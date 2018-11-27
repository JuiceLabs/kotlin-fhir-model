package com.juicelabs.fhir.model

import java.io.File
import kotlin.test.assertEquals
import kotlin.test.assertTrue
import org.junit.jupiter.api.Test

class Bundle101DataTest : DataTests() {
    @Test
    fun `patient-examples-cypress-template 472 Test`() {
        val json = File("./src/test/resources/model/sample_data/patient-examples-cypress-template.json").readTextAndClose()
        val obj = mapper.fromJson(json, Bundle::class.java)
        assertTrue(stringMatch("295", (obj.entry[224].resource!! as Patient).id))
        assertEquals("2012-06-03T23:45:32Z", (obj.entry[224].resource!! as Patient).meta!!.lastUpdated.toString())
        assertTrue(stringMatch("generated", (obj.entry[224].resource!! as Patient).text!!.status))
        assertTrue(stringMatch("<div xmlns=\"http://www.w3.org", (obj.entry[224].resource!! as Patient).text!!.div))
        assertTrue(stringMatch("http://hl7.org/fhir/v2/0203", (obj.entry[224].resource!! as Patient).identifier[0].type!!.coding[0].system))
        assertTrue(stringMatch("SS", (obj.entry[224].resource!! as Patient).identifier[0].type!!.coding[0].code))
        assertTrue(stringMatch("https://github.com/projectcyp", (obj.entry[224].resource!! as Patient).identifier[0].system))
        assertTrue(stringMatch("577614", (obj.entry[224].resource!! as Patient).identifier[0].value))
        assertEquals(true, if ((obj.entry[224].resource!! as Patient).active != null) (obj.entry[224].resource!! as Patient).active else false, "Field: (obj.entry[224].resource!! as Patient).active")
        assertTrue(stringMatch("official", (obj.entry[224].resource!! as Patient).name[0].use))
        assertTrue(stringMatch("Wheeler", (obj.entry[224].resource!! as Patient).name[0].family))
        assertTrue(stringMatch("Beverly", (obj.entry[224].resource!! as Patient).name[0].given[0]))
        assertTrue(stringMatch("female", (obj.entry[224].resource!! as Patient).gender))
        assertEquals("1931-07-07", (obj.entry[224].resource!! as Patient).birthDate.toString())
        assertTrue(stringMatch("Organization/1", (obj.entry[224].resource!! as Patient).managingOrganization!!.reference))
    }

    @Test
    fun `bundle-example 473 Test`() {
        val json = File("./src/test/resources/model/sample_data/bundle-example.json").readTextAndClose()
        val obj = mapper.fromJson(json, Bundle::class.java)
        assertTrue(stringMatch("Bundle", obj.resourceType))
        assertTrue(stringMatch("bundle-example", obj.id))
        assertEquals("2014-08-18T01:43:30Z", obj.meta!!.lastUpdated.toString())
        assertTrue(stringMatch("searchset", obj.type))
        assertEquals(3, obj.total)
        assertTrue(stringMatch("self", obj.link[0].relation))
        assertTrue(stringMatch("https://example.com/base/Medi", obj.link[0].url))
        assertTrue(stringMatch("next", obj.link[1].relation))
        assertTrue(stringMatch("https://example.com/base/Medi", obj.link[1].url))
        assertTrue(stringMatch("https://example.com/base/Medi", obj.entry[0].fullUrl))
        assertTrue(stringMatch("MedicationRequest", (obj.entry[0].resource!! as MedicationRequest).resourceType))
        assertTrue(stringMatch("3123", (obj.entry[0].resource!! as MedicationRequest).id))
        assertTrue(stringMatch("generated", (obj.entry[0].resource!! as MedicationRequest).text!!.status))
        assertTrue(stringMatch("<div xmlns=\"http://www.w3.org", (obj.entry[0].resource!! as MedicationRequest).text!!.div))
        assertTrue(stringMatch("order", (obj.entry[0].resource!! as MedicationRequest).intent))
        assertTrue(stringMatch("Medication/example", (obj.entry[0].resource!! as MedicationRequest).medicationReference.reference))
        assertTrue(stringMatch("Patient/347", (obj.entry[0].resource!! as MedicationRequest).subject.reference))
        assertTrue(stringMatch("match", obj.entry[0].search!!.mode))
        assertTrue(stringMatch("%.2f".format(1f), "%.2f".format(obj.entry[0].search!!.score)))
        assertTrue(stringMatch("https://example.com/base/Medi", obj.entry[1].fullUrl))
        assertTrue(stringMatch("Medication", (obj.entry[1].resource!! as Medication).resourceType))
        assertTrue(stringMatch("example", (obj.entry[1].resource!! as Medication).id))
        assertTrue(stringMatch("generated", (obj.entry[1].resource!! as Medication).text!!.status))
        assertTrue(stringMatch("<div xmlns=\"http://www.w3.org", (obj.entry[1].resource!! as Medication).text!!.div))
        assertTrue(stringMatch("include", obj.entry[1].search!!.mode))
    }

    @Test
    fun `diagnosticreport-examples-general 474 Test`() {
        val json = File("./src/test/resources/model/sample_data/diagnosticreport-examples-general.json").readTextAndClose()
        val obj = mapper.fromJson(json, Bundle::class.java)
        assertTrue(stringMatch("Bundle", obj.resourceType))
        assertTrue(stringMatch("72ac8493-52ac-41bd-8d5d-7258c", obj.id))
        assertEquals("2012-04-14T10:35:23Z", obj.meta!!.lastUpdated.toString())
        assertTrue(stringMatch("collection", obj.type))
        assertTrue(stringMatch("http://hl7.org/fhir/Diagnosti", obj.entry[0].fullUrl))
        assertTrue(stringMatch("DiagnosticReport", (obj.entry[0].resource!! as DiagnosticReport).resourceType))
        assertTrue(stringMatch("3", (obj.entry[0].resource!! as DiagnosticReport).id))
        assertEquals("2012-04-14T10:35:23Z", (obj.entry[0].resource!! as DiagnosticReport).meta!!.lastUpdated.toString())
        assertTrue(stringMatch("generated", (obj.entry[0].resource!! as DiagnosticReport).text!!.status))
        assertTrue(stringMatch("<div xmlns=\"http://www.w3.org", (obj.entry[0].resource!! as DiagnosticReport).text!!.div))
        assertTrue(stringMatch("Observation", ((obj.entry[0].resource!! as DiagnosticReport).contained[0] as Observation).resourceType))
        assertTrue(stringMatch("o1", ((obj.entry[0].resource!! as DiagnosticReport).contained[0] as Observation).id))
        assertTrue(stringMatch("final", ((obj.entry[0].resource!! as DiagnosticReport).contained[0] as Observation).status))
        assertTrue(stringMatch("http://loinc.org", ((obj.entry[0].resource!! as DiagnosticReport).contained[0] as Observation).code.coding[0].system))
        assertTrue(stringMatch("2951-2", ((obj.entry[0].resource!! as DiagnosticReport).contained[0] as Observation).code.coding[0].code))
        assertTrue(stringMatch("Sodium [Moles/volume] in Seru", ((obj.entry[0].resource!! as DiagnosticReport).contained[0] as Observation).code.coding[0].display))
        assertTrue(stringMatch("http://snomed.info/sct", ((obj.entry[0].resource!! as DiagnosticReport).contained[0] as Observation).code.coding[1].system))
        assertTrue(stringMatch("104934005", ((obj.entry[0].resource!! as DiagnosticReport).contained[0] as Observation).code.coding[1].code))
        assertTrue(stringMatch("Patient/1", ((obj.entry[0].resource!! as DiagnosticReport).contained[0] as Observation).subject!!.reference))
        assertTrue(stringMatch("Organization/1832473e-2fe0-45", ((obj.entry[0].resource!! as DiagnosticReport).contained[0] as Observation).performer[0].reference))
        assertTrue(stringMatch("Acme Laboratory, Inc", ((obj.entry[0].resource!! as DiagnosticReport).contained[0] as Observation).performer[0].display))
        assertTrue(stringMatch("%.2f".format(140f), "%.2f".format(((obj.entry[0].resource!! as DiagnosticReport).contained[0] as Observation).valueQuantity!!.value)))
        assertTrue(stringMatch("mmol/L", ((obj.entry[0].resource!! as DiagnosticReport).contained[0] as Observation).valueQuantity!!.unit))
        assertTrue(stringMatch("%.2f".format(137f), "%.2f".format(((obj.entry[0].resource!! as DiagnosticReport).contained[0] as Observation).referenceRange[0].low!!.value)))
        assertTrue(stringMatch("mmol/L", ((obj.entry[0].resource!! as DiagnosticReport).contained[0] as Observation).referenceRange[0].low!!.unit))
        assertTrue(stringMatch("%.2f".format(147f), "%.2f".format(((obj.entry[0].resource!! as DiagnosticReport).contained[0] as Observation).referenceRange[0].high!!.value)))
        assertTrue(stringMatch("mmol/L", ((obj.entry[0].resource!! as DiagnosticReport).contained[0] as Observation).referenceRange[0].high!!.unit))
        assertTrue(stringMatch("Observation", ((obj.entry[0].resource!! as DiagnosticReport).contained[1] as Observation).resourceType))
        assertTrue(stringMatch("o2", ((obj.entry[0].resource!! as DiagnosticReport).contained[1] as Observation).id))
        assertTrue(stringMatch("final", ((obj.entry[0].resource!! as DiagnosticReport).contained[1] as Observation).status))
        assertTrue(stringMatch("http://loinc.org", ((obj.entry[0].resource!! as DiagnosticReport).contained[1] as Observation).code.coding[0].system))
    }
}
