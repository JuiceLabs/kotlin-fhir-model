package com.juicelabs.fhir.model

import java.io.File
import kotlin.test.assertEquals
import kotlin.test.assertTrue
import org.junit.jupiter.api.Test

class Bundle93DataTest : DataTests() {
    @Test
    fun `patient-examples-cypress-template 464 Test`() {
        val json = File("./src/test/resources/model/sample_data/patient-examples-cypress-template.json").readTextAndClose()
        val obj = mapper.fromJson(json, Bundle::class.java)
        assertTrue(stringMatch("Hayes", (obj.entry[190].resource!! as Patient).name[0].family))
        assertTrue(stringMatch("Peggy", (obj.entry[190].resource!! as Patient).name[0].given[0]))
        assertTrue(stringMatch("female", (obj.entry[190].resource!! as Patient).gender))
        assertEquals("2003-11-02", (obj.entry[190].resource!! as Patient).birthDate.toString())
        assertTrue(stringMatch("Organization/1", (obj.entry[190].resource!! as Patient).managingOrganization!!.reference))
        assertTrue(stringMatch("http://hl7.org/fhir/Patient/2", obj.entry[191].fullUrl))
        assertTrue(stringMatch("Patient", (obj.entry[191].resource!! as Patient).resourceType))
        assertTrue(stringMatch("262", (obj.entry[191].resource!! as Patient).id))
        assertEquals("2012-06-03T23:45:32Z", (obj.entry[191].resource!! as Patient).meta!!.lastUpdated.toString())
        assertTrue(stringMatch("generated", (obj.entry[191].resource!! as Patient).text!!.status))
        assertTrue(stringMatch("<div xmlns=\"http://www.w3.org", (obj.entry[191].resource!! as Patient).text!!.div))
        assertTrue(stringMatch("http://hl7.org/fhir/v2/0203", (obj.entry[191].resource!! as Patient).identifier[0].type!!.coding[0].system))
        assertTrue(stringMatch("SS", (obj.entry[191].resource!! as Patient).identifier[0].type!!.coding[0].code))
        assertTrue(stringMatch("https://github.com/projectcyp", (obj.entry[191].resource!! as Patient).identifier[0].system))
        assertTrue(stringMatch("577581", (obj.entry[191].resource!! as Patient).identifier[0].value))
        assertEquals(true, if ((obj.entry[191].resource!! as Patient).active != null) (obj.entry[191].resource!! as Patient).active else false, "Field: (obj.entry[191].resource!! as Patient).active")
        assertTrue(stringMatch("official", (obj.entry[191].resource!! as Patient).name[0].use))
        assertTrue(stringMatch("Fleming", (obj.entry[191].resource!! as Patient).name[0].family))
        assertTrue(stringMatch("Jo", (obj.entry[191].resource!! as Patient).name[0].given[0]))
        assertTrue(stringMatch("female", (obj.entry[191].resource!! as Patient).gender))
        assertEquals("1961-09-14", (obj.entry[191].resource!! as Patient).birthDate.toString())
        assertTrue(stringMatch("Organization/1", (obj.entry[191].resource!! as Patient).managingOrganization!!.reference))
        assertTrue(stringMatch("http://hl7.org/fhir/Patient/2", obj.entry[192].fullUrl))
        assertTrue(stringMatch("Patient", (obj.entry[192].resource!! as Patient).resourceType))
        assertTrue(stringMatch("263", (obj.entry[192].resource!! as Patient).id))
        assertEquals("2012-06-03T23:45:32Z", (obj.entry[192].resource!! as Patient).meta!!.lastUpdated.toString())
        assertTrue(stringMatch("generated", (obj.entry[192].resource!! as Patient).text!!.status))
        assertTrue(stringMatch("<div xmlns=\"http://www.w3.org", (obj.entry[192].resource!! as Patient).text!!.div))
        assertTrue(stringMatch("http://hl7.org/fhir/v2/0203", (obj.entry[192].resource!! as Patient).identifier[0].type!!.coding[0].system))
        assertTrue(stringMatch("SS", (obj.entry[192].resource!! as Patient).identifier[0].type!!.coding[0].code))
        assertTrue(stringMatch("https://github.com/projectcyp", (obj.entry[192].resource!! as Patient).identifier[0].system))
        assertTrue(stringMatch("577582", (obj.entry[192].resource!! as Patient).identifier[0].value))
        assertEquals(true, if ((obj.entry[192].resource!! as Patient).active != null) (obj.entry[192].resource!! as Patient).active else false, "Field: (obj.entry[192].resource!! as Patient).active")
        assertTrue(stringMatch("official", (obj.entry[192].resource!! as Patient).name[0].use))
        assertTrue(stringMatch("Lambert", (obj.entry[192].resource!! as Patient).name[0].family))
        assertTrue(stringMatch("Clarence", (obj.entry[192].resource!! as Patient).name[0].given[0]))
        assertTrue(stringMatch("male", (obj.entry[192].resource!! as Patient).gender))
        assertEquals("2002-12-14", (obj.entry[192].resource!! as Patient).birthDate.toString())
        assertTrue(stringMatch("Organization/1", (obj.entry[192].resource!! as Patient).managingOrganization!!.reference))
        assertTrue(stringMatch("http://hl7.org/fhir/Patient/2", obj.entry[193].fullUrl))
        assertTrue(stringMatch("Patient", (obj.entry[193].resource!! as Patient).resourceType))
        assertTrue(stringMatch("264", (obj.entry[193].resource!! as Patient).id))
        assertEquals("2012-06-03T23:45:32Z", (obj.entry[193].resource!! as Patient).meta!!.lastUpdated.toString())
        assertTrue(stringMatch("generated", (obj.entry[193].resource!! as Patient).text!!.status))
        assertTrue(stringMatch("<div xmlns=\"http://www.w3.org", (obj.entry[193].resource!! as Patient).text!!.div))
        assertTrue(stringMatch("http://hl7.org/fhir/v2/0203", (obj.entry[193].resource!! as Patient).identifier[0].type!!.coding[0].system))
        assertTrue(stringMatch("SS", (obj.entry[193].resource!! as Patient).identifier[0].type!!.coding[0].code))
        assertTrue(stringMatch("https://github.com/projectcyp", (obj.entry[193].resource!! as Patient).identifier[0].system))
        assertTrue(stringMatch("577583", (obj.entry[193].resource!! as Patient).identifier[0].value))
        assertEquals(true, if ((obj.entry[193].resource!! as Patient).active != null) (obj.entry[193].resource!! as Patient).active else false, "Field: (obj.entry[193].resource!! as Patient).active")
        assertTrue(stringMatch("official", (obj.entry[193].resource!! as Patient).name[0].use))
        assertTrue(stringMatch("Pena", (obj.entry[193].resource!! as Patient).name[0].family))
        assertTrue(stringMatch("Marsha", (obj.entry[193].resource!! as Patient).name[0].given[0]))
        assertTrue(stringMatch("female", (obj.entry[193].resource!! as Patient).gender))
        assertEquals("2001-11-02", (obj.entry[193].resource!! as Patient).birthDate.toString())
        assertTrue(stringMatch("Organization/1", (obj.entry[193].resource!! as Patient).managingOrganization!!.reference))
        assertTrue(stringMatch("http://hl7.org/fhir/Patient/2", obj.entry[194].fullUrl))
        assertTrue(stringMatch("Patient", (obj.entry[194].resource!! as Patient).resourceType))
        assertTrue(stringMatch("265", (obj.entry[194].resource!! as Patient).id))
        assertEquals("2012-06-03T23:45:32Z", (obj.entry[194].resource!! as Patient).meta!!.lastUpdated.toString())
        assertTrue(stringMatch("generated", (obj.entry[194].resource!! as Patient).text!!.status))
        assertTrue(stringMatch("<div xmlns=\"http://www.w3.org", (obj.entry[194].resource!! as Patient).text!!.div))
        assertTrue(stringMatch("http://hl7.org/fhir/v2/0203", (obj.entry[194].resource!! as Patient).identifier[0].type!!.coding[0].system))
        assertTrue(stringMatch("SS", (obj.entry[194].resource!! as Patient).identifier[0].type!!.coding[0].code))
        assertTrue(stringMatch("https://github.com/projectcyp", (obj.entry[194].resource!! as Patient).identifier[0].system))
        assertTrue(stringMatch("577584", (obj.entry[194].resource!! as Patient).identifier[0].value))
        assertEquals(true, if ((obj.entry[194].resource!! as Patient).active != null) (obj.entry[194].resource!! as Patient).active else false, "Field: (obj.entry[194].resource!! as Patient).active")
        assertTrue(stringMatch("official", (obj.entry[194].resource!! as Patient).name[0].use))
        assertTrue(stringMatch("Jefferson", (obj.entry[194].resource!! as Patient).name[0].family))
        assertTrue(stringMatch("Michele", (obj.entry[194].resource!! as Patient).name[0].given[0]))
        assertTrue(stringMatch("female", (obj.entry[194].resource!! as Patient).gender))
    }
}