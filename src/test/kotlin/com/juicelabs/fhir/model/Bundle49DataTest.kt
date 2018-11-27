package com.juicelabs.fhir.model

import java.io.File
import kotlin.test.assertEquals
import kotlin.test.assertTrue
import org.junit.jupiter.api.Test

class Bundle49DataTest : DataTests() {
    @Test
    fun `patient-examples-cypress-template 420 Test`() {
        val json = File("./src/test/resources/model/sample_data/patient-examples-cypress-template.json").readTextAndClose()
        val obj = mapper.fromJson(json, Bundle::class.java)
        assertTrue(stringMatch("Organization/1", (obj.entry[6].resource!! as Patient).managingOrganization!!.reference))
        assertTrue(stringMatch("http://hl7.org/fhir/Patient/7", obj.entry[7].fullUrl))
        assertTrue(stringMatch("Patient", (obj.entry[7].resource!! as Patient).resourceType))
        assertTrue(stringMatch("78", (obj.entry[7].resource!! as Patient).id))
        assertEquals("2012-06-03T23:45:32Z", (obj.entry[7].resource!! as Patient).meta!!.lastUpdated.toString())
        assertTrue(stringMatch("generated", (obj.entry[7].resource!! as Patient).text!!.status))
        assertTrue(stringMatch("<div xmlns=\"http://www.w3.org", (obj.entry[7].resource!! as Patient).text!!.div))
        assertTrue(stringMatch("http://hl7.org/fhir/v2/0203", (obj.entry[7].resource!! as Patient).identifier[0].type!!.coding[0].system))
        assertTrue(stringMatch("SS", (obj.entry[7].resource!! as Patient).identifier[0].type!!.coding[0].code))
        assertTrue(stringMatch("https://github.com/projectcyp", (obj.entry[7].resource!! as Patient).identifier[0].system))
        assertTrue(stringMatch("577397", (obj.entry[7].resource!! as Patient).identifier[0].value))
        assertEquals(true, if ((obj.entry[7].resource!! as Patient).active != null) (obj.entry[7].resource!! as Patient).active else false, "Field: (obj.entry[7].resource!! as Patient).active")
        assertTrue(stringMatch("official", (obj.entry[7].resource!! as Patient).name[0].use))
        assertTrue(stringMatch("Greene", (obj.entry[7].resource!! as Patient).name[0].family))
        assertTrue(stringMatch("Pamela", (obj.entry[7].resource!! as Patient).name[0].given[0]))
        assertTrue(stringMatch("female", (obj.entry[7].resource!! as Patient).gender))
        assertEquals("1973-02-08", (obj.entry[7].resource!! as Patient).birthDate.toString())
        assertTrue(stringMatch("Organization/1", (obj.entry[7].resource!! as Patient).managingOrganization!!.reference))
        assertTrue(stringMatch("http://hl7.org/fhir/Patient/7", obj.entry[8].fullUrl))
        assertTrue(stringMatch("Patient", (obj.entry[8].resource!! as Patient).resourceType))
        assertTrue(stringMatch("79", (obj.entry[8].resource!! as Patient).id))
        assertEquals("2012-06-03T23:45:32Z", (obj.entry[8].resource!! as Patient).meta!!.lastUpdated.toString())
        assertTrue(stringMatch("generated", (obj.entry[8].resource!! as Patient).text!!.status))
        assertTrue(stringMatch("<div xmlns=\"http://www.w3.org", (obj.entry[8].resource!! as Patient).text!!.div))
        assertTrue(stringMatch("http://hl7.org/fhir/v2/0203", (obj.entry[8].resource!! as Patient).identifier[0].type!!.coding[0].system))
        assertTrue(stringMatch("SS", (obj.entry[8].resource!! as Patient).identifier[0].type!!.coding[0].code))
        assertTrue(stringMatch("https://github.com/projectcyp", (obj.entry[8].resource!! as Patient).identifier[0].system))
        assertTrue(stringMatch("577398", (obj.entry[8].resource!! as Patient).identifier[0].value))
        assertEquals(true, if ((obj.entry[8].resource!! as Patient).active != null) (obj.entry[8].resource!! as Patient).active else false, "Field: (obj.entry[8].resource!! as Patient).active")
        assertTrue(stringMatch("official", (obj.entry[8].resource!! as Patient).name[0].use))
        assertTrue(stringMatch("Fields", (obj.entry[8].resource!! as Patient).name[0].family))
        assertTrue(stringMatch("Glenda", (obj.entry[8].resource!! as Patient).name[0].given[0]))
        assertTrue(stringMatch("female", (obj.entry[8].resource!! as Patient).gender))
        assertEquals("1958-06-08", (obj.entry[8].resource!! as Patient).birthDate.toString())
        assertTrue(stringMatch("Organization/1", (obj.entry[8].resource!! as Patient).managingOrganization!!.reference))
        assertTrue(stringMatch("http://hl7.org/fhir/Patient/8", obj.entry[9].fullUrl))
        assertTrue(stringMatch("Patient", (obj.entry[9].resource!! as Patient).resourceType))
        assertTrue(stringMatch("80", (obj.entry[9].resource!! as Patient).id))
        assertEquals("2012-06-03T23:45:32Z", (obj.entry[9].resource!! as Patient).meta!!.lastUpdated.toString())
        assertTrue(stringMatch("generated", (obj.entry[9].resource!! as Patient).text!!.status))
        assertTrue(stringMatch("<div xmlns=\"http://www.w3.org", (obj.entry[9].resource!! as Patient).text!!.div))
        assertTrue(stringMatch("http://hl7.org/fhir/v2/0203", (obj.entry[9].resource!! as Patient).identifier[0].type!!.coding[0].system))
        assertTrue(stringMatch("SS", (obj.entry[9].resource!! as Patient).identifier[0].type!!.coding[0].code))
        assertTrue(stringMatch("https://github.com/projectcyp", (obj.entry[9].resource!! as Patient).identifier[0].system))
        assertTrue(stringMatch("577399", (obj.entry[9].resource!! as Patient).identifier[0].value))
        assertEquals(true, if ((obj.entry[9].resource!! as Patient).active != null) (obj.entry[9].resource!! as Patient).active else false, "Field: (obj.entry[9].resource!! as Patient).active")
        assertTrue(stringMatch("official", (obj.entry[9].resource!! as Patient).name[0].use))
        assertTrue(stringMatch("Lee", (obj.entry[9].resource!! as Patient).name[0].family))
        assertTrue(stringMatch("Vera", (obj.entry[9].resource!! as Patient).name[0].given[0]))
        assertTrue(stringMatch("female", (obj.entry[9].resource!! as Patient).gender))
        assertEquals("1945-05-02", (obj.entry[9].resource!! as Patient).birthDate.toString())
        assertTrue(stringMatch("Organization/1", (obj.entry[9].resource!! as Patient).managingOrganization!!.reference))
        assertTrue(stringMatch("http://hl7.org/fhir/Patient/8", obj.entry[10].fullUrl))
        assertTrue(stringMatch("Patient", (obj.entry[10].resource!! as Patient).resourceType))
        assertTrue(stringMatch("81", (obj.entry[10].resource!! as Patient).id))
        assertEquals("2012-06-03T23:45:32Z", (obj.entry[10].resource!! as Patient).meta!!.lastUpdated.toString())
        assertTrue(stringMatch("generated", (obj.entry[10].resource!! as Patient).text!!.status))
        assertTrue(stringMatch("<div xmlns=\"http://www.w3.org", (obj.entry[10].resource!! as Patient).text!!.div))
        assertTrue(stringMatch("http://hl7.org/fhir/v2/0203", (obj.entry[10].resource!! as Patient).identifier[0].type!!.coding[0].system))
        assertTrue(stringMatch("SS", (obj.entry[10].resource!! as Patient).identifier[0].type!!.coding[0].code))
        assertTrue(stringMatch("https://github.com/projectcyp", (obj.entry[10].resource!! as Patient).identifier[0].system))
        assertTrue(stringMatch("577400", (obj.entry[10].resource!! as Patient).identifier[0].value))
        assertEquals(true, if ((obj.entry[10].resource!! as Patient).active != null) (obj.entry[10].resource!! as Patient).active else false, "Field: (obj.entry[10].resource!! as Patient).active")
        assertTrue(stringMatch("official", (obj.entry[10].resource!! as Patient).name[0].use))
        assertTrue(stringMatch("Peters", (obj.entry[10].resource!! as Patient).name[0].family))
        assertTrue(stringMatch("Rose", (obj.entry[10].resource!! as Patient).name[0].given[0]))
        assertTrue(stringMatch("female", (obj.entry[10].resource!! as Patient).gender))
        assertEquals("1932-03-23", (obj.entry[10].resource!! as Patient).birthDate.toString())
        assertTrue(stringMatch("Organization/1", (obj.entry[10].resource!! as Patient).managingOrganization!!.reference))
        assertTrue(stringMatch("http://hl7.org/fhir/Patient/8", obj.entry[11].fullUrl))
        assertTrue(stringMatch("Patient", (obj.entry[11].resource!! as Patient).resourceType))
    }
}
