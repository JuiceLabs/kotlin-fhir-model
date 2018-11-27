package com.juicelabs.fhir.model

import java.io.File
import kotlin.test.assertEquals
import kotlin.test.assertTrue
import org.junit.jupiter.api.Test

class Bundle68DataTest : DataTests() {
    @Test
    fun `patient-examples-cypress-template 439 Test`() {
        val json = File("./src/test/resources/model/sample_data/patient-examples-cypress-template.json").readTextAndClose()
        val obj = mapper.fromJson(json, Bundle::class.java)
        assertTrue(stringMatch("<div xmlns=\"http://www.w3.org", (obj.entry[86].resource!! as Patient).text!!.div))
        assertTrue(stringMatch("http://hl7.org/fhir/v2/0203", (obj.entry[86].resource!! as Patient).identifier[0].type!!.coding[0].system))
        assertTrue(stringMatch("SS", (obj.entry[86].resource!! as Patient).identifier[0].type!!.coding[0].code))
        assertTrue(stringMatch("https://github.com/projectcyp", (obj.entry[86].resource!! as Patient).identifier[0].system))
        assertTrue(stringMatch("577476", (obj.entry[86].resource!! as Patient).identifier[0].value))
        assertEquals(true, if ((obj.entry[86].resource!! as Patient).active != null) (obj.entry[86].resource!! as Patient).active else false, "Field: (obj.entry[86].resource!! as Patient).active")
        assertTrue(stringMatch("official", (obj.entry[86].resource!! as Patient).name[0].use))
        assertTrue(stringMatch("Burton", (obj.entry[86].resource!! as Patient).name[0].family))
        assertTrue(stringMatch("Darren", (obj.entry[86].resource!! as Patient).name[0].given[0]))
        assertTrue(stringMatch("male", (obj.entry[86].resource!! as Patient).gender))
        assertEquals("1938-02-13", (obj.entry[86].resource!! as Patient).birthDate.toString())
        assertTrue(stringMatch("Organization/1", (obj.entry[86].resource!! as Patient).managingOrganization!!.reference))
        assertTrue(stringMatch("http://hl7.org/fhir/Patient/1", obj.entry[87].fullUrl))
        assertTrue(stringMatch("Patient", (obj.entry[87].resource!! as Patient).resourceType))
        assertTrue(stringMatch("158", (obj.entry[87].resource!! as Patient).id))
        assertEquals("2012-06-03T23:45:32Z", (obj.entry[87].resource!! as Patient).meta!!.lastUpdated.toString())
        assertTrue(stringMatch("generated", (obj.entry[87].resource!! as Patient).text!!.status))
        assertTrue(stringMatch("<div xmlns=\"http://www.w3.org", (obj.entry[87].resource!! as Patient).text!!.div))
        assertTrue(stringMatch("http://hl7.org/fhir/v2/0203", (obj.entry[87].resource!! as Patient).identifier[0].type!!.coding[0].system))
        assertTrue(stringMatch("SS", (obj.entry[87].resource!! as Patient).identifier[0].type!!.coding[0].code))
        assertTrue(stringMatch("https://github.com/projectcyp", (obj.entry[87].resource!! as Patient).identifier[0].system))
        assertTrue(stringMatch("577477", (obj.entry[87].resource!! as Patient).identifier[0].value))
        assertEquals(true, if ((obj.entry[87].resource!! as Patient).active != null) (obj.entry[87].resource!! as Patient).active else false, "Field: (obj.entry[87].resource!! as Patient).active")
        assertTrue(stringMatch("official", (obj.entry[87].resource!! as Patient).name[0].use))
        assertTrue(stringMatch("Swanson", (obj.entry[87].resource!! as Patient).name[0].family))
        assertTrue(stringMatch("Deanna", (obj.entry[87].resource!! as Patient).name[0].given[0]))
        assertTrue(stringMatch("female", (obj.entry[87].resource!! as Patient).gender))
        assertEquals("1936-02-08", (obj.entry[87].resource!! as Patient).birthDate.toString())
        assertTrue(stringMatch("Organization/1", (obj.entry[87].resource!! as Patient).managingOrganization!!.reference))
        assertTrue(stringMatch("http://hl7.org/fhir/Patient/1", obj.entry[88].fullUrl))
        assertTrue(stringMatch("Patient", (obj.entry[88].resource!! as Patient).resourceType))
        assertTrue(stringMatch("159", (obj.entry[88].resource!! as Patient).id))
        assertEquals("2012-06-03T23:45:32Z", (obj.entry[88].resource!! as Patient).meta!!.lastUpdated.toString())
        assertTrue(stringMatch("generated", (obj.entry[88].resource!! as Patient).text!!.status))
        assertTrue(stringMatch("<div xmlns=\"http://www.w3.org", (obj.entry[88].resource!! as Patient).text!!.div))
        assertTrue(stringMatch("http://hl7.org/fhir/v2/0203", (obj.entry[88].resource!! as Patient).identifier[0].type!!.coding[0].system))
        assertTrue(stringMatch("SS", (obj.entry[88].resource!! as Patient).identifier[0].type!!.coding[0].code))
        assertTrue(stringMatch("https://github.com/projectcyp", (obj.entry[88].resource!! as Patient).identifier[0].system))
        assertTrue(stringMatch("577478", (obj.entry[88].resource!! as Patient).identifier[0].value))
        assertEquals(true, if ((obj.entry[88].resource!! as Patient).active != null) (obj.entry[88].resource!! as Patient).active else false, "Field: (obj.entry[88].resource!! as Patient).active")
        assertTrue(stringMatch("official", (obj.entry[88].resource!! as Patient).name[0].use))
        assertTrue(stringMatch("Roberts", (obj.entry[88].resource!! as Patient).name[0].family))
        assertTrue(stringMatch("Ben", (obj.entry[88].resource!! as Patient).name[0].given[0]))
        assertTrue(stringMatch("male", (obj.entry[88].resource!! as Patient).gender))
        assertEquals("1943-01-05", (obj.entry[88].resource!! as Patient).birthDate.toString())
        assertTrue(stringMatch("Organization/1", (obj.entry[88].resource!! as Patient).managingOrganization!!.reference))
        assertTrue(stringMatch("http://hl7.org/fhir/Patient/1", obj.entry[89].fullUrl))
        assertTrue(stringMatch("Patient", (obj.entry[89].resource!! as Patient).resourceType))
        assertTrue(stringMatch("160", (obj.entry[89].resource!! as Patient).id))
        assertEquals("2012-06-03T23:45:32Z", (obj.entry[89].resource!! as Patient).meta!!.lastUpdated.toString())
        assertTrue(stringMatch("generated", (obj.entry[89].resource!! as Patient).text!!.status))
        assertTrue(stringMatch("<div xmlns=\"http://www.w3.org", (obj.entry[89].resource!! as Patient).text!!.div))
        assertTrue(stringMatch("http://hl7.org/fhir/v2/0203", (obj.entry[89].resource!! as Patient).identifier[0].type!!.coding[0].system))
        assertTrue(stringMatch("SS", (obj.entry[89].resource!! as Patient).identifier[0].type!!.coding[0].code))
        assertTrue(stringMatch("https://github.com/projectcyp", (obj.entry[89].resource!! as Patient).identifier[0].system))
        assertTrue(stringMatch("577479", (obj.entry[89].resource!! as Patient).identifier[0].value))
        assertEquals(true, if ((obj.entry[89].resource!! as Patient).active != null) (obj.entry[89].resource!! as Patient).active else false, "Field: (obj.entry[89].resource!! as Patient).active")
        assertTrue(stringMatch("official", (obj.entry[89].resource!! as Patient).name[0].use))
        assertTrue(stringMatch("Little", (obj.entry[89].resource!! as Patient).name[0].family))
        assertTrue(stringMatch("Dora", (obj.entry[89].resource!! as Patient).name[0].given[0]))
        assertTrue(stringMatch("female", (obj.entry[89].resource!! as Patient).gender))
        assertEquals("1950-02-06", (obj.entry[89].resource!! as Patient).birthDate.toString())
        assertTrue(stringMatch("Organization/1", (obj.entry[89].resource!! as Patient).managingOrganization!!.reference))
        assertTrue(stringMatch("http://hl7.org/fhir/Patient/1", obj.entry[90].fullUrl))
        assertTrue(stringMatch("Patient", (obj.entry[90].resource!! as Patient).resourceType))
        assertTrue(stringMatch("161", (obj.entry[90].resource!! as Patient).id))
        assertEquals("2012-06-03T23:45:32Z", (obj.entry[90].resource!! as Patient).meta!!.lastUpdated.toString())
        assertTrue(stringMatch("generated", (obj.entry[90].resource!! as Patient).text!!.status))
        assertTrue(stringMatch("<div xmlns=\"http://www.w3.org", (obj.entry[90].resource!! as Patient).text!!.div))
        assertTrue(stringMatch("http://hl7.org/fhir/v2/0203", (obj.entry[90].resource!! as Patient).identifier[0].type!!.coding[0].system))
        assertTrue(stringMatch("SS", (obj.entry[90].resource!! as Patient).identifier[0].type!!.coding[0].code))
    }
}