package com.juicelabs.fhir.generator

import com.google.gson.Gson
import com.google.gson.GsonBuilder
import com.google.gson.JsonObject
import com.google.gson.JsonParser
import com.squareup.kotlinpoet.ClassName
import com.squareup.kotlinpoet.CodeBlock
import com.squareup.kotlinpoet.FileSpec
import com.squareup.kotlinpoet.FunSpec
import com.squareup.kotlinpoet.KModifier
import com.squareup.kotlinpoet.TypeSpec
import com.squareup.kotlinpoet.asTypeName
import java.io.File


class TestClassRenderer(val spec: FhirSpec) {
    val c = mutableMapOf<FhirClass, MutableList<Pair<String, JsonObject>>>()
    val classes = mutableListOf<Triple<FhirClass, String, JsonObject>>()

    init {
        File(Settings.samplesDir)
                .walk()
                .filter { it.name.contains("example") }
                .filter { !it.name.startsWith("list") }
                .forEach {
                    buildClassList(it)
                }
        createTestCase()
    }


    private fun buildClassList(file: File) {
        val parser = JsonParser()
        var jsonObject = JsonObject()
        try {
            jsonObject = parser.parse(readFile(file)).getAsJsonObject()
        } catch (e: Exception) {
            print("")
        }
        val res = if (jsonObject.has("resourceType")) jsonObject["resourceType"].asString else null
        if (res.isNullOrBlank()) {
            return
        }
        val className = Settings.classMap[res] ?: res ?: ""

        if (className.isNotBlank()) {
            val fhirClass = FhirClass.withName(className)
            if (fhirClass != null) {
                classes.add(Triple(fhirClass, file.name, jsonObject))
                if (!c.containsKey(fhirClass)) {
                    c[fhirClass] = arrayListOf(Pair(file.name, jsonObject))
                } else {
                    c[fhirClass]!!.add(Pair(file.name, jsonObject))
                }
            }
        }
    }


    private fun createTestCase() {

        createParaentClass()

//        val testClass = ClassName("org.junit.jupiter.api", "Test")
        val parentClass = ClassName("com.juicelabs.fhir.model", "DataTests")

        c.forEach { fhirClass, dataList ->
            val out = FileSpec.builder(spec.packageName, fhirClass.name + "Test")
            dataList.forEach { (exampleFilename, jsonObject) ->
                out.addType(createTestClass(fhirClass, exampleFilename, jsonObject, parentClass))
            }
            out.build().writeTo(File(Settings.destinationTestDir))
        }
    }


    private fun getTestValues(jsonObject: JsonObject, fhirClass: FhirClass): MutableMap<String, Pair<String, String>> {
        val values = mutableMapOf<String, Pair<String, String>>()
        jsonObject.keySet().forEach { key ->

            val o = jsonObject[key]

            var ptype: String? = null
            for (prop in fhirClass.properties) {
                if (prop.name == key) {
                    ptype = prop.typeName
                    break
                }
            }

            if ((ptype == null || ptype == "String" || ptype == "Code") && o.isJsonPrimitive) {
                values[key] = Pair("\"${o.asString}\"", "String")
            } else if ((ptype == null || ptype == "Boolean") && o.isJsonPrimitive) {
                values[key] = Pair(o.asString, "Boolean")
            }
        }
        return values
    }

    private fun createTestClass(fhirClass: FhirClass, exampleFilename: String, jsonObject: JsonObject, parentClass: ClassName): TypeSpec {
        val testClass = ClassName("org.junit.jupiter.api", "Test")

        val values = getTestValues(jsonObject, fhirClass)
        val classBuilder =
                TypeSpec.classBuilder(exampleFilename.replace("-", "_").replace(".", "_") + "Test")
        classBuilder.superclass(parentClass)

        val className = ClassName("com.juicelabs.fhir.model", fhirClass.name)

        // create read and parse code
        val fspec = FunSpec.builder("${exampleFilename.substringBefore(".")} Test")
                .addStatement("val json = readFile(\"${exampleFilename}\")")
                .addStatement("val obj = mapper.fromJson(json, %T::class.java)", className)
                .addAnnotation(testClass)

        // create asserts
        val assertEq = ClassName("kotlin.test", "assertEquals")
        val assertTrueCN = ClassName("kotlin.test", "assertTrue")
        values.forEach { k, (v, t) ->
            if (t == "String") {
                val s = (if (v.length < 30) v else v.substring(0, 29) + "\"")
                fspec.addStatement("%T(stringMatch(${s}, obj.${k}))", assertTrueCN)
            } else {
                fspec.addStatement("%T(${v}, if (obj.${k} != null) obj.${k} else false, \"Field: ${k}\")", assertEq)
            }
        }
        classBuilder.addFunction(fspec.build())
        return classBuilder.build()
    }


    private fun createParaentClass() {
        val out = FileSpec.builder(spec.packageName, "DataTests")
        val classBuilder = TypeSpec.classBuilder("DataTests").addModifiers(KModifier.OPEN)

        registerGsonTypeAdaptors(classBuilder)

        classBuilder.addFunction(FunSpec.builder("stringMatch")
                .returns(Boolean::class)
                .addParameter("str", String::class)
                .addParameter("actual", String::class.asTypeName().asNullable())
                .addStatement("return if (actual.isNullOrBlank()) true else actual!!.startsWith(str) ")
                .build()
        )

        classBuilder.addFunction(FunSpec.builder("readFile")
                .returns(String::class)
                .addParameter("fileName", String::class)
                .addStatement("%T(\"${Settings.samplesDir}/\" + fileName).reader().use { reader ->", ClassName("java.io", "File"))
                .addStatement("return reader.readText()")
                .addStatement("}")
                .build()
        )
        out.addType(classBuilder.build())
        out.build().writeTo(File(Settings.destinationTestDir))
    }


    private fun registerGsonTypeAdaptors(classBuilder: TypeSpec.Builder) {
        classBuilder.addProperty("mapper", Gson::class.java)
        classBuilder.addProperty("builder", GsonBuilder::class.java)

        val fd = ClassName("com.juicelabs.fhir.default", "FhirDate")
        val fdSerializer = ClassName("com.juicelabs.fhir.default", "FhirDateSerializer")
        val fdDeserializer = ClassName("com.juicelabs.fhir.default", "FhirDateDeSerializer")
        classBuilder.addInitializerBlock(CodeBlock.of(
                """
            builder = GsonBuilder()
            builder.registerTypeAdapter(%T::class.java, %T())
            builder.registerTypeAdapter(%T::class.java, %T())
            mapper = builder.create()

            """.trimIndent(), fd, fdSerializer, fd, fdDeserializer))
    }


    private fun readFile(f: File): String {
        f.reader().use { reader ->
            return reader.readText()
        }
    }

}


