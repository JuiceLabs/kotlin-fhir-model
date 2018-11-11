package com.juicelabs.fhir.generator

import com.google.gson.JsonObject

/**
 * The "binding" element in an element definition
 */
class FhirElementBinding(dict: JsonObject) {

    val strength: String? = dict.get("strength").asString
    val description: String? = if (dict.has("description")) dict["description"].asString else null
    val uri: String? = if (dict.has("valueSetUri")) dict["valueSetUri"].asString else null
    val canonical: String? = if (dict.has("valueSetCanonical")) dict["valueSetCanonical"].asString else null
    val isRequired = "required" == strength

//    private val code: String?
//
//    private val profile: JsonElement?
//
//    init {
//        code = if (dict.has("code")) dict["code"].asString else null
//        // todo check that it's valid
//
//        profile = dict["profile"]
//        // todo more checks
//    }

}