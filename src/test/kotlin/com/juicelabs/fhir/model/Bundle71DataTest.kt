package com.juicelabs.fhir.model

import java.io.File
import kotlin.test.assertEquals
import kotlin.test.assertTrue
import org.junit.jupiter.api.Test

class Bundle71DataTest : DataTests() {
    @Test
    fun `patient-examples-cypress-template 442 Test`() {
        val json = File("./src/test/resources/model/sample_data/patient-examples-cypress-template.json").readTextAndClose()
        val obj = mapper.fromJson(json, Bundle::class.java)
        assertTrue(stringMatch("female", (obj.entry[98].resource!! as Patient).gender))
        assertEquals("1961-03-17", (obj.entry[98].resource!! as Patient).birthDate.toString())
        assertTrue(stringMatch("Organization/1", (obj.entry[98].resource!! as Patient).managingOrganization!!.reference))
        assertTrue(stringMatch("http://hl7.org/fhir/Patient/1", obj.entry[99].fullUrl))
        assertTrue(stringMatch("Patient", (obj.entry[99].resource!! as Patient).resourceType))
        assertTrue(stringMatch("170", (obj.entry[99].resource!! as Patient).id))
        assertEquals("2012-06-03T23:45:32Z", (obj.entry[99].resource!! as Patient).meta!!.lastUpdated.toString())
        assertTrue(stringMatch("generated", (obj.entry[99].resource!! as Patient).text!!.status))
        assertTrue(stringMatch("<div xmlns=\"http://www.w3.org", (obj.entry[99].resource!! as Patient).text!!.div))
        assertTrue(stringMatch("http://hl7.org/fhir/v2/0203", (obj.entry[99].resource!! as Patient).identifier[0].type!!.coding[0].system))
        assertTrue(stringMatch("SS", (obj.entry[99].resource!! as Patient).identifier[0].type!!.coding[0].code))
        assertTrue(stringMatch("https://github.com/projectcyp", (obj.entry[99].resource!! as Patient).identifier[0].system))
        assertTrue(stringMatch("577489", (obj.entry[99].resource!! as Patient).identifier[0].value))
        assertEquals(true, if ((obj.entry[99].resource!! as Patient).active != null) (obj.entry[99].resource!! as Patient).active else false, "Field: (obj.entry[99].resource!! as Patient).active")
        assertTrue(stringMatch("official", (obj.entry[99].resource!! as Patient).name[0].use))
        assertTrue(stringMatch("Dennis", (obj.entry[99].resource!! as Patient).name[0].family))
        assertTrue(stringMatch("Juanita", (obj.entry[99].resource!! as Patient).name[0].given[0]))
        assertTrue(stringMatch("female", (obj.entry[99].resource!! as Patient).gender))
        assertEquals("1989-05-30", (obj.entry[99].resource!! as Patient).birthDate.toString())
        assertTrue(stringMatch("Organization/1", (obj.entry[99].resource!! as Patient).managingOrganization!!.reference))
        assertTrue(stringMatch("http://hl7.org/fhir/Patient/1", obj.entry[100].fullUrl))
        assertTrue(stringMatch("Patient", (obj.entry[100].resource!! as Patient).resourceType))
        assertTrue(stringMatch("171", (obj.entry[100].resource!! as Patient).id))
        assertEquals("2012-06-03T23:45:32Z", (obj.entry[100].resource!! as Patient).meta!!.lastUpdated.toString())
        assertTrue(stringMatch("generated", (obj.entry[100].resource!! as Patient).text!!.status))
        assertTrue(stringMatch("<div xmlns=\"http://www.w3.org", (obj.entry[100].resource!! as Patient).text!!.div))
        assertTrue(stringMatch("http://hl7.org/fhir/v2/0203", (obj.entry[100].resource!! as Patient).identifier[0].type!!.coding[0].system))
        assertTrue(stringMatch("SS", (obj.entry[100].resource!! as Patient).identifier[0].type!!.coding[0].code))
        assertTrue(stringMatch("https://github.com/projectcyp", (obj.entry[100].resource!! as Patient).identifier[0].system))
        assertTrue(stringMatch("577490", (obj.entry[100].resource!! as Patient).identifier[0].value))
        assertEquals(true, if ((obj.entry[100].resource!! as Patient).active != null) (obj.entry[100].resource!! as Patient).active else false, "Field: (obj.entry[100].resource!! as Patient).active")
        assertTrue(stringMatch("official", (obj.entry[100].resource!! as Patient).name[0].use))
        assertTrue(stringMatch("Brady", (obj.entry[100].resource!! as Patient).name[0].family))
        assertTrue(stringMatch("Tracey", (obj.entry[100].resource!! as Patient).name[0].given[0]))
        assertTrue(stringMatch("female", (obj.entry[100].resource!! as Patient).gender))
        assertEquals("1990-06-22", (obj.entry[100].resource!! as Patient).birthDate.toString())
        assertTrue(stringMatch("Organization/1", (obj.entry[100].resource!! as Patient).managingOrganization!!.reference))
        assertTrue(stringMatch("http://hl7.org/fhir/Patient/1", obj.entry[101].fullUrl))
        assertTrue(stringMatch("Patient", (obj.entry[101].resource!! as Patient).resourceType))
        assertTrue(stringMatch("172", (obj.entry[101].resource!! as Patient).id))
        assertEquals("2012-06-03T23:45:32Z", (obj.entry[101].resource!! as Patient).meta!!.lastUpdated.toString())
        assertTrue(stringMatch("generated", (obj.entry[101].resource!! as Patient).text!!.status))
        assertTrue(stringMatch("<div xmlns=\"http://www.w3.org", (obj.entry[101].resource!! as Patient).text!!.div))
        assertTrue(stringMatch("http://hl7.org/fhir/v2/0203", (obj.entry[101].resource!! as Patient).identifier[0].type!!.coding[0].system))
        assertTrue(stringMatch("SS", (obj.entry[101].resource!! as Patient).identifier[0].type!!.coding[0].code))
        assertTrue(stringMatch("https://github.com/projectcyp", (obj.entry[101].resource!! as Patient).identifier[0].system))
        assertTrue(stringMatch("577491", (obj.entry[101].resource!! as Patient).identifier[0].value))
        assertEquals(true, if ((obj.entry[101].resource!! as Patient).active != null) (obj.entry[101].resource!! as Patient).active else false, "Field: (obj.entry[101].resource!! as Patient).active")
        assertTrue(stringMatch("official", (obj.entry[101].resource!! as Patient).name[0].use))
        assertTrue(stringMatch("Hall", (obj.entry[101].resource!! as Patient).name[0].family))
        assertTrue(stringMatch("Courtney", (obj.entry[101].resource!! as Patient).name[0].given[0]))
        assertTrue(stringMatch("female", (obj.entry[101].resource!! as Patient).gender))
        assertEquals("1997-03-31", (obj.entry[101].resource!! as Patient).birthDate.toString())
        assertTrue(stringMatch("Organization/1", (obj.entry[101].resource!! as Patient).managingOrganization!!.reference))
        assertTrue(stringMatch("http://hl7.org/fhir/Patient/1", obj.entry[102].fullUrl))
        assertTrue(stringMatch("Patient", (obj.entry[102].resource!! as Patient).resourceType))
        assertTrue(stringMatch("173", (obj.entry[102].resource!! as Patient).id))
        assertEquals("2012-06-03T23:45:32Z", (obj.entry[102].resource!! as Patient).meta!!.lastUpdated.toString())
        assertTrue(stringMatch("generated", (obj.entry[102].resource!! as Patient).text!!.status))
        assertTrue(stringMatch("<div xmlns=\"http://www.w3.org", (obj.entry[102].resource!! as Patient).text!!.div))
        assertTrue(stringMatch("http://hl7.org/fhir/v2/0203", (obj.entry[102].resource!! as Patient).identifier[0].type!!.coding[0].system))
        assertTrue(stringMatch("SS", (obj.entry[102].resource!! as Patient).identifier[0].type!!.coding[0].code))
        assertTrue(stringMatch("https://github.com/projectcyp", (obj.entry[102].resource!! as Patient).identifier[0].system))
        assertTrue(stringMatch("577492", (obj.entry[102].resource!! as Patient).identifier[0].value))
        assertEquals(true, if ((obj.entry[102].resource!! as Patient).active != null) (obj.entry[102].resource!! as Patient).active else false, "Field: (obj.entry[102].resource!! as Patient).active")
        assertTrue(stringMatch("official", (obj.entry[102].resource!! as Patient).name[0].use))
        assertTrue(stringMatch("Copeland", (obj.entry[102].resource!! as Patient).name[0].family))
        assertTrue(stringMatch("Brian", (obj.entry[102].resource!! as Patient).name[0].given[0]))
        assertTrue(stringMatch("male", (obj.entry[102].resource!! as Patient).gender))
        assertEquals("1949-03-15", (obj.entry[102].resource!! as Patient).birthDate.toString())
        assertTrue(stringMatch("Organization/1", (obj.entry[102].resource!! as Patient).managingOrganization!!.reference))
    }
}
