package com.juicelabs.fhir.model

import java.io.File
import kotlin.test.assertTrue
import org.junit.jupiter.api.Test

class LinkageDataTest : DataTests() {
    @Test
    fun `linkage-example 790 Test`() {
        val json = File("./src/test/resources/model/sample_data/linkage-example.json").readTextAndClose()
        val obj = mapper.fromJson(json, Linkage::class.java)
        assertTrue(stringMatch("Linkage", obj.resourceType))
        assertTrue(stringMatch("example", obj.id))
        assertTrue(stringMatch("generated", obj.text!!.status))
        assertTrue(stringMatch("<div xmlns=\"http://www.w3.org", obj.text!!.div))
        assertTrue(stringMatch("Practitioner/f201", obj.author!!.reference))
        assertTrue(stringMatch("source", obj.item[0].type))
        assertTrue(stringMatch("Condition/example", obj.item[0].resource.reference))
        assertTrue(stringMatch("Severe burn of left ear (Date", obj.item[0].resource.display))
        assertTrue(stringMatch("alternate", obj.item[1].type))
        assertTrue(stringMatch("Condition/condition-example", obj.item[1].resource.reference))
        assertTrue(stringMatch("Severe burn of left ear (Date", obj.item[1].resource.display))
    }
}