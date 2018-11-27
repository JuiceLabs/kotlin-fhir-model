package com.juicelabs.fhir.model

import java.io.File
import kotlin.test.assertEquals
import kotlin.test.assertTrue
import org.junit.jupiter.api.Test

class Bundle67DataTest : DataTests() {
    @Test
    fun `patient-examples-cypress-template 438 Test`() {
        val json = File("./src/test/resources/model/sample_data/patient-examples-cypress-template.json").readTextAndClose()
        val obj = mapper.fromJson(json, Bundle::class.java)
        assertTrue(stringMatch("153", (obj.entry[82].resource!! as Patient).id))
        assertEquals("2012-06-03T23:45:32Z", (obj.entry[82].resource!! as Patient).meta!!.lastUpdated.toString())
        assertTrue(stringMatch("generated", (obj.entry[82].resource!! as Patient).text!!.status))
        assertTrue(stringMatch("<div xmlns=\"http://www.w3.org", (obj.entry[82].resource!! as Patient).text!!.div))
        assertTrue(stringMatch("http://hl7.org/fhir/v2/0203", (obj.entry[82].resource!! as Patient).identifier[0].type!!.coding[0].system))
        assertTrue(stringMatch("SS", (obj.entry[82].resource!! as Patient).identifier[0].type!!.coding[0].code))
        assertTrue(stringMatch("https://github.com/projectcyp", (obj.entry[82].resource!! as Patient).identifier[0].system))
        assertTrue(stringMatch("577472", (obj.entry[82].resource!! as Patient).identifier[0].value))
        assertEquals(true, if ((obj.entry[82].resource!! as Patient).active != null) (obj.entry[82].resource!! as Patient).active else false, "Field: (obj.entry[82].resource!! as Patient).active")
        assertTrue(stringMatch("official", (obj.entry[82].resource!! as Patient).name[0].use))
        assertTrue(stringMatch("Chambers", (obj.entry[82].resource!! as Patient).name[0].family))
        assertTrue(stringMatch("Darren", (obj.entry[82].resource!! as Patient).name[0].given[0]))
        assertTrue(stringMatch("male", (obj.entry[82].resource!! as Patient).gender))
        assertEquals("1963-04-14", (obj.entry[82].resource!! as Patient).birthDate.toString())
        assertTrue(stringMatch("Organization/1", (obj.entry[82].resource!! as Patient).managingOrganization!!.reference))
        assertTrue(stringMatch("http://hl7.org/fhir/Patient/1", obj.entry[83].fullUrl))
        assertTrue(stringMatch("Patient", (obj.entry[83].resource!! as Patient).resourceType))
        assertTrue(stringMatch("154", (obj.entry[83].resource!! as Patient).id))
        assertEquals("2012-06-03T23:45:32Z", (obj.entry[83].resource!! as Patient).meta!!.lastUpdated.toString())
        assertTrue(stringMatch("generated", (obj.entry[83].resource!! as Patient).text!!.status))
        assertTrue(stringMatch("<div xmlns=\"http://www.w3.org", (obj.entry[83].resource!! as Patient).text!!.div))
        assertTrue(stringMatch("http://hl7.org/fhir/v2/0203", (obj.entry[83].resource!! as Patient).identifier[0].type!!.coding[0].system))
        assertTrue(stringMatch("SS", (obj.entry[83].resource!! as Patient).identifier[0].type!!.coding[0].code))
        assertTrue(stringMatch("https://github.com/projectcyp", (obj.entry[83].resource!! as Patient).identifier[0].system))
        assertTrue(stringMatch("577473", (obj.entry[83].resource!! as Patient).identifier[0].value))
        assertEquals(true, if ((obj.entry[83].resource!! as Patient).active != null) (obj.entry[83].resource!! as Patient).active else false, "Field: (obj.entry[83].resource!! as Patient).active")
        assertTrue(stringMatch("official", (obj.entry[83].resource!! as Patient).name[0].use))
        assertTrue(stringMatch("Walsh", (obj.entry[83].resource!! as Patient).name[0].family))
        assertTrue(stringMatch("Catherine", (obj.entry[83].resource!! as Patient).name[0].given[0]))
        assertTrue(stringMatch("female", (obj.entry[83].resource!! as Patient).gender))
        assertEquals("1944-06-17", (obj.entry[83].resource!! as Patient).birthDate.toString())
        assertTrue(stringMatch("Organization/1", (obj.entry[83].resource!! as Patient).managingOrganization!!.reference))
        assertTrue(stringMatch("http://hl7.org/fhir/Patient/1", obj.entry[84].fullUrl))
        assertTrue(stringMatch("Patient", (obj.entry[84].resource!! as Patient).resourceType))
        assertTrue(stringMatch("155", (obj.entry[84].resource!! as Patient).id))
        assertEquals("2012-06-03T23:45:32Z", (obj.entry[84].resource!! as Patient).meta!!.lastUpdated.toString())
        assertTrue(stringMatch("generated", (obj.entry[84].resource!! as Patient).text!!.status))
        assertTrue(stringMatch("<div xmlns=\"http://www.w3.org", (obj.entry[84].resource!! as Patient).text!!.div))
        assertTrue(stringMatch("http://hl7.org/fhir/v2/0203", (obj.entry[84].resource!! as Patient).identifier[0].type!!.coding[0].system))
        assertTrue(stringMatch("SS", (obj.entry[84].resource!! as Patient).identifier[0].type!!.coding[0].code))
        assertTrue(stringMatch("https://github.com/projectcyp", (obj.entry[84].resource!! as Patient).identifier[0].system))
        assertTrue(stringMatch("577474", (obj.entry[84].resource!! as Patient).identifier[0].value))
        assertEquals(true, if ((obj.entry[84].resource!! as Patient).active != null) (obj.entry[84].resource!! as Patient).active else false, "Field: (obj.entry[84].resource!! as Patient).active")
        assertTrue(stringMatch("official", (obj.entry[84].resource!! as Patient).name[0].use))
        assertTrue(stringMatch("Simon", (obj.entry[84].resource!! as Patient).name[0].family))
        assertTrue(stringMatch("Gregory", (obj.entry[84].resource!! as Patient).name[0].given[0]))
        assertTrue(stringMatch("male", (obj.entry[84].resource!! as Patient).gender))
        assertEquals("1975-06-17", (obj.entry[84].resource!! as Patient).birthDate.toString())
        assertTrue(stringMatch("Organization/1", (obj.entry[84].resource!! as Patient).managingOrganization!!.reference))
        assertTrue(stringMatch("http://hl7.org/fhir/Patient/1", obj.entry[85].fullUrl))
        assertTrue(stringMatch("Patient", (obj.entry[85].resource!! as Patient).resourceType))
        assertTrue(stringMatch("156", (obj.entry[85].resource!! as Patient).id))
        assertEquals("2012-06-03T23:45:32Z", (obj.entry[85].resource!! as Patient).meta!!.lastUpdated.toString())
        assertTrue(stringMatch("generated", (obj.entry[85].resource!! as Patient).text!!.status))
        assertTrue(stringMatch("<div xmlns=\"http://www.w3.org", (obj.entry[85].resource!! as Patient).text!!.div))
        assertTrue(stringMatch("http://hl7.org/fhir/v2/0203", (obj.entry[85].resource!! as Patient).identifier[0].type!!.coding[0].system))
        assertTrue(stringMatch("SS", (obj.entry[85].resource!! as Patient).identifier[0].type!!.coding[0].code))
        assertTrue(stringMatch("https://github.com/projectcyp", (obj.entry[85].resource!! as Patient).identifier[0].system))
        assertTrue(stringMatch("577475", (obj.entry[85].resource!! as Patient).identifier[0].value))
        assertEquals(true, if ((obj.entry[85].resource!! as Patient).active != null) (obj.entry[85].resource!! as Patient).active else false, "Field: (obj.entry[85].resource!! as Patient).active")
        assertTrue(stringMatch("official", (obj.entry[85].resource!! as Patient).name[0].use))
        assertTrue(stringMatch("Johnson", (obj.entry[85].resource!! as Patient).name[0].family))
        assertTrue(stringMatch("Charlene", (obj.entry[85].resource!! as Patient).name[0].given[0]))
        assertTrue(stringMatch("female", (obj.entry[85].resource!! as Patient).gender))
        assertEquals("1992-09-19", (obj.entry[85].resource!! as Patient).birthDate.toString())
        assertTrue(stringMatch("Organization/1", (obj.entry[85].resource!! as Patient).managingOrganization!!.reference))
        assertTrue(stringMatch("http://hl7.org/fhir/Patient/1", obj.entry[86].fullUrl))
        assertTrue(stringMatch("Patient", (obj.entry[86].resource!! as Patient).resourceType))
        assertTrue(stringMatch("157", (obj.entry[86].resource!! as Patient).id))
        assertEquals("2012-06-03T23:45:32Z", (obj.entry[86].resource!! as Patient).meta!!.lastUpdated.toString())
        assertTrue(stringMatch("generated", (obj.entry[86].resource!! as Patient).text!!.status))
    }
}
