package com.juicelabs.fhir.model

import java.io.File
import java.lang.SuppressWarnings
import kotlin.test.assertEquals
import kotlin.test.assertTrue
import org.junit.jupiter.api.Test

class QuestionnaireDataTest : DataTests() {
    @Test
    fun `questionnaire-example 568 Test`() {
        val json = File("./src/test/resources/model/sample_data/questionnaire-example.json").readTextAndClose()
        val obj = mapper.fromJson(json, Questionnaire::class.java)
        assertTrue(stringMatch("Questionnaire", obj.resourceType))
        assertTrue(stringMatch("3141", obj.id))
        assertTrue(stringMatch("generated", obj.text!!.status))
        assertTrue(stringMatch("<div xmlns=\"http://www.w3.org", obj.text!!.div))
        assertTrue(stringMatch("http://hl7.org/fhir/Questionn", obj.url))
        assertTrue(stringMatch("Cancer Quality Forum Question", obj.title))
        assertTrue(stringMatch("draft", obj.status))
        assertTrue(stringMatch("2012-01", obj.date))
        assertTrue(stringMatch("Patient", obj.subjectType[0]))
        assertTrue(stringMatch("1", obj.item[0].linkId))
        assertTrue(stringMatch("http://example.org/system/cod", obj.item[0].code[0].system))
        assertTrue(stringMatch("COMORBIDITY", obj.item[0].code[0].code))
        assertTrue(stringMatch("group", obj.item[0].type))
    }

    @Test
    fun `questionnaire-example 569 Test`() {
        val json = File("./src/test/resources/model/sample_data/questionnaire-example.json").readTextAndClose()
        val obj = mapper.fromJson(json, Questionnaire::class.java)
        assertTrue(stringMatch("1.1", obj.item[0].item[0].linkId))
        assertTrue(stringMatch("http://example.org/system/cod", obj.item[0].item[0].code[0].system))
        assertTrue(stringMatch("COMORB", obj.item[0].item[0].code[0].code))
        assertTrue(stringMatch("1", obj.item[0].item[0].prefix))
        assertTrue(stringMatch("choice", obj.item[0].item[0].type))
        assertTrue(stringMatch("http://hl7.org/fhir/ValueSet/", obj.item[0].item[0].options!!.reference))
        assertTrue(stringMatch("1.1.1", obj.item[0].item[0].item[0].linkId))
        assertTrue(stringMatch("http://example.org/system/cod", obj.item[0].item[0].item[0].code[0].system))
        assertTrue(stringMatch("CARDIAL", obj.item[0].item[0].item[0].code[0].code))
        assertTrue(stringMatch("group", obj.item[0].item[0].item[0].type))
        assertTrue(stringMatch("1.1", obj.item[0].item[0].item[0].enableWhen[0].question))
        assertTrue(stringMatch("http://hl7.org/fhir/v2/0136", obj.item[0].item[0].item[0].enableWhen[0].answerCoding!!.system))
        assertTrue(stringMatch("Y", obj.item[0].item[0].item[0].enableWhen[0].answerCoding!!.code))
        assertTrue(stringMatch("1.1.1.1", obj.item[0].item[0].item[0].item[0].linkId))
        assertTrue(stringMatch("http://example.org/system/cod", obj.item[0].item[0].item[0].item[0].code[0].system))
        assertTrue(stringMatch("COMORBCAR", obj.item[0].item[0].item[0].item[0].code[0].code))
        assertTrue(stringMatch("1.1", obj.item[0].item[0].item[0].item[0].prefix))
        assertTrue(stringMatch("choice", obj.item[0].item[0].item[0].item[0].type))
        assertTrue(stringMatch("http://hl7.org/fhir/ValueSet/", obj.item[0].item[0].item[0].item[0].options!!.reference))
        assertTrue(stringMatch("1.1.1.1.1", obj.item[0].item[0].item[0].item[0].item[0].linkId))
        assertTrue(stringMatch("http://example.org/system/cod", obj.item[0].item[0].item[0].item[0].item[0].code[0].system))
        assertTrue(stringMatch("COMCAR00", obj.item[0].item[0].item[0].item[0].item[0].code[0].code))
        assertTrue(stringMatch("Angina Pectoris", obj.item[0].item[0].item[0].item[0].item[0].code[0].display))
        assertTrue(stringMatch("http://snomed.info/sct", obj.item[0].item[0].item[0].item[0].item[0].code[1].system))
        assertTrue(stringMatch("194828000", obj.item[0].item[0].item[0].item[0].item[0].code[1].code))
        assertTrue(stringMatch("Angina (disorder)", obj.item[0].item[0].item[0].item[0].item[0].code[1].display))
        assertTrue(stringMatch("1.1.1", obj.item[0].item[0].item[0].item[0].item[0].prefix))
        assertTrue(stringMatch("choice", obj.item[0].item[0].item[0].item[0].item[0].type))
        assertTrue(stringMatch("http://hl7.org/fhir/ValueSet/", obj.item[0].item[0].item[0].item[0].item[0].options!!.reference))
        assertTrue(stringMatch("1.1.1.1.2", obj.item[0].item[0].item[0].item[0].item[1].linkId))
        assertTrue(stringMatch("http://snomed.info/sct", obj.item[0].item[0].item[0].item[0].item[1].code[0].system))
        assertTrue(stringMatch("22298006", obj.item[0].item[0].item[0].item[0].item[1].code[0].code))
        assertTrue(stringMatch("Myocardial infarction (disord", obj.item[0].item[0].item[0].item[0].item[1].code[0].display))
        assertTrue(stringMatch("1.1.2", obj.item[0].item[0].item[0].item[0].item[1].prefix))
        assertTrue(stringMatch("choice", obj.item[0].item[0].item[0].item[0].item[1].type))
        assertTrue(stringMatch("http://hl7.org/fhir/ValueSet/", obj.item[0].item[0].item[0].item[0].item[1].options!!.reference))
        assertTrue(stringMatch("1.1.1.2", obj.item[0].item[0].item[0].item[1].linkId))
        assertTrue(stringMatch("http://example.org/system/cod", obj.item[0].item[0].item[0].item[1].code[0].system))
        assertTrue(stringMatch("COMORBVAS", obj.item[0].item[0].item[0].item[1].code[0].code))
        assertTrue(stringMatch("1.2", obj.item[0].item[0].item[0].item[1].prefix))
        assertTrue(stringMatch("choice", obj.item[0].item[0].item[0].item[1].type))
        assertTrue(stringMatch("http://hl7.org/fhir/ValueSet/", obj.item[0].item[0].item[0].item[1].options!!.reference))
        assertTrue(stringMatch("2", obj.item[1].linkId))
        assertTrue(stringMatch("http://example.org/system/cod", obj.item[1].code[0].system))
        assertTrue(stringMatch("HISTOPATHOLOGY", obj.item[1].code[0].code))
        assertTrue(stringMatch("group", obj.item[1].type))
        assertTrue(stringMatch("2.1", obj.item[1].item[0].linkId))
        assertTrue(stringMatch("http://example.org/system/cod", obj.item[1].item[0].code[0].system))
        assertTrue(stringMatch("ABDOMINAL", obj.item[1].item[0].code[0].code))
        assertTrue(stringMatch("group", obj.item[1].item[0].type))
        assertTrue(stringMatch("2.1.2", obj.item[1].item[0].item[0].linkId))
        assertTrue(stringMatch("http://example.org/system/cod", obj.item[1].item[0].item[0].code[0].system))
        assertTrue(stringMatch("STADPT", obj.item[1].item[0].item[0].code[0].code))
        assertTrue(stringMatch("pT category", obj.item[1].item[0].item[0].code[0].display))
        assertTrue(stringMatch("choice", obj.item[1].item[0].item[0].type))
    }

    fun `questionnaire-example Init`(@SuppressWarnings("unused") obj: Bundle) {
        obj.identifier  // No-Op to suprress unused warnings
    }

    @Test
    fun `questionnaire-example-f201-lifelines 570 Test`() {
        val json = File("./src/test/resources/model/sample_data/questionnaire-example-f201-lifelines.json").readTextAndClose()
        val obj = mapper.fromJson(json, Questionnaire::class.java)
        assertTrue(stringMatch("Questionnaire", obj.resourceType))
        assertTrue(stringMatch("f201", obj.id))
        assertTrue(stringMatch("generated", obj.text!!.status))
        assertTrue(stringMatch("<div xmlns=\"http://www.w3.org", obj.text!!.div))
        assertTrue(stringMatch("http://hl7.org/fhir/Questionn", obj.url))
        assertTrue(stringMatch("active", obj.status))
        assertTrue(stringMatch("2010", obj.date))
        assertTrue(stringMatch("http://example.org/system/cod", obj.code[0].system))
        assertTrue(stringMatch("VL 1-1, 18-65_1.2.2", obj.code[0].code))
        assertTrue(stringMatch("Lifelines Questionnaire 1 par", obj.code[0].display))
        assertTrue(stringMatch("Patient", obj.subjectType[0]))
        assertTrue(stringMatch("1", obj.item[0].linkId))
        assertTrue(stringMatch("Do you have allergies?", obj.item[0].text))
        assertTrue(stringMatch("boolean", obj.item[0].type))
        assertTrue(stringMatch("2", obj.item[1].linkId))
        assertTrue(stringMatch("General questions", obj.item[1].text))
        assertTrue(stringMatch("group", obj.item[1].type))
        assertTrue(stringMatch("2.1", obj.item[1].item[0].linkId))
        assertTrue(stringMatch("What is your gender?", obj.item[1].item[0].text))
        assertTrue(stringMatch("string", obj.item[1].item[0].type))
        assertTrue(stringMatch("2.2", obj.item[1].item[1].linkId))
        assertTrue(stringMatch("What is your date of birth?", obj.item[1].item[1].text))
        assertTrue(stringMatch("date", obj.item[1].item[1].type))
        assertTrue(stringMatch("2.3", obj.item[1].item[2].linkId))
        assertTrue(stringMatch("What is your country of birth", obj.item[1].item[2].text))
        assertTrue(stringMatch("string", obj.item[1].item[2].type))
        assertTrue(stringMatch("2.4", obj.item[1].item[3].linkId))
        assertTrue(stringMatch("What is your marital status?", obj.item[1].item[3].text))
        assertTrue(stringMatch("string", obj.item[1].item[3].type))
        assertTrue(stringMatch("3", obj.item[2].linkId))
        assertTrue(stringMatch("Intoxications", obj.item[2].text))
        assertTrue(stringMatch("group", obj.item[2].type))
        assertTrue(stringMatch("3.1", obj.item[2].item[0].linkId))
        assertTrue(stringMatch("Do you smoke?", obj.item[2].item[0].text))
        assertTrue(stringMatch("boolean", obj.item[2].item[0].type))
        assertTrue(stringMatch("3.2", obj.item[2].item[1].linkId))
        assertTrue(stringMatch("Do you drink alchohol?", obj.item[2].item[1].text))
        assertTrue(stringMatch("boolean", obj.item[2].item[1].type))
    }

    fun `questionnaire-example-f201-lifelines Init`(@SuppressWarnings("unused") obj: Bundle) {
        obj.identifier  // No-Op to suprress unused warnings
    }

    @Test
    fun `questionnaire-example-gcs 571 Test`() {
        val json = File("./src/test/resources/model/sample_data/questionnaire-example-gcs.json").readTextAndClose()
        val obj = mapper.fromJson(json, Questionnaire::class.java)
        assertTrue(stringMatch("Questionnaire", obj.resourceType))
        assertTrue(stringMatch("gcs", obj.id))
        assertTrue(stringMatch("generated", obj.text!!.status))
        assertTrue(stringMatch("<div xmlns=\"http://www.w3.org", obj.text!!.div))
        assertTrue(stringMatch("ValueSet", (obj.contained[0] as ValueSet).resourceType))
        assertTrue(stringMatch("motor", (obj.contained[0] as ValueSet).id))
        assertTrue(stringMatch("http://loinc.org", (obj.contained[0] as ValueSet).identifier[0].system))
        assertTrue(stringMatch("http://loinc.org/ValueSet/LL3", (obj.contained[0] as ValueSet).identifier[0].value))
        assertTrue(stringMatch("GCS Motor Value Set", (obj.contained[0] as ValueSet).name))
        assertTrue(stringMatch("active", (obj.contained[0] as ValueSet).status))
        assertTrue(stringMatch("LOINC ANSWER LIST    (LL357-5", (obj.contained[0] as ValueSet).description))
        assertTrue(stringMatch("http://loinc.org", (obj.contained[0] as ValueSet).compose!!.include[0].system))
        assertTrue(stringMatch("LA6562-8", (obj.contained[0] as ValueSet).compose!!.include[0].concept[0].code))
        assertTrue(stringMatch("No motor response", (obj.contained[0] as ValueSet).compose!!.include[0].concept[0].display))
        assertTrue(stringMatch("LA6563-6", (obj.contained[0] as ValueSet).compose!!.include[0].concept[1].code))
        assertTrue(stringMatch("Extension to pain", (obj.contained[0] as ValueSet).compose!!.include[0].concept[1].display))
        assertTrue(stringMatch("LA6564-4", (obj.contained[0] as ValueSet).compose!!.include[0].concept[2].code))
        assertTrue(stringMatch("Flexion to pain", (obj.contained[0] as ValueSet).compose!!.include[0].concept[2].display))
        assertTrue(stringMatch("LA6565-1", (obj.contained[0] as ValueSet).compose!!.include[0].concept[3].code))
        assertTrue(stringMatch("Withdrawl from pain", (obj.contained[0] as ValueSet).compose!!.include[0].concept[3].display))
        assertTrue(stringMatch("LA6566-9", (obj.contained[0] as ValueSet).compose!!.include[0].concept[4].code))
        assertTrue(stringMatch("Localizing pain", (obj.contained[0] as ValueSet).compose!!.include[0].concept[4].display))
        assertTrue(stringMatch("LA6567-7", (obj.contained[0] as ValueSet).compose!!.include[0].concept[5].code))
        assertTrue(stringMatch("Obeys commands", (obj.contained[0] as ValueSet).compose!!.include[0].concept[5].display))
        assertTrue(stringMatch("ValueSet", (obj.contained[1] as ValueSet).resourceType))
        assertTrue(stringMatch("verbal", (obj.contained[1] as ValueSet).id))
        assertTrue(stringMatch("http://loinc.org", (obj.contained[1] as ValueSet).identifier[0].system))
        assertTrue(stringMatch("http://loinc.org/ValueSet/LL3", (obj.contained[1] as ValueSet).identifier[0].value))
        assertTrue(stringMatch("GCS Verbal Value Set", (obj.contained[1] as ValueSet).name))
        assertTrue(stringMatch("active", (obj.contained[1] as ValueSet).status))
        assertTrue(stringMatch("LOINC ANSWER LIST    (LL356-7", (obj.contained[1] as ValueSet).description))
        assertTrue(stringMatch("http://loinc.org", (obj.contained[1] as ValueSet).compose!!.include[0].system))
        assertTrue(stringMatch("LA6557-8", (obj.contained[1] as ValueSet).compose!!.include[0].concept[0].code))
        assertTrue(stringMatch("No verbal response (>2yrs); n", (obj.contained[1] as ValueSet).compose!!.include[0].concept[0].display))
        assertTrue(stringMatch("LA6558-6", (obj.contained[1] as ValueSet).compose!!.include[0].concept[1].code))
        assertTrue(stringMatch("Incomprehensible sounds", (obj.contained[1] as ValueSet).compose!!.include[0].concept[1].display))
        assertTrue(stringMatch("LA6559-4", (obj.contained[1] as ValueSet).compose!!.include[0].concept[2].code))
        assertTrue(stringMatch("Inappropriate words", (obj.contained[1] as ValueSet).compose!!.include[0].concept[2].display))
        assertTrue(stringMatch("LA6560-2", (obj.contained[1] as ValueSet).compose!!.include[0].concept[3].code))
        assertTrue(stringMatch("Confused", (obj.contained[1] as ValueSet).compose!!.include[0].concept[3].display))
        assertTrue(stringMatch("LA6561-0", (obj.contained[1] as ValueSet).compose!!.include[0].concept[4].code))
        assertTrue(stringMatch("Oriented", (obj.contained[1] as ValueSet).compose!!.include[0].concept[4].display))
        assertTrue(stringMatch("ValueSet", (obj.contained[2] as ValueSet).resourceType))
        assertTrue(stringMatch("eye", (obj.contained[2] as ValueSet).id))
        assertTrue(stringMatch("http://loinc.org", (obj.contained[2] as ValueSet).identifier[0].system))
        assertTrue(stringMatch("http://loinc.org/ValueSet/LL3", (obj.contained[2] as ValueSet).identifier[0].value))
        assertTrue(stringMatch("GCS Eye Value Set", (obj.contained[2] as ValueSet).name))
        assertTrue(stringMatch("active", (obj.contained[2] as ValueSet).status))
        assertTrue(stringMatch("LOINC ANSWER LIST    (LL355-9", (obj.contained[2] as ValueSet).description))
        assertTrue(stringMatch("http://loinc.org", (obj.contained[2] as ValueSet).compose!!.include[0].system))
        assertTrue(stringMatch("LA6553-7", (obj.contained[2] as ValueSet).compose!!.include[0].concept[0].code))
        assertTrue(stringMatch("No eye opening", (obj.contained[2] as ValueSet).compose!!.include[0].concept[0].display))
        assertTrue(stringMatch("LA6554-5", (obj.contained[2] as ValueSet).compose!!.include[0].concept[1].code))
        assertTrue(stringMatch("Eye opening to pain", (obj.contained[2] as ValueSet).compose!!.include[0].concept[1].display))
        assertTrue(stringMatch("LA6555-2", (obj.contained[2] as ValueSet).compose!!.include[0].concept[2].code))
        assertTrue(stringMatch("Eye opening to verbal command", (obj.contained[2] as ValueSet).compose!!.include[0].concept[2].display))
        assertTrue(stringMatch("LA6556-0", (obj.contained[2] as ValueSet).compose!!.include[0].concept[3].code))
        assertTrue(stringMatch("Eyes open spontaneously", (obj.contained[2] as ValueSet).compose!!.include[0].concept[3].display))
        assertTrue(stringMatch("http://hl7.org/fhir/Questionn", obj.url))
        assertTrue(stringMatch("Glasgow Coma Score", obj.title))
        assertTrue(stringMatch("draft", obj.status))
        assertTrue(stringMatch("2015-08-03", obj.date))
        assertTrue(stringMatch("FHIR Project team", obj.publisher))
        assertTrue(stringMatch("http://loinc.org", obj.code[0].system))
        assertTrue(stringMatch("9269-2", obj.code[0].code))
        assertTrue(stringMatch("Patient", obj.subjectType[0]))
        assertTrue(stringMatch("1.1", obj.item[0].linkId))
        assertTrue(stringMatch("http://loinc.org", obj.item[0].code[0].system))
        assertTrue(stringMatch("9270-0", obj.item[0].code[0].code))
        assertTrue(stringMatch("choice", obj.item[0].type))
        assertTrue(stringMatch("#verbal", obj.item[0].options!!.reference))
        assertTrue(stringMatch("1.2", obj.item[1].linkId))
        assertTrue(stringMatch("http://loinc.org", obj.item[1].code[0].system))
        assertTrue(stringMatch("9268-4", obj.item[1].code[0].code))
        assertTrue(stringMatch("choice", obj.item[1].type))
        assertTrue(stringMatch("#motor", obj.item[1].options!!.reference))
        assertTrue(stringMatch("1.3", obj.item[2].linkId))
        assertTrue(stringMatch("http://loinc.org", obj.item[2].code[0].system))
        assertTrue(stringMatch("9267-6", obj.item[2].code[0].code))
        assertTrue(stringMatch("choice", obj.item[2].type))
        assertTrue(stringMatch("#eye", obj.item[2].options!!.reference))
    }

    fun `questionnaire-example-gcs Init`(@SuppressWarnings("unused") obj: Bundle) {
        obj.identifier  // No-Op to suprress unused warnings
    }

    @Test
    fun `questionnaire-example-bluebook 572 Test`() {
        val json = File("./src/test/resources/model/sample_data/questionnaire-example-bluebook.json").readTextAndClose()
        val obj = mapper.fromJson(json, Questionnaire::class.java)
        assertTrue(stringMatch("Questionnaire", obj.resourceType))
        assertTrue(stringMatch("bb", obj.id))
        assertTrue(stringMatch("generated", obj.text!!.status))
        assertTrue(stringMatch("<div xmlns=\"http://www.w3.org", obj.text!!.div))
        assertTrue(stringMatch("http://hl7.org/fhir/Questionn", obj.url))
        assertTrue(stringMatch("NSW Government My Personal He", obj.title))
        assertTrue(stringMatch("draft", obj.status))
        assertTrue(stringMatch("2013-02-19", obj.date))
        assertTrue(stringMatch("New South Wales Department of", obj.publisher))
        assertTrue(stringMatch("urn:iso:std:iso:3166", obj.jurisdiction[0].coding[0].system))
        assertTrue(stringMatch("AU", obj.jurisdiction[0].coding[0].code))
        assertTrue(stringMatch("Patient", obj.subjectType[0]))
        assertTrue(stringMatch("birthDetails", obj.item[0].linkId))
        assertTrue(stringMatch("Birth details - To be complet", obj.item[0].text))
        assertTrue(stringMatch("group", obj.item[0].type))
        assertTrue(stringMatch("group", obj.item[0].item[0].linkId))
        assertTrue(stringMatch("group", obj.item[0].item[0].type))
        assertTrue(stringMatch("nameOfChild", obj.item[0].item[0].item[0].linkId))
        assertTrue(stringMatch("Name of child", obj.item[0].item[0].item[0].text))
        assertTrue(stringMatch("string", obj.item[0].item[0].item[0].type))
        assertTrue(stringMatch("sex", obj.item[0].item[0].item[1].linkId))
        assertTrue(stringMatch("Sex", obj.item[0].item[0].item[1].text))
        assertTrue(stringMatch("choice", obj.item[0].item[0].item[1].type))
        assertTrue(stringMatch("F", obj.item[0].item[0].item[1].option[0].valueCoding.code))
        assertTrue(stringMatch("M", obj.item[0].item[0].item[1].option[1].valueCoding.code))
        assertTrue(stringMatch("neonatalInformation", obj.item[0].item[1].linkId))
        assertTrue(stringMatch("Neonatal Information", obj.item[0].item[1].text))
        assertTrue(stringMatch("group", obj.item[0].item[1].type))
        assertTrue(stringMatch("birthWeight", obj.item[0].item[1].item[0].linkId))
        assertTrue(stringMatch("Birth weight (kg)", obj.item[0].item[1].item[0].text))
        assertTrue(stringMatch("decimal", obj.item[0].item[1].item[0].type))
        assertTrue(stringMatch("birthLength", obj.item[0].item[1].item[1].linkId))
        assertTrue(stringMatch("Birth length (cm)", obj.item[0].item[1].item[1].text))
        assertTrue(stringMatch("decimal", obj.item[0].item[1].item[1].type))
        assertTrue(stringMatch("vitaminKgiven", obj.item[0].item[1].item[2].linkId))
        assertTrue(stringMatch("Vitamin K given", obj.item[0].item[1].item[2].text))
        assertTrue(stringMatch("choice", obj.item[0].item[1].item[2].type))
        assertTrue(stringMatch("INJECTION", obj.item[0].item[1].item[2].option[0].valueCoding.code))
        assertTrue(stringMatch("INTRAVENOUS", obj.item[0].item[1].item[2].option[1].valueCoding.code))
        assertTrue(stringMatch("ORAL", obj.item[0].item[1].item[2].option[2].valueCoding.code))
        assertTrue(stringMatch("vitaminKgivenDoses", obj.item[0].item[1].item[2].item[0].linkId))
        assertTrue(stringMatch("group", obj.item[0].item[1].item[2].item[0].type))
        assertTrue(stringMatch("vitaminKgiven", obj.item[0].item[1].item[2].item[0].enableWhen[0].question))
        assertEquals(true, if (obj.item[0].item[1].item[2].item[0].enableWhen[0].hasAnswer != null) obj.item[0].item[1].item[2].item[0].enableWhen[0].hasAnswer else false, "Field: obj.item[0].item[1].item[2].item[0].enableWhen[0].hasAnswer")
        assertTrue(stringMatch("vitaminiKDose1", obj.item[0].item[1].item[2].item[0].item[0].linkId))
        assertTrue(stringMatch("1st dose", obj.item[0].item[1].item[2].item[0].item[0].text))
        assertTrue(stringMatch("dateTime", obj.item[0].item[1].item[2].item[0].item[0].type))
        assertTrue(stringMatch("vitaminiKDose2", obj.item[0].item[1].item[2].item[0].item[1].linkId))
        assertTrue(stringMatch("2nd dose", obj.item[0].item[1].item[2].item[0].item[1].text))
        assertTrue(stringMatch("dateTime", obj.item[0].item[1].item[2].item[0].item[1].type))
        assertTrue(stringMatch("hepBgiven", obj.item[0].item[1].item[3].linkId))
        assertTrue(stringMatch("Hep B given y / n", obj.item[0].item[1].item[3].text))
        assertTrue(stringMatch("boolean", obj.item[0].item[1].item[3].type))
        assertTrue(stringMatch("hepBgivenDate", obj.item[0].item[1].item[3].item[0].linkId))
        assertTrue(stringMatch("Date given", obj.item[0].item[1].item[3].item[0].text))
        assertTrue(stringMatch("date", obj.item[0].item[1].item[3].item[0].type))
        assertTrue(stringMatch("abnormalitiesAtBirth", obj.item[0].item[1].item[4].linkId))
        assertTrue(stringMatch("Abnormalities noted at birth", obj.item[0].item[1].item[4].text))
        assertTrue(stringMatch("string", obj.item[0].item[1].item[4].type))
    }

    fun `questionnaire-example-bluebook Init`(@SuppressWarnings("unused") obj: Bundle) {
        obj.identifier  // No-Op to suprress unused warnings
    }
}
