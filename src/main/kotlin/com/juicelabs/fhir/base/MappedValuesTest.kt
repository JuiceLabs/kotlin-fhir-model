package com.juicelabs.fhir.base

import com.google.common.collect.Maps
import com.google.gson.JsonParser
import com.google.gson.reflect.TypeToken
import com.juicelabs.fhir.generator.FhirClass
import com.juicelabs.fhir.generator.Settings
import com.juicelabs.fhir.generator.readTextAndClose
import java.io.File


class MappingDiff() {


    private val c = mutableMapOf<Class<*>, MutableList<Pair<String, String>>>()
    private val classes = mutableListOf<Triple<FhirClass, String, String>>()
    private var failed = 0
    private var passed = 0
    private var results: MutableMap<String, Pair<Int, Int>> = mutableMapOf()

    init {
        File(Settings.samplesDir)
                .walk()
                .filter { it.name.contains("example") }
                .filter { !it.name.startsWith("list") }
                .forEach {
                    buildClassList(it)
                }
        c.forEach { cls, dataList ->
            if (cls.name.contains("Parameters"))
                dataList.forEach { (filename, json) ->

                    diffIt(filename, json, cls)
                }

        }

        results.forEach { key, v ->
            println("Class: %55s  Passed: ${v.first}\t  Failed ${v.second}".format(key))
        }
        print("passed: $passed  failed: $failed")
    }


    private fun buildClassList(file: File) {
        val parser = JsonParser()
        val json = file.readTextAndClose() ?: ""
        val jsonObject = parser.parse(json).asJsonObject
        val res = if (jsonObject.has("resourceType")) jsonObject["resourceType"].asString else null
        if (res.isNullOrBlank()) {
            return
        }
        val className = Settings.classMap[res?.toLowerCase()] ?: res ?: ""
        var cls = Class.forName("com.juicelabs.fhir.model.${className}")

        if (className.isNotBlank()) {
            //      val fhirClass = FhirClass.withName(className)
            //    if (fhirClass != null) {
//                classes.add(Triple(cls, file.name, json))
            if (!c.containsKey(cls)) {
                c[cls] = arrayListOf(Pair(file.name, json))
            } else {
                c[cls]!!.add(Pair(file.name, json))
                //          }
            }
        }
    }

    fun diffIt(filename: String, json: String, cls: Class<*>) {
        println("Checking ${cls.name}")
        val gson = getFhirGson()


        val model = gson.fromJson(json, cls)
        val convertedJson = gson.toJson(model)

        val mapType = object : TypeToken<Map<String, Any>>() {}.type

        val origData: Map<String, Any> = gson.fromJson(json, mapType)
        val filteredOrigData = filterMap(origData)
        val mappedData: Map<String, Any> = gson.fromJson(convertedJson, mapType)
        val filteredMappedData: Map<String, Any> = filterMap(mappedData)

        val diff = Maps.difference(filteredOrigData, mappedData)
        print("\n\n")

        var pass = 0
        var fail = 0
        if (diff.entriesDiffering().count() > 0) {
            println("Failed for ${cls.name} on data $filename")
            failed++
            fail = 1
            println(diff)
        } else {
            pass = 1
            passed++
        }
        var p = results[cls.name]
        if (p == null) {
            p = Pair(0, 0)
        }
        p = Pair(p.first + pass, p.second + fail)

        results[cls.name] = p
    }
}


private fun filterMap(
        input: Map<String, Any>,
        predicate: (Map.Entry<String, Any>) -> Boolean = { !it.key.startsWith("_") }): Map<String, Any> {
    val output: MutableMap<String, Any> = mutableMapOf()
    for (entry in input.entries) {
        if (predicate(entry)) {
            if (entry.value is Map<*, *>) {
                @Suppress("UNCHECKED_CAST")
                val filtered = filterMap(entry.value as Map<String, Any>, predicate)
                if (filtered.count() > 0)
                output[entry.key] = filtered
                else
                    print(1)
            } else {
                if (entry.value is List<*>) {
                    @Suppress("UNCHECKED_CAST") val source = entry.value as List<Any>
                    if (source.count() > 0) {
                        val list = mutableListOf<Any>()
                        source.forEach { e ->
                            if (e is Map<*, *>) {
                                @Suppress("UNCHECKED_CAST")
                                list.add(filterMap(e as Map<String, Any>))
                            } else {
                                list.add(e)
                            }
                        }
                            output[entry.key] = list
                    }
                } else {
                    output[entry.key] = entry.value
                }
            }
        }
    }
    return output
}

fun main(args: Array<String>) {
    val m = MappingDiff()

//    m.diffIt("basic-example.json", Basic::class.java)
//    m.diffIt("patient-example.json", Patient::class.java)
}

