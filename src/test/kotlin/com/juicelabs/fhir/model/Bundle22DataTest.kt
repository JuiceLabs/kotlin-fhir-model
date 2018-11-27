package com.juicelabs.fhir.model

import java.io.File
import kotlin.test.assertEquals
import kotlin.test.assertTrue
import org.junit.jupiter.api.Test

class Bundle22DataTest : DataTests() {
    @Test
    fun `diagnosticreport-hla-genetics-results-example 387 Test`() {
        val json = File("./src/test/resources/model/sample_data/diagnosticreport-hla-genetics-results-example.json").readTextAndClose()
        val obj = mapper.fromJson(json, Bundle::class.java)
        assertEquals("2016-12-15", (obj.entry[14].resource!! as Observation).effectiveDateTime.toString())
        assertTrue(stringMatch("Specimen/120", (obj.entry[14].resource!! as Observation).specimen!!.reference))
        assertTrue(stringMatch("buccal swab from Mary Chalmer", (obj.entry[14].resource!! as Observation).specimen!!.display))
        assertTrue(stringMatch("derived-from", (obj.entry[14].resource!! as Observation).related[0].type))
        assertTrue(stringMatch("urn:uuid:65c85f14-c3a0-4b72-8", (obj.entry[14].resource!! as Observation).related[0].target.reference))
        assertTrue(stringMatch("HLA-A*01:02, exon 2", (obj.entry[14].resource!! as Observation).related[0].target.display))
        assertTrue(stringMatch("derived-from", (obj.entry[14].resource!! as Observation).related[1].type))
        assertTrue(stringMatch("urn:uuid:fbba9fe7-0ece-4ec1-9", (obj.entry[14].resource!! as Observation).related[1].target.reference))
        assertTrue(stringMatch("HLA-A*01:02, exon 3", (obj.entry[14].resource!! as Observation).related[1].target.display))
        assertTrue(stringMatch("POST", obj.entry[14].request!!.method))
        assertTrue(stringMatch("Observation", obj.entry[14].request!!.url))
        assertTrue(stringMatch("urn:uuid:49a86246-4004-42eb-9", obj.entry[15].fullUrl))
        assertTrue(stringMatch("Observation", (obj.entry[15].resource!! as Observation).resourceType))
        assertTrue(stringMatch("generated", (obj.entry[15].resource!! as Observation).text!!.status))
        assertTrue(stringMatch("<div xmlns=\"http://www.w3.org", (obj.entry[15].resource!! as Observation).text!!.div))
        assertTrue(stringMatch("http://hl7.org/fhir/Structure", (obj.entry[15].resource!! as Observation).extension[0].url))
        assertTrue(stringMatch("http://www.genenames.org", (obj.entry[15].resource!! as Observation).extension[0].valueCodeableConcept!!.coding[0].system))
        assertTrue(stringMatch("HGNC:4931", (obj.entry[15].resource!! as Observation).extension[0].valueCodeableConcept!!.coding[0].code))
        assertTrue(stringMatch("HLA-A", (obj.entry[15].resource!! as Observation).extension[0].valueCodeableConcept!!.coding[0].display))
        assertTrue(stringMatch("http://hl7.org/fhir/Structure", (obj.entry[15].resource!! as Observation).extension[1].url))
        assertTrue(stringMatch("http://loinc.org", (obj.entry[15].resource!! as Observation).extension[1].valueCodeableConcept!!.coding[0].system))
        assertTrue(stringMatch("LA6683-2", (obj.entry[15].resource!! as Observation).extension[1].valueCodeableConcept!!.coding[0].code))
        assertTrue(stringMatch("germline", (obj.entry[15].resource!! as Observation).extension[1].valueCodeableConcept!!.coding[0].display))
        assertTrue(stringMatch("final", (obj.entry[15].resource!! as Observation).status))
        assertTrue(stringMatch("http://loinc.org", (obj.entry[15].resource!! as Observation).code.coding[0].system))
        assertTrue(stringMatch("57290-9", (obj.entry[15].resource!! as Observation).code.coding[0].code))
        assertTrue(stringMatch("HLA-A [Type] by High resoluti", (obj.entry[15].resource!! as Observation).code.coding[0].display))
        assertTrue(stringMatch("Patient/119", (obj.entry[15].resource!! as Observation).subject!!.reference))
        assertTrue(stringMatch("Mary Chalmers", (obj.entry[15].resource!! as Observation).subject!!.display))
        assertEquals("2016-12-15", (obj.entry[15].resource!! as Observation).effectiveDateTime.toString())
        assertTrue(stringMatch("Specimen/120", (obj.entry[15].resource!! as Observation).specimen!!.reference))
        assertTrue(stringMatch("buccal swab from Mary Chalmer", (obj.entry[15].resource!! as Observation).specimen!!.display))
        assertTrue(stringMatch("derived-from", (obj.entry[15].resource!! as Observation).related[0].type))
        assertTrue(stringMatch("urn:uuid:b7765bbf-df40-486a-9", (obj.entry[15].resource!! as Observation).related[0].target.reference))
        assertTrue(stringMatch("HLA-A*01:01:01G, exons 2 and ", (obj.entry[15].resource!! as Observation).related[0].target.display))
        assertTrue(stringMatch("derived-from", (obj.entry[15].resource!! as Observation).related[1].type))
        assertTrue(stringMatch("urn:uuid:d98d92a7-0e86-4ae5-b", (obj.entry[15].resource!! as Observation).related[1].target.reference))
        assertTrue(stringMatch("HLA-A*01:02, exons 2 and 3", (obj.entry[15].resource!! as Observation).related[1].target.display))
        assertTrue(stringMatch("POST", obj.entry[15].request!!.method))
        assertTrue(stringMatch("Observation", obj.entry[15].request!!.url))
        assertTrue(stringMatch("urn:uuid:e2092243-2970-49d2-a", obj.entry[16].fullUrl))
        assertTrue(stringMatch("Observation", (obj.entry[16].resource!! as Observation).resourceType))
        assertTrue(stringMatch("generated", (obj.entry[16].resource!! as Observation).text!!.status))
        assertTrue(stringMatch("<div xmlns=\"http://www.w3.org", (obj.entry[16].resource!! as Observation).text!!.div))
        assertTrue(stringMatch("http://hl7.org/fhir/Structure", (obj.entry[16].resource!! as Observation).extension[0].url))
        assertTrue(stringMatch("http://www.genenames.org", (obj.entry[16].resource!! as Observation).extension[0].valueCodeableConcept!!.coding[0].system))
        assertTrue(stringMatch("HGNC:4932", (obj.entry[16].resource!! as Observation).extension[0].valueCodeableConcept!!.coding[0].code))
        assertTrue(stringMatch("HLA-B", (obj.entry[16].resource!! as Observation).extension[0].valueCodeableConcept!!.coding[0].display))
        assertTrue(stringMatch("http://hl7.org/fhir/Structure", (obj.entry[16].resource!! as Observation).extension[1].url))
        assertTrue(stringMatch("http://www.ebi.ac.uk/cgi-bin/", (obj.entry[16].resource!! as Observation).extension[1].valueCodeableConcept!!.coding[0].system))
        assertTrue(stringMatch("B*15:01:01:01", (obj.entry[16].resource!! as Observation).extension[1].valueCodeableConcept!!.coding[0].code))
        assertTrue(stringMatch("HLA-B*15:01:01G", (obj.entry[16].resource!! as Observation).extension[1].valueCodeableConcept!!.coding[0].display))
        assertTrue(stringMatch("http://hl7.org/fhir/Structure", (obj.entry[16].resource!! as Observation).extension[2].url))
        assertTrue(stringMatch("http://loinc.org", (obj.entry[16].resource!! as Observation).extension[2].valueCodeableConcept!!.coding[0].system))
        assertTrue(stringMatch("LA6683-2", (obj.entry[16].resource!! as Observation).extension[2].valueCodeableConcept!!.coding[0].code))
        assertTrue(stringMatch("germline", (obj.entry[16].resource!! as Observation).extension[2].valueCodeableConcept!!.coding[0].display))
        assertTrue(stringMatch("http://hl7.org/fhir/Structure", (obj.entry[16].resource!! as Observation).extension[3].url))
        assertTrue(stringMatch("urn:uuid:29c67a1b-aeaa-4599-a", (obj.entry[16].resource!! as Observation).extension[3].valueUri))
        assertTrue(stringMatch("final", (obj.entry[16].resource!! as Observation).status))
        assertTrue(stringMatch("http://loinc.org", (obj.entry[16].resource!! as Observation).code.coding[0].system))
        assertTrue(stringMatch("57291-7", (obj.entry[16].resource!! as Observation).code.coding[0].code))
        assertTrue(stringMatch("HLA-B [Type] by High resoluti", (obj.entry[16].resource!! as Observation).code.coding[0].display))
        assertTrue(stringMatch("Patient/119", (obj.entry[16].resource!! as Observation).subject!!.reference))
        assertTrue(stringMatch("Mary Chalmers", (obj.entry[16].resource!! as Observation).subject!!.display))
        assertEquals("2016-12-15", (obj.entry[16].resource!! as Observation).effectiveDateTime.toString())
        assertTrue(stringMatch("Specimen/120", (obj.entry[16].resource!! as Observation).specimen!!.reference))
        assertTrue(stringMatch("buccal swab from Mary Chalmer", (obj.entry[16].resource!! as Observation).specimen!!.display))
        assertTrue(stringMatch("derived-from", (obj.entry[16].resource!! as Observation).related[0].type))
        assertTrue(stringMatch("urn:uuid:cbabf93e-1b4b-46f2-b", (obj.entry[16].resource!! as Observation).related[0].target.reference))
        assertTrue(stringMatch("HLA-B*15:01:01:01, exon 2", (obj.entry[16].resource!! as Observation).related[0].target.display))
        assertTrue(stringMatch("derived-from", (obj.entry[16].resource!! as Observation).related[1].type))
    }
}