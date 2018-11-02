package com.juicelabs.fhir.generator

import com.google.gson.JsonObject

/**
 * The "binding" element in an element definition
 */
class FhirElementBinding(dict: JsonObject) {

    val strength: String?
    val description: String?
    val uri: String?
    val canonical: String?
    val isRequired: Boolean


    init {
        strength = dict.get("strength").asString
        description = if (dict.has("description")) dict["description"].asString else null
        uri = if (dict.has("valueSetUri")) dict["valueSetUri"].asString else null
        canonical = if (dict.has("valueSetCanonical")) dict["valueSetCanonical"].asString else null
        isRequired = "required".equals(strength)
    }

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