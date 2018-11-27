package com.juicelabs.fhir.model

import java.io.File
import kotlin.test.assertTrue
import org.junit.jupiter.api.Test

class Bundle131DataTest : DataTests() {
    @Test
    fun `diagnosticreport-examples-general 504 Test`() {
        val json = File("./src/test/resources/model/sample_data/diagnosticreport-examples-general.json").readTextAndClose()
        val obj = mapper.fromJson(json, Bundle::class.java)
        assertTrue(stringMatch("Organization/1832473e-2fe0-45", ((obj.entry[4].resource!! as DiagnosticReport).contained[9] as Observation).performer[0].reference))
        assertTrue(stringMatch("Acme Laboratory, Inc", ((obj.entry[4].resource!! as DiagnosticReport).contained[9] as Observation).performer[0].display))
        assertTrue(stringMatch("%.2f".format(43f), "%.2f".format(((obj.entry[4].resource!! as DiagnosticReport).contained[9] as Observation).valueQuantity!!.value)))
        assertTrue(stringMatch("umol/L", ((obj.entry[4].resource!! as DiagnosticReport).contained[9] as Observation).valueQuantity!!.unit))
        assertTrue(stringMatch("http://hl7.org/fhir/v2/0078", ((obj.entry[4].resource!! as DiagnosticReport).contained[9] as Observation).interpretation!!.coding[0].system))
        assertTrue(stringMatch("HH", ((obj.entry[4].resource!! as DiagnosticReport).contained[9] as Observation).interpretation!!.coding[0].code))
        assertTrue(stringMatch("%.2f".format(2f), "%.2f".format(((obj.entry[4].resource!! as DiagnosticReport).contained[9] as Observation).referenceRange[0].low!!.value)))
        assertTrue(stringMatch("umol/L", ((obj.entry[4].resource!! as DiagnosticReport).contained[9] as Observation).referenceRange[0].low!!.unit))
        assertTrue(stringMatch("%.2f".format(20f), "%.2f".format(((obj.entry[4].resource!! as DiagnosticReport).contained[9] as Observation).referenceRange[0].high!!.value)))
        assertTrue(stringMatch("umol/L", ((obj.entry[4].resource!! as DiagnosticReport).contained[9] as Observation).referenceRange[0].high!!.unit))
        assertTrue(stringMatch("Observation", ((obj.entry[4].resource!! as DiagnosticReport).contained[10] as Observation).resourceType))
        assertTrue(stringMatch("o11", ((obj.entry[4].resource!! as DiagnosticReport).contained[10] as Observation).id))
        assertTrue(stringMatch("final", ((obj.entry[4].resource!! as DiagnosticReport).contained[10] as Observation).status))
        assertTrue(stringMatch("http://loinc.org", ((obj.entry[4].resource!! as DiagnosticReport).contained[10] as Observation).code.coding[0].system))
        assertTrue(stringMatch("6768-6", ((obj.entry[4].resource!! as DiagnosticReport).contained[10] as Observation).code.coding[0].code))
        assertTrue(stringMatch("Alkaline phosphatase [Enzymat", ((obj.entry[4].resource!! as DiagnosticReport).contained[10] as Observation).code.coding[0].display))
        assertTrue(stringMatch("http://snomed.info/sct", ((obj.entry[4].resource!! as DiagnosticReport).contained[10] as Observation).code.coding[1].system))
        assertTrue(stringMatch("88810008", ((obj.entry[4].resource!! as DiagnosticReport).contained[10] as Observation).code.coding[1].code))
        assertTrue(stringMatch("Patient/5", ((obj.entry[4].resource!! as DiagnosticReport).contained[10] as Observation).subject!!.reference))
        assertTrue(stringMatch("Organization/1832473e-2fe0-45", ((obj.entry[4].resource!! as DiagnosticReport).contained[10] as Observation).performer[0].reference))
        assertTrue(stringMatch("Acme Laboratory, Inc", ((obj.entry[4].resource!! as DiagnosticReport).contained[10] as Observation).performer[0].display))
        assertTrue(stringMatch("%.2f".format(708f), "%.2f".format(((obj.entry[4].resource!! as DiagnosticReport).contained[10] as Observation).valueQuantity!!.value)))
        assertTrue(stringMatch("U/L", ((obj.entry[4].resource!! as DiagnosticReport).contained[10] as Observation).valueQuantity!!.unit))
        assertTrue(stringMatch("http://hl7.org/fhir/v2/0078", ((obj.entry[4].resource!! as DiagnosticReport).contained[10] as Observation).interpretation!!.coding[0].system))
        assertTrue(stringMatch("HH", ((obj.entry[4].resource!! as DiagnosticReport).contained[10] as Observation).interpretation!!.coding[0].code))
        assertTrue(stringMatch("%.2f".format(30f), "%.2f".format(((obj.entry[4].resource!! as DiagnosticReport).contained[10] as Observation).referenceRange[0].low!!.value)))
        assertTrue(stringMatch("U/L", ((obj.entry[4].resource!! as DiagnosticReport).contained[10] as Observation).referenceRange[0].low!!.unit))
        assertTrue(stringMatch("%.2f".format(115f), "%.2f".format(((obj.entry[4].resource!! as DiagnosticReport).contained[10] as Observation).referenceRange[0].high!!.value)))
        assertTrue(stringMatch("U/L", ((obj.entry[4].resource!! as DiagnosticReport).contained[10] as Observation).referenceRange[0].high!!.unit))
        assertTrue(stringMatch("Observation", ((obj.entry[4].resource!! as DiagnosticReport).contained[11] as Observation).resourceType))
        assertTrue(stringMatch("o12", ((obj.entry[4].resource!! as DiagnosticReport).contained[11] as Observation).id))
        assertTrue(stringMatch("final", ((obj.entry[4].resource!! as DiagnosticReport).contained[11] as Observation).status))
        assertTrue(stringMatch("http://loinc.org", ((obj.entry[4].resource!! as DiagnosticReport).contained[11] as Observation).code.coding[0].system))
        assertTrue(stringMatch("2324-2", ((obj.entry[4].resource!! as DiagnosticReport).contained[11] as Observation).code.coding[0].code))
        assertTrue(stringMatch("Gamma glutamyl transferase [E", ((obj.entry[4].resource!! as DiagnosticReport).contained[11] as Observation).code.coding[0].display))
        assertTrue(stringMatch("http://snomed.info/sct", ((obj.entry[4].resource!! as DiagnosticReport).contained[11] as Observation).code.coding[1].system))
        assertTrue(stringMatch("69480007", ((obj.entry[4].resource!! as DiagnosticReport).contained[11] as Observation).code.coding[1].code))
        assertTrue(stringMatch("Patient/5", ((obj.entry[4].resource!! as DiagnosticReport).contained[11] as Observation).subject!!.reference))
        assertTrue(stringMatch("Organization/1832473e-2fe0-45", ((obj.entry[4].resource!! as DiagnosticReport).contained[11] as Observation).performer[0].reference))
        assertTrue(stringMatch("Acme Laboratory, Inc", ((obj.entry[4].resource!! as DiagnosticReport).contained[11] as Observation).performer[0].display))
        assertTrue(stringMatch("%.2f".format(1131f), "%.2f".format(((obj.entry[4].resource!! as DiagnosticReport).contained[11] as Observation).valueQuantity!!.value)))
        assertTrue(stringMatch("U/L", ((obj.entry[4].resource!! as DiagnosticReport).contained[11] as Observation).valueQuantity!!.unit))
        assertTrue(stringMatch("http://hl7.org/fhir/v2/0078", ((obj.entry[4].resource!! as DiagnosticReport).contained[11] as Observation).interpretation!!.coding[0].system))
        assertTrue(stringMatch("HH", ((obj.entry[4].resource!! as DiagnosticReport).contained[11] as Observation).interpretation!!.coding[0].code))
        assertTrue(stringMatch("%.2f".format(0f), "%.2f".format(((obj.entry[4].resource!! as DiagnosticReport).contained[11] as Observation).referenceRange[0].low!!.value)))
        assertTrue(stringMatch("U/L", ((obj.entry[4].resource!! as DiagnosticReport).contained[11] as Observation).referenceRange[0].low!!.unit))
        assertTrue(stringMatch("%.2f".format(45f), "%.2f".format(((obj.entry[4].resource!! as DiagnosticReport).contained[11] as Observation).referenceRange[0].high!!.value)))
        assertTrue(stringMatch("U/L", ((obj.entry[4].resource!! as DiagnosticReport).contained[11] as Observation).referenceRange[0].high!!.unit))
        assertTrue(stringMatch("Observation", ((obj.entry[4].resource!! as DiagnosticReport).contained[12] as Observation).resourceType))
        assertTrue(stringMatch("o13", ((obj.entry[4].resource!! as DiagnosticReport).contained[12] as Observation).id))
        assertTrue(stringMatch("final", ((obj.entry[4].resource!! as DiagnosticReport).contained[12] as Observation).status))
        assertTrue(stringMatch("http://loinc.org", ((obj.entry[4].resource!! as DiagnosticReport).contained[12] as Observation).code.coding[0].system))
        assertTrue(stringMatch("1742-6", ((obj.entry[4].resource!! as DiagnosticReport).contained[12] as Observation).code.coding[0].code))
        assertTrue(stringMatch("Alanine aminotransferase [Enz", ((obj.entry[4].resource!! as DiagnosticReport).contained[12] as Observation).code.coding[0].display))
        assertTrue(stringMatch("http://snomed.info/sct", ((obj.entry[4].resource!! as DiagnosticReport).contained[12] as Observation).code.coding[1].system))
        assertTrue(stringMatch("34608000", ((obj.entry[4].resource!! as DiagnosticReport).contained[12] as Observation).code.coding[1].code))
        assertTrue(stringMatch("Patient/5", ((obj.entry[4].resource!! as DiagnosticReport).contained[12] as Observation).subject!!.reference))
        assertTrue(stringMatch("Organization/1832473e-2fe0-45", ((obj.entry[4].resource!! as DiagnosticReport).contained[12] as Observation).performer[0].reference))
        assertTrue(stringMatch("Acme Laboratory, Inc", ((obj.entry[4].resource!! as DiagnosticReport).contained[12] as Observation).performer[0].display))
        assertTrue(stringMatch("%.2f".format(475f), "%.2f".format(((obj.entry[4].resource!! as DiagnosticReport).contained[12] as Observation).valueQuantity!!.value)))
        assertTrue(stringMatch("U/L", ((obj.entry[4].resource!! as DiagnosticReport).contained[12] as Observation).valueQuantity!!.unit))
        assertTrue(stringMatch("http://hl7.org/fhir/v2/0078", ((obj.entry[4].resource!! as DiagnosticReport).contained[12] as Observation).interpretation!!.coding[0].system))
        assertTrue(stringMatch("HH", ((obj.entry[4].resource!! as DiagnosticReport).contained[12] as Observation).interpretation!!.coding[0].code))
        assertTrue(stringMatch("%.2f".format(0f), "%.2f".format(((obj.entry[4].resource!! as DiagnosticReport).contained[12] as Observation).referenceRange[0].low!!.value)))
        assertTrue(stringMatch("U/L", ((obj.entry[4].resource!! as DiagnosticReport).contained[12] as Observation).referenceRange[0].low!!.unit))
        assertTrue(stringMatch("%.2f".format(45f), "%.2f".format(((obj.entry[4].resource!! as DiagnosticReport).contained[12] as Observation).referenceRange[0].high!!.value)))
        assertTrue(stringMatch("U/L", ((obj.entry[4].resource!! as DiagnosticReport).contained[12] as Observation).referenceRange[0].high!!.unit))
        assertTrue(stringMatch("Observation", ((obj.entry[4].resource!! as DiagnosticReport).contained[13] as Observation).resourceType))
        assertTrue(stringMatch("o14", ((obj.entry[4].resource!! as DiagnosticReport).contained[13] as Observation).id))
        assertTrue(stringMatch("final", ((obj.entry[4].resource!! as DiagnosticReport).contained[13] as Observation).status))
        assertTrue(stringMatch("http://loinc.org", ((obj.entry[4].resource!! as DiagnosticReport).contained[13] as Observation).code.coding[0].system))
    }
}
