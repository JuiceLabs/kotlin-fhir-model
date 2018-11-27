package com.juicelabs.fhir.model

import java.io.File
import kotlin.test.assertEquals
import kotlin.test.assertTrue
import org.junit.jupiter.api.Test

class Bundle87DataTest : DataTests() {
    @Test
    fun `patient-examples-cypress-template 458 Test`() {
        val json = File("./src/test/resources/model/sample_data/patient-examples-cypress-template.json").readTextAndClose()
        val obj = mapper.fromJson(json, Bundle::class.java)
        assertTrue(stringMatch("official", (obj.entry[165].resource!! as Patient).name[0].use))
        assertTrue(stringMatch("Bridges", (obj.entry[165].resource!! as Patient).name[0].family))
        assertTrue(stringMatch("Keith", (obj.entry[165].resource!! as Patient).name[0].given[0]))
        assertTrue(stringMatch("male", (obj.entry[165].resource!! as Patient).gender))
        assertEquals("2009-03-26", (obj.entry[165].resource!! as Patient).birthDate.toString())
        assertTrue(stringMatch("Organization/1", (obj.entry[165].resource!! as Patient).managingOrganization!!.reference))
        assertTrue(stringMatch("http://hl7.org/fhir/Patient/2", obj.entry[166].fullUrl))
        assertTrue(stringMatch("Patient", (obj.entry[166].resource!! as Patient).resourceType))
        assertTrue(stringMatch("237", (obj.entry[166].resource!! as Patient).id))
        assertEquals("2012-06-03T23:45:32Z", (obj.entry[166].resource!! as Patient).meta!!.lastUpdated.toString())
        assertTrue(stringMatch("generated", (obj.entry[166].resource!! as Patient).text!!.status))
        assertTrue(stringMatch("<div xmlns=\"http://www.w3.org", (obj.entry[166].resource!! as Patient).text!!.div))
        assertTrue(stringMatch("http://hl7.org/fhir/v2/0203", (obj.entry[166].resource!! as Patient).identifier[0].type!!.coding[0].system))
        assertTrue(stringMatch("SS", (obj.entry[166].resource!! as Patient).identifier[0].type!!.coding[0].code))
        assertTrue(stringMatch("https://github.com/projectcyp", (obj.entry[166].resource!! as Patient).identifier[0].system))
        assertTrue(stringMatch("577556", (obj.entry[166].resource!! as Patient).identifier[0].value))
        assertEquals(true, if ((obj.entry[166].resource!! as Patient).active != null) (obj.entry[166].resource!! as Patient).active else false, "Field: (obj.entry[166].resource!! as Patient).active")
        assertTrue(stringMatch("official", (obj.entry[166].resource!! as Patient).name[0].use))
        assertTrue(stringMatch("Carr", (obj.entry[166].resource!! as Patient).name[0].family))
        assertTrue(stringMatch("Curtis", (obj.entry[166].resource!! as Patient).name[0].given[0]))
        assertTrue(stringMatch("male", (obj.entry[166].resource!! as Patient).gender))
        assertEquals("1943-07-22", (obj.entry[166].resource!! as Patient).birthDate.toString())
        assertTrue(stringMatch("Organization/1", (obj.entry[166].resource!! as Patient).managingOrganization!!.reference))
        assertTrue(stringMatch("http://hl7.org/fhir/Patient/2", obj.entry[167].fullUrl))
        assertTrue(stringMatch("Patient", (obj.entry[167].resource!! as Patient).resourceType))
        assertTrue(stringMatch("238", (obj.entry[167].resource!! as Patient).id))
        assertEquals("2012-06-03T23:45:32Z", (obj.entry[167].resource!! as Patient).meta!!.lastUpdated.toString())
        assertTrue(stringMatch("generated", (obj.entry[167].resource!! as Patient).text!!.status))
        assertTrue(stringMatch("<div xmlns=\"http://www.w3.org", (obj.entry[167].resource!! as Patient).text!!.div))
        assertTrue(stringMatch("http://hl7.org/fhir/v2/0203", (obj.entry[167].resource!! as Patient).identifier[0].type!!.coding[0].system))
        assertTrue(stringMatch("SS", (obj.entry[167].resource!! as Patient).identifier[0].type!!.coding[0].code))
        assertTrue(stringMatch("https://github.com/projectcyp", (obj.entry[167].resource!! as Patient).identifier[0].system))
        assertTrue(stringMatch("577557", (obj.entry[167].resource!! as Patient).identifier[0].value))
        assertEquals(true, if ((obj.entry[167].resource!! as Patient).active != null) (obj.entry[167].resource!! as Patient).active else false, "Field: (obj.entry[167].resource!! as Patient).active")
        assertTrue(stringMatch("official", (obj.entry[167].resource!! as Patient).name[0].use))
        assertTrue(stringMatch("Watson", (obj.entry[167].resource!! as Patient).name[0].family))
        assertTrue(stringMatch("Joshua", (obj.entry[167].resource!! as Patient).name[0].given[0]))
        assertTrue(stringMatch("male", (obj.entry[167].resource!! as Patient).gender))
        assertEquals("1938-09-16", (obj.entry[167].resource!! as Patient).birthDate.toString())
        assertTrue(stringMatch("Organization/1", (obj.entry[167].resource!! as Patient).managingOrganization!!.reference))
        assertTrue(stringMatch("http://hl7.org/fhir/Patient/2", obj.entry[168].fullUrl))
        assertTrue(stringMatch("Patient", (obj.entry[168].resource!! as Patient).resourceType))
        assertTrue(stringMatch("239", (obj.entry[168].resource!! as Patient).id))
        assertEquals("2012-06-03T23:45:32Z", (obj.entry[168].resource!! as Patient).meta!!.lastUpdated.toString())
        assertTrue(stringMatch("generated", (obj.entry[168].resource!! as Patient).text!!.status))
        assertTrue(stringMatch("<div xmlns=\"http://www.w3.org", (obj.entry[168].resource!! as Patient).text!!.div))
        assertTrue(stringMatch("http://hl7.org/fhir/v2/0203", (obj.entry[168].resource!! as Patient).identifier[0].type!!.coding[0].system))
        assertTrue(stringMatch("SS", (obj.entry[168].resource!! as Patient).identifier[0].type!!.coding[0].code))
        assertTrue(stringMatch("https://github.com/projectcyp", (obj.entry[168].resource!! as Patient).identifier[0].system))
        assertTrue(stringMatch("577558", (obj.entry[168].resource!! as Patient).identifier[0].value))
        assertEquals(true, if ((obj.entry[168].resource!! as Patient).active != null) (obj.entry[168].resource!! as Patient).active else false, "Field: (obj.entry[168].resource!! as Patient).active")
        assertTrue(stringMatch("official", (obj.entry[168].resource!! as Patient).name[0].use))
        assertTrue(stringMatch("Hoffman", (obj.entry[168].resource!! as Patient).name[0].family))
        assertTrue(stringMatch("Carlos", (obj.entry[168].resource!! as Patient).name[0].given[0]))
        assertTrue(stringMatch("male", (obj.entry[168].resource!! as Patient).gender))
        assertEquals("1960-07-10", (obj.entry[168].resource!! as Patient).birthDate.toString())
        assertTrue(stringMatch("Organization/1", (obj.entry[168].resource!! as Patient).managingOrganization!!.reference))
        assertTrue(stringMatch("http://hl7.org/fhir/Patient/2", obj.entry[169].fullUrl))
        assertTrue(stringMatch("Patient", (obj.entry[169].resource!! as Patient).resourceType))
        assertTrue(stringMatch("240", (obj.entry[169].resource!! as Patient).id))
        assertEquals("2012-06-03T23:45:32Z", (obj.entry[169].resource!! as Patient).meta!!.lastUpdated.toString())
        assertTrue(stringMatch("generated", (obj.entry[169].resource!! as Patient).text!!.status))
        assertTrue(stringMatch("<div xmlns=\"http://www.w3.org", (obj.entry[169].resource!! as Patient).text!!.div))
        assertTrue(stringMatch("http://hl7.org/fhir/v2/0203", (obj.entry[169].resource!! as Patient).identifier[0].type!!.coding[0].system))
        assertTrue(stringMatch("SS", (obj.entry[169].resource!! as Patient).identifier[0].type!!.coding[0].code))
        assertTrue(stringMatch("https://github.com/projectcyp", (obj.entry[169].resource!! as Patient).identifier[0].system))
        assertTrue(stringMatch("577559", (obj.entry[169].resource!! as Patient).identifier[0].value))
        assertEquals(true, if ((obj.entry[169].resource!! as Patient).active != null) (obj.entry[169].resource!! as Patient).active else false, "Field: (obj.entry[169].resource!! as Patient).active")
        assertTrue(stringMatch("official", (obj.entry[169].resource!! as Patient).name[0].use))
        assertTrue(stringMatch("Chandler", (obj.entry[169].resource!! as Patient).name[0].family))
        assertTrue(stringMatch("Debra", (obj.entry[169].resource!! as Patient).name[0].given[0]))
    }
}