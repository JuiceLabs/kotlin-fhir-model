package com.juicelabs.fhir.model

import java.io.File
import kotlin.test.assertEquals
import kotlin.test.assertTrue
import org.junit.jupiter.api.Test

class EpisodeOfCareDataTest : DataTests() {
    @Test
    fun `episodeofcare-example 959 Test`() {
        val json = File("./src/test/resources/model/sample_data/episodeofcare-example.json").readTextAndClose()
        val obj = mapper.fromJson(json, EpisodeOfCare::class.java)
        assertTrue(stringMatch("EpisodeOfCare", obj.resourceType))
        assertTrue(stringMatch("example", obj.id))
        assertTrue(stringMatch("generated", obj.text!!.status))
        assertTrue(stringMatch("<div xmlns=\"http://www.w3.org", obj.text!!.div))
        assertTrue(stringMatch("http://example.org/sampleepis", obj.identifier[0].system))
        assertTrue(stringMatch("123", obj.identifier[0].value))
        assertTrue(stringMatch("active", obj.status))
        assertTrue(stringMatch("planned", obj.statusHistory[0].status))
        assertEquals("2014-09-01", obj.statusHistory[0].period.start.toString())
        assertEquals("2014-09-14", obj.statusHistory[0].period.end.toString())
        assertTrue(stringMatch("active", obj.statusHistory[1].status))
        assertEquals("2014-09-15", obj.statusHistory[1].period.start.toString())
        assertEquals("2014-09-21", obj.statusHistory[1].period.end.toString())
        assertTrue(stringMatch("onhold", obj.statusHistory[2].status))
        assertEquals("2014-09-22", obj.statusHistory[2].period.start.toString())
        assertEquals("2014-09-24", obj.statusHistory[2].period.end.toString())
        assertTrue(stringMatch("active", obj.statusHistory[3].status))
        assertEquals("2014-09-25", obj.statusHistory[3].period.start.toString())
        assertTrue(stringMatch("http://hl7.org/fhir/episodeof", obj.type[0].coding[0].system))
        assertTrue(stringMatch("hacc", obj.type[0].coding[0].code))
        assertTrue(stringMatch("Home and Community Care", obj.type[0].coding[0].display))
        assertTrue(stringMatch("Condition/stroke", obj.diagnosis[0].condition.reference))
        assertTrue(stringMatch("http://hl7.org/fhir/diagnosis", obj.diagnosis[0].role!!.coding[0].system))
        assertTrue(stringMatch("CC", obj.diagnosis[0].role!!.coding[0].code))
        assertTrue(stringMatch("Chief complaint", obj.diagnosis[0].role!!.coding[0].display))
        assertEquals(1, obj.diagnosis[0].rank)
        assertTrue(stringMatch("Patient/example", obj.patient.reference))
        assertTrue(stringMatch("Organization/hl7", obj.managingOrganization!!.reference))
        assertEquals("2014-09-01", obj.period!!.start.toString())
        assertTrue(stringMatch("Referral from Example Aged Ca", obj.referralRequest[0].display))
        assertTrue(stringMatch("Practitioner/14", obj.careManager!!.reference))
        assertTrue(stringMatch("Amanda Assigned", obj.careManager!!.display))
        assertTrue(stringMatch("CareTeam/example", obj.team[0].reference))
        assertTrue(stringMatch("example care team", obj.team[0].display))
        assertTrue(stringMatch("Account/example", obj.account[0].reference))
        assertTrue(stringMatch("example account", obj.account[0].display))
    }
}