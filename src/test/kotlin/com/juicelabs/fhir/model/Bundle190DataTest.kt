package com.juicelabs.fhir.model

import java.io.File
import kotlin.test.assertTrue
import org.junit.jupiter.api.Test

class Bundle190DataTest : DataTests() {
    @Test
    fun `diagnosticreport-examples-general 563 Test`() {
        val json = File("./src/test/resources/model/sample_data/diagnosticreport-examples-general.json").readTextAndClose()
        val obj = mapper.fromJson(json, Bundle::class.java)
        assertTrue(stringMatch("86228006", ((obj.entry[13].resource!! as DiagnosticReport).contained[8] as Observation).code.coding[1].code))
        assertTrue(stringMatch("Patient/4", ((obj.entry[13].resource!! as DiagnosticReport).contained[8] as Observation).subject!!.reference))
        assertTrue(stringMatch("Organization/1832473e-2fe0-45", ((obj.entry[13].resource!! as DiagnosticReport).contained[8] as Observation).performer[0].reference))
        assertTrue(stringMatch("Acme Laboratory, Inc", ((obj.entry[13].resource!! as DiagnosticReport).contained[8] as Observation).performer[0].display))
        assertTrue(stringMatch("%.2f".format(0.41f), "%.2f".format(((obj.entry[13].resource!! as DiagnosticReport).contained[8] as Observation).valueQuantity!!.value)))
        assertTrue(stringMatch("mmol/L", ((obj.entry[13].resource!! as DiagnosticReport).contained[8] as Observation).valueQuantity!!.unit))
        assertTrue(stringMatch("http://hl7.org/fhir/v2/0078", ((obj.entry[13].resource!! as DiagnosticReport).contained[8] as Observation).interpretation!!.coding[0].system))
        assertTrue(stringMatch("HH", ((obj.entry[13].resource!! as DiagnosticReport).contained[8] as Observation).interpretation!!.coding[0].code))
        assertTrue(stringMatch("%.2f".format(0.14f), "%.2f".format(((obj.entry[13].resource!! as DiagnosticReport).contained[8] as Observation).referenceRange[0].low!!.value)))
        assertTrue(stringMatch("mmol/L", ((obj.entry[13].resource!! as DiagnosticReport).contained[8] as Observation).referenceRange[0].low!!.unit))
        assertTrue(stringMatch("%.2f".format(0.35f), "%.2f".format(((obj.entry[13].resource!! as DiagnosticReport).contained[8] as Observation).referenceRange[0].high!!.value)))
        assertTrue(stringMatch("mmol/L", ((obj.entry[13].resource!! as DiagnosticReport).contained[8] as Observation).referenceRange[0].high!!.unit))
        assertTrue(stringMatch("Observation", ((obj.entry[13].resource!! as DiagnosticReport).contained[9] as Observation).resourceType))
        assertTrue(stringMatch("o10", ((obj.entry[13].resource!! as DiagnosticReport).contained[9] as Observation).id))
        assertTrue(stringMatch("final", ((obj.entry[13].resource!! as DiagnosticReport).contained[9] as Observation).status))
        assertTrue(stringMatch("http://loinc.org", ((obj.entry[13].resource!! as DiagnosticReport).contained[9] as Observation).code.coding[0].system))
        assertTrue(stringMatch("14631-6", ((obj.entry[13].resource!! as DiagnosticReport).contained[9] as Observation).code.coding[0].code))
        assertTrue(stringMatch("Bilirubin.total [Moles/volume", ((obj.entry[13].resource!! as DiagnosticReport).contained[9] as Observation).code.coding[0].display))
        assertTrue(stringMatch("http://snomed.info/sct", ((obj.entry[13].resource!! as DiagnosticReport).contained[9] as Observation).code.coding[1].system))
        assertTrue(stringMatch("27171005", ((obj.entry[13].resource!! as DiagnosticReport).contained[9] as Observation).code.coding[1].code))
        assertTrue(stringMatch("Patient/4", ((obj.entry[13].resource!! as DiagnosticReport).contained[9] as Observation).subject!!.reference))
        assertTrue(stringMatch("Organization/1832473e-2fe0-45", ((obj.entry[13].resource!! as DiagnosticReport).contained[9] as Observation).performer[0].reference))
        assertTrue(stringMatch("Acme Laboratory, Inc", ((obj.entry[13].resource!! as DiagnosticReport).contained[9] as Observation).performer[0].display))
        assertTrue(stringMatch("%.2f".format(27f), "%.2f".format(((obj.entry[13].resource!! as DiagnosticReport).contained[9] as Observation).valueQuantity!!.value)))
        assertTrue(stringMatch("umol/L", ((obj.entry[13].resource!! as DiagnosticReport).contained[9] as Observation).valueQuantity!!.unit))
        assertTrue(stringMatch("http://hl7.org/fhir/v2/0078", ((obj.entry[13].resource!! as DiagnosticReport).contained[9] as Observation).interpretation!!.coding[0].system))
        assertTrue(stringMatch("H", ((obj.entry[13].resource!! as DiagnosticReport).contained[9] as Observation).interpretation!!.coding[0].code))
        assertTrue(stringMatch("%.2f".format(2f), "%.2f".format(((obj.entry[13].resource!! as DiagnosticReport).contained[9] as Observation).referenceRange[0].low!!.value)))
        assertTrue(stringMatch("umol/L", ((obj.entry[13].resource!! as DiagnosticReport).contained[9] as Observation).referenceRange[0].low!!.unit))
        assertTrue(stringMatch("%.2f".format(20f), "%.2f".format(((obj.entry[13].resource!! as DiagnosticReport).contained[9] as Observation).referenceRange[0].high!!.value)))
        assertTrue(stringMatch("umol/L", ((obj.entry[13].resource!! as DiagnosticReport).contained[9] as Observation).referenceRange[0].high!!.unit))
        assertTrue(stringMatch("Observation", ((obj.entry[13].resource!! as DiagnosticReport).contained[10] as Observation).resourceType))
        assertTrue(stringMatch("o11", ((obj.entry[13].resource!! as DiagnosticReport).contained[10] as Observation).id))
        assertTrue(stringMatch("final", ((obj.entry[13].resource!! as DiagnosticReport).contained[10] as Observation).status))
        assertTrue(stringMatch("http://loinc.org", ((obj.entry[13].resource!! as DiagnosticReport).contained[10] as Observation).code.coding[0].system))
        assertTrue(stringMatch("6768-6", ((obj.entry[13].resource!! as DiagnosticReport).contained[10] as Observation).code.coding[0].code))
        assertTrue(stringMatch("Alkaline phosphatase [Enzymat", ((obj.entry[13].resource!! as DiagnosticReport).contained[10] as Observation).code.coding[0].display))
        assertTrue(stringMatch("http://snomed.info/sct", ((obj.entry[13].resource!! as DiagnosticReport).contained[10] as Observation).code.coding[1].system))
        assertTrue(stringMatch("88810008", ((obj.entry[13].resource!! as DiagnosticReport).contained[10] as Observation).code.coding[1].code))
        assertTrue(stringMatch("Patient/4", ((obj.entry[13].resource!! as DiagnosticReport).contained[10] as Observation).subject!!.reference))
        assertTrue(stringMatch("Organization/1832473e-2fe0-45", ((obj.entry[13].resource!! as DiagnosticReport).contained[10] as Observation).performer[0].reference))
        assertTrue(stringMatch("Acme Laboratory, Inc", ((obj.entry[13].resource!! as DiagnosticReport).contained[10] as Observation).performer[0].display))
        assertTrue(stringMatch("%.2f".format(631f), "%.2f".format(((obj.entry[13].resource!! as DiagnosticReport).contained[10] as Observation).valueQuantity!!.value)))
        assertTrue(stringMatch("U/L", ((obj.entry[13].resource!! as DiagnosticReport).contained[10] as Observation).valueQuantity!!.unit))
        assertTrue(stringMatch("http://hl7.org/fhir/v2/0078", ((obj.entry[13].resource!! as DiagnosticReport).contained[10] as Observation).interpretation!!.coding[0].system))
        assertTrue(stringMatch("HH", ((obj.entry[13].resource!! as DiagnosticReport).contained[10] as Observation).interpretation!!.coding[0].code))
        assertTrue(stringMatch("%.2f".format(30f), "%.2f".format(((obj.entry[13].resource!! as DiagnosticReport).contained[10] as Observation).referenceRange[0].low!!.value)))
        assertTrue(stringMatch("U/L", ((obj.entry[13].resource!! as DiagnosticReport).contained[10] as Observation).referenceRange[0].low!!.unit))
        assertTrue(stringMatch("%.2f".format(115f), "%.2f".format(((obj.entry[13].resource!! as DiagnosticReport).contained[10] as Observation).referenceRange[0].high!!.value)))
        assertTrue(stringMatch("U/L", ((obj.entry[13].resource!! as DiagnosticReport).contained[10] as Observation).referenceRange[0].high!!.unit))
        assertTrue(stringMatch("Observation", ((obj.entry[13].resource!! as DiagnosticReport).contained[11] as Observation).resourceType))
        assertTrue(stringMatch("o12", ((obj.entry[13].resource!! as DiagnosticReport).contained[11] as Observation).id))
        assertTrue(stringMatch("final", ((obj.entry[13].resource!! as DiagnosticReport).contained[11] as Observation).status))
        assertTrue(stringMatch("http://loinc.org", ((obj.entry[13].resource!! as DiagnosticReport).contained[11] as Observation).code.coding[0].system))
        assertTrue(stringMatch("2324-2", ((obj.entry[13].resource!! as DiagnosticReport).contained[11] as Observation).code.coding[0].code))
        assertTrue(stringMatch("Gamma glutamyl transferase [E", ((obj.entry[13].resource!! as DiagnosticReport).contained[11] as Observation).code.coding[0].display))
        assertTrue(stringMatch("http://snomed.info/sct", ((obj.entry[13].resource!! as DiagnosticReport).contained[11] as Observation).code.coding[1].system))
        assertTrue(stringMatch("69480007", ((obj.entry[13].resource!! as DiagnosticReport).contained[11] as Observation).code.coding[1].code))
        assertTrue(stringMatch("Patient/4", ((obj.entry[13].resource!! as DiagnosticReport).contained[11] as Observation).subject!!.reference))
        assertTrue(stringMatch("Organization/1832473e-2fe0-45", ((obj.entry[13].resource!! as DiagnosticReport).contained[11] as Observation).performer[0].reference))
        assertTrue(stringMatch("Acme Laboratory, Inc", ((obj.entry[13].resource!! as DiagnosticReport).contained[11] as Observation).performer[0].display))
        assertTrue(stringMatch("%.2f".format(956f), "%.2f".format(((obj.entry[13].resource!! as DiagnosticReport).contained[11] as Observation).valueQuantity!!.value)))
        assertTrue(stringMatch("U/L", ((obj.entry[13].resource!! as DiagnosticReport).contained[11] as Observation).valueQuantity!!.unit))
        assertTrue(stringMatch("http://hl7.org/fhir/v2/0078", ((obj.entry[13].resource!! as DiagnosticReport).contained[11] as Observation).interpretation!!.coding[0].system))
        assertTrue(stringMatch("HH", ((obj.entry[13].resource!! as DiagnosticReport).contained[11] as Observation).interpretation!!.coding[0].code))
        assertTrue(stringMatch("%.2f".format(0f), "%.2f".format(((obj.entry[13].resource!! as DiagnosticReport).contained[11] as Observation).referenceRange[0].low!!.value)))
        assertTrue(stringMatch("U/L", ((obj.entry[13].resource!! as DiagnosticReport).contained[11] as Observation).referenceRange[0].low!!.unit))
        assertTrue(stringMatch("%.2f".format(45f), "%.2f".format(((obj.entry[13].resource!! as DiagnosticReport).contained[11] as Observation).referenceRange[0].high!!.value)))
        assertTrue(stringMatch("U/L", ((obj.entry[13].resource!! as DiagnosticReport).contained[11] as Observation).referenceRange[0].high!!.unit))
        assertTrue(stringMatch("Observation", ((obj.entry[13].resource!! as DiagnosticReport).contained[12] as Observation).resourceType))
        assertTrue(stringMatch("o13", ((obj.entry[13].resource!! as DiagnosticReport).contained[12] as Observation).id))
    }
}