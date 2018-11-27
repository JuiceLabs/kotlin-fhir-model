package com.juicelabs.fhir.model

import java.io.File
import kotlin.test.assertEquals
import kotlin.test.assertTrue
import org.junit.jupiter.api.Test

class Bundle62DataTest : DataTests() {
    @Test
    fun `patient-examples-cypress-template 433 Test`() {
        val json = File("./src/test/resources/model/sample_data/patient-examples-cypress-template.json").readTextAndClose()
        val obj = mapper.fromJson(json, Bundle::class.java)
        assertTrue(stringMatch("generated", (obj.entry[61].resource!! as Patient).text!!.status))
        assertTrue(stringMatch("<div xmlns=\"http://www.w3.org", (obj.entry[61].resource!! as Patient).text!!.div))
        assertTrue(stringMatch("http://hl7.org/fhir/v2/0203", (obj.entry[61].resource!! as Patient).identifier[0].type!!.coding[0].system))
        assertTrue(stringMatch("SS", (obj.entry[61].resource!! as Patient).identifier[0].type!!.coding[0].code))
        assertTrue(stringMatch("https://github.com/projectcyp", (obj.entry[61].resource!! as Patient).identifier[0].system))
        assertTrue(stringMatch("577451", (obj.entry[61].resource!! as Patient).identifier[0].value))
        assertEquals(true, if ((obj.entry[61].resource!! as Patient).active != null) (obj.entry[61].resource!! as Patient).active else false, "Field: (obj.entry[61].resource!! as Patient).active")
        assertTrue(stringMatch("official", (obj.entry[61].resource!! as Patient).name[0].use))
        assertTrue(stringMatch("White", (obj.entry[61].resource!! as Patient).name[0].family))
        assertTrue(stringMatch("Wilma", (obj.entry[61].resource!! as Patient).name[0].given[0]))
        assertTrue(stringMatch("female", (obj.entry[61].resource!! as Patient).gender))
        assertEquals("1968-07-10", (obj.entry[61].resource!! as Patient).birthDate.toString())
        assertTrue(stringMatch("Organization/1", (obj.entry[61].resource!! as Patient).managingOrganization!!.reference))
        assertTrue(stringMatch("http://hl7.org/fhir/Patient/1", obj.entry[62].fullUrl))
        assertTrue(stringMatch("Patient", (obj.entry[62].resource!! as Patient).resourceType))
        assertTrue(stringMatch("133", (obj.entry[62].resource!! as Patient).id))
        assertEquals("2012-06-03T23:45:32Z", (obj.entry[62].resource!! as Patient).meta!!.lastUpdated.toString())
        assertTrue(stringMatch("generated", (obj.entry[62].resource!! as Patient).text!!.status))
        assertTrue(stringMatch("<div xmlns=\"http://www.w3.org", (obj.entry[62].resource!! as Patient).text!!.div))
        assertTrue(stringMatch("http://hl7.org/fhir/v2/0203", (obj.entry[62].resource!! as Patient).identifier[0].type!!.coding[0].system))
        assertTrue(stringMatch("SS", (obj.entry[62].resource!! as Patient).identifier[0].type!!.coding[0].code))
        assertTrue(stringMatch("https://github.com/projectcyp", (obj.entry[62].resource!! as Patient).identifier[0].system))
        assertTrue(stringMatch("577452", (obj.entry[62].resource!! as Patient).identifier[0].value))
        assertEquals(true, if ((obj.entry[62].resource!! as Patient).active != null) (obj.entry[62].resource!! as Patient).active else false, "Field: (obj.entry[62].resource!! as Patient).active")
        assertTrue(stringMatch("official", (obj.entry[62].resource!! as Patient).name[0].use))
        assertTrue(stringMatch("Drake", (obj.entry[62].resource!! as Patient).name[0].family))
        assertTrue(stringMatch("Ronald", (obj.entry[62].resource!! as Patient).name[0].given[0]))
        assertTrue(stringMatch("male", (obj.entry[62].resource!! as Patient).gender))
        assertEquals("1979-07-18", (obj.entry[62].resource!! as Patient).birthDate.toString())
        assertTrue(stringMatch("Organization/1", (obj.entry[62].resource!! as Patient).managingOrganization!!.reference))
        assertTrue(stringMatch("http://hl7.org/fhir/Patient/1", obj.entry[63].fullUrl))
        assertTrue(stringMatch("Patient", (obj.entry[63].resource!! as Patient).resourceType))
        assertTrue(stringMatch("134", (obj.entry[63].resource!! as Patient).id))
        assertEquals("2012-06-03T23:45:32Z", (obj.entry[63].resource!! as Patient).meta!!.lastUpdated.toString())
        assertTrue(stringMatch("generated", (obj.entry[63].resource!! as Patient).text!!.status))
        assertTrue(stringMatch("<div xmlns=\"http://www.w3.org", (obj.entry[63].resource!! as Patient).text!!.div))
        assertTrue(stringMatch("http://hl7.org/fhir/v2/0203", (obj.entry[63].resource!! as Patient).identifier[0].type!!.coding[0].system))
        assertTrue(stringMatch("SS", (obj.entry[63].resource!! as Patient).identifier[0].type!!.coding[0].code))
        assertTrue(stringMatch("https://github.com/projectcyp", (obj.entry[63].resource!! as Patient).identifier[0].system))
        assertTrue(stringMatch("577453", (obj.entry[63].resource!! as Patient).identifier[0].value))
        assertEquals(true, if ((obj.entry[63].resource!! as Patient).active != null) (obj.entry[63].resource!! as Patient).active else false, "Field: (obj.entry[63].resource!! as Patient).active")
        assertTrue(stringMatch("official", (obj.entry[63].resource!! as Patient).name[0].use))
        assertTrue(stringMatch("Phillips", (obj.entry[63].resource!! as Patient).name[0].family))
        assertTrue(stringMatch("Wanda", (obj.entry[63].resource!! as Patient).name[0].given[0]))
        assertTrue(stringMatch("female", (obj.entry[63].resource!! as Patient).gender))
        assertEquals("1980-04-23", (obj.entry[63].resource!! as Patient).birthDate.toString())
        assertTrue(stringMatch("Organization/1", (obj.entry[63].resource!! as Patient).managingOrganization!!.reference))
        assertTrue(stringMatch("http://hl7.org/fhir/Patient/1", obj.entry[64].fullUrl))
        assertTrue(stringMatch("Patient", (obj.entry[64].resource!! as Patient).resourceType))
        assertTrue(stringMatch("135", (obj.entry[64].resource!! as Patient).id))
        assertEquals("2012-06-03T23:45:32Z", (obj.entry[64].resource!! as Patient).meta!!.lastUpdated.toString())
        assertTrue(stringMatch("generated", (obj.entry[64].resource!! as Patient).text!!.status))
        assertTrue(stringMatch("<div xmlns=\"http://www.w3.org", (obj.entry[64].resource!! as Patient).text!!.div))
        assertTrue(stringMatch("http://hl7.org/fhir/v2/0203", (obj.entry[64].resource!! as Patient).identifier[0].type!!.coding[0].system))
        assertTrue(stringMatch("SS", (obj.entry[64].resource!! as Patient).identifier[0].type!!.coding[0].code))
        assertTrue(stringMatch("https://github.com/projectcyp", (obj.entry[64].resource!! as Patient).identifier[0].system))
        assertTrue(stringMatch("577454", (obj.entry[64].resource!! as Patient).identifier[0].value))
        assertEquals(true, if ((obj.entry[64].resource!! as Patient).active != null) (obj.entry[64].resource!! as Patient).active else false, "Field: (obj.entry[64].resource!! as Patient).active")
        assertTrue(stringMatch("official", (obj.entry[64].resource!! as Patient).name[0].use))
        assertTrue(stringMatch("Hansen", (obj.entry[64].resource!! as Patient).name[0].family))
        assertTrue(stringMatch("Chris", (obj.entry[64].resource!! as Patient).name[0].given[0]))
        assertTrue(stringMatch("male", (obj.entry[64].resource!! as Patient).gender))
        assertEquals("1956-11-28", (obj.entry[64].resource!! as Patient).birthDate.toString())
        assertTrue(stringMatch("Organization/1", (obj.entry[64].resource!! as Patient).managingOrganization!!.reference))
        assertTrue(stringMatch("http://hl7.org/fhir/Patient/1", obj.entry[65].fullUrl))
        assertTrue(stringMatch("Patient", (obj.entry[65].resource!! as Patient).resourceType))
        assertTrue(stringMatch("136", (obj.entry[65].resource!! as Patient).id))
        assertEquals("2012-06-03T23:45:32Z", (obj.entry[65].resource!! as Patient).meta!!.lastUpdated.toString())
        assertTrue(stringMatch("generated", (obj.entry[65].resource!! as Patient).text!!.status))
        assertTrue(stringMatch("<div xmlns=\"http://www.w3.org", (obj.entry[65].resource!! as Patient).text!!.div))
        assertTrue(stringMatch("http://hl7.org/fhir/v2/0203", (obj.entry[65].resource!! as Patient).identifier[0].type!!.coding[0].system))
    }
}
