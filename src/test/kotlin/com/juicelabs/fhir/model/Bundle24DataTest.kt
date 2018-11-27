package com.juicelabs.fhir.model

import java.io.File
import kotlin.test.assertEquals
import kotlin.test.assertTrue
import org.junit.jupiter.api.Test

class Bundle24DataTest : DataTests() {
    @Test
    fun `diagnosticreport-hla-genetics-results-example 389 Test`() {
        val json = File("./src/test/resources/model/sample_data/diagnosticreport-hla-genetics-results-example.json").readTextAndClose()
        val obj = mapper.fromJson(json, Bundle::class.java)
        assertTrue(stringMatch("<div xmlns=\"http://www.w3.org", (obj.entry[19].resource!! as Observation).text!!.div))
        assertTrue(stringMatch("http://hl7.org/fhir/Structure", (obj.entry[19].resource!! as Observation).extension[0].url))
        assertTrue(stringMatch("http://www.genenames.org", (obj.entry[19].resource!! as Observation).extension[0].valueCodeableConcept!!.coding[0].system))
        assertTrue(stringMatch("HGNC:4933", (obj.entry[19].resource!! as Observation).extension[0].valueCodeableConcept!!.coding[0].code))
        assertTrue(stringMatch("HLA-C", (obj.entry[19].resource!! as Observation).extension[0].valueCodeableConcept!!.coding[0].display))
        assertTrue(stringMatch("http://hl7.org/fhir/Structure", (obj.entry[19].resource!! as Observation).extension[1].url))
        assertTrue(stringMatch("http://www.ebi.ac.uk/cgi-bin/", (obj.entry[19].resource!! as Observation).extension[1].valueCodeableConcept!!.coding[0].system))
        assertTrue(stringMatch("C*01:02:01", (obj.entry[19].resource!! as Observation).extension[1].valueCodeableConcept!!.coding[0].code))
        assertTrue(stringMatch("HLA-C*01:02:01", (obj.entry[19].resource!! as Observation).extension[1].valueCodeableConcept!!.coding[0].display))
        assertTrue(stringMatch("http://hl7.org/fhir/Structure", (obj.entry[19].resource!! as Observation).extension[2].url))
        assertTrue(stringMatch("http://loinc.org", (obj.entry[19].resource!! as Observation).extension[2].valueCodeableConcept!!.coding[0].system))
        assertTrue(stringMatch("LA6683-2", (obj.entry[19].resource!! as Observation).extension[2].valueCodeableConcept!!.coding[0].code))
        assertTrue(stringMatch("germline", (obj.entry[19].resource!! as Observation).extension[2].valueCodeableConcept!!.coding[0].display))
        assertTrue(stringMatch("http://hl7.org/fhir/Structure", (obj.entry[19].resource!! as Observation).extension[3].url))
        assertTrue(stringMatch("urn:uuid:79383455-4f55-4126-b", (obj.entry[19].resource!! as Observation).extension[3].valueUri))
        assertTrue(stringMatch("final", (obj.entry[19].resource!! as Observation).status))
        assertTrue(stringMatch("http://loinc.org", (obj.entry[19].resource!! as Observation).code.coding[0].system))
        assertTrue(stringMatch("77636-9", (obj.entry[19].resource!! as Observation).code.coding[0].code))
        assertTrue(stringMatch("HLA-C [Type] by High resoluti", (obj.entry[19].resource!! as Observation).code.coding[0].display))
        assertTrue(stringMatch("Patient/119", (obj.entry[19].resource!! as Observation).subject!!.reference))
        assertTrue(stringMatch("Mary Chalmers", (obj.entry[19].resource!! as Observation).subject!!.display))
        assertEquals("2016-12-15", (obj.entry[19].resource!! as Observation).effectiveDateTime.toString())
        assertTrue(stringMatch("Specimen/120", (obj.entry[19].resource!! as Observation).specimen!!.reference))
        assertTrue(stringMatch("buccal swab from Mary Chalmer", (obj.entry[19].resource!! as Observation).specimen!!.display))
        assertTrue(stringMatch("derived-from", (obj.entry[19].resource!! as Observation).related[0].type))
        assertTrue(stringMatch("urn:uuid:bb55c2bc-5ad2-4bc1-8", (obj.entry[19].resource!! as Observation).related[0].target.reference))
        assertTrue(stringMatch("HLA-C*01:02:01, exon 2", (obj.entry[19].resource!! as Observation).related[0].target.display))
        assertTrue(stringMatch("derived-from", (obj.entry[19].resource!! as Observation).related[1].type))
        assertTrue(stringMatch("urn:uuid:46938bb2-0486-4e87-b", (obj.entry[19].resource!! as Observation).related[1].target.reference))
        assertTrue(stringMatch("HLA-C*01:02:01, exon 3", (obj.entry[19].resource!! as Observation).related[1].target.display))
        assertTrue(stringMatch("POST", obj.entry[19].request!!.method))
        assertTrue(stringMatch("Observation", obj.entry[19].request!!.url))
        assertTrue(stringMatch("urn:uuid:8b2aa21c-1426-4717-8", obj.entry[20].fullUrl))
        assertTrue(stringMatch("Observation", (obj.entry[20].resource!! as Observation).resourceType))
        assertTrue(stringMatch("generated", (obj.entry[20].resource!! as Observation).text!!.status))
        assertTrue(stringMatch("<div xmlns=\"http://www.w3.org", (obj.entry[20].resource!! as Observation).text!!.div))
        assertTrue(stringMatch("http://hl7.org/fhir/Structure", (obj.entry[20].resource!! as Observation).extension[0].url))
        assertTrue(stringMatch("http://www.genenames.org", (obj.entry[20].resource!! as Observation).extension[0].valueCodeableConcept!!.coding[0].system))
        assertTrue(stringMatch("HGNC:4933", (obj.entry[20].resource!! as Observation).extension[0].valueCodeableConcept!!.coding[0].code))
        assertTrue(stringMatch("HLA-C", (obj.entry[20].resource!! as Observation).extension[0].valueCodeableConcept!!.coding[0].display))
        assertTrue(stringMatch("http://hl7.org/fhir/Structure", (obj.entry[20].resource!! as Observation).extension[1].url))
        assertTrue(stringMatch("http://www.ebi.ac.uk/cgi-bin/", (obj.entry[20].resource!! as Observation).extension[1].valueCodeableConcept!!.coding[0].system))
        assertTrue(stringMatch("C*03:04:01:01", (obj.entry[20].resource!! as Observation).extension[1].valueCodeableConcept!!.coding[0].code))
        assertTrue(stringMatch("HLA-C*03:04:01:01", (obj.entry[20].resource!! as Observation).extension[1].valueCodeableConcept!!.coding[0].display))
        assertTrue(stringMatch("http://hl7.org/fhir/Structure", (obj.entry[20].resource!! as Observation).extension[2].url))
        assertTrue(stringMatch("http://loinc.org", (obj.entry[20].resource!! as Observation).extension[2].valueCodeableConcept!!.coding[0].system))
        assertTrue(stringMatch("LA6683-2", (obj.entry[20].resource!! as Observation).extension[2].valueCodeableConcept!!.coding[0].code))
        assertTrue(stringMatch("germline", (obj.entry[20].resource!! as Observation).extension[2].valueCodeableConcept!!.coding[0].display))
        assertTrue(stringMatch("http://hl7.org/fhir/Structure", (obj.entry[20].resource!! as Observation).extension[3].url))
        assertTrue(stringMatch("urn:uuid:a220b7a5-2d7a-4cec-a", (obj.entry[20].resource!! as Observation).extension[3].valueUri))
        assertTrue(stringMatch("final", (obj.entry[20].resource!! as Observation).status))
        assertTrue(stringMatch("http://loinc.org", (obj.entry[20].resource!! as Observation).code.coding[0].system))
        assertTrue(stringMatch("77636-9", (obj.entry[20].resource!! as Observation).code.coding[0].code))
        assertTrue(stringMatch("HLA-C [Type] by High resoluti", (obj.entry[20].resource!! as Observation).code.coding[0].display))
        assertTrue(stringMatch("Patient/119", (obj.entry[20].resource!! as Observation).subject!!.reference))
        assertTrue(stringMatch("Mary Chalmers", (obj.entry[20].resource!! as Observation).subject!!.display))
        assertEquals("2016-12-15", (obj.entry[20].resource!! as Observation).effectiveDateTime.toString())
        assertTrue(stringMatch("Specimen/120", (obj.entry[20].resource!! as Observation).specimen!!.reference))
        assertTrue(stringMatch("buccal swab from Mary Chalmer", (obj.entry[20].resource!! as Observation).specimen!!.display))
        assertTrue(stringMatch("derived-from", (obj.entry[20].resource!! as Observation).related[0].type))
        assertTrue(stringMatch("urn:uuid:2ae2ff34-279e-43c2-9", (obj.entry[20].resource!! as Observation).related[0].target.reference))
        assertTrue(stringMatch("HLA-C*03:04:01:01, exon 2", (obj.entry[20].resource!! as Observation).related[0].target.display))
        assertTrue(stringMatch("derived-from", (obj.entry[20].resource!! as Observation).related[1].type))
        assertTrue(stringMatch("urn:uuid:19153ef1-68c6-47a2-9", (obj.entry[20].resource!! as Observation).related[1].target.reference))
        assertTrue(stringMatch("HLA-C*03:04:01:01, exon 3", (obj.entry[20].resource!! as Observation).related[1].target.display))
        assertTrue(stringMatch("POST", obj.entry[20].request!!.method))
        assertTrue(stringMatch("Observation", obj.entry[20].request!!.url))
        assertTrue(stringMatch("urn:uuid:0e0a780e-4486-4cd0-b", obj.entry[21].fullUrl))
        assertTrue(stringMatch("Observation", (obj.entry[21].resource!! as Observation).resourceType))
        assertTrue(stringMatch("generated", (obj.entry[21].resource!! as Observation).text!!.status))
        assertTrue(stringMatch("<div xmlns=\"http://www.w3.org", (obj.entry[21].resource!! as Observation).text!!.div))
    }
}