package com.juicelabs.fhir.model

import java.io.File
import kotlin.test.assertEquals
import kotlin.test.assertTrue
import org.junit.jupiter.api.Test

class ImmunizationRecommendationDataTest : DataTests() {
    @Test
    fun `immunizationrecommendation-example 928 Test`() {
        val json = File("./src/test/resources/model/sample_data/immunizationrecommendation-example.json").readTextAndClose()
        val obj = mapper.fromJson(json, ImmunizationRecommendation::class.java)
        assertTrue(stringMatch("ImmunizationRecommendation", obj.resourceType))
        assertTrue(stringMatch("example", obj.id))
        assertTrue(stringMatch("generated", obj.text!!.status))
        assertTrue(stringMatch("<div xmlns=\"http://www.w3.org", obj.text!!.div))
        assertTrue(stringMatch("urn:ietf:rfc:3986", obj.identifier[0].system))
        assertTrue(stringMatch("urn:oid:1.3.6.1.4.1.21367.200", obj.identifier[0].value))
        assertTrue(stringMatch("Patient/example", obj.patient.reference))
        assertEquals("2015-02-09T11:04:15.817-05:00", obj.recommendation[0].date.toString())
        assertTrue(stringMatch("http://snomed.info/sct", obj.recommendation[0].vaccineCode!!.coding[0].system))
        assertTrue(stringMatch("14745005", obj.recommendation[0].vaccineCode!!.coding[0].code))
        assertTrue(stringMatch("Hepatitis A vaccine", obj.recommendation[0].vaccineCode!!.coding[0].display))
        assertEquals(1, obj.recommendation[0].doseNumber)
        assertTrue(stringMatch("Not Complete", obj.recommendation[0].forecastStatus.text))
        assertTrue(stringMatch("http://hl7.org/fhir/immunizat", obj.recommendation[0].dateCriterion[0].code.coding[0].system))
        assertTrue(stringMatch("earliest", obj.recommendation[0].dateCriterion[0].code.coding[0].code))
        assertTrue(stringMatch("Earliest Date", obj.recommendation[0].dateCriterion[0].code.coding[0].display))
        assertEquals("2015-12-01T00:00:00-05:00", obj.recommendation[0].dateCriterion[0].value.toString())
        assertTrue(stringMatch("http://hl7.org/fhir/immunizat", obj.recommendation[0].dateCriterion[1].code.coding[0].system))
        assertTrue(stringMatch("recommended", obj.recommendation[0].dateCriterion[1].code.coding[0].code))
        assertTrue(stringMatch("Recommended", obj.recommendation[0].dateCriterion[1].code.coding[0].display))
        assertEquals("2015-12-01T00:00:00-05:00", obj.recommendation[0].dateCriterion[1].value.toString())
        assertTrue(stringMatch("http://hl7.org/fhir/immunizat", obj.recommendation[0].dateCriterion[2].code.coding[0].system))
        assertTrue(stringMatch("overdue", obj.recommendation[0].dateCriterion[2].code.coding[0].code))
        assertTrue(stringMatch("Past Due Date", obj.recommendation[0].dateCriterion[2].code.coding[0].display))
        assertEquals("2016-12-28T00:00:00-05:00", obj.recommendation[0].dateCriterion[2].value.toString())
        assertEquals(1, obj.recommendation[0].protocol!!.doseSequence)
        assertTrue(stringMatch("First sequence in protocol", obj.recommendation[0].protocol!!.description))
        assertTrue(stringMatch("Organization/hl7", obj.recommendation[0].protocol!!.authority!!.reference))
        assertTrue(stringMatch("Vaccination Series 1", obj.recommendation[0].protocol!!.series))
        assertTrue(stringMatch("Immunization/example", obj.recommendation[0].supportingImmunization[0].reference))
        assertTrue(stringMatch("Observation/example", obj.recommendation[0].supportingPatientInformation[0].reference))
    }

    @Test
    fun `immunizationrecommendation-target-disease-example 929 Test`() {
        val json = File("./src/test/resources/model/sample_data/immunizationrecommendation-target-disease-example.json").readTextAndClose()
        val obj = mapper.fromJson(json, ImmunizationRecommendation::class.java)
        assertTrue(stringMatch("ImmunizationRecommendation", obj.resourceType))
        assertTrue(stringMatch("example", obj.id))
        assertTrue(stringMatch("generated", obj.text!!.status))
        assertTrue(stringMatch("<div xmlns=\"http://www.w3.org", obj.text!!.div))
        assertTrue(stringMatch("urn:ietf:rfc:3986", obj.identifier[0].system))
        assertTrue(stringMatch("urn:oid:1.3.6.1.4.1.21367.200", obj.identifier[0].value))
        assertTrue(stringMatch("Patient/example", obj.patient.reference))
        assertEquals("2015-02-09T11:04:15.817-05:00", obj.recommendation[0].date.toString())
        assertTrue(stringMatch("http://snomed.info/sct", obj.recommendation[0].targetDisease!!.coding[0].system))
        assertTrue(stringMatch("40468003", obj.recommendation[0].targetDisease!!.coding[0].code))
        assertEquals(1, obj.recommendation[0].doseNumber)
        assertTrue(stringMatch("Not Complete", obj.recommendation[0].forecastStatus.text))
        assertTrue(stringMatch("http://hl7.org/fhir/immunizat", obj.recommendation[0].dateCriterion[0].code.coding[0].system))
        assertTrue(stringMatch("earliest", obj.recommendation[0].dateCriterion[0].code.coding[0].code))
    }

    @Test
    fun `immunizationrecommendation-target-disease-example 930 Test`() {
        val json = File("./src/test/resources/model/sample_data/immunizationrecommendation-target-disease-example.json").readTextAndClose()
        val obj = mapper.fromJson(json, ImmunizationRecommendation::class.java)
        assertTrue(stringMatch("Earliest Date", obj.recommendation[0].dateCriterion[0].code.coding[0].display))
        assertEquals("2015-12-01T00:00:00-05:00", obj.recommendation[0].dateCriterion[0].value.toString())
        assertTrue(stringMatch("http://hl7.org/fhir/immunizat", obj.recommendation[0].dateCriterion[1].code.coding[0].system))
        assertTrue(stringMatch("recommended", obj.recommendation[0].dateCriterion[1].code.coding[0].code))
        assertTrue(stringMatch("Recommended", obj.recommendation[0].dateCriterion[1].code.coding[0].display))
        assertEquals("2015-12-01T00:00:00-05:00", obj.recommendation[0].dateCriterion[1].value.toString())
        assertTrue(stringMatch("http://hl7.org/fhir/immunizat", obj.recommendation[0].dateCriterion[2].code.coding[0].system))
        assertTrue(stringMatch("overdue", obj.recommendation[0].dateCriterion[2].code.coding[0].code))
        assertTrue(stringMatch("Past Due Date", obj.recommendation[0].dateCriterion[2].code.coding[0].display))
        assertEquals("2016-12-28T00:00:00-05:00", obj.recommendation[0].dateCriterion[2].value.toString())
        assertEquals(1, obj.recommendation[0].protocol!!.doseSequence)
        assertTrue(stringMatch("First sequence in protocol", obj.recommendation[0].protocol!!.description))
        assertTrue(stringMatch("Organization/hl7", obj.recommendation[0].protocol!!.authority!!.reference))
        assertTrue(stringMatch("Vaccination Series 1", obj.recommendation[0].protocol!!.series))
        assertTrue(stringMatch("Immunization/example", obj.recommendation[0].supportingImmunization[0].reference))
        assertTrue(stringMatch("Observation/example", obj.recommendation[0].supportingPatientInformation[0].reference))
    }
}
