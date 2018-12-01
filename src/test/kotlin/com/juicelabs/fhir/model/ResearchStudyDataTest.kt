package com.juicelabs.fhir.model

import java.io.File
import kotlin.test.assertTrue
import org.junit.jupiter.api.Test

class ResearchStudyDataTest : DataTests() {
    @Test
    fun `researchstudy-example 554 Test`() {
        val json = File("./src/test/resources/model/sample_data/researchstudy-example.json").readTextAndClose()
        val obj = mapper.fromJson(json, ResearchStudy::class.java)
        assertTrue(stringMatch("ResearchStudy", obj.resourceType))
        assertTrue(stringMatch("example", obj.id))
        assertTrue(stringMatch("generated", obj.text!!.status))
        assertTrue(stringMatch("<div xmlns=\"http://www.w3.org", obj.text!!.div))
        assertTrue(stringMatch("draft", obj.status))
    }

    fun `researchstudy-example Init`(obj: Bundle) {
    }
}
