package com.juicelabs.fhir.model

import java.io.File
import kotlin.test.assertTrue
import org.junit.jupiter.api.Test

class Bundle109DataTest : DataTests() {
    @Test
    fun `diagnosticreport-examples-general 482 Test`() {
        val json = File("./src/test/resources/model/sample_data/diagnosticreport-examples-general.json").readTextAndClose()
        val obj = mapper.fromJson(json, Bundle::class.java)
        assertTrue(stringMatch("Acme Laboratory, Inc", ((obj.entry[1].resource!! as DiagnosticReport).contained[1] as Observation).performer[0].display))
        assertTrue(stringMatch("%.2f".format(4.1f), "%.2f".format(((obj.entry[1].resource!! as DiagnosticReport).contained[1] as Observation).valueQuantity!!.value)))
        assertTrue(stringMatch("mmol/L", ((obj.entry[1].resource!! as DiagnosticReport).contained[1] as Observation).valueQuantity!!.unit))
        assertTrue(stringMatch("%.2f".format(3.5f), "%.2f".format(((obj.entry[1].resource!! as DiagnosticReport).contained[1] as Observation).referenceRange[0].low!!.value)))
        assertTrue(stringMatch("mmol/L", ((obj.entry[1].resource!! as DiagnosticReport).contained[1] as Observation).referenceRange[0].low!!.unit))
        assertTrue(stringMatch("%.2f".format(5.0f), "%.2f".format(((obj.entry[1].resource!! as DiagnosticReport).contained[1] as Observation).referenceRange[0].high!!.value)))
        assertTrue(stringMatch("mmol/L", ((obj.entry[1].resource!! as DiagnosticReport).contained[1] as Observation).referenceRange[0].high!!.unit))
        assertTrue(stringMatch("Observation", ((obj.entry[1].resource!! as DiagnosticReport).contained[2] as Observation).resourceType))
        assertTrue(stringMatch("o3", ((obj.entry[1].resource!! as DiagnosticReport).contained[2] as Observation).id))
        assertTrue(stringMatch("final", ((obj.entry[1].resource!! as DiagnosticReport).contained[2] as Observation).status))
        assertTrue(stringMatch("http://loinc.org", ((obj.entry[1].resource!! as DiagnosticReport).contained[2] as Observation).code.coding[0].system))
        assertTrue(stringMatch("2075-0", ((obj.entry[1].resource!! as DiagnosticReport).contained[2] as Observation).code.coding[0].code))
        assertTrue(stringMatch("Chloride [Moles/volume] in Se", ((obj.entry[1].resource!! as DiagnosticReport).contained[2] as Observation).code.coding[0].display))
        assertTrue(stringMatch("http://snomed.info/sct", ((obj.entry[1].resource!! as DiagnosticReport).contained[2] as Observation).code.coding[1].system))
        assertTrue(stringMatch("46511006", ((obj.entry[1].resource!! as DiagnosticReport).contained[2] as Observation).code.coding[1].code))
        assertTrue(stringMatch("Patient/2", ((obj.entry[1].resource!! as DiagnosticReport).contained[2] as Observation).subject!!.reference))
        assertTrue(stringMatch("Organization/1832473e-2fe0-45", ((obj.entry[1].resource!! as DiagnosticReport).contained[2] as Observation).performer[0].reference))
        assertTrue(stringMatch("Acme Laboratory, Inc", ((obj.entry[1].resource!! as DiagnosticReport).contained[2] as Observation).performer[0].display))
        assertTrue(stringMatch("%.2f".format(103f), "%.2f".format(((obj.entry[1].resource!! as DiagnosticReport).contained[2] as Observation).valueQuantity!!.value)))
        assertTrue(stringMatch("mmol/L", ((obj.entry[1].resource!! as DiagnosticReport).contained[2] as Observation).valueQuantity!!.unit))
        assertTrue(stringMatch("%.2f".format(96f), "%.2f".format(((obj.entry[1].resource!! as DiagnosticReport).contained[2] as Observation).referenceRange[0].low!!.value)))
        assertTrue(stringMatch("mmol/L", ((obj.entry[1].resource!! as DiagnosticReport).contained[2] as Observation).referenceRange[0].low!!.unit))
        assertTrue(stringMatch("%.2f".format(109f), "%.2f".format(((obj.entry[1].resource!! as DiagnosticReport).contained[2] as Observation).referenceRange[0].high!!.value)))
        assertTrue(stringMatch("mmol/L", ((obj.entry[1].resource!! as DiagnosticReport).contained[2] as Observation).referenceRange[0].high!!.unit))
        assertTrue(stringMatch("Observation", ((obj.entry[1].resource!! as DiagnosticReport).contained[3] as Observation).resourceType))
        assertTrue(stringMatch("o4", ((obj.entry[1].resource!! as DiagnosticReport).contained[3] as Observation).id))
        assertTrue(stringMatch("final", ((obj.entry[1].resource!! as DiagnosticReport).contained[3] as Observation).status))
        assertTrue(stringMatch("http://loinc.org", ((obj.entry[1].resource!! as DiagnosticReport).contained[3] as Observation).code.coding[0].system))
        assertTrue(stringMatch("1963-8", ((obj.entry[1].resource!! as DiagnosticReport).contained[3] as Observation).code.coding[0].code))
        assertTrue(stringMatch("Bicarbonate [Moles/volume] in", ((obj.entry[1].resource!! as DiagnosticReport).contained[3] as Observation).code.coding[0].display))
        assertTrue(stringMatch("http://snomed.info/sct", ((obj.entry[1].resource!! as DiagnosticReport).contained[3] as Observation).code.coding[1].system))
        assertTrue(stringMatch("88645003", ((obj.entry[1].resource!! as DiagnosticReport).contained[3] as Observation).code.coding[1].code))
        assertTrue(stringMatch("Patient/2", ((obj.entry[1].resource!! as DiagnosticReport).contained[3] as Observation).subject!!.reference))
        assertTrue(stringMatch("Organization/1832473e-2fe0-45", ((obj.entry[1].resource!! as DiagnosticReport).contained[3] as Observation).performer[0].reference))
        assertTrue(stringMatch("Acme Laboratory, Inc", ((obj.entry[1].resource!! as DiagnosticReport).contained[3] as Observation).performer[0].display))
        assertTrue(stringMatch("%.2f".format(27f), "%.2f".format(((obj.entry[1].resource!! as DiagnosticReport).contained[3] as Observation).valueQuantity!!.value)))
        assertTrue(stringMatch("mmol/L", ((obj.entry[1].resource!! as DiagnosticReport).contained[3] as Observation).valueQuantity!!.unit))
        assertTrue(stringMatch("%.2f".format(25f), "%.2f".format(((obj.entry[1].resource!! as DiagnosticReport).contained[3] as Observation).referenceRange[0].low!!.value)))
        assertTrue(stringMatch("mmol/L", ((obj.entry[1].resource!! as DiagnosticReport).contained[3] as Observation).referenceRange[0].low!!.unit))
        assertTrue(stringMatch("%.2f".format(33f), "%.2f".format(((obj.entry[1].resource!! as DiagnosticReport).contained[3] as Observation).referenceRange[0].high!!.value)))
        assertTrue(stringMatch("mmol/L", ((obj.entry[1].resource!! as DiagnosticReport).contained[3] as Observation).referenceRange[0].high!!.unit))
        assertTrue(stringMatch("Observation", ((obj.entry[1].resource!! as DiagnosticReport).contained[4] as Observation).resourceType))
        assertTrue(stringMatch("o5", ((obj.entry[1].resource!! as DiagnosticReport).contained[4] as Observation).id))
        assertTrue(stringMatch("final", ((obj.entry[1].resource!! as DiagnosticReport).contained[4] as Observation).status))
        assertTrue(stringMatch("http://loinc.org", ((obj.entry[1].resource!! as DiagnosticReport).contained[4] as Observation).code.coding[0].system))
        assertTrue(stringMatch("1863-0", ((obj.entry[1].resource!! as DiagnosticReport).contained[4] as Observation).code.coding[0].code))
        assertTrue(stringMatch("Anion gap 4 in Serum or Plasm", ((obj.entry[1].resource!! as DiagnosticReport).contained[4] as Observation).code.coding[0].display))
        assertTrue(stringMatch("http://snomed.info/sct", ((obj.entry[1].resource!! as DiagnosticReport).contained[4] as Observation).code.coding[1].system))
        assertTrue(stringMatch("271057005", ((obj.entry[1].resource!! as DiagnosticReport).contained[4] as Observation).code.coding[1].code))
        assertTrue(stringMatch("Patient/2", ((obj.entry[1].resource!! as DiagnosticReport).contained[4] as Observation).subject!!.reference))
        assertTrue(stringMatch("Organization/1832473e-2fe0-45", ((obj.entry[1].resource!! as DiagnosticReport).contained[4] as Observation).performer[0].reference))
        assertTrue(stringMatch("Acme Laboratory, Inc", ((obj.entry[1].resource!! as DiagnosticReport).contained[4] as Observation).performer[0].display))
        assertTrue(stringMatch("%.2f".format(12f), "%.2f".format(((obj.entry[1].resource!! as DiagnosticReport).contained[4] as Observation).valueQuantity!!.value)))
        assertTrue(stringMatch("mmol/L", ((obj.entry[1].resource!! as DiagnosticReport).contained[4] as Observation).valueQuantity!!.unit))
        assertTrue(stringMatch("%.2f".format(4f), "%.2f".format(((obj.entry[1].resource!! as DiagnosticReport).contained[4] as Observation).referenceRange[0].low!!.value)))
        assertTrue(stringMatch("mmol/L", ((obj.entry[1].resource!! as DiagnosticReport).contained[4] as Observation).referenceRange[0].low!!.unit))
        assertTrue(stringMatch("%.2f".format(17f), "%.2f".format(((obj.entry[1].resource!! as DiagnosticReport).contained[4] as Observation).referenceRange[0].high!!.value)))
        assertTrue(stringMatch("mmol/L", ((obj.entry[1].resource!! as DiagnosticReport).contained[4] as Observation).referenceRange[0].high!!.unit))
        assertTrue(stringMatch("Observation", ((obj.entry[1].resource!! as DiagnosticReport).contained[5] as Observation).resourceType))
        assertTrue(stringMatch("o6", ((obj.entry[1].resource!! as DiagnosticReport).contained[5] as Observation).id))
        assertTrue(stringMatch("final", ((obj.entry[1].resource!! as DiagnosticReport).contained[5] as Observation).status))
        assertTrue(stringMatch("http://loinc.org", ((obj.entry[1].resource!! as DiagnosticReport).contained[5] as Observation).code.coding[0].system))
        assertTrue(stringMatch("14749-6", ((obj.entry[1].resource!! as DiagnosticReport).contained[5] as Observation).code.coding[0].code))
        assertTrue(stringMatch("Glucose [Moles/volume] in Ser", ((obj.entry[1].resource!! as DiagnosticReport).contained[5] as Observation).code.coding[0].display))
        assertTrue(stringMatch("http://snomed.info/sct", ((obj.entry[1].resource!! as DiagnosticReport).contained[5] as Observation).code.coding[1].system))
        assertTrue(stringMatch("36048009", ((obj.entry[1].resource!! as DiagnosticReport).contained[5] as Observation).code.coding[1].code))
        assertTrue(stringMatch("Patient/2", ((obj.entry[1].resource!! as DiagnosticReport).contained[5] as Observation).subject!!.reference))
        assertTrue(stringMatch("Organization/1832473e-2fe0-45", ((obj.entry[1].resource!! as DiagnosticReport).contained[5] as Observation).performer[0].reference))
        assertTrue(stringMatch("Acme Laboratory, Inc", ((obj.entry[1].resource!! as DiagnosticReport).contained[5] as Observation).performer[0].display))
        assertTrue(stringMatch("%.2f".format(6.8f), "%.2f".format(((obj.entry[1].resource!! as DiagnosticReport).contained[5] as Observation).valueQuantity!!.value)))
        assertTrue(stringMatch("mmol/L", ((obj.entry[1].resource!! as DiagnosticReport).contained[5] as Observation).valueQuantity!!.unit))
    }
}
