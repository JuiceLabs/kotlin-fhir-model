package com.juicelabs.fhir.model

import java.io.File
import kotlin.test.assertTrue
import org.junit.jupiter.api.Test

class Bundle165DataTest : DataTests() {
    @Test
    fun `diagnosticreport-examples-general 538 Test`() {
        val json = File("./src/test/resources/model/sample_data/diagnosticreport-examples-general.json").readTextAndClose()
        val obj = mapper.fromJson(json, Bundle::class.java)
        assertTrue(stringMatch("http://hl7.org/fhir/v2/0078", ((obj.entry[9].resource!! as DiagnosticReport).contained[13] as Observation).interpretation!!.coding[0].system))
        assertTrue(stringMatch("H", ((obj.entry[9].resource!! as DiagnosticReport).contained[13] as Observation).interpretation!!.coding[0].code))
        assertTrue(stringMatch("%.2f".format(0f), "%.2f".format(((obj.entry[9].resource!! as DiagnosticReport).contained[13] as Observation).referenceRange[0].low!!.value)))
        assertTrue(stringMatch("U/L", ((obj.entry[9].resource!! as DiagnosticReport).contained[13] as Observation).referenceRange[0].low!!.unit))
        assertTrue(stringMatch("%.2f".format(45f), "%.2f".format(((obj.entry[9].resource!! as DiagnosticReport).contained[13] as Observation).referenceRange[0].high!!.value)))
        assertTrue(stringMatch("U/L", ((obj.entry[9].resource!! as DiagnosticReport).contained[13] as Observation).referenceRange[0].high!!.unit))
        assertTrue(stringMatch("Observation", ((obj.entry[9].resource!! as DiagnosticReport).contained[14] as Observation).resourceType))
        assertTrue(stringMatch("o15", ((obj.entry[9].resource!! as DiagnosticReport).contained[14] as Observation).id))
        assertTrue(stringMatch("final", ((obj.entry[9].resource!! as DiagnosticReport).contained[14] as Observation).status))
        assertTrue(stringMatch("http://loinc.org", ((obj.entry[9].resource!! as DiagnosticReport).contained[14] as Observation).code.coding[0].system))
        assertTrue(stringMatch("1920-8", ((obj.entry[9].resource!! as DiagnosticReport).contained[14] as Observation).code.coding[0].code))
        assertTrue(stringMatch("Aspartate aminotransferase [E", ((obj.entry[9].resource!! as DiagnosticReport).contained[14] as Observation).code.coding[0].display))
        assertTrue(stringMatch("http://snomed.info/sct", ((obj.entry[9].resource!! as DiagnosticReport).contained[14] as Observation).code.coding[1].system))
        assertTrue(stringMatch("45896001", ((obj.entry[9].resource!! as DiagnosticReport).contained[14] as Observation).code.coding[1].code))
        assertTrue(stringMatch("Patient/10", ((obj.entry[9].resource!! as DiagnosticReport).contained[14] as Observation).subject!!.reference))
        assertTrue(stringMatch("Organization/1832473e-2fe0-45", ((obj.entry[9].resource!! as DiagnosticReport).contained[14] as Observation).performer[0].reference))
        assertTrue(stringMatch("Acme Laboratory, Inc", ((obj.entry[9].resource!! as DiagnosticReport).contained[14] as Observation).performer[0].display))
        assertTrue(stringMatch("%.2f".format(26f), "%.2f".format(((obj.entry[9].resource!! as DiagnosticReport).contained[14] as Observation).valueQuantity!!.value)))
        assertTrue(stringMatch("U/L", ((obj.entry[9].resource!! as DiagnosticReport).contained[14] as Observation).valueQuantity!!.unit))
        assertTrue(stringMatch("%.2f".format(0f), "%.2f".format(((obj.entry[9].resource!! as DiagnosticReport).contained[14] as Observation).referenceRange[0].low!!.value)))
        assertTrue(stringMatch("U/L", ((obj.entry[9].resource!! as DiagnosticReport).contained[14] as Observation).referenceRange[0].low!!.unit))
        assertTrue(stringMatch("%.2f".format(41f), "%.2f".format(((obj.entry[9].resource!! as DiagnosticReport).contained[14] as Observation).referenceRange[0].high!!.value)))
        assertTrue(stringMatch("U/L", ((obj.entry[9].resource!! as DiagnosticReport).contained[14] as Observation).referenceRange[0].high!!.unit))
        assertTrue(stringMatch("Observation", ((obj.entry[9].resource!! as DiagnosticReport).contained[15] as Observation).resourceType))
        assertTrue(stringMatch("o16", ((obj.entry[9].resource!! as DiagnosticReport).contained[15] as Observation).id))
        assertTrue(stringMatch("final", ((obj.entry[9].resource!! as DiagnosticReport).contained[15] as Observation).status))
        assertTrue(stringMatch("http://loinc.org", ((obj.entry[9].resource!! as DiagnosticReport).contained[15] as Observation).code.coding[0].system))
        assertTrue(stringMatch("2532-0", ((obj.entry[9].resource!! as DiagnosticReport).contained[15] as Observation).code.coding[0].code))
        assertTrue(stringMatch("Lactate dehydrogenase [Enzyma", ((obj.entry[9].resource!! as DiagnosticReport).contained[15] as Observation).code.coding[0].display))
        assertTrue(stringMatch("http://snomed.info/sct", ((obj.entry[9].resource!! as DiagnosticReport).contained[15] as Observation).code.coding[1].system))
        assertTrue(stringMatch("11274001", ((obj.entry[9].resource!! as DiagnosticReport).contained[15] as Observation).code.coding[1].code))
        assertTrue(stringMatch("Patient/10", ((obj.entry[9].resource!! as DiagnosticReport).contained[15] as Observation).subject!!.reference))
        assertTrue(stringMatch("Organization/1832473e-2fe0-45", ((obj.entry[9].resource!! as DiagnosticReport).contained[15] as Observation).performer[0].reference))
        assertTrue(stringMatch("Acme Laboratory, Inc", ((obj.entry[9].resource!! as DiagnosticReport).contained[15] as Observation).performer[0].display))
        assertTrue(stringMatch("%.2f".format(150f), "%.2f".format(((obj.entry[9].resource!! as DiagnosticReport).contained[15] as Observation).valueQuantity!!.value)))
        assertTrue(stringMatch("U/L", ((obj.entry[9].resource!! as DiagnosticReport).contained[15] as Observation).valueQuantity!!.unit))
        assertTrue(stringMatch("%.2f".format(80f), "%.2f".format(((obj.entry[9].resource!! as DiagnosticReport).contained[15] as Observation).referenceRange[0].low!!.value)))
        assertTrue(stringMatch("U/L", ((obj.entry[9].resource!! as DiagnosticReport).contained[15] as Observation).referenceRange[0].low!!.unit))
        assertTrue(stringMatch("%.2f".format(250f), "%.2f".format(((obj.entry[9].resource!! as DiagnosticReport).contained[15] as Observation).referenceRange[0].high!!.value)))
        assertTrue(stringMatch("U/L", ((obj.entry[9].resource!! as DiagnosticReport).contained[15] as Observation).referenceRange[0].high!!.unit))
        assertTrue(stringMatch("Observation", ((obj.entry[9].resource!! as DiagnosticReport).contained[16] as Observation).resourceType))
        assertTrue(stringMatch("o17", ((obj.entry[9].resource!! as DiagnosticReport).contained[16] as Observation).id))
        assertTrue(stringMatch("final", ((obj.entry[9].resource!! as DiagnosticReport).contained[16] as Observation).status))
        assertTrue(stringMatch("http://loinc.org", ((obj.entry[9].resource!! as DiagnosticReport).contained[16] as Observation).code.coding[0].system))
        assertTrue(stringMatch("2000-8", ((obj.entry[9].resource!! as DiagnosticReport).contained[16] as Observation).code.coding[0].code))
        assertTrue(stringMatch("Calcium [Moles/volume] in Ser", ((obj.entry[9].resource!! as DiagnosticReport).contained[16] as Observation).code.coding[0].display))
        assertTrue(stringMatch("http://snomed.info/sct", ((obj.entry[9].resource!! as DiagnosticReport).contained[16] as Observation).code.coding[1].system))
        assertTrue(stringMatch("71878006", ((obj.entry[9].resource!! as DiagnosticReport).contained[16] as Observation).code.coding[1].code))
        assertTrue(stringMatch("Patient/10", ((obj.entry[9].resource!! as DiagnosticReport).contained[16] as Observation).subject!!.reference))
        assertTrue(stringMatch("Organization/1832473e-2fe0-45", ((obj.entry[9].resource!! as DiagnosticReport).contained[16] as Observation).performer[0].reference))
        assertTrue(stringMatch("Acme Laboratory, Inc", ((obj.entry[9].resource!! as DiagnosticReport).contained[16] as Observation).performer[0].display))
        assertTrue(stringMatch("%.2f".format(2.37f), "%.2f".format(((obj.entry[9].resource!! as DiagnosticReport).contained[16] as Observation).valueQuantity!!.value)))
        assertTrue(stringMatch("mmol/L", ((obj.entry[9].resource!! as DiagnosticReport).contained[16] as Observation).valueQuantity!!.unit))
        assertTrue(stringMatch("%.2f".format(2.25f), "%.2f".format(((obj.entry[9].resource!! as DiagnosticReport).contained[16] as Observation).referenceRange[0].low!!.value)))
        assertTrue(stringMatch("mmol/L", ((obj.entry[9].resource!! as DiagnosticReport).contained[16] as Observation).referenceRange[0].low!!.unit))
        assertTrue(stringMatch("%.2f".format(2.65f), "%.2f".format(((obj.entry[9].resource!! as DiagnosticReport).contained[16] as Observation).referenceRange[0].high!!.value)))
        assertTrue(stringMatch("mmol/L", ((obj.entry[9].resource!! as DiagnosticReport).contained[16] as Observation).referenceRange[0].high!!.unit))
        assertTrue(stringMatch("Observation", ((obj.entry[9].resource!! as DiagnosticReport).contained[17] as Observation).resourceType))
        assertTrue(stringMatch("o18", ((obj.entry[9].resource!! as DiagnosticReport).contained[17] as Observation).id))
        assertTrue(stringMatch("final", ((obj.entry[9].resource!! as DiagnosticReport).contained[17] as Observation).status))
        assertTrue(stringMatch("http://loinc.org", ((obj.entry[9].resource!! as DiagnosticReport).contained[17] as Observation).code.coding[0].system))
        assertTrue(stringMatch("13959-2", ((obj.entry[9].resource!! as DiagnosticReport).contained[17] as Observation).code.coding[0].code))
        assertTrue(stringMatch("Calcium.ionized [Moles/volume", ((obj.entry[9].resource!! as DiagnosticReport).contained[17] as Observation).code.coding[0].display))
        assertTrue(stringMatch("http://snomed.info/sct", ((obj.entry[9].resource!! as DiagnosticReport).contained[17] as Observation).code.coding[1].system))
        assertTrue(stringMatch("166708003", ((obj.entry[9].resource!! as DiagnosticReport).contained[17] as Observation).code.coding[1].code))
        assertTrue(stringMatch("Patient/10", ((obj.entry[9].resource!! as DiagnosticReport).contained[17] as Observation).subject!!.reference))
        assertTrue(stringMatch("Organization/1832473e-2fe0-45", ((obj.entry[9].resource!! as DiagnosticReport).contained[17] as Observation).performer[0].reference))
        assertTrue(stringMatch("Acme Laboratory, Inc", ((obj.entry[9].resource!! as DiagnosticReport).contained[17] as Observation).performer[0].display))
        assertTrue(stringMatch("%.2f".format(2.47f), "%.2f".format(((obj.entry[9].resource!! as DiagnosticReport).contained[17] as Observation).valueQuantity!!.value)))
        assertTrue(stringMatch("mmol/L", ((obj.entry[9].resource!! as DiagnosticReport).contained[17] as Observation).valueQuantity!!.unit))
        assertTrue(stringMatch("%.2f".format(2.25f), "%.2f".format(((obj.entry[9].resource!! as DiagnosticReport).contained[17] as Observation).referenceRange[0].low!!.value)))
    }
}
