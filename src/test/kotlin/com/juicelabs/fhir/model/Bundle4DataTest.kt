package com.juicelabs.fhir.model

import java.io.File
import kotlin.test.assertEquals
import kotlin.test.assertTrue
import org.junit.jupiter.api.Test

class Bundle4DataTest : DataTests() {
    @Test
    fun `practitioner-examples-general 368 Test`() {
        val json = File("./src/test/resources/model/sample_data/practitioner-examples-general.json").readTextAndClose()
        val obj = mapper.fromJson(json, Bundle::class.java)
        assertEquals("2012-05-29T23:45:32Z", (obj.entry[9].resource!! as Practitioner).meta!!.lastUpdated.toString())
        assertTrue(stringMatch("generated", (obj.entry[9].resource!! as Practitioner).text!!.status))
        assertTrue(stringMatch("<div xmlns=\"http://www.w3.org", (obj.entry[9].resource!! as Practitioner).text!!.div))
        assertTrue(stringMatch("http://hl7.org/fhir/v2/0203", (obj.entry[9].resource!! as Practitioner).identifier[0].type!!.coding[0].system))
        assertTrue(stringMatch("SS", (obj.entry[9].resource!! as Practitioner).identifier[0].type!!.coding[0].code))
        assertTrue(stringMatch("http://hl7.org/fhir/sid/us-ss", (obj.entry[9].resource!! as Practitioner).identifier[0].system))
        assertTrue(stringMatch("888333333", (obj.entry[9].resource!! as Practitioner).identifier[0].value))
        assertTrue(stringMatch("official", (obj.entry[9].resource!! as Practitioner).name[0].use))
        assertTrue(stringMatch("Resident", (obj.entry[9].resource!! as Practitioner).name[0].family))
        assertTrue(stringMatch("Rachel", (obj.entry[9].resource!! as Practitioner).name[0].given[0]))
        assertTrue(stringMatch("phone", (obj.entry[9].resource!! as Practitioner).telecom[0].system))
        assertTrue(stringMatch("555-555-1023", (obj.entry[9].resource!! as Practitioner).telecom[0].value))
        assertTrue(stringMatch("work", (obj.entry[9].resource!! as Practitioner).telecom[0].use))
        assertTrue(stringMatch("home", (obj.entry[9].resource!! as Practitioner).address[0].use))
        assertTrue(stringMatch("1022 Healthcare Drive", (obj.entry[9].resource!! as Practitioner).address[0].line[0]))
        assertTrue(stringMatch("female", (obj.entry[9].resource!! as Practitioner).gender))
        assertTrue(stringMatch("http://hl7.org/fhir/Practitio", obj.entry[10].fullUrl))
        assertTrue(stringMatch("Practitioner", (obj.entry[10].resource!! as Practitioner).resourceType))
        assertTrue(stringMatch("22", (obj.entry[10].resource!! as Practitioner).id))
        assertEquals("2012-05-29T23:45:32Z", (obj.entry[10].resource!! as Practitioner).meta!!.lastUpdated.toString())
        assertTrue(stringMatch("generated", (obj.entry[10].resource!! as Practitioner).text!!.status))
        assertTrue(stringMatch("<div xmlns=\"http://www.w3.org", (obj.entry[10].resource!! as Practitioner).text!!.div))
        assertTrue(stringMatch("http://hl7.org/fhir/v2/0203", (obj.entry[10].resource!! as Practitioner).identifier[0].type!!.coding[0].system))
        assertTrue(stringMatch("SS", (obj.entry[10].resource!! as Practitioner).identifier[0].type!!.coding[0].code))
        assertTrue(stringMatch("http://hl7.org/fhir/sid/us-ss", (obj.entry[10].resource!! as Practitioner).identifier[0].system))
        assertTrue(stringMatch("888444444", (obj.entry[10].resource!! as Practitioner).identifier[0].value))
        assertTrue(stringMatch("official", (obj.entry[10].resource!! as Practitioner).name[0].use))
        assertTrue(stringMatch("Leader", (obj.entry[10].resource!! as Practitioner).name[0].family))
        assertTrue(stringMatch("Linda", (obj.entry[10].resource!! as Practitioner).name[0].given[0]))
        assertTrue(stringMatch("phone", (obj.entry[10].resource!! as Practitioner).telecom[0].system))
        assertTrue(stringMatch("555-555-1024", (obj.entry[10].resource!! as Practitioner).telecom[0].value))
        assertTrue(stringMatch("work", (obj.entry[10].resource!! as Practitioner).telecom[0].use))
        assertTrue(stringMatch("home", (obj.entry[10].resource!! as Practitioner).address[0].use))
        assertTrue(stringMatch("1023 Healthcare Drive", (obj.entry[10].resource!! as Practitioner).address[0].line[0]))
        assertTrue(stringMatch("female", (obj.entry[10].resource!! as Practitioner).gender))
        assertTrue(stringMatch("http://hl7.org/fhir/Practitio", obj.entry[11].fullUrl))
        assertTrue(stringMatch("Practitioner", (obj.entry[11].resource!! as Practitioner).resourceType))
        assertTrue(stringMatch("23", (obj.entry[11].resource!! as Practitioner).id))
        assertEquals("2012-05-29T23:45:32Z", (obj.entry[11].resource!! as Practitioner).meta!!.lastUpdated.toString())
        assertTrue(stringMatch("generated", (obj.entry[11].resource!! as Practitioner).text!!.status))
        assertTrue(stringMatch("<div xmlns=\"http://www.w3.org", (obj.entry[11].resource!! as Practitioner).text!!.div))
        assertTrue(stringMatch("http://hl7.org/fhir/v2/0203", (obj.entry[11].resource!! as Practitioner).identifier[0].type!!.coding[0].system))
        assertTrue(stringMatch("SS", (obj.entry[11].resource!! as Practitioner).identifier[0].type!!.coding[0].code))
        assertTrue(stringMatch("http://hl7.org/fhir/sid/us-ss", (obj.entry[11].resource!! as Practitioner).identifier[0].system))
        assertTrue(stringMatch("999999999", (obj.entry[11].resource!! as Practitioner).identifier[0].value))
        assertTrue(stringMatch("official", (obj.entry[11].resource!! as Practitioner).name[0].use))
        assertTrue(stringMatch("Verify", (obj.entry[11].resource!! as Practitioner).name[0].family))
        assertTrue(stringMatch("Virgil", (obj.entry[11].resource!! as Practitioner).name[0].given[0]))
        assertTrue(stringMatch("phone", (obj.entry[11].resource!! as Practitioner).telecom[0].system))
        assertTrue(stringMatch("555-555-1008", (obj.entry[11].resource!! as Practitioner).telecom[0].value))
        assertTrue(stringMatch("work", (obj.entry[11].resource!! as Practitioner).telecom[0].use))
        assertTrue(stringMatch("home", (obj.entry[11].resource!! as Practitioner).address[0].use))
        assertTrue(stringMatch("1008 Healthcare Drive", (obj.entry[11].resource!! as Practitioner).address[0].line[0]))
        assertTrue(stringMatch("male", (obj.entry[11].resource!! as Practitioner).gender))
        assertTrue(stringMatch("http://hl7.org/fhir/Practitio", obj.entry[12].fullUrl))
        assertTrue(stringMatch("Practitioner", (obj.entry[12].resource!! as Practitioner).resourceType))
        assertTrue(stringMatch("24", (obj.entry[12].resource!! as Practitioner).id))
        assertEquals("2012-05-29T23:45:32Z", (obj.entry[12].resource!! as Practitioner).meta!!.lastUpdated.toString())
        assertTrue(stringMatch("generated", (obj.entry[12].resource!! as Practitioner).text!!.status))
        assertTrue(stringMatch("<div xmlns=\"http://www.w3.org", (obj.entry[12].resource!! as Practitioner).text!!.div))
        assertTrue(stringMatch("http://hl7.org/fhir/v2/0203", (obj.entry[12].resource!! as Practitioner).identifier[0].type!!.coding[0].system))
        assertTrue(stringMatch("SS", (obj.entry[12].resource!! as Practitioner).identifier[0].type!!.coding[0].code))
        assertTrue(stringMatch("http://hl7.org/fhir/sid/us-ss", (obj.entry[12].resource!! as Practitioner).identifier[0].system))
        assertTrue(stringMatch("222333333", (obj.entry[12].resource!! as Practitioner).identifier[0].value))
        assertTrue(stringMatch("official", (obj.entry[12].resource!! as Practitioner).name[0].use))
        assertTrue(stringMatch("Specialize", (obj.entry[12].resource!! as Practitioner).name[0].family))
        assertTrue(stringMatch("Sara", (obj.entry[12].resource!! as Practitioner).name[0].given[0]))
        assertTrue(stringMatch("phone", (obj.entry[12].resource!! as Practitioner).telecom[0].system))
        assertTrue(stringMatch("555-555-1009", (obj.entry[12].resource!! as Practitioner).telecom[0].value))
        assertTrue(stringMatch("work", (obj.entry[12].resource!! as Practitioner).telecom[0].use))
        assertTrue(stringMatch("home", (obj.entry[12].resource!! as Practitioner).address[0].use))
    }
}