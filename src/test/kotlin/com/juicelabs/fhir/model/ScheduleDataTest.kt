package com.juicelabs.fhir.model

import java.io.File
import kotlin.test.assertEquals
import kotlin.test.assertTrue
import org.junit.jupiter.api.Test

class ScheduleDataTest : DataTests() {
    @Test
    fun `schedule-provider-location1-example 309 Test`() {
        val json = File("./src/test/resources/model/sample_data/schedule-provider-location1-example.json").readTextAndClose()
        val obj = mapper.fromJson(json, Schedule::class.java)
        assertTrue(stringMatch("Schedule", obj.resourceType))
        assertTrue(stringMatch("exampleloc1", obj.id))
        assertTrue(stringMatch("generated", obj.text!!.status))
        assertTrue(stringMatch("<div xmlns=\"http://www.w3.org", obj.text!!.div))
        assertTrue(stringMatch("usual", obj.identifier[0].use))
        assertTrue(stringMatch("http://example.org/scheduleid", obj.identifier[0].system))
        assertTrue(stringMatch("46", obj.identifier[0].value))
        assertEquals(true, if (obj.active != null) obj.active else false, "Field: obj.active")
        assertTrue(stringMatch("17", obj.serviceCategory!!.coding[0].code))
        assertTrue(stringMatch("General Practice", obj.serviceCategory!!.coding[0].display))
        assertTrue(stringMatch("75", obj.serviceType[0].coding[0].code))
        assertTrue(stringMatch("Genetic Counselling", obj.serviceType[0].coding[0].display))
        assertTrue(stringMatch("394580004", obj.specialty[0].coding[0].code))
        assertTrue(stringMatch("Clinical genetics", obj.specialty[0].coding[0].display))
        assertTrue(stringMatch("Practitioner/1", obj.actor[0].reference))
        assertTrue(stringMatch("Dr. Beverly Crusher", obj.actor[0].display))
        assertTrue(stringMatch("Location/3", obj.actor[1].reference))
        assertTrue(stringMatch("USS Enterprise-D Sickbay", obj.actor[1].display))
        assertEquals("2017-12-25T09:15:00Z", obj.planningHorizon!!.start.toString())
        assertEquals("2017-12-25T09:30:00Z", obj.planningHorizon!!.end.toString())
        assertTrue(stringMatch("The slots attached to this sc", obj.comment))
    }

    @Test
    fun `schedule-example 310 Test`() {
        val json = File("./src/test/resources/model/sample_data/schedule-example.json").readTextAndClose()
        val obj = mapper.fromJson(json, Schedule::class.java)
        assertTrue(stringMatch("Schedule", obj.resourceType))
        assertTrue(stringMatch("example", obj.id))
        assertTrue(stringMatch("generated", obj.text!!.status))
        assertTrue(stringMatch("<div xmlns=\"http://www.w3.org", obj.text!!.div))
        assertTrue(stringMatch("usual", obj.identifier[0].use))
        assertTrue(stringMatch("http://example.org/scheduleid", obj.identifier[0].system))
        assertTrue(stringMatch("45", obj.identifier[0].value))
        assertEquals(true, if (obj.active != null) obj.active else false, "Field: obj.active")
        assertTrue(stringMatch("17", obj.serviceCategory!!.coding[0].code))
        assertTrue(stringMatch("General Practice", obj.serviceCategory!!.coding[0].display))
        assertTrue(stringMatch("57", obj.serviceType[0].coding[0].code))
        assertTrue(stringMatch("Immunization", obj.serviceType[0].coding[0].display))
        assertTrue(stringMatch("408480009", obj.specialty[0].coding[0].code))
        assertTrue(stringMatch("Clinical immunology", obj.specialty[0].coding[0].display))
        assertTrue(stringMatch("Location/1", obj.actor[0].reference))
    }

    @Test
    fun `schedule-example 311 Test`() {
        val json = File("./src/test/resources/model/sample_data/schedule-example.json").readTextAndClose()
        val obj = mapper.fromJson(json, Schedule::class.java)
        assertTrue(stringMatch("Burgers UMC, South Wing, seco", obj.actor[0].display))
        assertEquals("2013-12-25T09:15:00Z", obj.planningHorizon!!.start.toString())
        assertEquals("2013-12-25T09:30:00Z", obj.planningHorizon!!.end.toString())
        assertTrue(stringMatch("The slots attached to this sc", obj.comment))
    }

    @Test
    fun `schedule-provider-location2-example 312 Test`() {
        val json = File("./src/test/resources/model/sample_data/schedule-provider-location2-example.json").readTextAndClose()
        val obj = mapper.fromJson(json, Schedule::class.java)
        assertTrue(stringMatch("Schedule", obj.resourceType))
        assertTrue(stringMatch("exampleloc2", obj.id))
        assertTrue(stringMatch("generated", obj.text!!.status))
        assertTrue(stringMatch("<div xmlns=\"http://www.w3.org", obj.text!!.div))
        assertTrue(stringMatch("usual", obj.identifier[0].use))
        assertTrue(stringMatch("http://example.org/scheduleid", obj.identifier[0].system))
        assertTrue(stringMatch("47", obj.identifier[0].value))
        assertEquals(true, if (obj.active != null) obj.active else false, "Field: obj.active")
        assertTrue(stringMatch("31", obj.serviceCategory!!.coding[0].code))
        assertTrue(stringMatch("Specialist Surgical", obj.serviceCategory!!.coding[0].display))
        assertTrue(stringMatch("221", obj.serviceType[0].coding[0].code))
        assertTrue(stringMatch("Surgery - General", obj.serviceType[0].coding[0].display))
        assertTrue(stringMatch("394610002", obj.specialty[0].coding[0].code))
        assertTrue(stringMatch("Surgery-Neurosurgery", obj.specialty[0].coding[0].display))
        assertTrue(stringMatch("Practitioner/1", obj.actor[0].reference))
        assertTrue(stringMatch("Dr. Beverly Crusher", obj.actor[0].display))
        assertTrue(stringMatch("Location/2", obj.actor[1].reference))
        assertTrue(stringMatch("Starfleet HQ Sickbay", obj.actor[1].display))
        assertEquals("2017-12-25T09:15:00Z", obj.planningHorizon!!.start.toString())
        assertEquals("2017-12-25T09:30:00Z", obj.planningHorizon!!.end.toString())
        assertTrue(stringMatch("The slots attached to this sc", obj.comment))
    }
}
