package com.juicelabs.fhir.model

import java.io.File
import kotlin.test.assertEquals
import kotlin.test.assertTrue
import org.junit.jupiter.api.Test

class Bundle60DataTest : DataTests() {
    @Test
    fun `patient-examples-cypress-template 431 Test`() {
        val json = File("./src/test/resources/model/sample_data/patient-examples-cypress-template.json").readTextAndClose()
        val obj = mapper.fromJson(json, Bundle::class.java)
        assertEquals("1976-06-01", (obj.entry[52].resource!! as Patient).birthDate.toString())
        assertTrue(stringMatch("Organization/1", (obj.entry[52].resource!! as Patient).managingOrganization!!.reference))
        assertTrue(stringMatch("http://hl7.org/fhir/Patient/1", obj.entry[53].fullUrl))
        assertTrue(stringMatch("Patient", (obj.entry[53].resource!! as Patient).resourceType))
        assertTrue(stringMatch("124", (obj.entry[53].resource!! as Patient).id))
        assertEquals("2012-06-03T23:45:32Z", (obj.entry[53].resource!! as Patient).meta!!.lastUpdated.toString())
        assertTrue(stringMatch("generated", (obj.entry[53].resource!! as Patient).text!!.status))
        assertTrue(stringMatch("<div xmlns=\"http://www.w3.org", (obj.entry[53].resource!! as Patient).text!!.div))
        assertTrue(stringMatch("http://hl7.org/fhir/v2/0203", (obj.entry[53].resource!! as Patient).identifier[0].type!!.coding[0].system))
        assertTrue(stringMatch("SS", (obj.entry[53].resource!! as Patient).identifier[0].type!!.coding[0].code))
        assertTrue(stringMatch("https://github.com/projectcyp", (obj.entry[53].resource!! as Patient).identifier[0].system))
        assertTrue(stringMatch("577443", (obj.entry[53].resource!! as Patient).identifier[0].value))
        assertEquals(true, if ((obj.entry[53].resource!! as Patient).active != null) (obj.entry[53].resource!! as Patient).active else false, "Field: (obj.entry[53].resource!! as Patient).active")
        assertTrue(stringMatch("official", (obj.entry[53].resource!! as Patient).name[0].use))
        assertTrue(stringMatch("Schmidt", (obj.entry[53].resource!! as Patient).name[0].family))
        assertTrue(stringMatch("Lewis", (obj.entry[53].resource!! as Patient).name[0].given[0]))
        assertTrue(stringMatch("male", (obj.entry[53].resource!! as Patient).gender))
        assertEquals("1963-02-12", (obj.entry[53].resource!! as Patient).birthDate.toString())
        assertTrue(stringMatch("Organization/1", (obj.entry[53].resource!! as Patient).managingOrganization!!.reference))
        assertTrue(stringMatch("http://hl7.org/fhir/Patient/1", obj.entry[54].fullUrl))
        assertTrue(stringMatch("Patient", (obj.entry[54].resource!! as Patient).resourceType))
        assertTrue(stringMatch("125", (obj.entry[54].resource!! as Patient).id))
        assertEquals("2012-06-03T23:45:32Z", (obj.entry[54].resource!! as Patient).meta!!.lastUpdated.toString())
        assertTrue(stringMatch("generated", (obj.entry[54].resource!! as Patient).text!!.status))
        assertTrue(stringMatch("<div xmlns=\"http://www.w3.org", (obj.entry[54].resource!! as Patient).text!!.div))
        assertTrue(stringMatch("http://hl7.org/fhir/v2/0203", (obj.entry[54].resource!! as Patient).identifier[0].type!!.coding[0].system))
        assertTrue(stringMatch("SS", (obj.entry[54].resource!! as Patient).identifier[0].type!!.coding[0].code))
        assertTrue(stringMatch("https://github.com/projectcyp", (obj.entry[54].resource!! as Patient).identifier[0].system))
        assertTrue(stringMatch("577444", (obj.entry[54].resource!! as Patient).identifier[0].value))
        assertEquals(true, if ((obj.entry[54].resource!! as Patient).active != null) (obj.entry[54].resource!! as Patient).active else false, "Field: (obj.entry[54].resource!! as Patient).active")
        assertTrue(stringMatch("official", (obj.entry[54].resource!! as Patient).name[0].use))
        assertTrue(stringMatch("Carr", (obj.entry[54].resource!! as Patient).name[0].family))
        assertTrue(stringMatch("Rebecca", (obj.entry[54].resource!! as Patient).name[0].given[0]))
        assertTrue(stringMatch("female", (obj.entry[54].resource!! as Patient).gender))
        assertEquals("1943-09-18", (obj.entry[54].resource!! as Patient).birthDate.toString())
        assertTrue(stringMatch("Organization/1", (obj.entry[54].resource!! as Patient).managingOrganization!!.reference))
        assertTrue(stringMatch("http://hl7.org/fhir/Patient/1", obj.entry[55].fullUrl))
        assertTrue(stringMatch("Patient", (obj.entry[55].resource!! as Patient).resourceType))
        assertTrue(stringMatch("126", (obj.entry[55].resource!! as Patient).id))
        assertEquals("2012-06-03T23:45:32Z", (obj.entry[55].resource!! as Patient).meta!!.lastUpdated.toString())
        assertTrue(stringMatch("generated", (obj.entry[55].resource!! as Patient).text!!.status))
        assertTrue(stringMatch("<div xmlns=\"http://www.w3.org", (obj.entry[55].resource!! as Patient).text!!.div))
        assertTrue(stringMatch("http://hl7.org/fhir/v2/0203", (obj.entry[55].resource!! as Patient).identifier[0].type!!.coding[0].system))
        assertTrue(stringMatch("SS", (obj.entry[55].resource!! as Patient).identifier[0].type!!.coding[0].code))
        assertTrue(stringMatch("https://github.com/projectcyp", (obj.entry[55].resource!! as Patient).identifier[0].system))
        assertTrue(stringMatch("577445", (obj.entry[55].resource!! as Patient).identifier[0].value))
        assertEquals(true, if ((obj.entry[55].resource!! as Patient).active != null) (obj.entry[55].resource!! as Patient).active else false, "Field: (obj.entry[55].resource!! as Patient).active")
        assertTrue(stringMatch("official", (obj.entry[55].resource!! as Patient).name[0].use))
        assertTrue(stringMatch("Greer", (obj.entry[55].resource!! as Patient).name[0].family))
        assertTrue(stringMatch("Esther", (obj.entry[55].resource!! as Patient).name[0].given[0]))
        assertTrue(stringMatch("female", (obj.entry[55].resource!! as Patient).gender))
        assertEquals("1952-03-26", (obj.entry[55].resource!! as Patient).birthDate.toString())
        assertTrue(stringMatch("Organization/1", (obj.entry[55].resource!! as Patient).managingOrganization!!.reference))
        assertTrue(stringMatch("http://hl7.org/fhir/Patient/1", obj.entry[56].fullUrl))
        assertTrue(stringMatch("Patient", (obj.entry[56].resource!! as Patient).resourceType))
        assertTrue(stringMatch("127", (obj.entry[56].resource!! as Patient).id))
        assertEquals("2012-06-03T23:45:32Z", (obj.entry[56].resource!! as Patient).meta!!.lastUpdated.toString())
        assertTrue(stringMatch("generated", (obj.entry[56].resource!! as Patient).text!!.status))
        assertTrue(stringMatch("<div xmlns=\"http://www.w3.org", (obj.entry[56].resource!! as Patient).text!!.div))
        assertTrue(stringMatch("http://hl7.org/fhir/v2/0203", (obj.entry[56].resource!! as Patient).identifier[0].type!!.coding[0].system))
        assertTrue(stringMatch("SS", (obj.entry[56].resource!! as Patient).identifier[0].type!!.coding[0].code))
        assertTrue(stringMatch("https://github.com/projectcyp", (obj.entry[56].resource!! as Patient).identifier[0].system))
        assertTrue(stringMatch("577446", (obj.entry[56].resource!! as Patient).identifier[0].value))
        assertEquals(true, if ((obj.entry[56].resource!! as Patient).active != null) (obj.entry[56].resource!! as Patient).active else false, "Field: (obj.entry[56].resource!! as Patient).active")
        assertTrue(stringMatch("official", (obj.entry[56].resource!! as Patient).name[0].use))
        assertTrue(stringMatch("Phillips", (obj.entry[56].resource!! as Patient).name[0].family))
        assertTrue(stringMatch("Eddie", (obj.entry[56].resource!! as Patient).name[0].given[0]))
        assertTrue(stringMatch("male", (obj.entry[56].resource!! as Patient).gender))
        assertEquals("1942-04-24", (obj.entry[56].resource!! as Patient).birthDate.toString())
        assertTrue(stringMatch("Organization/1", (obj.entry[56].resource!! as Patient).managingOrganization!!.reference))
        assertTrue(stringMatch("http://hl7.org/fhir/Patient/1", obj.entry[57].fullUrl))
    }
}
