package com.juicelabs.fhir.model

import java.io.File
import kotlin.test.assertEquals
import kotlin.test.assertTrue
import org.junit.jupiter.api.Test

class Bundle180DataTest : DataTests() {
    @Test
    fun `diagnosticreport-examples-general 553 Test`() {
        val json = File("./src/test/resources/model/sample_data/diagnosticreport-examples-general.json").readTextAndClose()
        val obj = mapper.fromJson(json, Bundle::class.java)
        assertTrue(stringMatch("Globulin [Mass/volume] in Ser", ((obj.entry[11].resource!! as DiagnosticReport).contained[20] as Observation).code.coding[0].display))
        assertTrue(stringMatch("http://snomed.info/sct", ((obj.entry[11].resource!! as DiagnosticReport).contained[20] as Observation).code.coding[1].system))
        assertTrue(stringMatch("104979009", ((obj.entry[11].resource!! as DiagnosticReport).contained[20] as Observation).code.coding[1].code))
        assertTrue(stringMatch("Patient/2", ((obj.entry[11].resource!! as DiagnosticReport).contained[20] as Observation).subject!!.reference))
        assertTrue(stringMatch("Organization/1832473e-2fe0-45", ((obj.entry[11].resource!! as DiagnosticReport).contained[20] as Observation).performer[0].reference))
        assertTrue(stringMatch("Acme Laboratory, Inc", ((obj.entry[11].resource!! as DiagnosticReport).contained[20] as Observation).performer[0].display))
        assertTrue(stringMatch("%.2f".format(33f), "%.2f".format(((obj.entry[11].resource!! as DiagnosticReport).contained[20] as Observation).valueQuantity!!.value)))
        assertTrue(stringMatch("g/L", ((obj.entry[11].resource!! as DiagnosticReport).contained[20] as Observation).valueQuantity!!.unit))
        assertTrue(stringMatch("%.2f".format(20f), "%.2f".format(((obj.entry[11].resource!! as DiagnosticReport).contained[20] as Observation).referenceRange[0].low!!.value)))
        assertTrue(stringMatch("g/L", ((obj.entry[11].resource!! as DiagnosticReport).contained[20] as Observation).referenceRange[0].low!!.unit))
        assertTrue(stringMatch("%.2f".format(40f), "%.2f".format(((obj.entry[11].resource!! as DiagnosticReport).contained[20] as Observation).referenceRange[0].high!!.value)))
        assertTrue(stringMatch("g/L", ((obj.entry[11].resource!! as DiagnosticReport).contained[20] as Observation).referenceRange[0].high!!.unit))
        assertTrue(stringMatch("Observation", ((obj.entry[11].resource!! as DiagnosticReport).contained[21] as Observation).resourceType))
        assertTrue(stringMatch("o22", ((obj.entry[11].resource!! as DiagnosticReport).contained[21] as Observation).id))
        assertTrue(stringMatch("final", ((obj.entry[11].resource!! as DiagnosticReport).contained[21] as Observation).status))
        assertTrue(stringMatch("http://loinc.org", ((obj.entry[11].resource!! as DiagnosticReport).contained[21] as Observation).code.coding[0].system))
        assertTrue(stringMatch("14798-3", ((obj.entry[11].resource!! as DiagnosticReport).contained[21] as Observation).code.coding[0].code))
        assertTrue(stringMatch("Iron [Moles/volume] in Serum ", ((obj.entry[11].resource!! as DiagnosticReport).contained[21] as Observation).code.coding[0].display))
        assertTrue(stringMatch("http://snomed.info/sct", ((obj.entry[11].resource!! as DiagnosticReport).contained[21] as Observation).code.coding[1].system))
        assertTrue(stringMatch("42950004", ((obj.entry[11].resource!! as DiagnosticReport).contained[21] as Observation).code.coding[1].code))
        assertTrue(stringMatch("Patient/2", ((obj.entry[11].resource!! as DiagnosticReport).contained[21] as Observation).subject!!.reference))
        assertTrue(stringMatch("Organization/1832473e-2fe0-45", ((obj.entry[11].resource!! as DiagnosticReport).contained[21] as Observation).performer[0].reference))
        assertTrue(stringMatch("Acme Laboratory, Inc", ((obj.entry[11].resource!! as DiagnosticReport).contained[21] as Observation).performer[0].display))
        assertTrue(stringMatch("%.2f".format(17f), "%.2f".format(((obj.entry[11].resource!! as DiagnosticReport).contained[21] as Observation).valueQuantity!!.value)))
        assertTrue(stringMatch("umol/L", ((obj.entry[11].resource!! as DiagnosticReport).contained[21] as Observation).valueQuantity!!.unit))
        assertTrue(stringMatch("%.2f".format(10f), "%.2f".format(((obj.entry[11].resource!! as DiagnosticReport).contained[21] as Observation).referenceRange[0].low!!.value)))
        assertTrue(stringMatch("umol/L", ((obj.entry[11].resource!! as DiagnosticReport).contained[21] as Observation).referenceRange[0].low!!.unit))
        assertTrue(stringMatch("%.2f".format(33f), "%.2f".format(((obj.entry[11].resource!! as DiagnosticReport).contained[21] as Observation).referenceRange[0].high!!.value)))
        assertTrue(stringMatch("umol/L", ((obj.entry[11].resource!! as DiagnosticReport).contained[21] as Observation).referenceRange[0].high!!.unit))
        assertTrue(stringMatch("Observation", ((obj.entry[11].resource!! as DiagnosticReport).contained[22] as Observation).resourceType))
        assertTrue(stringMatch("o23", ((obj.entry[11].resource!! as DiagnosticReport).contained[22] as Observation).id))
        assertTrue(stringMatch("final", ((obj.entry[11].resource!! as DiagnosticReport).contained[22] as Observation).status))
        assertTrue(stringMatch("http://loinc.org", ((obj.entry[11].resource!! as DiagnosticReport).contained[22] as Observation).code.coding[0].system))
        assertTrue(stringMatch("14647-2", ((obj.entry[11].resource!! as DiagnosticReport).contained[22] as Observation).code.coding[0].code))
        assertTrue(stringMatch("Cholesterol [Moles/volume] in", ((obj.entry[11].resource!! as DiagnosticReport).contained[22] as Observation).code.coding[0].display))
        assertTrue(stringMatch("http://snomed.info/sct", ((obj.entry[11].resource!! as DiagnosticReport).contained[22] as Observation).code.coding[1].system))
        assertTrue(stringMatch("77068002", ((obj.entry[11].resource!! as DiagnosticReport).contained[22] as Observation).code.coding[1].code))
        assertTrue(stringMatch("Patient/2", ((obj.entry[11].resource!! as DiagnosticReport).contained[22] as Observation).subject!!.reference))
        assertTrue(stringMatch("Organization/1832473e-2fe0-45", ((obj.entry[11].resource!! as DiagnosticReport).contained[22] as Observation).performer[0].reference))
        assertTrue(stringMatch("Acme Laboratory, Inc", ((obj.entry[11].resource!! as DiagnosticReport).contained[22] as Observation).performer[0].display))
        assertTrue(stringMatch("%.2f".format(7.0f), "%.2f".format(((obj.entry[11].resource!! as DiagnosticReport).contained[22] as Observation).valueQuantity!!.value)))
        assertTrue(stringMatch("mmol/L", ((obj.entry[11].resource!! as DiagnosticReport).contained[22] as Observation).valueQuantity!!.unit))
        assertTrue(stringMatch("http://hl7.org/fhir/v2/0078", ((obj.entry[11].resource!! as DiagnosticReport).contained[22] as Observation).interpretation!!.coding[0].system))
        assertTrue(stringMatch("H", ((obj.entry[11].resource!! as DiagnosticReport).contained[22] as Observation).interpretation!!.coding[0].code))
        assertTrue(stringMatch("%.2f".format(3.6f), "%.2f".format(((obj.entry[11].resource!! as DiagnosticReport).contained[22] as Observation).referenceRange[0].low!!.value)))
        assertTrue(stringMatch("mmol/L", ((obj.entry[11].resource!! as DiagnosticReport).contained[22] as Observation).referenceRange[0].low!!.unit))
        assertTrue(stringMatch("%.2f".format(6.7f), "%.2f".format(((obj.entry[11].resource!! as DiagnosticReport).contained[22] as Observation).referenceRange[0].high!!.value)))
        assertTrue(stringMatch("mmol/L", ((obj.entry[11].resource!! as DiagnosticReport).contained[22] as Observation).referenceRange[0].high!!.unit))
        assertTrue(stringMatch("Observation", ((obj.entry[11].resource!! as DiagnosticReport).contained[23] as Observation).resourceType))
        assertTrue(stringMatch("o24", ((obj.entry[11].resource!! as DiagnosticReport).contained[23] as Observation).id))
        assertTrue(stringMatch("final", ((obj.entry[11].resource!! as DiagnosticReport).contained[23] as Observation).status))
        assertTrue(stringMatch("http://loinc.org", ((obj.entry[11].resource!! as DiagnosticReport).contained[23] as Observation).code.coding[0].system))
        assertTrue(stringMatch("14927-8", ((obj.entry[11].resource!! as DiagnosticReport).contained[23] as Observation).code.coding[0].code))
        assertTrue(stringMatch("Triglyceride [Moles/volume] i", ((obj.entry[11].resource!! as DiagnosticReport).contained[23] as Observation).code.coding[0].display))
        assertTrue(stringMatch("http://snomed.info/sct", ((obj.entry[11].resource!! as DiagnosticReport).contained[23] as Observation).code.coding[1].system))
        assertTrue(stringMatch("104784006", ((obj.entry[11].resource!! as DiagnosticReport).contained[23] as Observation).code.coding[1].code))
        assertTrue(stringMatch("Patient/2", ((obj.entry[11].resource!! as DiagnosticReport).contained[23] as Observation).subject!!.reference))
        assertTrue(stringMatch("Organization/1832473e-2fe0-45", ((obj.entry[11].resource!! as DiagnosticReport).contained[23] as Observation).performer[0].reference))
        assertTrue(stringMatch("Acme Laboratory, Inc", ((obj.entry[11].resource!! as DiagnosticReport).contained[23] as Observation).performer[0].display))
        assertTrue(stringMatch("%.2f".format(0.9f), "%.2f".format(((obj.entry[11].resource!! as DiagnosticReport).contained[23] as Observation).valueQuantity!!.value)))
        assertTrue(stringMatch("mmol/L", ((obj.entry[11].resource!! as DiagnosticReport).contained[23] as Observation).valueQuantity!!.unit))
        assertTrue(stringMatch("%.2f".format(0.3f), "%.2f".format(((obj.entry[11].resource!! as DiagnosticReport).contained[23] as Observation).referenceRange[0].low!!.value)))
        assertTrue(stringMatch("mmol/L", ((obj.entry[11].resource!! as DiagnosticReport).contained[23] as Observation).referenceRange[0].low!!.unit))
        assertTrue(stringMatch("%.2f".format(4.0f), "%.2f".format(((obj.entry[11].resource!! as DiagnosticReport).contained[23] as Observation).referenceRange[0].high!!.value)))
        assertTrue(stringMatch("mmol/L", ((obj.entry[11].resource!! as DiagnosticReport).contained[23] as Observation).referenceRange[0].high!!.unit))
        assertTrue(stringMatch("http://acme.com/lab/reports", (obj.entry[11].resource!! as DiagnosticReport).identifier[0].system))
        assertTrue(stringMatch("5234342", (obj.entry[11].resource!! as DiagnosticReport).identifier[0].value))
        assertTrue(stringMatch("final", (obj.entry[11].resource!! as DiagnosticReport).status))
        assertTrue(stringMatch("SERUM CHEMISTRY", (obj.entry[11].resource!! as DiagnosticReport).code.text))
        assertTrue(stringMatch("Patient/2", (obj.entry[11].resource!! as DiagnosticReport).subject!!.reference))
        assertEquals("2004-12-03T09:45:17Z", (obj.entry[11].resource!! as DiagnosticReport).effectiveDateTime.toString())
    }
}
