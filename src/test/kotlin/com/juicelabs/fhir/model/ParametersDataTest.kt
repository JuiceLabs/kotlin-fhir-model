package com.juicelabs.fhir.model

import java.io.File
import kotlin.test.assertTrue
import org.junit.jupiter.api.Test

class ParametersDataTest : DataTests() {
    @Test
    fun `parameters-example 355 Test`() {
        val json = File("./src/test/resources/model/sample_data/parameters-example.json").readTextAndClose()
        val obj = mapper.fromJson(json, Parameters::class.java)
        assertTrue(stringMatch("Parameters", obj.resourceType))
        assertTrue(stringMatch("example", obj.id))
        assertTrue(stringMatch("start", obj.parameter[0].name))
        assertTrue(stringMatch("2010-01-01", obj.parameter[0].valueDate))
        assertTrue(stringMatch("end", obj.parameter[1].name))
        assertTrue(stringMatch("Binary", (obj.parameter[1].resource!! as Binary).resourceType))
        assertTrue(stringMatch("text/plain", (obj.parameter[1].resource!! as Binary).contentType))
        assertTrue(stringMatch("VGhpcyBpcyBhIHRlc3QgZXhhbXBsZ", (obj.parameter[1].resource!! as Binary).content))
    }

    fun `parameters-example Init`(obj: Bundle) {
    }
}
