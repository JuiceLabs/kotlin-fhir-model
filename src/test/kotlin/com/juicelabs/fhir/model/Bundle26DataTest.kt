package com.juicelabs.fhir.model

import java.io.File
import kotlin.test.assertEquals
import kotlin.test.assertTrue
import org.junit.jupiter.api.Test

class Bundle26DataTest : DataTests() {
    @Test
    fun `practitionerrole-examples-general 392 Test`() {
        val json = File("./src/test/resources/model/sample_data/practitionerrole-examples-general.json").readTextAndClose()
        val obj = mapper.fromJson(json, Bundle::class.java)
        assertTrue(stringMatch("Practitioner/example", (obj.entry[2].resource!! as PractitionerRole).practitioner!!.reference))
        assertTrue(stringMatch("Adam Careful", (obj.entry[2].resource!! as PractitionerRole).practitioner!!.display))
        assertTrue(stringMatch("Organization/2", (obj.entry[2].resource!! as PractitionerRole).organization!!.reference))
        assertTrue(stringMatch("Good Health Clinic", (obj.entry[2].resource!! as PractitionerRole).organization!!.display))
        assertTrue(stringMatch("http://hl7.org/fhir/Practitio", obj.entry[3].fullUrl))
        assertTrue(stringMatch("PractitionerRole", (obj.entry[3].resource!! as PractitionerRole).resourceType))
        assertTrue(stringMatch("example-2", (obj.entry[3].resource!! as PractitionerRole).id))
        assertTrue(stringMatch("generated", (obj.entry[3].resource!! as PractitionerRole).text!!.status))
        assertTrue(stringMatch("<div xmlns=\"http://www.w3.org", (obj.entry[3].resource!! as PractitionerRole).text!!.div))
        assertEquals("2016-07-01", (obj.entry[3].resource!! as PractitionerRole).period!!.start.toString())
        assertEquals("2017-06-30", (obj.entry[3].resource!! as PractitionerRole).period!!.end.toString())
        assertTrue(stringMatch("Practitioner/example", (obj.entry[3].resource!! as PractitionerRole).practitioner!!.reference))
        assertTrue(stringMatch("Adam Careful", (obj.entry[3].resource!! as PractitionerRole).practitioner!!.display))
        assertTrue(stringMatch("Organization/2", (obj.entry[3].resource!! as PractitionerRole).organization!!.reference))
        assertTrue(stringMatch("Good Health Clinic", (obj.entry[3].resource!! as PractitionerRole).organization!!.display))
        assertTrue(stringMatch("On call physcologist", (obj.entry[3].resource!! as PractitionerRole).code[0].text))
        assertTrue(stringMatch("phone", (obj.entry[3].resource!! as PractitionerRole).telecom[0].system))
        assertTrue(stringMatch("555 123456", (obj.entry[3].resource!! as PractitionerRole).telecom[0].value))
        assertTrue(stringMatch("mobile", (obj.entry[3].resource!! as PractitionerRole).telecom[0].use))
        assertTrue(stringMatch("sat", (obj.entry[3].resource!! as PractitionerRole).availableTime[0].daysOfWeek[0]))
        assertTrue(stringMatch("sun", (obj.entry[3].resource!! as PractitionerRole).availableTime[0].daysOfWeek[1]))
        assertEquals(true, if ((obj.entry[3].resource!! as PractitionerRole).availableTime[0].allDay != null) (obj.entry[3].resource!! as PractitionerRole).availableTime[0].allDay else false, "Field: (obj.entry[3].resource!! as PractitionerRole).availableTime[0].allDay")
        assertTrue(stringMatch("Public Holidays", (obj.entry[3].resource!! as PractitionerRole).availabilityExceptions))
        assertTrue(stringMatch("http://hl7.org/fhir/Practitio", obj.entry[4].fullUrl))
        assertTrue(stringMatch("PractitionerRole", (obj.entry[4].resource!! as PractitionerRole).resourceType))
        assertTrue(stringMatch("f007-0", (obj.entry[4].resource!! as PractitionerRole).id))
        assertTrue(stringMatch("generated", (obj.entry[4].resource!! as PractitionerRole).text!!.status))
        assertTrue(stringMatch("<div xmlns=\"http://www.w3.org", (obj.entry[4].resource!! as PractitionerRole).text!!.div))
        assertTrue(stringMatch("Practitioner/f007", (obj.entry[4].resource!! as PractitionerRole).practitioner!!.reference))
        assertTrue(stringMatch("Simone Heps", (obj.entry[4].resource!! as PractitionerRole).practitioner!!.display))
        assertTrue(stringMatch("Organization/f001", (obj.entry[4].resource!! as PractitionerRole).organization!!.reference))
        assertTrue(stringMatch("BMC", (obj.entry[4].resource!! as PractitionerRole).organization!!.display))
        assertTrue(stringMatch("urn:oid:2.16.840.1.113883.2.4", (obj.entry[4].resource!! as PractitionerRole).code[0].coding[0].system))
        assertTrue(stringMatch("01.000", (obj.entry[4].resource!! as PractitionerRole).code[0].coding[0].code))
        assertTrue(stringMatch("Arts", (obj.entry[4].resource!! as PractitionerRole).code[0].coding[0].display))
        assertTrue(stringMatch("Care role", (obj.entry[4].resource!! as PractitionerRole).code[0].text))
        assertTrue(stringMatch("urn:oid:2.16.840.1.113883.2.4", (obj.entry[4].resource!! as PractitionerRole).specialty[0].coding[0].system))
        assertTrue(stringMatch("01.015", (obj.entry[4].resource!! as PractitionerRole).specialty[0].coding[0].code))
        assertTrue(stringMatch("Physician", (obj.entry[4].resource!! as PractitionerRole).specialty[0].coding[0].display))
        assertTrue(stringMatch("specialization", (obj.entry[4].resource!! as PractitionerRole).specialty[0].text))
        assertTrue(stringMatch("http://hl7.org/fhir/Practitio", obj.entry[5].fullUrl))
        assertTrue(stringMatch("PractitionerRole", (obj.entry[5].resource!! as PractitionerRole).resourceType))
        assertTrue(stringMatch("f004-0", (obj.entry[5].resource!! as PractitionerRole).id))
        assertTrue(stringMatch("generated", (obj.entry[5].resource!! as PractitionerRole).text!!.status))
        assertTrue(stringMatch("<div xmlns=\"http://www.w3.org", (obj.entry[5].resource!! as PractitionerRole).text!!.div))
        assertTrue(stringMatch("Practitioner/f004", (obj.entry[5].resource!! as PractitionerRole).practitioner!!.reference))
        assertTrue(stringMatch("Ronald Briet", (obj.entry[5].resource!! as PractitionerRole).practitioner!!.display))
        assertTrue(stringMatch("Organization/f001", (obj.entry[5].resource!! as PractitionerRole).organization!!.reference))
        assertTrue(stringMatch("BMC", (obj.entry[5].resource!! as PractitionerRole).organization!!.display))
        assertTrue(stringMatch("urn:oid:2.16.840.1.113883.2.4", (obj.entry[5].resource!! as PractitionerRole).code[0].coding[0].system))
        assertTrue(stringMatch("01.000", (obj.entry[5].resource!! as PractitionerRole).code[0].coding[0].code))
        assertTrue(stringMatch("Arts", (obj.entry[5].resource!! as PractitionerRole).code[0].coding[0].display))
        assertTrue(stringMatch("Care role", (obj.entry[5].resource!! as PractitionerRole).code[0].text))
        assertTrue(stringMatch("urn:oid:2.16.840.1.113883.2.4", (obj.entry[5].resource!! as PractitionerRole).specialty[0].coding[0].system))
        assertTrue(stringMatch("01.018", (obj.entry[5].resource!! as PractitionerRole).specialty[0].coding[0].code))
        assertTrue(stringMatch("Ear-, Nose and Throat", (obj.entry[5].resource!! as PractitionerRole).specialty[0].coding[0].display))
        assertTrue(stringMatch("specialization", (obj.entry[5].resource!! as PractitionerRole).specialty[0].text))
        assertTrue(stringMatch("http://hl7.org/fhir/Practitio", obj.entry[6].fullUrl))
        assertTrue(stringMatch("PractitionerRole", (obj.entry[6].resource!! as PractitionerRole).resourceType))
        assertTrue(stringMatch("xcda1-0", (obj.entry[6].resource!! as PractitionerRole).id))
        assertTrue(stringMatch("generated", (obj.entry[6].resource!! as PractitionerRole).text!!.status))
        assertTrue(stringMatch("<div xmlns=\"http://www.w3.org", (obj.entry[6].resource!! as PractitionerRole).text!!.div))
        assertTrue(stringMatch("Practitioner/xcda1", (obj.entry[6].resource!! as PractitionerRole).practitioner!!.reference))
        assertTrue(stringMatch("Sherry Dopplemeyer", (obj.entry[6].resource!! as PractitionerRole).practitioner!!.display))
        assertTrue(stringMatch("Cleveland Clinic", (obj.entry[6].resource!! as PractitionerRole).organization!!.display))
        assertTrue(stringMatch("Primary Surgon", (obj.entry[6].resource!! as PractitionerRole).code[0].text))
        assertTrue(stringMatch("Orthopedic", (obj.entry[6].resource!! as PractitionerRole).specialty[0].text))
        assertTrue(stringMatch("http://hl7.org/fhir/Practitio", obj.entry[7].fullUrl))
        assertTrue(stringMatch("PractitionerRole", (obj.entry[7].resource!! as PractitionerRole).resourceType))
        assertTrue(stringMatch("f202-0", (obj.entry[7].resource!! as PractitionerRole).id))
        assertTrue(stringMatch("generated", (obj.entry[7].resource!! as PractitionerRole).text!!.status))
    }
}