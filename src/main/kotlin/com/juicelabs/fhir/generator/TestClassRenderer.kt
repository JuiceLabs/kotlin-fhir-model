package com.juicelabs.fhir.generator

import com.google.gson.Gson
import com.google.gson.JsonElement
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
    private val c = mutableMapOf<FhirClass, MutableList<Pair<String, JsonObject>>>()
    private val classes = mutableListOf<Triple<FhirClass, String, JsonObject>>()

    init {
        File(Settings.samplesDir)
                .walk()
                .filter { it.name.contains("example") }
                .filter { !it.name.startsWith("list") }
                .forEach {
                    buildClassList(it)
                }

        CreateTestMethod(spec, c)
    }


    private fun buildClassList(file: File) {
        val parser = JsonParser()
        val jsonObject = parser.parse(file.readTextAndClose()).asJsonObject
        val res = if (jsonObject.has("resourceType")) jsonObject["resourceType"].asString else null
        if (res.isNullOrBlank()) {
            return
        }
        val className = Settings.classMap[res?.toLowerCase()] ?: res ?: ""

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


}

open class TestValue(val origTypeName: String, var propName: String?, val value: String?, val isList: Boolean, val nullable: Boolean = false) {
    var castRequired = false
    var jsonArray = false
    var children = mutableListOf<TestValue>()
    var fieldName = Settings.reservedMap.getOrDefault(propName, propName)
    var castVal = ""
    var typeName = Settings.classMap.getOrDefault(origTypeName.toLowerCase(), origTypeName)
    var plainValue = false
}


class TestValues {

    fun getTestValues(jsonObject: JsonObject, testClass: FhirClass, parentTestValue: TestValue? = null): MutableList<TestValue> {
        val values = mutableListOf<TestValue>()

        var propClass = testClass

        if (testClass.name == "Resource" && jsonObject.has("resourceType")) {
            propClass = FhirClass.withName(jsonObject["resourceType"].asString)!!
        }

        for (key in jsonObject.keySet()) {
            if (key.startsWith("_")) {
                continue
            }

            val safeKey = Settings.reservedMap.getOrDefault(key, key)
            val found = findProperty(propClass, safeKey, key, jsonObject) ?: continue

            values.add(found)

            val value = jsonObject[key]

            if (found.value != null) {
                addParentCast(parentTestValue, jsonObject)
            } else if (value.isJsonObject) {
                addParentCast(parentTestValue, jsonObject)
                val cls = FhirClass.withName(found.typeName)
                if (cls != null) {
                    found.children.addAll(getTestValues(jsonObject[key].asJsonObject, cls, found))
                }
            } else if (value.isJsonArray) {
                found.jsonArray = true
                val rootClass = FhirClass.withName(found.typeName)
                var index = 0

                value.asJsonArray.forEach { entry ->
                    addArrayEntry(index, entry, found, rootClass)
                    index++
                }
            } else {
                throw Exception("Error getting value for $key in ${testClass.name}")
            }
        }

        return values
    }

    private fun addArrayEntry(index: Int, entry: JsonElement, found: TestValue, rootClass: FhirClass?) {
        val arrayEntry = TestValue("Array", "[$index]", null, true)
        addArrayCast(entry, arrayEntry)
        if (Settings.primitives.contains(found.typeName)) {
            // handle arrays of primitive values "foo" : [ "bar", "rab" ]
            val tv = TestValue(found.origTypeName, found.propName, entry.asString, false)
            tv.plainValue = true
            arrayEntry.children.add(tv)
        } else {
            arrayEntry.children.addAll(getTestValues(entry.asJsonObject, rootClass!!))
        }
        found.children.add(arrayEntry)
    }

    private fun addArrayCast(entry: JsonElement, arrayEntry: TestValue) {
        if (entry.isJsonObject && entry.asJsonObject.has("resourceType")) {
            val subClass = FhirClass.withName(entry.asJsonObject["resourceType"].asString)!!
            arrayEntry.castVal = " as ${subClass.name})"
            arrayEntry.castRequired = true
        }
    }

    private fun addParentCast(parentTestValue: TestValue?, jsonObject: JsonObject) {
        if (parentTestValue != null && parentTestValue.typeName == "Resource") {
            val subClass = FhirClass.withName(jsonObject.asJsonObject["resourceType"].asString)!!
            parentTestValue.castVal = " as ${subClass.name})"
            parentTestValue.castRequired = true
        }
    }


    /**
     * Look for the property named 'key' in testClass. If it's a primitive add it's value to the list.
     * Searches up the class inheritence hierarchy.
     */
    private fun findProperty(testClass: FhirClass,
                             safeKey: String,
                             origKey: String,
                             jsonObject: JsonObject): TestValue? {

        if (testClass.properties.containsKey(safeKey)) {
            val classProp = testClass.properties[safeKey]!!
            val propType = Settings.classMap.getOrDefault(classProp.typeName.toLowerCase(), classProp.typeName)
            return if (!classProp.isList() && Settings.primitives.contains(propType)) {
                addPrimitive(propType, safeKey, jsonObject[origKey].asString)
            } else {
                TestValue(propType, safeKey, null, false, classProp.isNullable())
            }
        } else {
            val superClass = testClass.superClass
            if (superClass != null) {
                return findProperty(superClass, safeKey, origKey, jsonObject)
            } else if (testClass.superclassName == "FhirAbstractResource" && safeKey == "resourceType") {
                return addPrimitive("String", safeKey, jsonObject[origKey].asString)
            }
        }
        throw Exception("Property $origKey not found")
    }

    private fun addPrimitive(typeName: String, key: String, value: String): TestValue {
        return when (typeName) {
            "Boolean" -> TestValue("Boolean", key, value, false)
            "Int" -> TestValue("Int", key, value, false)
            "Float" -> TestValue("Float", key, value, false)
            "FhirDate" -> TestValue("FhirDate", key, value, false)
            else -> TestValue("String", key, value, false)
        }
    }

}


class CreateTestMethod(private var spec: FhirSpec, private val rawData: MutableMap<FhirClass, MutableList<Pair<String, JsonObject>>>) {

    private lateinit var fspec: FunSpec.Builder
    private var testCount = 0
    private lateinit var classBuilder: TypeSpec.Builder
    private lateinit var className: ClassName
    private var testValues = TestValues()

    private var out: FileSpec.Builder? = null

    private lateinit var filename: String

    private val testClass = ClassName("org.junit.jupiter.api", "Test")
    private val assertEq = ClassName("kotlin.test", "assertEquals")
    private val assertTrueCN = ClassName("kotlin.test", "assertTrue")
    private val parentClass = ClassName("com.juicelabs.fhir.model", "DataTests")


    init {
        createParaentClass()
        createTestClasses()
    }


    // iterate over every example
    private fun createTestClasses() {
        // skip bundle until GSON and Kotlin bugs are resolved.
        rawData.filter {it.key.name != "Bundle"}
//                .filter { it.key.name == "PlanDefinition" }
                .forEach { fhirClass, dataList ->
            className = ClassName("com.juicelabs.fhir.model", fhirClass.name)
            createClassFile(fhirClass)
            dataList.forEach { (dataFilename, jsonObject) ->
                filename = dataFilename
                val values = testValues.getTestValues(jsonObject, fhirClass)
                createTestFun()
                addAsserts(values)
                finishFunction()
            }
            out!!.addType(classBuilder.build())
            out!!.build().writeTo(File(Settings.destinationTestDir))
        }
    }


    private fun createClassFile(fhirClass: FhirClass) {
        out = FileSpec.builder(spec.packageName, fhirClass.name + "DataTest")

        classBuilder = TypeSpec.classBuilder("${fhirClass.name}DataTest")
        classBuilder.superclass(parentClass)
    }

    private fun createTestFun() {

        val testName = "${filename.substringBefore(".")} $testCount Test"

        testCount++

        fspec = FunSpec.builder(testName)
                .addStatement("val json = %T(\"${Settings.samplesDir}/$filename\").readTextAndClose()", ClassName("java.io", "File"))
                .addStatement("val obj = mapper.fromJson(json, %T::class.java)", className)
                .addAnnotation(testClass)
    }

    private fun createKotlinBugNewFun() {
        classBuilder.addFunction(fspec.build())
        createTestFun()
    }

    private fun finishFunction() {
        classBuilder.addFunction(fspec.build())
    }

    private var statementCount: Int = 0

    private fun addAsserts(testValues: MutableList<TestValue>, path: String? = null) {

        testValues.forEach { testValue ->

            val propPath = if (testValue.plainValue) path!! else buildCallPath(path, testValue)
            addAsserts(testValue.children, propPath)
            if (testValue.value != null) {
                addAssertStatement(testValue, testValue.value, propPath)
            }
        }
    }

    private fun buildCallPath(path: String?, testValue: TestValue): String {
        val del = if (path == null || testValue.isList) "" else "."
        val nullable = if (testValue.nullable) "!!" else ""

        var propPath = (path ?: "obj.") + del + testValue.fieldName + nullable + testValue.castVal
        if (testValue.castRequired) {
            propPath = "($propPath"
        }
        return propPath
    }

    private fun addAssertStatement(testValue: TestValue, value: String, propPath: String) {
        statementCount++

        if (statementCount > 70) {
            createKotlinBugNewFun()
            statementCount = 0
        }

        when {
            testValue.typeName == "String" -> {
                val s = (if (value.length < 30) value else value.substring(0, 29))
                fspec.addStatement("%T(stringMatch(%S, $propPath))", assertTrueCN, s)
            }
            testValue.typeName == "Float" -> {
                val v = "\"%.2f\".format($propPath)"
                fspec.addStatement("%T(stringMatch(%L, %L))", assertTrueCN, "\"%.2f\".format(${value}f)", v)
            }
            testValue.typeName == "FhirDate" -> fspec.addStatement("%T(%S, $propPath.toString())", assertEq, value)
            testValue.typeName == "Int" -> fspec.addStatement("%T($value, $propPath)", assertEq)
            else -> fspec.addStatement("%T($value, if ($propPath != null) " +
                    "$propPath else false, \"Field: $propPath\")", assertEq)
        }
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

        out.addType(classBuilder.build())

        out.addFunction(FunSpec.builder("readTextAndClose")
                .receiver(File::class)
                .returns(String::class)
                .addCode("""
                    reader().use { reader ->
                       return reader.readText()
                       }

                """.trimIndent())
                .build())

        out.build().writeTo(File(Settings.destinationTestDir))
    }


    private fun registerGsonTypeAdaptors(classBuilder: TypeSpec.Builder) {
        classBuilder.addProperty("mapper", Gson::class.java)
        classBuilder.addInitializerBlock(CodeBlock.of(
                """
            mapper = com.juicelabs.fhir.base.getFhirGson()

            """.trimIndent()))
    }
}