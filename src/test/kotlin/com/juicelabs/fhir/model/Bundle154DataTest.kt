package com.juicelabs.fhir.model

import java.io.File
import kotlin.test.assertEquals
import kotlin.test.assertTrue
import org.junit.jupiter.api.Test

class Bundle154DataTest : DataTests() {
    @Test
    fun `diagnosticreport-examples-general 527 Test`() {
        val json = File("./src/test/resources/model/sample_data/diagnosticreport-examples-general.json").readTextAndClose()
        val obj = mapper.fromJson(json, Bundle::class.java)
        assertTrue(stringMatch("mmol/L", ((obj.entry[7].resource!! as DiagnosticReport).contained[23] as Observation).valueQuantity!!.unit))
        assertTrue(stringMatch("%.2f".format(3.6f), "%.2f".format(((obj.entry[7].resource!! as DiagnosticReport).contained[23] as Observation).referenceRange[0].low!!.value)))
        assertTrue(stringMatch("mmol/L", ((obj.entry[7].resource!! as DiagnosticReport).contained[23] as Observation).referenceRange[0].low!!.unit))
        assertTrue(stringMatch("%.2f".format(6.7f), "%.2f".format(((obj.entry[7].resource!! as DiagnosticReport).contained[23] as Observation).referenceRange[0].high!!.value)))
        assertTrue(stringMatch("mmol/L", ((obj.entry[7].resource!! as DiagnosticReport).contained[23] as Observation).referenceRange[0].high!!.unit))
        assertTrue(stringMatch("Observation", ((obj.entry[7].resource!! as DiagnosticReport).contained[24] as Observation).resourceType))
        assertTrue(stringMatch("o25", ((obj.entry[7].resource!! as DiagnosticReport).contained[24] as Observation).id))
        assertTrue(stringMatch("final", ((obj.entry[7].resource!! as DiagnosticReport).contained[24] as Observation).status))
        assertTrue(stringMatch("http://loinc.org", ((obj.entry[7].resource!! as DiagnosticReport).contained[24] as Observation).code.coding[0].system))
        assertTrue(stringMatch("14927-8", ((obj.entry[7].resource!! as DiagnosticReport).contained[24] as Observation).code.coding[0].code))
        assertTrue(stringMatch("Triglyceride [Moles/volume] i", ((obj.entry[7].resource!! as DiagnosticReport).contained[24] as Observation).code.coding[0].display))
        assertTrue(stringMatch("http://snomed.info/sct", ((obj.entry[7].resource!! as DiagnosticReport).contained[24] as Observation).code.coding[1].system))
        assertTrue(stringMatch("104784006", ((obj.entry[7].resource!! as DiagnosticReport).contained[24] as Observation).code.coding[1].code))
        assertTrue(stringMatch("Patient/8", ((obj.entry[7].resource!! as DiagnosticReport).contained[24] as Observation).subject!!.reference))
        assertTrue(stringMatch("Organization/1832473e-2fe0-45", ((obj.entry[7].resource!! as DiagnosticReport).contained[24] as Observation).performer[0].reference))
        assertTrue(stringMatch("Acme Laboratory, Inc", ((obj.entry[7].resource!! as DiagnosticReport).contained[24] as Observation).performer[0].display))
        assertTrue(stringMatch("%.2f".format(0.9f), "%.2f".format(((obj.entry[7].resource!! as DiagnosticReport).contained[24] as Observation).valueQuantity!!.value)))
        assertTrue(stringMatch("mmol/L", ((obj.entry[7].resource!! as DiagnosticReport).contained[24] as Observation).valueQuantity!!.unit))
        assertTrue(stringMatch("%.2f".format(0.3f), "%.2f".format(((obj.entry[7].resource!! as DiagnosticReport).contained[24] as Observation).referenceRange[0].low!!.value)))
        assertTrue(stringMatch("mmol/L", ((obj.entry[7].resource!! as DiagnosticReport).contained[24] as Observation).referenceRange[0].low!!.unit))
        assertTrue(stringMatch("%.2f".format(4.0f), "%.2f".format(((obj.entry[7].resource!! as DiagnosticReport).contained[24] as Observation).referenceRange[0].high!!.value)))
        assertTrue(stringMatch("mmol/L", ((obj.entry[7].resource!! as DiagnosticReport).contained[24] as Observation).referenceRange[0].high!!.unit))
        assertTrue(stringMatch("http://acme.com/lab/reports", (obj.entry[7].resource!! as DiagnosticReport).identifier[0].system))
        assertTrue(stringMatch("5234342", (obj.entry[7].resource!! as DiagnosticReport).identifier[0].value))
        assertTrue(stringMatch("final", (obj.entry[7].resource!! as DiagnosticReport).status))
        assertTrue(stringMatch("SERUM CHEMISTRY", (obj.entry[7].resource!! as DiagnosticReport).code.text))
        assertTrue(stringMatch("Patient/8", (obj.entry[7].resource!! as DiagnosticReport).subject!!.reference))
        assertEquals("2005-01-27T06:40:17Z", (obj.entry[7].resource!! as DiagnosticReport).effectiveDateTime.toString())
        assertEquals("2005-02-23T10:04:01Z", (obj.entry[7].resource!! as DiagnosticReport).issued.toString())
        assertTrue(stringMatch("Organization/1832473e-2fe0-45", (obj.entry[7].resource!! as DiagnosticReport).performer[0].actor.reference))
        assertTrue(stringMatch("Acme Laboratory, Inc", (obj.entry[7].resource!! as DiagnosticReport).performer[0].actor.display))
        assertTrue(stringMatch("#o1", (obj.entry[7].resource!! as DiagnosticReport).result[0].reference))
        assertTrue(stringMatch("#o2", (obj.entry[7].resource!! as DiagnosticReport).result[1].reference))
        assertTrue(stringMatch("#o3", (obj.entry[7].resource!! as DiagnosticReport).result[2].reference))
        assertTrue(stringMatch("#o4", (obj.entry[7].resource!! as DiagnosticReport).result[3].reference))
        assertTrue(stringMatch("#o5", (obj.entry[7].resource!! as DiagnosticReport).result[4].reference))
        assertTrue(stringMatch("#o6", (obj.entry[7].resource!! as DiagnosticReport).result[5].reference))
        assertTrue(stringMatch("#o7", (obj.entry[7].resource!! as DiagnosticReport).result[6].reference))
        assertTrue(stringMatch("#o8", (obj.entry[7].resource!! as DiagnosticReport).result[7].reference))
        assertTrue(stringMatch("#o9", (obj.entry[7].resource!! as DiagnosticReport).result[8].reference))
        assertTrue(stringMatch("#o10", (obj.entry[7].resource!! as DiagnosticReport).result[9].reference))
        assertTrue(stringMatch("#o11", (obj.entry[7].resource!! as DiagnosticReport).result[10].reference))
        assertTrue(stringMatch("#o12", (obj.entry[7].resource!! as DiagnosticReport).result[11].reference))
        assertTrue(stringMatch("#o13", (obj.entry[7].resource!! as DiagnosticReport).result[12].reference))
        assertTrue(stringMatch("#o14", (obj.entry[7].resource!! as DiagnosticReport).result[13].reference))
        assertTrue(stringMatch("#o15", (obj.entry[7].resource!! as DiagnosticReport).result[14].reference))
        assertTrue(stringMatch("#o16", (obj.entry[7].resource!! as DiagnosticReport).result[15].reference))
        assertTrue(stringMatch("#o17", (obj.entry[7].resource!! as DiagnosticReport).result[16].reference))
        assertTrue(stringMatch("#o18", (obj.entry[7].resource!! as DiagnosticReport).result[17].reference))
        assertTrue(stringMatch("#o19", (obj.entry[7].resource!! as DiagnosticReport).result[18].reference))
        assertTrue(stringMatch("#o20", (obj.entry[7].resource!! as DiagnosticReport).result[19].reference))
        assertTrue(stringMatch("#o21", (obj.entry[7].resource!! as DiagnosticReport).result[20].reference))
        assertTrue(stringMatch("#o22", (obj.entry[7].resource!! as DiagnosticReport).result[21].reference))
        assertTrue(stringMatch("#o23", (obj.entry[7].resource!! as DiagnosticReport).result[22].reference))
        assertTrue(stringMatch("#o24", (obj.entry[7].resource!! as DiagnosticReport).result[23].reference))
        assertTrue(stringMatch("#o25", (obj.entry[7].resource!! as DiagnosticReport).result[24].reference))
        assertTrue(stringMatch("http://hl7.org/fhir/Diagnosti", obj.entry[8].fullUrl))
        assertTrue(stringMatch("DiagnosticReport", (obj.entry[8].resource!! as DiagnosticReport).resourceType))
        assertTrue(stringMatch("16", (obj.entry[8].resource!! as DiagnosticReport).id))
        assertEquals("2012-04-14T10:35:23Z", (obj.entry[8].resource!! as DiagnosticReport).meta!!.lastUpdated.toString())
        assertTrue(stringMatch("generated", (obj.entry[8].resource!! as DiagnosticReport).text!!.status))
        assertTrue(stringMatch("<div xmlns=\"http://www.w3.org", (obj.entry[8].resource!! as DiagnosticReport).text!!.div))
        assertTrue(stringMatch("Observation", ((obj.entry[8].resource!! as DiagnosticReport).contained[0] as Observation).resourceType))
        assertTrue(stringMatch("o1", ((obj.entry[8].resource!! as DiagnosticReport).contained[0] as Observation).id))
        assertTrue(stringMatch("final", ((obj.entry[8].resource!! as DiagnosticReport).contained[0] as Observation).status))
        assertTrue(stringMatch("http://loinc.org", ((obj.entry[8].resource!! as DiagnosticReport).contained[0] as Observation).code.coding[0].system))
        assertTrue(stringMatch("2951-2", ((obj.entry[8].resource!! as DiagnosticReport).contained[0] as Observation).code.coding[0].code))
        assertTrue(stringMatch("Sodium [Moles/volume] in Seru", ((obj.entry[8].resource!! as DiagnosticReport).contained[0] as Observation).code.coding[0].display))
        assertTrue(stringMatch("http://snomed.info/sct", ((obj.entry[8].resource!! as DiagnosticReport).contained[0] as Observation).code.coding[1].system))
        assertTrue(stringMatch("104934005", ((obj.entry[8].resource!! as DiagnosticReport).contained[0] as Observation).code.coding[1].code))
        assertTrue(stringMatch("Patient/9", ((obj.entry[8].resource!! as DiagnosticReport).contained[0] as Observation).subject!!.reference))
    }
}