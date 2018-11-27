package com.juicelabs.fhir.model

import java.io.File
import kotlin.test.assertEquals
import kotlin.test.assertTrue
import org.junit.jupiter.api.Test

class Bundle61DataTest : DataTests() {
    @Test
    fun `patient-examples-cypress-template 432 Test`() {
        val json = File("./src/test/resources/model/sample_data/patient-examples-cypress-template.json").readTextAndClose()
        val obj = mapper.fromJson(json, Bundle::class.java)
        assertTrue(stringMatch("Patient", (obj.entry[57].resource!! as Patient).resourceType))
        assertTrue(stringMatch("128", (obj.entry[57].resource!! as Patient).id))
        assertEquals("2012-06-03T23:45:32Z", (obj.entry[57].resource!! as Patient).meta!!.lastUpdated.toString())
        assertTrue(stringMatch("generated", (obj.entry[57].resource!! as Patient).text!!.status))
        assertTrue(stringMatch("<div xmlns=\"http://www.w3.org", (obj.entry[57].resource!! as Patient).text!!.div))
        assertTrue(stringMatch("http://hl7.org/fhir/v2/0203", (obj.entry[57].resource!! as Patient).identifier[0].type!!.coding[0].system))
        assertTrue(stringMatch("SS", (obj.entry[57].resource!! as Patient).identifier[0].type!!.coding[0].code))
        assertTrue(stringMatch("https://github.com/projectcyp", (obj.entry[57].resource!! as Patient).identifier[0].system))
        assertTrue(stringMatch("577447", (obj.entry[57].resource!! as Patient).identifier[0].value))
        assertEquals(true, if ((obj.entry[57].resource!! as Patient).active != null) (obj.entry[57].resource!! as Patient).active else false, "Field: (obj.entry[57].resource!! as Patient).active")
        assertTrue(stringMatch("official", (obj.entry[57].resource!! as Patient).name[0].use))
        assertTrue(stringMatch("Sparks", (obj.entry[57].resource!! as Patient).name[0].family))
        assertTrue(stringMatch("Louise", (obj.entry[57].resource!! as Patient).name[0].given[0]))
        assertTrue(stringMatch("female", (obj.entry[57].resource!! as Patient).gender))
        assertEquals("1968-11-27", (obj.entry[57].resource!! as Patient).birthDate.toString())
        assertTrue(stringMatch("Organization/1", (obj.entry[57].resource!! as Patient).managingOrganization!!.reference))
        assertTrue(stringMatch("http://hl7.org/fhir/Patient/1", obj.entry[58].fullUrl))
        assertTrue(stringMatch("Patient", (obj.entry[58].resource!! as Patient).resourceType))
        assertTrue(stringMatch("129", (obj.entry[58].resource!! as Patient).id))
        assertEquals("2012-06-03T23:45:32Z", (obj.entry[58].resource!! as Patient).meta!!.lastUpdated.toString())
        assertTrue(stringMatch("generated", (obj.entry[58].resource!! as Patient).text!!.status))
        assertTrue(stringMatch("<div xmlns=\"http://www.w3.org", (obj.entry[58].resource!! as Patient).text!!.div))
        assertTrue(stringMatch("http://hl7.org/fhir/v2/0203", (obj.entry[58].resource!! as Patient).identifier[0].type!!.coding[0].system))
        assertTrue(stringMatch("SS", (obj.entry[58].resource!! as Patient).identifier[0].type!!.coding[0].code))
        assertTrue(stringMatch("https://github.com/projectcyp", (obj.entry[58].resource!! as Patient).identifier[0].system))
        assertTrue(stringMatch("577448", (obj.entry[58].resource!! as Patient).identifier[0].value))
        assertEquals(true, if ((obj.entry[58].resource!! as Patient).active != null) (obj.entry[58].resource!! as Patient).active else false, "Field: (obj.entry[58].resource!! as Patient).active")
        assertTrue(stringMatch("official", (obj.entry[58].resource!! as Patient).name[0].use))
        assertTrue(stringMatch("Holloway", (obj.entry[58].resource!! as Patient).name[0].family))
        assertTrue(stringMatch("Willie", (obj.entry[58].resource!! as Patient).name[0].given[0]))
        assertTrue(stringMatch("female", (obj.entry[58].resource!! as Patient).gender))
        assertEquals("1959-08-02", (obj.entry[58].resource!! as Patient).birthDate.toString())
        assertTrue(stringMatch("Organization/1", (obj.entry[58].resource!! as Patient).managingOrganization!!.reference))
        assertTrue(stringMatch("http://hl7.org/fhir/Patient/1", obj.entry[59].fullUrl))
        assertTrue(stringMatch("Patient", (obj.entry[59].resource!! as Patient).resourceType))
        assertTrue(stringMatch("130", (obj.entry[59].resource!! as Patient).id))
        assertEquals("2012-06-03T23:45:32Z", (obj.entry[59].resource!! as Patient).meta!!.lastUpdated.toString())
        assertTrue(stringMatch("generated", (obj.entry[59].resource!! as Patient).text!!.status))
        assertTrue(stringMatch("<div xmlns=\"http://www.w3.org", (obj.entry[59].resource!! as Patient).text!!.div))
        assertTrue(stringMatch("http://hl7.org/fhir/v2/0203", (obj.entry[59].resource!! as Patient).identifier[0].type!!.coding[0].system))
        assertTrue(stringMatch("SS", (obj.entry[59].resource!! as Patient).identifier[0].type!!.coding[0].code))
        assertTrue(stringMatch("https://github.com/projectcyp", (obj.entry[59].resource!! as Patient).identifier[0].system))
        assertTrue(stringMatch("577449", (obj.entry[59].resource!! as Patient).identifier[0].value))
        assertEquals(true, if ((obj.entry[59].resource!! as Patient).active != null) (obj.entry[59].resource!! as Patient).active else false, "Field: (obj.entry[59].resource!! as Patient).active")
        assertTrue(stringMatch("official", (obj.entry[59].resource!! as Patient).name[0].use))
        assertTrue(stringMatch("Foster", (obj.entry[59].resource!! as Patient).name[0].family))
        assertTrue(stringMatch("Gabriel", (obj.entry[59].resource!! as Patient).name[0].given[0]))
        assertTrue(stringMatch("male", (obj.entry[59].resource!! as Patient).gender))
        assertEquals("1967-12-29", (obj.entry[59].resource!! as Patient).birthDate.toString())
        assertTrue(stringMatch("Organization/1", (obj.entry[59].resource!! as Patient).managingOrganization!!.reference))
        assertTrue(stringMatch("http://hl7.org/fhir/Patient/1", obj.entry[60].fullUrl))
        assertTrue(stringMatch("Patient", (obj.entry[60].resource!! as Patient).resourceType))
        assertTrue(stringMatch("131", (obj.entry[60].resource!! as Patient).id))
        assertEquals("2012-06-03T23:45:32Z", (obj.entry[60].resource!! as Patient).meta!!.lastUpdated.toString())
        assertTrue(stringMatch("generated", (obj.entry[60].resource!! as Patient).text!!.status))
        assertTrue(stringMatch("<div xmlns=\"http://www.w3.org", (obj.entry[60].resource!! as Patient).text!!.div))
        assertTrue(stringMatch("http://hl7.org/fhir/v2/0203", (obj.entry[60].resource!! as Patient).identifier[0].type!!.coding[0].system))
        assertTrue(stringMatch("SS", (obj.entry[60].resource!! as Patient).identifier[0].type!!.coding[0].code))
        assertTrue(stringMatch("https://github.com/projectcyp", (obj.entry[60].resource!! as Patient).identifier[0].system))
        assertTrue(stringMatch("577450", (obj.entry[60].resource!! as Patient).identifier[0].value))
        assertEquals(true, if ((obj.entry[60].resource!! as Patient).active != null) (obj.entry[60].resource!! as Patient).active else false, "Field: (obj.entry[60].resource!! as Patient).active")
        assertTrue(stringMatch("official", (obj.entry[60].resource!! as Patient).name[0].use))
        assertTrue(stringMatch("Hodges", (obj.entry[60].resource!! as Patient).name[0].family))
        assertTrue(stringMatch("Sarah", (obj.entry[60].resource!! as Patient).name[0].given[0]))
        assertTrue(stringMatch("female", (obj.entry[60].resource!! as Patient).gender))
        assertEquals("1964-07-18", (obj.entry[60].resource!! as Patient).birthDate.toString())
        assertTrue(stringMatch("Organization/1", (obj.entry[60].resource!! as Patient).managingOrganization!!.reference))
        assertTrue(stringMatch("http://hl7.org/fhir/Patient/1", obj.entry[61].fullUrl))
        assertTrue(stringMatch("Patient", (obj.entry[61].resource!! as Patient).resourceType))
        assertTrue(stringMatch("132", (obj.entry[61].resource!! as Patient).id))
        assertEquals("2012-06-03T23:45:32Z", (obj.entry[61].resource!! as Patient).meta!!.lastUpdated.toString())
    }
}