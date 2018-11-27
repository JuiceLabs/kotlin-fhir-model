package com.juicelabs.fhir.model

import java.io.File
import kotlin.test.assertEquals
import kotlin.test.assertTrue
import org.junit.jupiter.api.Test

class Bundle36DataTest : DataTests() {
    @Test
    fun `questionnaire-profile-example-ussg-fht 405 Test`() {
        val json = File("./src/test/resources/model/sample_data/questionnaire-profile-example-ussg-fht.json").readTextAndClose()
        val obj = mapper.fromJson(json, Bundle::class.java)
        assertEquals(true, if ((obj.entry[1].resource!! as Questionnaire).item[2].item[0].item[1].repeats != null) (obj.entry[1].resource!! as Questionnaire).item[2].item[0].item[1].repeats else false, "Field: (obj.entry[1].resource!! as Questionnaire).item[2].item[0].item[1].repeats")
        assertTrue(stringMatch("2.1.2.1", (obj.entry[1].resource!! as Questionnaire).item[2].item[0].item[1].item[0].linkId))
        assertTrue(stringMatch("http://loinc.org/fhir/DataEle", (obj.entry[1].resource!! as Questionnaire).item[2].item[0].item[1].item[0].definition))
        assertTrue(stringMatch("Disease or Condition", (obj.entry[1].resource!! as Questionnaire).item[2].item[0].item[1].item[0].text))
        assertTrue(stringMatch("choice", (obj.entry[1].resource!! as Questionnaire).item[2].item[0].item[1].item[0].type))
        assertEquals(true, if ((obj.entry[1].resource!! as Questionnaire).item[2].item[0].item[1].item[0].required != null) (obj.entry[1].resource!! as Questionnaire).item[2].item[0].item[1].item[0].required else false, "Field: (obj.entry[1].resource!! as Questionnaire).item[2].item[0].item[1].item[0].required")
        assertTrue(stringMatch("http://hl7.org/fhir/us/sdc/Va", (obj.entry[1].resource!! as Questionnaire).item[2].item[0].item[1].item[0].options!!.reference))
        assertTrue(stringMatch("USSG-FHT diseases", (obj.entry[1].resource!! as Questionnaire).item[2].item[0].item[1].item[0].options!!.display))
        assertTrue(stringMatch("2.1.2.2", (obj.entry[1].resource!! as Questionnaire).item[2].item[0].item[1].item[1].linkId))
        assertTrue(stringMatch("http://loinc.org/fhir/DataEle", (obj.entry[1].resource!! as Questionnaire).item[2].item[0].item[1].item[1].definition))
        assertTrue(stringMatch("Age at Diagnosis", (obj.entry[1].resource!! as Questionnaire).item[2].item[0].item[1].item[1].text))
        assertTrue(stringMatch("choice", (obj.entry[1].resource!! as Questionnaire).item[2].item[0].item[1].item[1].type))
        assertTrue(stringMatch("http://hl7.org/fhir/us/sdc/Va", (obj.entry[1].resource!! as Questionnaire).item[2].item[0].item[1].item[1].options!!.reference))
        assertTrue(stringMatch("USSG-FHT age", (obj.entry[1].resource!! as Questionnaire).item[2].item[0].item[1].item[1].options!!.display))
        assertTrue(stringMatch("2.1.2.3", (obj.entry[1].resource!! as Questionnaire).item[2].item[0].item[1].item[2].linkId))
        assertTrue(stringMatch("Mock-up item: Height", (obj.entry[1].resource!! as Questionnaire).item[2].item[0].item[1].item[2].text))
        assertTrue(stringMatch("decimal", (obj.entry[1].resource!! as Questionnaire).item[2].item[0].item[1].item[2].type))
        assertTrue(stringMatch("2.1.2.4", (obj.entry[1].resource!! as Questionnaire).item[2].item[0].item[1].item[3].linkId))
        assertTrue(stringMatch("Mock-up item: Weight", (obj.entry[1].resource!! as Questionnaire).item[2].item[0].item[1].item[3].text))
        assertTrue(stringMatch("decimal", (obj.entry[1].resource!! as Questionnaire).item[2].item[0].item[1].item[3].type))
        assertTrue(stringMatch("2.1.2.5", (obj.entry[1].resource!! as Questionnaire).item[2].item[0].item[1].item[4].linkId))
        assertTrue(stringMatch("Mock-up item: BMI", (obj.entry[1].resource!! as Questionnaire).item[2].item[0].item[1].item[4].text))
        assertTrue(stringMatch("decimal", (obj.entry[1].resource!! as Questionnaire).item[2].item[0].item[1].item[4].type))
        assertTrue(stringMatch("PUT", obj.entry[1].request!!.method))
        assertTrue(stringMatch("http://hl7.org/fhir/us/sdc/Qu", obj.entry[1].request!!.url))
        assertTrue(stringMatch("http://hl7.org/fhir/us/sdc/Va", obj.entry[2].fullUrl))
        assertTrue(stringMatch("ValueSet", (obj.entry[2].resource!! as ValueSet).resourceType))
        assertTrue(stringMatch("LL1-9", (obj.entry[2].resource!! as ValueSet).id))
        assertTrue(stringMatch("http://hl7.org/fhir/us/sdc/St", (obj.entry[2].resource!! as ValueSet).meta!!.profile[0]))
        assertTrue(stringMatch("generated", (obj.entry[2].resource!! as ValueSet).text!!.status))
        assertTrue(stringMatch("<div xmlns=\"http://www.w3.org", (obj.entry[2].resource!! as ValueSet).text!!.div))
        assertTrue(stringMatch("http://details.loinc.org/Answ", (obj.entry[2].resource!! as ValueSet).url))
        assertTrue(stringMatch("Gender_M/F", (obj.entry[2].resource!! as ValueSet).name))
        assertTrue(stringMatch("active", (obj.entry[2].resource!! as ValueSet).status))
        assertTrue(stringMatch("Regenstrief Institute, Inc an", (obj.entry[2].resource!! as ValueSet).publisher))
        assertTrue(stringMatch("Male=1, Female=2", (obj.entry[2].resource!! as ValueSet).description))
        assertEquals(true, if ((obj.entry[2].resource!! as ValueSet).immutable != null) (obj.entry[2].resource!! as ValueSet).immutable else false, "Field: (obj.entry[2].resource!! as ValueSet).immutable")
        assertTrue(stringMatch("Refer to https://loinc.org/te", (obj.entry[2].resource!! as ValueSet).copyright))
        assertEquals(false, if ((obj.entry[2].resource!! as ValueSet).extensible != null) (obj.entry[2].resource!! as ValueSet).extensible else false, "Field: (obj.entry[2].resource!! as ValueSet).extensible")
        assertTrue(stringMatch("http://loinc.org", (obj.entry[2].resource!! as ValueSet).compose!!.include[0].system))
        assertTrue(stringMatch("LA2-8", (obj.entry[2].resource!! as ValueSet).compose!!.include[0].concept[0].code))
        assertTrue(stringMatch("Male", (obj.entry[2].resource!! as ValueSet).compose!!.include[0].concept[0].display))
        assertTrue(stringMatch("LA3-6", (obj.entry[2].resource!! as ValueSet).compose!!.include[0].concept[1].code))
        assertTrue(stringMatch("Female", (obj.entry[2].resource!! as ValueSet).compose!!.include[0].concept[1].display))
        assertTrue(stringMatch("LA46-8", (obj.entry[2].resource!! as ValueSet).compose!!.include[0].concept[2].code))
        assertTrue(stringMatch("Other", (obj.entry[2].resource!! as ValueSet).compose!!.include[0].concept[2].display))
        assertTrue(stringMatch("PUT", obj.entry[2].request!!.method))
        assertTrue(stringMatch("http://hl7.org/fhir/us/sdc/Va", obj.entry[2].request!!.url))
        assertTrue(stringMatch("http://hl7.org/fhir/us/sdc/Va", obj.entry[3].fullUrl))
        assertTrue(stringMatch("ValueSet", (obj.entry[3].resource!! as ValueSet).resourceType))
        assertTrue(stringMatch("LL623-0", (obj.entry[3].resource!! as ValueSet).id))
        assertTrue(stringMatch("http://hl7.org/fhir/us/sdc/St", (obj.entry[3].resource!! as ValueSet).meta!!.profile[0]))
        assertTrue(stringMatch("generated", (obj.entry[3].resource!! as ValueSet).text!!.status))
        assertTrue(stringMatch("<div xmlns=\"http://www.w3.org", (obj.entry[3].resource!! as ValueSet).text!!.div))
        assertTrue(stringMatch("http://details.loinc.org/Answ", (obj.entry[3].resource!! as ValueSet).url))
        assertTrue(stringMatch("USSG-FHT twin", (obj.entry[3].resource!! as ValueSet).name))
        assertTrue(stringMatch("active", (obj.entry[3].resource!! as ValueSet).status))
        assertTrue(stringMatch("Regenstrief Institute, Inc an", (obj.entry[3].resource!! as ValueSet).publisher))
        assertTrue(stringMatch("Family history tool twin", (obj.entry[3].resource!! as ValueSet).description))
        assertEquals(true, if ((obj.entry[3].resource!! as ValueSet).immutable != null) (obj.entry[3].resource!! as ValueSet).immutable else false, "Field: (obj.entry[3].resource!! as ValueSet).immutable")
        assertTrue(stringMatch("Refer to https://loinc.org/te", (obj.entry[3].resource!! as ValueSet).copyright))
        assertEquals(false, if ((obj.entry[3].resource!! as ValueSet).extensible != null) (obj.entry[3].resource!! as ValueSet).extensible else false, "Field: (obj.entry[3].resource!! as ValueSet).extensible")
        assertTrue(stringMatch("http://loinc.org", (obj.entry[3].resource!! as ValueSet).compose!!.include[0].system))
        assertTrue(stringMatch("LA10427-5", (obj.entry[3].resource!! as ValueSet).compose!!.include[0].concept[0].code))
        assertTrue(stringMatch("Yes - Identical (Same)", (obj.entry[3].resource!! as ValueSet).compose!!.include[0].concept[0].display))
        assertTrue(stringMatch("LA10428-3", (obj.entry[3].resource!! as ValueSet).compose!!.include[0].concept[1].code))
        assertTrue(stringMatch("Yes - Fraternal (Different)", (obj.entry[3].resource!! as ValueSet).compose!!.include[0].concept[1].display))
        assertTrue(stringMatch("LA32-8", (obj.entry[3].resource!! as ValueSet).compose!!.include[0].concept[2].code))
        assertTrue(stringMatch("No", (obj.entry[3].resource!! as ValueSet).compose!!.include[0].concept[2].display))
        assertTrue(stringMatch("PUT", obj.entry[3].request!!.method))
        assertTrue(stringMatch("http://hl7.org/fhir/us/sdc/Va", obj.entry[3].request!!.url))
    }
}