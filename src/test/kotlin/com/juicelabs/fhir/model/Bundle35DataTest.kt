package com.juicelabs.fhir.model

import java.io.File
import kotlin.test.assertEquals
import kotlin.test.assertTrue
import org.junit.jupiter.api.Test

class Bundle35DataTest : DataTests() {
    @Test
    fun `questionnaire-profile-example-ussg-fht 404 Test`() {
        val json = File("./src/test/resources/model/sample_data/questionnaire-profile-example-ussg-fht.json").readTextAndClose()
        val obj = mapper.fromJson(json, Bundle::class.java)
        assertTrue(stringMatch("string", (obj.entry[1].resource!! as Questionnaire).item[2].item[0].item[0].item[1].type))
        assertTrue(stringMatch("2.1.1.3", (obj.entry[1].resource!! as Questionnaire).item[2].item[0].item[0].item[2].linkId))
        assertTrue(stringMatch("http://loinc.org/fhir/DataEle", (obj.entry[1].resource!! as Questionnaire).item[2].item[0].item[0].item[2].definition))
        assertTrue(stringMatch("Gender", (obj.entry[1].resource!! as Questionnaire).item[2].item[0].item[0].item[2].text))
        assertTrue(stringMatch("choice", (obj.entry[1].resource!! as Questionnaire).item[2].item[0].item[0].item[2].type))
        assertTrue(stringMatch("http://hl7.org/fhir/us/sdc/Va", (obj.entry[1].resource!! as Questionnaire).item[2].item[0].item[0].item[2].options!!.reference))
        assertTrue(stringMatch("Gender_M/F", (obj.entry[1].resource!! as Questionnaire).item[2].item[0].item[0].item[2].options!!.display))
        assertTrue(stringMatch("2.1.1.3.1.1", (obj.entry[1].resource!! as Questionnaire).item[2].item[0].item[0].item[2].item[0].linkId))
        assertTrue(stringMatch("Please specify", (obj.entry[1].resource!! as Questionnaire).item[2].item[0].item[0].item[2].item[0].text))
        assertTrue(stringMatch("string", (obj.entry[1].resource!! as Questionnaire).item[2].item[0].item[0].item[2].item[0].type))
        assertEquals(true, if ((obj.entry[1].resource!! as Questionnaire).item[2].item[0].item[0].item[2].item[0].required != null) (obj.entry[1].resource!! as Questionnaire).item[2].item[0].item[0].item[2].item[0].required else false, "Field: (obj.entry[1].resource!! as Questionnaire).item[2].item[0].item[0].item[2].item[0].required")
        assertTrue(stringMatch("2.1.1.4", (obj.entry[1].resource!! as Questionnaire).item[2].item[0].item[0].item[3].linkId))
        assertTrue(stringMatch("http://loinc.org/fhir/DataEle", (obj.entry[1].resource!! as Questionnaire).item[2].item[0].item[0].item[3].definition))
        assertTrue(stringMatch("Living?", (obj.entry[1].resource!! as Questionnaire).item[2].item[0].item[0].item[3].text))
        assertTrue(stringMatch("choice", (obj.entry[1].resource!! as Questionnaire).item[2].item[0].item[0].item[3].type))
        assertTrue(stringMatch("http://hl7.org/fhir/us/sdc/Va", (obj.entry[1].resource!! as Questionnaire).item[2].item[0].item[0].item[3].options!!.reference))
        assertTrue(stringMatch("Y/N1", (obj.entry[1].resource!! as Questionnaire).item[2].item[0].item[0].item[3].options!!.display))
        assertTrue(stringMatch("2.1.1.4.1", (obj.entry[1].resource!! as Questionnaire).item[2].item[0].item[0].item[3].item[0].linkId))
        assertTrue(stringMatch("group", (obj.entry[1].resource!! as Questionnaire).item[2].item[0].item[0].item[3].item[0].type))
        assertTrue(stringMatch("2.1.1.4.1.1", (obj.entry[1].resource!! as Questionnaire).item[2].item[0].item[0].item[3].item[0].item[0].linkId))
        assertTrue(stringMatch("http://loinc.org/fhir/DataEle", (obj.entry[1].resource!! as Questionnaire).item[2].item[0].item[0].item[3].item[0].item[0].definition))
        assertTrue(stringMatch("Cause of Death", (obj.entry[1].resource!! as Questionnaire).item[2].item[0].item[0].item[3].item[0].item[0].text))
        assertTrue(stringMatch("choice", (obj.entry[1].resource!! as Questionnaire).item[2].item[0].item[0].item[3].item[0].item[0].type))
        assertTrue(stringMatch("http://hl7.org/fhir/us/sdc/Va", (obj.entry[1].resource!! as Questionnaire).item[2].item[0].item[0].item[3].item[0].item[0].options!!.reference))
        assertTrue(stringMatch("2.1.1.4.1.1.1", (obj.entry[1].resource!! as Questionnaire).item[2].item[0].item[0].item[3].item[0].item[0].item[0].linkId))
        assertTrue(stringMatch("Please specify", (obj.entry[1].resource!! as Questionnaire).item[2].item[0].item[0].item[3].item[0].item[0].item[0].text))
        assertTrue(stringMatch("string", (obj.entry[1].resource!! as Questionnaire).item[2].item[0].item[0].item[3].item[0].item[0].item[0].type))
        assertTrue(stringMatch("2.1.1.4.1.2", (obj.entry[1].resource!! as Questionnaire).item[2].item[0].item[0].item[3].item[0].item[1].linkId))
        assertTrue(stringMatch("http://loinc.org/fhir/DataEle", (obj.entry[1].resource!! as Questionnaire).item[2].item[0].item[0].item[3].item[0].item[1].definition))
        assertTrue(stringMatch("Age at Death", (obj.entry[1].resource!! as Questionnaire).item[2].item[0].item[0].item[3].item[0].item[1].text))
        assertTrue(stringMatch("choice", (obj.entry[1].resource!! as Questionnaire).item[2].item[0].item[0].item[3].item[0].item[1].type))
        assertTrue(stringMatch("http://hl7.org/fhir/us/sdc/Va", (obj.entry[1].resource!! as Questionnaire).item[2].item[0].item[0].item[3].item[0].item[1].options!!.reference))
        assertTrue(stringMatch("USSG-FHT age", (obj.entry[1].resource!! as Questionnaire).item[2].item[0].item[0].item[3].item[0].item[1].options!!.display))
        assertTrue(stringMatch("2.1.1.4.2", (obj.entry[1].resource!! as Questionnaire).item[2].item[0].item[0].item[3].item[1].linkId))
        assertTrue(stringMatch("group", (obj.entry[1].resource!! as Questionnaire).item[2].item[0].item[0].item[3].item[1].type))
        assertTrue(stringMatch("2.1.1.4.2.1", (obj.entry[1].resource!! as Questionnaire).item[2].item[0].item[0].item[3].item[1].item[0].linkId))
        assertTrue(stringMatch("http://loinc.org/fhir/DataEle", (obj.entry[1].resource!! as Questionnaire).item[2].item[0].item[0].item[3].item[1].item[0].definition))
        assertTrue(stringMatch("Date of Birth", (obj.entry[1].resource!! as Questionnaire).item[2].item[0].item[0].item[3].item[1].item[0].text))
        assertTrue(stringMatch("date", (obj.entry[1].resource!! as Questionnaire).item[2].item[0].item[0].item[3].item[1].item[0].type))
        assertTrue(stringMatch("2.1.1.4.2.2", (obj.entry[1].resource!! as Questionnaire).item[2].item[0].item[0].item[3].item[1].item[1].linkId))
        assertTrue(stringMatch("http://loinc.org/fhir/DataEle", (obj.entry[1].resource!! as Questionnaire).item[2].item[0].item[0].item[3].item[1].item[1].definition))
        assertTrue(stringMatch("Age", (obj.entry[1].resource!! as Questionnaire).item[2].item[0].item[0].item[3].item[1].item[1].text))
        assertTrue(stringMatch("decimal", (obj.entry[1].resource!! as Questionnaire).item[2].item[0].item[0].item[3].item[1].item[1].type))
        assertTrue(stringMatch("2.1.1.5", (obj.entry[1].resource!! as Questionnaire).item[2].item[0].item[0].item[4].linkId))
        assertTrue(stringMatch("http://loinc.org/fhir/DataEle", (obj.entry[1].resource!! as Questionnaire).item[2].item[0].item[0].item[4].definition))
        assertTrue(stringMatch("Was this person born a twin?", (obj.entry[1].resource!! as Questionnaire).item[2].item[0].item[0].item[4].text))
        assertTrue(stringMatch("choice", (obj.entry[1].resource!! as Questionnaire).item[2].item[0].item[0].item[4].type))
        assertTrue(stringMatch("http://hl7.org/fhir/us/sdc/Va", (obj.entry[1].resource!! as Questionnaire).item[2].item[0].item[0].item[4].options!!.reference))
        assertTrue(stringMatch("2.1.1.6", (obj.entry[1].resource!! as Questionnaire).item[2].item[0].item[0].item[5].linkId))
        assertTrue(stringMatch("http://loinc.org/fhir/DataEle", (obj.entry[1].resource!! as Questionnaire).item[2].item[0].item[0].item[5].definition))
        assertTrue(stringMatch("Was this person adopted?", (obj.entry[1].resource!! as Questionnaire).item[2].item[0].item[0].item[5].text))
        assertTrue(stringMatch("choice", (obj.entry[1].resource!! as Questionnaire).item[2].item[0].item[0].item[5].type))
        assertTrue(stringMatch("http://hl7.org/fhir/us/sdc/Va", (obj.entry[1].resource!! as Questionnaire).item[2].item[0].item[0].item[5].options!!.reference))
        assertTrue(stringMatch("2.1.1.7", (obj.entry[1].resource!! as Questionnaire).item[2].item[0].item[0].item[6].linkId))
        assertTrue(stringMatch("http://loinc.org/fhir/DataEle", (obj.entry[1].resource!! as Questionnaire).item[2].item[0].item[0].item[6].definition))
        assertTrue(stringMatch("Race", (obj.entry[1].resource!! as Questionnaire).item[2].item[0].item[0].item[6].text))
        assertTrue(stringMatch("choice", (obj.entry[1].resource!! as Questionnaire).item[2].item[0].item[0].item[6].type))
        assertEquals(true, if ((obj.entry[1].resource!! as Questionnaire).item[2].item[0].item[0].item[6].repeats != null) (obj.entry[1].resource!! as Questionnaire).item[2].item[0].item[0].item[6].repeats else false, "Field: (obj.entry[1].resource!! as Questionnaire).item[2].item[0].item[0].item[6].repeats")
        assertTrue(stringMatch("http://hl7.org/fhir/us/sdc/Va", (obj.entry[1].resource!! as Questionnaire).item[2].item[0].item[0].item[6].options!!.reference))
        assertTrue(stringMatch("USSG-FHT race", (obj.entry[1].resource!! as Questionnaire).item[2].item[0].item[0].item[6].options!!.display))
        assertTrue(stringMatch("2.1.1.8", (obj.entry[1].resource!! as Questionnaire).item[2].item[0].item[0].item[7].linkId))
        assertTrue(stringMatch("http://loinc.org/fhir/DataEle", (obj.entry[1].resource!! as Questionnaire).item[2].item[0].item[0].item[7].definition))
        assertTrue(stringMatch("Ethnicity", (obj.entry[1].resource!! as Questionnaire).item[2].item[0].item[0].item[7].text))
        assertTrue(stringMatch("choice", (obj.entry[1].resource!! as Questionnaire).item[2].item[0].item[0].item[7].type))
        assertEquals(true, if ((obj.entry[1].resource!! as Questionnaire).item[2].item[0].item[0].item[7].repeats != null) (obj.entry[1].resource!! as Questionnaire).item[2].item[0].item[0].item[7].repeats else false, "Field: (obj.entry[1].resource!! as Questionnaire).item[2].item[0].item[0].item[7].repeats")
        assertTrue(stringMatch("http://hl7.org/fhir/us/sdc/Va", (obj.entry[1].resource!! as Questionnaire).item[2].item[0].item[0].item[7].options!!.reference))
        assertTrue(stringMatch("USSG-FHT ethnicity", (obj.entry[1].resource!! as Questionnaire).item[2].item[0].item[0].item[7].options!!.display))
        assertTrue(stringMatch("2.1.2", (obj.entry[1].resource!! as Questionnaire).item[2].item[0].item[1].linkId))
        assertTrue(stringMatch("http://loinc.org/fhir/DataEle", (obj.entry[1].resource!! as Questionnaire).item[2].item[0].item[1].definition))
        assertTrue(stringMatch("This family member's history ", (obj.entry[1].resource!! as Questionnaire).item[2].item[0].item[1].text))
        assertTrue(stringMatch("group", (obj.entry[1].resource!! as Questionnaire).item[2].item[0].item[1].type))
    }
}