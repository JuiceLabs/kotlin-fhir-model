package com.juicelabs.fhir.model

import java.io.File
import kotlin.test.assertEquals
import kotlin.test.assertTrue
import org.junit.jupiter.api.Test

class Bundle21DataTest : DataTests() {
    @Test
    fun `diagnosticreport-hla-genetics-results-example 386 Test`() {
        val json = File("./src/test/resources/model/sample_data/diagnosticreport-hla-genetics-results-example.json").readTextAndClose()
        val obj = mapper.fromJson(json, Bundle::class.java)
        assertTrue(stringMatch("Mary Chalmers", (obj.entry[12].resource!! as Sequence).patient!!.display))
        assertTrue(stringMatch("Specimen/120", (obj.entry[12].resource!! as Sequence).specimen!!.reference))
        assertTrue(stringMatch("buccal swab from Mary Chalmer", (obj.entry[12].resource!! as Sequence).specimen!!.display))
        assertTrue(stringMatch("http://www.ebi.ac.uk/ipd/imgt", (obj.entry[12].resource!! as Sequence).referenceSeq!!.referenceSeqId!!.coding[0].system))
        assertTrue(stringMatch("3.23", (obj.entry[12].resource!! as Sequence).referenceSeq!!.referenceSeqId!!.coding[0].version))
        assertTrue(stringMatch("HLA00413", (obj.entry[12].resource!! as Sequence).referenceSeq!!.referenceSeqId!!.coding[0].code))
        assertTrue(stringMatch("HLA-C*03:04:01:01", (obj.entry[12].resource!! as Sequence).referenceSeq!!.referenceSeqId!!.text))
        assertEquals(1001, (obj.entry[12].resource!! as Sequence).referenceSeq!!.windowStart)
        assertEquals(1277, (obj.entry[12].resource!! as Sequence).referenceSeq!!.windowEnd)
        assertTrue(stringMatch("GGTCTCACATCATCCAGAGGATGTATGGC", (obj.entry[12].resource!! as Sequence).observedSeq))
        assertTrue(stringMatch("POST", obj.entry[12].request!!.method))
        assertTrue(stringMatch("Sequence", obj.entry[12].request!!.url))
        assertTrue(stringMatch("urn:uuid:b7765bbf-df40-486a-9", obj.entry[13].fullUrl))
        assertTrue(stringMatch("Observation", (obj.entry[13].resource!! as Observation).resourceType))
        assertTrue(stringMatch("generated", (obj.entry[13].resource!! as Observation).text!!.status))
        assertTrue(stringMatch("<div xmlns=\"http://www.w3.org", (obj.entry[13].resource!! as Observation).text!!.div))
        assertTrue(stringMatch("http://hl7.org/fhir/Structure", (obj.entry[13].resource!! as Observation).extension[0].url))
        assertTrue(stringMatch("http://www.genenames.org", (obj.entry[13].resource!! as Observation).extension[0].valueCodeableConcept!!.coding[0].system))
        assertTrue(stringMatch("HGNC:4931", (obj.entry[13].resource!! as Observation).extension[0].valueCodeableConcept!!.coding[0].code))
        assertTrue(stringMatch("HLA-A", (obj.entry[13].resource!! as Observation).extension[0].valueCodeableConcept!!.coding[0].display))
        assertTrue(stringMatch("http://hl7.org/fhir/Structure", (obj.entry[13].resource!! as Observation).extension[1].url))
        assertTrue(stringMatch("http://www.ebi.ac.uk/cgi-bin/", (obj.entry[13].resource!! as Observation).extension[1].valueCodeableConcept!!.coding[0].system))
        assertTrue(stringMatch("A*01:01:01:01", (obj.entry[13].resource!! as Observation).extension[1].valueCodeableConcept!!.coding[0].code))
        assertTrue(stringMatch("HLA-A*01:01:01G", (obj.entry[13].resource!! as Observation).extension[1].valueCodeableConcept!!.coding[0].display))
        assertTrue(stringMatch("http://hl7.org/fhir/Structure", (obj.entry[13].resource!! as Observation).extension[2].url))
        assertTrue(stringMatch("http://loinc.org", (obj.entry[13].resource!! as Observation).extension[2].valueCodeableConcept!!.coding[0].system))
        assertTrue(stringMatch("LA6683-2", (obj.entry[13].resource!! as Observation).extension[2].valueCodeableConcept!!.coding[0].code))
        assertTrue(stringMatch("germline", (obj.entry[13].resource!! as Observation).extension[2].valueCodeableConcept!!.coding[0].display))
        assertTrue(stringMatch("http://hl7.org/fhir/Structure", (obj.entry[13].resource!! as Observation).extension[3].url))
        assertTrue(stringMatch("urn:uuid:e13f147e-41e5-4f7a-b", (obj.entry[13].resource!! as Observation).extension[3].valueUri))
        assertTrue(stringMatch("final", (obj.entry[13].resource!! as Observation).status))
        assertTrue(stringMatch("http://loinc.org", (obj.entry[13].resource!! as Observation).code.coding[0].system))
        assertTrue(stringMatch("57290-9", (obj.entry[13].resource!! as Observation).code.coding[0].code))
        assertTrue(stringMatch("HLA-A [Type] by High resoluti", (obj.entry[13].resource!! as Observation).code.coding[0].display))
        assertTrue(stringMatch("Patient/119", (obj.entry[13].resource!! as Observation).subject!!.reference))
        assertTrue(stringMatch("Mary Chalmers", (obj.entry[13].resource!! as Observation).subject!!.display))
        assertEquals("2016-12-15", (obj.entry[13].resource!! as Observation).effectiveDateTime.toString())
        assertTrue(stringMatch("Specimen/120", (obj.entry[13].resource!! as Observation).specimen!!.reference))
        assertTrue(stringMatch("buccal swab from Mary Chalmer", (obj.entry[13].resource!! as Observation).specimen!!.display))
        assertTrue(stringMatch("derived-from", (obj.entry[13].resource!! as Observation).related[0].type))
        assertTrue(stringMatch("urn:uuid:8200dab6-18a2-4550-b", (obj.entry[13].resource!! as Observation).related[0].target.reference))
        assertTrue(stringMatch("HLA-A*01:01:01:01, exon 2", (obj.entry[13].resource!! as Observation).related[0].target.display))
        assertTrue(stringMatch("derived-from", (obj.entry[13].resource!! as Observation).related[1].type))
        assertTrue(stringMatch("urn:uuid:7c393185-f15c-45bc-a", (obj.entry[13].resource!! as Observation).related[1].target.reference))
        assertTrue(stringMatch("HLA-A*01:01:01:01, exon 3", (obj.entry[13].resource!! as Observation).related[1].target.display))
        assertTrue(stringMatch("POST", obj.entry[13].request!!.method))
        assertTrue(stringMatch("Observation", obj.entry[13].request!!.url))
        assertTrue(stringMatch("urn:uuid:d98d92a7-0e86-4ae5-b", obj.entry[14].fullUrl))
        assertTrue(stringMatch("Observation", (obj.entry[14].resource!! as Observation).resourceType))
        assertTrue(stringMatch("generated", (obj.entry[14].resource!! as Observation).text!!.status))
        assertTrue(stringMatch("<div xmlns=\"http://www.w3.org", (obj.entry[14].resource!! as Observation).text!!.div))
        assertTrue(stringMatch("http://hl7.org/fhir/Structure", (obj.entry[14].resource!! as Observation).extension[0].url))
        assertTrue(stringMatch("http://www.genenames.org", (obj.entry[14].resource!! as Observation).extension[0].valueCodeableConcept!!.coding[0].system))
        assertTrue(stringMatch("HGNC:4931", (obj.entry[14].resource!! as Observation).extension[0].valueCodeableConcept!!.coding[0].code))
        assertTrue(stringMatch("HLA-A", (obj.entry[14].resource!! as Observation).extension[0].valueCodeableConcept!!.coding[0].display))
        assertTrue(stringMatch("http://hl7.org/fhir/Structure", (obj.entry[14].resource!! as Observation).extension[1].url))
        assertTrue(stringMatch("http://www.ebi.ac.uk/cgi-bin/", (obj.entry[14].resource!! as Observation).extension[1].valueCodeableConcept!!.coding[0].system))
        assertTrue(stringMatch("A*01:02", (obj.entry[14].resource!! as Observation).extension[1].valueCodeableConcept!!.coding[0].code))
        assertTrue(stringMatch("HLA-A*01:02", (obj.entry[14].resource!! as Observation).extension[1].valueCodeableConcept!!.coding[0].display))
        assertTrue(stringMatch("http://hl7.org/fhir/Structure", (obj.entry[14].resource!! as Observation).extension[2].url))
        assertTrue(stringMatch("http://loinc.org", (obj.entry[14].resource!! as Observation).extension[2].valueCodeableConcept!!.coding[0].system))
        assertTrue(stringMatch("LA6683-2", (obj.entry[14].resource!! as Observation).extension[2].valueCodeableConcept!!.coding[0].code))
        assertTrue(stringMatch("germline", (obj.entry[14].resource!! as Observation).extension[2].valueCodeableConcept!!.coding[0].display))
        assertTrue(stringMatch("http://hl7.org/fhir/Structure", (obj.entry[14].resource!! as Observation).extension[3].url))
        assertTrue(stringMatch("urn:uuid:af8e79ec-343e-4380-b", (obj.entry[14].resource!! as Observation).extension[3].valueUri))
        assertTrue(stringMatch("final", (obj.entry[14].resource!! as Observation).status))
        assertTrue(stringMatch("http://loinc.org", (obj.entry[14].resource!! as Observation).code.coding[0].system))
        assertTrue(stringMatch("57290-9", (obj.entry[14].resource!! as Observation).code.coding[0].code))
        assertTrue(stringMatch("HLA-A [Type] by High resoluti", (obj.entry[14].resource!! as Observation).code.coding[0].display))
        assertTrue(stringMatch("Patient/119", (obj.entry[14].resource!! as Observation).subject!!.reference))
        assertTrue(stringMatch("Mary Chalmers", (obj.entry[14].resource!! as Observation).subject!!.display))
    }
}