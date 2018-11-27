package com.juicelabs.fhir.model

import java.io.File
import kotlin.test.assertEquals
import kotlin.test.assertTrue
import org.junit.jupiter.api.Test

class DetectedIssueDataTest : DataTests() {
    @Test
    fun `detectedissue-example-allergy 769 Test`() {
        val json = File("./src/test/resources/model/sample_data/detectedissue-example-allergy.json").readTextAndClose()
        val obj = mapper.fromJson(json, DetectedIssue::class.java)
        assertTrue(stringMatch("DetectedIssue", obj.resourceType))
        assertTrue(stringMatch("allergy", obj.id))
        assertTrue(stringMatch("generated", obj.text!!.status))
        assertTrue(stringMatch("<div xmlns=\"http://www.w3.org", obj.text!!.div))
        assertTrue(stringMatch("final", obj.status))
    }

    @Test
    fun `detectedissue-example-dup 770 Test`() {
        val json = File("./src/test/resources/model/sample_data/detectedissue-example-dup.json").readTextAndClose()
        val obj = mapper.fromJson(json, DetectedIssue::class.java)
        assertTrue(stringMatch("DetectedIssue", obj.resourceType))
        assertTrue(stringMatch("duplicate", obj.id))
        assertTrue(stringMatch("generated", obj.text!!.status))
        assertTrue(stringMatch("<div xmlns=\"http://www.w3.org", obj.text!!.div))
        assertTrue(stringMatch("official", obj.identifier!!.use))
        assertTrue(stringMatch("http://example.org", obj.identifier!!.system))
        assertTrue(stringMatch("12345", obj.identifier!!.value))
        assertTrue(stringMatch("final", obj.status))
        assertTrue(stringMatch("http://hl7.org/fhir/v3/ActCod", obj.category!!.coding[0].system))
        assertTrue(stringMatch("DUPTHPY", obj.category!!.coding[0].code))
        assertTrue(stringMatch("Duplicate Therapy Alert", obj.category!!.coding[0].display))
        assertTrue(stringMatch("Patient/dicom", obj.patient!!.reference))
        assertEquals("2013-05-08", obj.date.toString())
        assertTrue(stringMatch("Device/software", obj.author!!.reference))
        assertTrue(stringMatch("ProcedureRequest/di", obj.implicated[0].reference))
        assertTrue(stringMatch("Chest CT - ordered May 8, 201", obj.implicated[0].display))
        assertTrue(stringMatch("ImagingStudy/example", obj.implicated[1].reference))
        assertTrue(stringMatch("Image 1 from Series 3: CT Ima", obj.implicated[1].display))
        assertTrue(stringMatch("Similar test was performed wi", obj.detail))
        assertTrue(stringMatch("http://www.tmhp.com/Radiology", obj.reference))
    }

    @Test
    fun `detectedissue-example 771 Test`() {
        val json = File("./src/test/resources/model/sample_data/detectedissue-example.json").readTextAndClose()
        val obj = mapper.fromJson(json, DetectedIssue::class.java)
        assertTrue(stringMatch("DetectedIssue", obj.resourceType))
        assertTrue(stringMatch("ddi", obj.id))
        assertTrue(stringMatch("generated", obj.text!!.status))
        assertTrue(stringMatch("<div xmlns=\"http://www.w3.org", obj.text!!.div))
        assertTrue(stringMatch("final", obj.status))
        assertTrue(stringMatch("http://hl7.org/fhir/v3/ActCod", obj.category!!.coding[0].system))
        assertTrue(stringMatch("DRG", obj.category!!.coding[0].code))
        assertTrue(stringMatch("Drug Interaction Alert", obj.category!!.coding[0].display))
        assertTrue(stringMatch("high", obj.severity))
        assertEquals("2014-01-05", obj.date.toString())
        assertTrue(stringMatch("Device/software", obj.author!!.reference))
        assertTrue(stringMatch("MedicationStatement/example00", obj.implicated[0].reference))
        assertTrue(stringMatch("500 mg Acetaminophen tablet 1", obj.implicated[0].display))
        assertTrue(stringMatch("MedicationRequest/medrx0331", obj.implicated[1].reference))
        assertTrue(stringMatch("Warfarin 1 MG TAB prescribed ", obj.implicated[1].display))
        assertTrue(stringMatch("Risk of internal bleeding.  T", obj.detail))
        assertTrue(stringMatch("http://hl7.org/fhir/v3/ActCod", obj.mitigation[0].action.coding[0].system))
        assertTrue(stringMatch("13", obj.mitigation[0].action.coding[0].code))
        assertTrue(stringMatch("Stopped Concurrent Therapy", obj.mitigation[0].action.coding[0].display))
        assertTrue(stringMatch("Asked patient to discontinue ", obj.mitigation[0].action.text))
        assertEquals("2014-01-05", obj.mitigation[0].date.toString())
        assertTrue(stringMatch("Practitioner/example", obj.mitigation[0].author!!.reference))
        assertTrue(stringMatch("Dr. Adam Careful", obj.mitigation[0].author!!.display))
    }

    @Test
    fun `detectedissue-example-lab 772 Test`() {
        val json = File("./src/test/resources/model/sample_data/detectedissue-example-lab.json").readTextAndClose()
        val obj = mapper.fromJson(json, DetectedIssue::class.java)
        assertTrue(stringMatch("DetectedIssue", obj.resourceType))
        assertTrue(stringMatch("lab", obj.id))
        assertTrue(stringMatch("generated", obj.text!!.status))
        assertTrue(stringMatch("<div xmlns=\"http://www.w3.org", obj.text!!.div))
        assertTrue(stringMatch("final", obj.status))
    }
}
