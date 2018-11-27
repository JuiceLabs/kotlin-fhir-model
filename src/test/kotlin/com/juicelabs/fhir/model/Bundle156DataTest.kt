package com.juicelabs.fhir.model

import java.io.File
import kotlin.test.assertTrue
import org.junit.jupiter.api.Test

class Bundle156DataTest : DataTests() {
    @Test
    fun `diagnosticreport-examples-general 529 Test`() {
        val json = File("./src/test/resources/model/sample_data/diagnosticreport-examples-general.json").readTextAndClose()
        val obj = mapper.fromJson(json, Bundle::class.java)
        assertTrue(stringMatch("mmol/L", ((obj.entry[8].resource!! as DiagnosticReport).contained[4] as Observation).valueQuantity!!.unit))
        assertTrue(stringMatch("%.2f".format(4f), "%.2f".format(((obj.entry[8].resource!! as DiagnosticReport).contained[4] as Observation).referenceRange[0].low!!.value)))
        assertTrue(stringMatch("mmol/L", ((obj.entry[8].resource!! as DiagnosticReport).contained[4] as Observation).referenceRange[0].low!!.unit))
        assertTrue(stringMatch("%.2f".format(17f), "%.2f".format(((obj.entry[8].resource!! as DiagnosticReport).contained[4] as Observation).referenceRange[0].high!!.value)))
        assertTrue(stringMatch("mmol/L", ((obj.entry[8].resource!! as DiagnosticReport).contained[4] as Observation).referenceRange[0].high!!.unit))
        assertTrue(stringMatch("Observation", ((obj.entry[8].resource!! as DiagnosticReport).contained[5] as Observation).resourceType))
        assertTrue(stringMatch("o6", ((obj.entry[8].resource!! as DiagnosticReport).contained[5] as Observation).id))
        assertTrue(stringMatch("final", ((obj.entry[8].resource!! as DiagnosticReport).contained[5] as Observation).status))
        assertTrue(stringMatch("http://loinc.org", ((obj.entry[8].resource!! as DiagnosticReport).contained[5] as Observation).code.coding[0].system))
        assertTrue(stringMatch("14749-6", ((obj.entry[8].resource!! as DiagnosticReport).contained[5] as Observation).code.coding[0].code))
        assertTrue(stringMatch("Glucose [Moles/volume] in Ser", ((obj.entry[8].resource!! as DiagnosticReport).contained[5] as Observation).code.coding[0].display))
        assertTrue(stringMatch("http://snomed.info/sct", ((obj.entry[8].resource!! as DiagnosticReport).contained[5] as Observation).code.coding[1].system))
        assertTrue(stringMatch("36048009", ((obj.entry[8].resource!! as DiagnosticReport).contained[5] as Observation).code.coding[1].code))
        assertTrue(stringMatch("Patient/9", ((obj.entry[8].resource!! as DiagnosticReport).contained[5] as Observation).subject!!.reference))
        assertTrue(stringMatch("Organization/1832473e-2fe0-45", ((obj.entry[8].resource!! as DiagnosticReport).contained[5] as Observation).performer[0].reference))
        assertTrue(stringMatch("Acme Laboratory, Inc", ((obj.entry[8].resource!! as DiagnosticReport).contained[5] as Observation).performer[0].display))
        assertTrue(stringMatch("%.2f".format(6.8f), "%.2f".format(((obj.entry[8].resource!! as DiagnosticReport).contained[5] as Observation).valueQuantity!!.value)))
        assertTrue(stringMatch("mmol/L", ((obj.entry[8].resource!! as DiagnosticReport).contained[5] as Observation).valueQuantity!!.unit))
        assertTrue(stringMatch("%.2f".format(3.0f), "%.2f".format(((obj.entry[8].resource!! as DiagnosticReport).contained[5] as Observation).referenceRange[0].low!!.value)))
        assertTrue(stringMatch("mmol/L", ((obj.entry[8].resource!! as DiagnosticReport).contained[5] as Observation).referenceRange[0].low!!.unit))
        assertTrue(stringMatch("%.2f".format(7.7f), "%.2f".format(((obj.entry[8].resource!! as DiagnosticReport).contained[5] as Observation).referenceRange[0].high!!.value)))
        assertTrue(stringMatch("mmol/L", ((obj.entry[8].resource!! as DiagnosticReport).contained[5] as Observation).referenceRange[0].high!!.unit))
        assertTrue(stringMatch("Observation", ((obj.entry[8].resource!! as DiagnosticReport).contained[6] as Observation).resourceType))
        assertTrue(stringMatch("o7", ((obj.entry[8].resource!! as DiagnosticReport).contained[6] as Observation).id))
        assertTrue(stringMatch("final", ((obj.entry[8].resource!! as DiagnosticReport).contained[6] as Observation).status))
        assertTrue(stringMatch("http://loinc.org", ((obj.entry[8].resource!! as DiagnosticReport).contained[6] as Observation).code.coding[0].system))
        assertTrue(stringMatch("14937-7", ((obj.entry[8].resource!! as DiagnosticReport).contained[6] as Observation).code.coding[0].code))
        assertTrue(stringMatch("Urea nitrogen [Moles/volume] ", ((obj.entry[8].resource!! as DiagnosticReport).contained[6] as Observation).code.coding[0].display))
        assertTrue(stringMatch("http://snomed.info/sct", ((obj.entry[8].resource!! as DiagnosticReport).contained[6] as Observation).code.coding[1].system))
        assertTrue(stringMatch("273967009", ((obj.entry[8].resource!! as DiagnosticReport).contained[6] as Observation).code.coding[1].code))
        assertTrue(stringMatch("Patient/9", ((obj.entry[8].resource!! as DiagnosticReport).contained[6] as Observation).subject!!.reference))
        assertTrue(stringMatch("Organization/1832473e-2fe0-45", ((obj.entry[8].resource!! as DiagnosticReport).contained[6] as Observation).performer[0].reference))
        assertTrue(stringMatch("Acme Laboratory, Inc", ((obj.entry[8].resource!! as DiagnosticReport).contained[6] as Observation).performer[0].display))
        assertTrue(stringMatch("%.2f".format(8.2f), "%.2f".format(((obj.entry[8].resource!! as DiagnosticReport).contained[6] as Observation).valueQuantity!!.value)))
        assertTrue(stringMatch("mmol/L", ((obj.entry[8].resource!! as DiagnosticReport).contained[6] as Observation).valueQuantity!!.unit))
        assertTrue(stringMatch("http://hl7.org/fhir/v2/0078", ((obj.entry[8].resource!! as DiagnosticReport).contained[6] as Observation).interpretation!!.coding[0].system))
        assertTrue(stringMatch("H", ((obj.entry[8].resource!! as DiagnosticReport).contained[6] as Observation).interpretation!!.coding[0].code))
        assertTrue(stringMatch("%.2f".format(2.0f), "%.2f".format(((obj.entry[8].resource!! as DiagnosticReport).contained[6] as Observation).referenceRange[0].low!!.value)))
        assertTrue(stringMatch("mmol/L", ((obj.entry[8].resource!! as DiagnosticReport).contained[6] as Observation).referenceRange[0].low!!.unit))
        assertTrue(stringMatch("%.2f".format(7.0f), "%.2f".format(((obj.entry[8].resource!! as DiagnosticReport).contained[6] as Observation).referenceRange[0].high!!.value)))
        assertTrue(stringMatch("mmol/L", ((obj.entry[8].resource!! as DiagnosticReport).contained[6] as Observation).referenceRange[0].high!!.unit))
        assertTrue(stringMatch("Observation", ((obj.entry[8].resource!! as DiagnosticReport).contained[7] as Observation).resourceType))
        assertTrue(stringMatch("o8", ((obj.entry[8].resource!! as DiagnosticReport).contained[7] as Observation).id))
        assertTrue(stringMatch("final", ((obj.entry[8].resource!! as DiagnosticReport).contained[7] as Observation).status))
        assertTrue(stringMatch("http://loinc.org", ((obj.entry[8].resource!! as DiagnosticReport).contained[7] as Observation).code.coding[0].system))
        assertTrue(stringMatch("14682-9", ((obj.entry[8].resource!! as DiagnosticReport).contained[7] as Observation).code.coding[0].code))
        assertTrue(stringMatch("Creatinine [Moles/volume] in ", ((obj.entry[8].resource!! as DiagnosticReport).contained[7] as Observation).code.coding[0].display))
        assertTrue(stringMatch("http://snomed.info/sct", ((obj.entry[8].resource!! as DiagnosticReport).contained[7] as Observation).code.coding[1].system))
        assertTrue(stringMatch("70901006", ((obj.entry[8].resource!! as DiagnosticReport).contained[7] as Observation).code.coding[1].code))
        assertTrue(stringMatch("Patient/9", ((obj.entry[8].resource!! as DiagnosticReport).contained[7] as Observation).subject!!.reference))
        assertTrue(stringMatch("Organization/1832473e-2fe0-45", ((obj.entry[8].resource!! as DiagnosticReport).contained[7] as Observation).performer[0].reference))
        assertTrue(stringMatch("Acme Laboratory, Inc", ((obj.entry[8].resource!! as DiagnosticReport).contained[7] as Observation).performer[0].display))
        assertTrue(stringMatch("%.2f".format(0.07f), "%.2f".format(((obj.entry[8].resource!! as DiagnosticReport).contained[7] as Observation).valueQuantity!!.value)))
        assertTrue(stringMatch("mmol/L", ((obj.entry[8].resource!! as DiagnosticReport).contained[7] as Observation).valueQuantity!!.unit))
        assertTrue(stringMatch("%.2f".format(0.04f), "%.2f".format(((obj.entry[8].resource!! as DiagnosticReport).contained[7] as Observation).referenceRange[0].low!!.value)))
        assertTrue(stringMatch("mmol/L", ((obj.entry[8].resource!! as DiagnosticReport).contained[7] as Observation).referenceRange[0].low!!.unit))
        assertTrue(stringMatch("%.2f".format(0.11f), "%.2f".format(((obj.entry[8].resource!! as DiagnosticReport).contained[7] as Observation).referenceRange[0].high!!.value)))
        assertTrue(stringMatch("mmol/L", ((obj.entry[8].resource!! as DiagnosticReport).contained[7] as Observation).referenceRange[0].high!!.unit))
        assertTrue(stringMatch("Observation", ((obj.entry[8].resource!! as DiagnosticReport).contained[8] as Observation).resourceType))
        assertTrue(stringMatch("o9", ((obj.entry[8].resource!! as DiagnosticReport).contained[8] as Observation).id))
        assertTrue(stringMatch("final", ((obj.entry[8].resource!! as DiagnosticReport).contained[8] as Observation).status))
        assertTrue(stringMatch("http://loinc.org", ((obj.entry[8].resource!! as DiagnosticReport).contained[8] as Observation).code.coding[0].system))
        assertTrue(stringMatch("14933-6", ((obj.entry[8].resource!! as DiagnosticReport).contained[8] as Observation).code.coding[0].code))
        assertTrue(stringMatch("Urate [Moles/volume] in Serum", ((obj.entry[8].resource!! as DiagnosticReport).contained[8] as Observation).code.coding[0].display))
        assertTrue(stringMatch("http://snomed.info/sct", ((obj.entry[8].resource!! as DiagnosticReport).contained[8] as Observation).code.coding[1].system))
        assertTrue(stringMatch("86228006", ((obj.entry[8].resource!! as DiagnosticReport).contained[8] as Observation).code.coding[1].code))
        assertTrue(stringMatch("Patient/9", ((obj.entry[8].resource!! as DiagnosticReport).contained[8] as Observation).subject!!.reference))
        assertTrue(stringMatch("Organization/1832473e-2fe0-45", ((obj.entry[8].resource!! as DiagnosticReport).contained[8] as Observation).performer[0].reference))
        assertTrue(stringMatch("Acme Laboratory, Inc", ((obj.entry[8].resource!! as DiagnosticReport).contained[8] as Observation).performer[0].display))
        assertTrue(stringMatch("%.2f".format(0.42f), "%.2f".format(((obj.entry[8].resource!! as DiagnosticReport).contained[8] as Observation).valueQuantity!!.value)))
        assertTrue(stringMatch("mmol/L", ((obj.entry[8].resource!! as DiagnosticReport).contained[8] as Observation).valueQuantity!!.unit))
    }
}