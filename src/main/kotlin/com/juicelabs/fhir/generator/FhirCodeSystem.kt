package com.juicelabs.fhir.generator

import com.google.gson.JsonObject

/**
 * Holds on to CodeSystems bundled with the spec.
 */
class FhirCodeSystem(val spec: FhirSpec, val definition: Map<String, *>) {

    val log by logger()

    val url: String? = if (definition.containsKey("url")) definition["url"] as String else ""
    val name: String
    val concepts: ArrayList<*>
    var generateEnum: Boolean
    val codes = mutableListOf<JsonObject>()


    init {
        name = if (Settings.enumNameMap.containsKey(url)) Settings.enumNameMap[url]!! else spec.safeEnumName(definition["name"] as String)
        concepts = definition["concept"] as ArrayList<*>
        if (!definition.containsKey("experimental")) {
            generateEnum = "complete" == definition["content"]
            if (generateEnum) {
                if (concepts.count() > 200) {
                    generateEnum = false
                    log.info("Will not generate enum for CodeSystem \"$url\" because it has > 200 (${concepts.size}) concepts")
                } else {
                    codes.addAll(parsedCodes(concepts))
                }
            } else {
                log.debug("Will not generate enum for CodeSystem \"$url\" whose content is ${definition["content"]}")
            }
        } else {
            generateEnum = false
        }
    }


    fun parsedCodes(codes: ArrayList<*>, prefix: String? = null): MutableList<JsonObject> {
        val found = mutableListOf<JsonObject>()
        codes.forEach { c ->
        //    val cd = c.
        //    found.add(c)

            // todo nested concepts
        }
        return found
    }
}