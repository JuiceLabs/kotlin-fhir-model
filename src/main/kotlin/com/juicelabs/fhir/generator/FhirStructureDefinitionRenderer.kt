package com.juicelabs.fhir.generator

import com.squareup.kotlinpoet.ClassName
import com.squareup.kotlinpoet.CodeBlock
import com.squareup.kotlinpoet.FileSpec
import com.squareup.kotlinpoet.FunSpec
import com.squareup.kotlinpoet.KModifier
import com.squareup.kotlinpoet.ParameterizedTypeName.Companion.parameterizedBy
import com.squareup.kotlinpoet.PropertySpec
import com.squareup.kotlinpoet.TypeSpec
import java.io.File
import java.time.LocalDateTime.now

class FhirStructureDefinitionRenderer(val spec: FhirSpec) {

    val log by logger()

    fun render() {

        renderManualClasses()

        spec.writeableProfile().forEach { profile ->
            val classes = profile.writeableClasses()
            val imports = profile.neededExternalClasses()
            val data = hashMapOf(
                    "profile" to profile,
                    "info" to spec.info,
                    "imports" to imports,
                    "classes" to classes
            )

            val header = buildHeader(data)
            val out = FileSpec.builder(spec.packageName, profile.targetName)
            out.addComment(header)
            buildImports(out, imports)


            classes.filter { c -> !Settings.natives.contains(c.name) }.forEach { c ->
                val classBody = buildClass(c)
                out.addType(classBody)
                if (c.name == "Immunization")
                    log.debug("Building class {}", c.name)
            }

            val dir = spec.info.directory
            out.build().writeTo(File(dir))
        }
    }

    private fun renderManualClasses() {
        Settings.manualClasses.forEach { name, props ->
            val out = FileSpec.builder(spec.packageName, name)
            // todo imports
            val classBuilder = TypeSpec.classBuilder(name).addModifiers(KModifier.OPEN)

            props.forEach { propName, typeInfo ->
                val className = ClassName(spec.packageName, typeInfo.first)
                // todo support list types
                val propBuilder = PropertySpec.builder(propName, className).mutable(true)
                if (typeInfo.second.isNotBlank()) {
                    propBuilder.initializer(typeInfo.second)
                }
                classBuilder.addProperty(propBuilder.build())
            }
            out.addType(classBuilder.build())
            out.build().writeTo(File(Settings.destinationSrcDir))
        }
    }


    private fun buildClass(cls: FhirClass): TypeSpec {

        val classBuilder = TypeSpec.classBuilder(cls.name).addModifiers(KModifier.OPEN)

        val primaryCtor = FunSpec.constructorBuilder()

        classBuilder.addKdoc("%L\n\n%L\n", cls.short, cls.formal)
        cls.properties.forEach { prop ->
            renderProperty(prop, prop.typeName, prop.origName, classBuilder)
        }
        classBuilder.primaryConstructor(primaryCtor.build())

        val superClass = cls.superClass
        if (superClass != null) {
            buildSuperClassConstructor(superClass, classBuilder)
        } else if (cls.name == "Resource") {
            val className = ClassName(spec.packageName, "FhirAbstractResource")
            val scBuilder = classBuilder.superclass(className)
            scBuilder.build()
        }

        return classBuilder.build()
    }


    private fun buildSuperClassConstructor(cls: FhirClass, classBuilder: TypeSpec.Builder) {
        val superClass = ClassName(spec.packageName, cls.name)
        val scBuilder = classBuilder.superclass(superClass)
        scBuilder.build()
    }


    private fun renderProperty(prop: FhirClassProperty, typeName: String, origName: String, classBuilder: TypeSpec.Builder) {
        val mappedTypeName = Settings.classMap[typeName.decapitalize()] ?: typeName
        val typeClassName = ClassName(spec.packageName, mappedTypeName)

        val propName = Settings.reservedMap[origName] ?: prop.origName // todo origName?
        if (prop.isList()) {
            val arrayList = ClassName("kotlin.collections", "List")
            val listOfProps = arrayList.parameterizedBy(typeClassName)
            classBuilder.addProperty(PropertySpec.builder(propName, listOfProps)
                    .initializer(CodeBlock.of("mutableListOf<%T>()", typeClassName))
                    .build())
        } else {
            val propBuilder = PropertySpec.builder(propName, typeClassName.isNullable(prop.min == 0)).mutable(true)

            if (prop.min == 0) {
                propBuilder.initializer("null")
            }

            if (prop.min == 1) {
                if (Settings.defaultValues.contains(mappedTypeName)) {
                    propBuilder.initializer(Settings.defaultValues[mappedTypeName]!!)
                } else {
                    propBuilder.initializer("$mappedTypeName()")
                }
            }

            classBuilder.addProperty(propBuilder
                    .addKdoc("%L\n", prop.shortDesc)
                    .build())
        }
    }


    private fun buildHeader(data: HashMap<String, Any>): String {
        return "\n Generated from FHIR Version ${(data["info"] as FhirVersionInfo).version} on ${now()} \n\n  ${now().year}, JuiceLab, LLC\n "
    }


    private fun buildImports(out: FileSpec.Builder, imports: Set<Pair<String, String>>): FileSpec.Builder {
        imports.forEach { imp ->
            out.addImport(imp.first, imp.second)
        }
        return out
    }
}

fun ClassName.isNullable(nullable: Boolean): ClassName {
    return if (nullable)
        asNullable()
    else
        asNonNull()
}