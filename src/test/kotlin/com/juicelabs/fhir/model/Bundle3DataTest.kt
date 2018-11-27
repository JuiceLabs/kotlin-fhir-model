package com.juicelabs.fhir.model

import java.io.File
import kotlin.test.assertEquals
import kotlin.test.assertTrue
import org.junit.jupiter.api.Test

class Bundle3DataTest : DataTests() {
    @Test
    fun `practitioner-examples-general 367 Test`() {
        val json = File("./src/test/resources/model/sample_data/practitioner-examples-general.json").readTextAndClose()
        val obj = mapper.fromJson(json, Bundle::class.java)
        assertTrue(stringMatch("http://hl7.org/fhir/sid/us-ss", (obj.entry[5].resource!! as Practitioner).identifier[0].system))
        assertTrue(stringMatch("666666666", (obj.entry[5].resource!! as Practitioner).identifier[0].value))
        assertTrue(stringMatch("official", (obj.entry[5].resource!! as Practitioner).name[0].use))
        assertTrue(stringMatch("Admit", (obj.entry[5].resource!! as Practitioner).name[0].family))
        assertTrue(stringMatch("Alan", (obj.entry[5].resource!! as Practitioner).name[0].given[0]))
        assertTrue(stringMatch("phone", (obj.entry[5].resource!! as Practitioner).telecom[0].system))
        assertTrue(stringMatch("555-555-1005", (obj.entry[5].resource!! as Practitioner).telecom[0].value))
        assertTrue(stringMatch("work", (obj.entry[5].resource!! as Practitioner).telecom[0].use))
        assertTrue(stringMatch("home", (obj.entry[5].resource!! as Practitioner).address[0].use))
        assertTrue(stringMatch("1005 Healthcare Drive", (obj.entry[5].resource!! as Practitioner).address[0].line[0]))
        assertTrue(stringMatch("male", (obj.entry[5].resource!! as Practitioner).gender))
        assertTrue(stringMatch("http://hl7.org/fhir/Practitio", obj.entry[6].fullUrl))
        assertTrue(stringMatch("Practitioner", (obj.entry[6].resource!! as Practitioner).resourceType))
        assertTrue(stringMatch("18", (obj.entry[6].resource!! as Practitioner).id))
        assertEquals("2012-05-29T23:45:32Z", (obj.entry[6].resource!! as Practitioner).meta!!.lastUpdated.toString())
        assertTrue(stringMatch("generated", (obj.entry[6].resource!! as Practitioner).text!!.status))
        assertTrue(stringMatch("<div xmlns=\"http://www.w3.org", (obj.entry[6].resource!! as Practitioner).text!!.div))
        assertTrue(stringMatch("http://hl7.org/fhir/v2/0203", (obj.entry[6].resource!! as Practitioner).identifier[0].type!!.coding[0].system))
        assertTrue(stringMatch("SS", (obj.entry[6].resource!! as Practitioner).identifier[0].type!!.coding[0].code))
        assertTrue(stringMatch("http://hl7.org/fhir/sid/us-ss", (obj.entry[6].resource!! as Practitioner).identifier[0].system))
        assertTrue(stringMatch("777777777", (obj.entry[6].resource!! as Practitioner).identifier[0].value))
        assertTrue(stringMatch("official", (obj.entry[6].resource!! as Practitioner).name[0].use))
        assertTrue(stringMatch("Attend", (obj.entry[6].resource!! as Practitioner).name[0].family))
        assertTrue(stringMatch("Aaron", (obj.entry[6].resource!! as Practitioner).name[0].given[0]))
        assertTrue(stringMatch("phone", (obj.entry[6].resource!! as Practitioner).telecom[0].system))
        assertTrue(stringMatch("555-555-1006", (obj.entry[6].resource!! as Practitioner).telecom[0].value))
        assertTrue(stringMatch("work", (obj.entry[6].resource!! as Practitioner).telecom[0].use))
        assertTrue(stringMatch("home", (obj.entry[6].resource!! as Practitioner).address[0].use))
        assertTrue(stringMatch("1006 Healthcare Drive", (obj.entry[6].resource!! as Practitioner).address[0].line[0]))
        assertTrue(stringMatch("male", (obj.entry[6].resource!! as Practitioner).gender))
        assertTrue(stringMatch("http://hl7.org/fhir/Practitio", obj.entry[7].fullUrl))
        assertTrue(stringMatch("Practitioner", (obj.entry[7].resource!! as Practitioner).resourceType))
        assertTrue(stringMatch("19", (obj.entry[7].resource!! as Practitioner).id))
        assertEquals("2012-05-29T23:45:32Z", (obj.entry[7].resource!! as Practitioner).meta!!.lastUpdated.toString())
        assertTrue(stringMatch("generated", (obj.entry[7].resource!! as Practitioner).text!!.status))
        assertTrue(stringMatch("<div xmlns=\"http://www.w3.org", (obj.entry[7].resource!! as Practitioner).text!!.div))
        assertTrue(stringMatch("http://hl7.org/fhir/v2/0203", (obj.entry[7].resource!! as Practitioner).identifier[0].type!!.coding[0].system))
        assertTrue(stringMatch("SS", (obj.entry[7].resource!! as Practitioner).identifier[0].type!!.coding[0].code))
        assertTrue(stringMatch("http://hl7.org/fhir/sid/us-ss", (obj.entry[7].resource!! as Practitioner).identifier[0].system))
        assertTrue(stringMatch("888888888", (obj.entry[7].resource!! as Practitioner).identifier[0].value))
        assertTrue(stringMatch("official", (obj.entry[7].resource!! as Practitioner).name[0].use))
        assertTrue(stringMatch("Sender", (obj.entry[7].resource!! as Practitioner).name[0].family))
        assertTrue(stringMatch("Sam", (obj.entry[7].resource!! as Practitioner).name[0].given[0]))
        assertTrue(stringMatch("phone", (obj.entry[7].resource!! as Practitioner).telecom[0].system))
        assertTrue(stringMatch("555-555-1007", (obj.entry[7].resource!! as Practitioner).telecom[0].value))
        assertTrue(stringMatch("work", (obj.entry[7].resource!! as Practitioner).telecom[0].use))
        assertTrue(stringMatch("home", (obj.entry[7].resource!! as Practitioner).address[0].use))
        assertTrue(stringMatch("1007 Healthcare Drive", (obj.entry[7].resource!! as Practitioner).address[0].line[0]))
        assertTrue(stringMatch("male", (obj.entry[7].resource!! as Practitioner).gender))
        assertTrue(stringMatch("http://hl7.org/fhir/Practitio", obj.entry[8].fullUrl))
        assertTrue(stringMatch("Practitioner", (obj.entry[8].resource!! as Practitioner).resourceType))
        assertTrue(stringMatch("20", (obj.entry[8].resource!! as Practitioner).id))
        assertEquals("2012-05-29T23:45:32Z", (obj.entry[8].resource!! as Practitioner).meta!!.lastUpdated.toString())
        assertTrue(stringMatch("generated", (obj.entry[8].resource!! as Practitioner).text!!.status))
        assertTrue(stringMatch("<div xmlns=\"http://www.w3.org", (obj.entry[8].resource!! as Practitioner).text!!.div))
        assertTrue(stringMatch("http://hl7.org/fhir/v2/0203", (obj.entry[8].resource!! as Practitioner).identifier[0].type!!.coding[0].system))
        assertTrue(stringMatch("SS", (obj.entry[8].resource!! as Practitioner).identifier[0].type!!.coding[0].code))
        assertTrue(stringMatch("http://hl7.org/fhir/sid/us-ss", (obj.entry[8].resource!! as Practitioner).identifier[0].system))
        assertTrue(stringMatch("888222222", (obj.entry[8].resource!! as Practitioner).identifier[0].value))
        assertTrue(stringMatch("official", (obj.entry[8].resource!! as Practitioner).name[0].use))
        assertTrue(stringMatch("Intern", (obj.entry[8].resource!! as Practitioner).name[0].family))
        assertTrue(stringMatch("Irving", (obj.entry[8].resource!! as Practitioner).name[0].given[0]))
        assertTrue(stringMatch("phone", (obj.entry[8].resource!! as Practitioner).telecom[0].system))
        assertTrue(stringMatch("555-555-1022", (obj.entry[8].resource!! as Practitioner).telecom[0].value))
        assertTrue(stringMatch("work", (obj.entry[8].resource!! as Practitioner).telecom[0].use))
        assertTrue(stringMatch("home", (obj.entry[8].resource!! as Practitioner).address[0].use))
        assertTrue(stringMatch("1021 Healthcare Drive", (obj.entry[8].resource!! as Practitioner).address[0].line[0]))
        assertTrue(stringMatch("male", (obj.entry[8].resource!! as Practitioner).gender))
        assertTrue(stringMatch("http://hl7.org/fhir/Practitio", obj.entry[9].fullUrl))
        assertTrue(stringMatch("Practitioner", (obj.entry[9].resource!! as Practitioner).resourceType))
        assertTrue(stringMatch("21", (obj.entry[9].resource!! as Practitioner).id))
    }
}