package com.juicelabs.fhir.model

import java.io.File
import kotlin.test.assertEquals
import kotlin.test.assertTrue
import org.junit.jupiter.api.Test

class GroupDataTest : DataTests() {
    @Test
    fun `group-example 747 Test`() {
        val json = File("./src/test/resources/model/sample_data/group-example.json").readTextAndClose()
        val obj = mapper.fromJson(json, Group::class.java)
        assertTrue(stringMatch("Group", obj.resourceType))
        assertTrue(stringMatch("101", obj.id))
        assertTrue(stringMatch("additional", obj.text!!.status))
        assertTrue(stringMatch("<div xmlns=\"http://www.w3.org", obj.text!!.div))
        assertTrue(stringMatch("http://someveterinarianclinic", obj.identifier[0].system))
        assertTrue(stringMatch("12345", obj.identifier[0].value))
        assertTrue(stringMatch("animal", obj.type))
        assertEquals(true, if (obj.actual != null) obj.actual else false, "Field: obj.actual")
        assertTrue(stringMatch("Horse", obj.code!!.text))
        assertTrue(stringMatch("John's herd", obj.name))
        assertEquals(25, obj.quantity)
        assertTrue(stringMatch("gender", obj.characteristic[0].code.text))
        assertTrue(stringMatch("mixed", obj.characteristic[0].valueCodeableConcept.text))
        assertEquals(false, if (obj.characteristic[0].exclude != null) obj.characteristic[0].exclude else false, "Field: obj.characteristic[0].exclude")
        assertTrue(stringMatch("owner", obj.characteristic[1].code.text))
        assertTrue(stringMatch("John Smith", obj.characteristic[1].valueCodeableConcept.text))
        assertEquals(false, if (obj.characteristic[1].exclude != null) obj.characteristic[1].exclude else false, "Field: obj.characteristic[1].exclude")
    }

    @Test
    fun `group-example-member 748 Test`() {
        val json = File("./src/test/resources/model/sample_data/group-example-member.json").readTextAndClose()
        val obj = mapper.fromJson(json, Group::class.java)
        assertTrue(stringMatch("Group", obj.resourceType))
        assertTrue(stringMatch("102", obj.id))
        assertTrue(stringMatch("additional", obj.text!!.status))
        assertTrue(stringMatch("<div xmlns=\"http://www.w3.org", obj.text!!.div))
        assertTrue(stringMatch("person", obj.type))
        assertEquals(true, if (obj.actual != null) obj.actual else false, "Field: obj.actual")
        assertTrue(stringMatch("Patient/pat1", obj.member[0].entity.reference))
        assertEquals("2014-10-08", obj.member[0].period!!.start.toString())
        assertTrue(stringMatch("Patient/pat2", obj.member[1].entity.reference))
        assertEquals("2015-04-02", obj.member[1].period!!.start.toString())
        assertEquals(true, if (obj.member[1].inactive != null) obj.member[1].inactive else false, "Field: obj.member[1].inactive")
        assertTrue(stringMatch("Patient/pat3", obj.member[2].entity.reference))
        assertEquals("2015-08-06", obj.member[2].period!!.start.toString())
        assertTrue(stringMatch("Patient/pat4", obj.member[3].entity.reference))
        assertEquals("2015-08-06", obj.member[3].period!!.start.toString())
    }
}
