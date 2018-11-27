package com.juicelabs.fhir.model

import java.io.File
import kotlin.test.assertEquals
import kotlin.test.assertTrue
import org.junit.jupiter.api.Test

class Bundle54DataTest : DataTests() {
    @Test
    fun `patient-examples-cypress-template 425 Test`() {
        val json = File("./src/test/resources/model/sample_data/patient-examples-cypress-template.json").readTextAndClose()
        val obj = mapper.fromJson(json, Bundle::class.java)
        assertTrue(stringMatch("male", (obj.entry[27].resource!! as Patient).gender))
        assertEquals("1945-05-08", (obj.entry[27].resource!! as Patient).birthDate.toString())
        assertTrue(stringMatch("Organization/1", (obj.entry[27].resource!! as Patient).managingOrganization!!.reference))
        assertTrue(stringMatch("http://hl7.org/fhir/Patient/9", obj.entry[28].fullUrl))
        assertTrue(stringMatch("Patient", (obj.entry[28].resource!! as Patient).resourceType))
        assertTrue(stringMatch("99", (obj.entry[28].resource!! as Patient).id))
        assertEquals("2012-06-03T23:45:32Z", (obj.entry[28].resource!! as Patient).meta!!.lastUpdated.toString())
        assertTrue(stringMatch("generated", (obj.entry[28].resource!! as Patient).text!!.status))
        assertTrue(stringMatch("<div xmlns=\"http://www.w3.org", (obj.entry[28].resource!! as Patient).text!!.div))
        assertTrue(stringMatch("http://hl7.org/fhir/v2/0203", (obj.entry[28].resource!! as Patient).identifier[0].type!!.coding[0].system))
        assertTrue(stringMatch("SS", (obj.entry[28].resource!! as Patient).identifier[0].type!!.coding[0].code))
        assertTrue(stringMatch("https://github.com/projectcyp", (obj.entry[28].resource!! as Patient).identifier[0].system))
        assertTrue(stringMatch("577418", (obj.entry[28].resource!! as Patient).identifier[0].value))
        assertEquals(true, if ((obj.entry[28].resource!! as Patient).active != null) (obj.entry[28].resource!! as Patient).active else false, "Field: (obj.entry[28].resource!! as Patient).active")
        assertTrue(stringMatch("official", (obj.entry[28].resource!! as Patient).name[0].use))
        assertTrue(stringMatch("Bridges", (obj.entry[28].resource!! as Patient).name[0].family))
        assertTrue(stringMatch("Chester", (obj.entry[28].resource!! as Patient).name[0].given[0]))
        assertTrue(stringMatch("male", (obj.entry[28].resource!! as Patient).gender))
        assertEquals("1968-09-08", (obj.entry[28].resource!! as Patient).birthDate.toString())
        assertTrue(stringMatch("Organization/1", (obj.entry[28].resource!! as Patient).managingOrganization!!.reference))
        assertTrue(stringMatch("http://hl7.org/fhir/Patient/1", obj.entry[29].fullUrl))
        assertTrue(stringMatch("Patient", (obj.entry[29].resource!! as Patient).resourceType))
        assertTrue(stringMatch("100", (obj.entry[29].resource!! as Patient).id))
        assertEquals("2012-06-03T23:45:32Z", (obj.entry[29].resource!! as Patient).meta!!.lastUpdated.toString())
        assertTrue(stringMatch("generated", (obj.entry[29].resource!! as Patient).text!!.status))
        assertTrue(stringMatch("<div xmlns=\"http://www.w3.org", (obj.entry[29].resource!! as Patient).text!!.div))
        assertTrue(stringMatch("http://hl7.org/fhir/v2/0203", (obj.entry[29].resource!! as Patient).identifier[0].type!!.coding[0].system))
        assertTrue(stringMatch("SS", (obj.entry[29].resource!! as Patient).identifier[0].type!!.coding[0].code))
        assertTrue(stringMatch("https://github.com/projectcyp", (obj.entry[29].resource!! as Patient).identifier[0].system))
        assertTrue(stringMatch("577419", (obj.entry[29].resource!! as Patient).identifier[0].value))
        assertEquals(true, if ((obj.entry[29].resource!! as Patient).active != null) (obj.entry[29].resource!! as Patient).active else false, "Field: (obj.entry[29].resource!! as Patient).active")
        assertTrue(stringMatch("official", (obj.entry[29].resource!! as Patient).name[0].use))
        assertTrue(stringMatch("Garrett", (obj.entry[29].resource!! as Patient).name[0].family))
        assertTrue(stringMatch("Gordon", (obj.entry[29].resource!! as Patient).name[0].given[0]))
        assertTrue(stringMatch("male", (obj.entry[29].resource!! as Patient).gender))
        assertEquals("1935-05-08", (obj.entry[29].resource!! as Patient).birthDate.toString())
        assertTrue(stringMatch("Organization/1", (obj.entry[29].resource!! as Patient).managingOrganization!!.reference))
        assertTrue(stringMatch("http://hl7.org/fhir/Patient/1", obj.entry[30].fullUrl))
        assertTrue(stringMatch("Patient", (obj.entry[30].resource!! as Patient).resourceType))
        assertTrue(stringMatch("101", (obj.entry[30].resource!! as Patient).id))
        assertEquals("2012-06-03T23:45:32Z", (obj.entry[30].resource!! as Patient).meta!!.lastUpdated.toString())
        assertTrue(stringMatch("generated", (obj.entry[30].resource!! as Patient).text!!.status))
        assertTrue(stringMatch("<div xmlns=\"http://www.w3.org", (obj.entry[30].resource!! as Patient).text!!.div))
        assertTrue(stringMatch("http://hl7.org/fhir/v2/0203", (obj.entry[30].resource!! as Patient).identifier[0].type!!.coding[0].system))
        assertTrue(stringMatch("SS", (obj.entry[30].resource!! as Patient).identifier[0].type!!.coding[0].code))
        assertTrue(stringMatch("https://github.com/projectcyp", (obj.entry[30].resource!! as Patient).identifier[0].system))
        assertTrue(stringMatch("577420", (obj.entry[30].resource!! as Patient).identifier[0].value))
        assertEquals(true, if ((obj.entry[30].resource!! as Patient).active != null) (obj.entry[30].resource!! as Patient).active else false, "Field: (obj.entry[30].resource!! as Patient).active")
        assertTrue(stringMatch("official", (obj.entry[30].resource!! as Patient).name[0].use))
        assertTrue(stringMatch("Lamb", (obj.entry[30].resource!! as Patient).name[0].family))
        assertTrue(stringMatch("Greg", (obj.entry[30].resource!! as Patient).name[0].given[0]))
        assertTrue(stringMatch("male", (obj.entry[30].resource!! as Patient).gender))
        assertEquals("1938-08-29", (obj.entry[30].resource!! as Patient).birthDate.toString())
        assertTrue(stringMatch("Organization/1", (obj.entry[30].resource!! as Patient).managingOrganization!!.reference))
        assertTrue(stringMatch("http://hl7.org/fhir/Patient/1", obj.entry[31].fullUrl))
        assertTrue(stringMatch("Patient", (obj.entry[31].resource!! as Patient).resourceType))
        assertTrue(stringMatch("102", (obj.entry[31].resource!! as Patient).id))
        assertEquals("2012-06-03T23:45:32Z", (obj.entry[31].resource!! as Patient).meta!!.lastUpdated.toString())
        assertTrue(stringMatch("generated", (obj.entry[31].resource!! as Patient).text!!.status))
        assertTrue(stringMatch("<div xmlns=\"http://www.w3.org", (obj.entry[31].resource!! as Patient).text!!.div))
        assertTrue(stringMatch("http://hl7.org/fhir/v2/0203", (obj.entry[31].resource!! as Patient).identifier[0].type!!.coding[0].system))
        assertTrue(stringMatch("SS", (obj.entry[31].resource!! as Patient).identifier[0].type!!.coding[0].code))
        assertTrue(stringMatch("https://github.com/projectcyp", (obj.entry[31].resource!! as Patient).identifier[0].system))
        assertTrue(stringMatch("577421", (obj.entry[31].resource!! as Patient).identifier[0].value))
        assertEquals(true, if ((obj.entry[31].resource!! as Patient).active != null) (obj.entry[31].resource!! as Patient).active else false, "Field: (obj.entry[31].resource!! as Patient).active")
        assertTrue(stringMatch("official", (obj.entry[31].resource!! as Patient).name[0].use))
        assertTrue(stringMatch("Garcia", (obj.entry[31].resource!! as Patient).name[0].family))
        assertTrue(stringMatch("Jessie", (obj.entry[31].resource!! as Patient).name[0].given[0]))
        assertTrue(stringMatch("female", (obj.entry[31].resource!! as Patient).gender))
        assertEquals("1949-05-08", (obj.entry[31].resource!! as Patient).birthDate.toString())
        assertTrue(stringMatch("Organization/1", (obj.entry[31].resource!! as Patient).managingOrganization!!.reference))
    }
}