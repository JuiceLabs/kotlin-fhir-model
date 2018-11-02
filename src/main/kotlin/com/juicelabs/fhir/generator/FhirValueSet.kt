package com.juicelabs.fhir.generator

import com.google.gson.JsonArray
import com.google.gson.JsonObject

class FhirValueSet(private val spec: FhirSpec, val definition: JsonObject) {
    val LOG by logger()
    var valueSetEnum: ValueSetEnum? = null


    init {
    }


    fun enum(): ValueSetEnum? {
        if (valueSetEnum != null) {
            return valueSetEnum
        }

        val compose = definition["compose"]
        if (compose == null) {
            Exception("Currently only composed ValueSets are supported")
        }

        if ((compose as JsonObject).has("exclude")) {
            Exception("Not currently supporting 'exclude' on ValueSet")
        }

        val include = compose["include"] as JsonArray
        if (include.count() != 1) {
            LOG.warn("Ignoring ValueSet with more than 1 includes (${include.count()}: ${include})")
            return null
        }


        val system = include[0].asJsonObject["system"].asString
        if (system == null) {
            return null
        }

        // alright, this is a ValueSet with 1 include and a system, is there a CodeSystem?
        val cs = spec.codesystemWithUri(system)
        if (!cs.generateEnum) {
            return null
        }

        val restrictedTo = mutableListOf<JsonObject>()
        val concepts = spec.codesystemWithUri(system).concepts

        if (concepts != null) {
            concepts.forEach { concept ->
                assert(concept.asJsonObject.has("code"))
                restrictedTo.add(concept.asJsonObject["code"].asJsonObject)
            }
        }

        valueSetEnum = ValueSetEnum(cs.name, restrictedTo)
        return valueSetEnum
    }
}

class ValueSetEnum(val name: String, val restrictedTo: List<JsonObject>)