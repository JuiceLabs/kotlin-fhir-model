package com.juicelabs.fhir.model

import java.io.File
import kotlin.test.assertEquals
import kotlin.test.assertTrue
import org.junit.jupiter.api.Test

class EligibilityRequestDataTest : DataTests() {
    @Test
    fun `eligibilityrequest-example-2 941 Test`() {
        val json = File("./src/test/resources/model/sample_data/eligibilityrequest-example-2.json").readTextAndClose()
        val obj = mapper.fromJson(json, EligibilityRequest::class.java)
        assertTrue(stringMatch("EligibilityRequest", obj.resourceType))
        assertTrue(stringMatch("52346", obj.id))
        assertTrue(stringMatch("generated", obj.text!!.status))
        assertTrue(stringMatch("<div xmlns=\"http://www.w3.org", obj.text!!.div))
        assertTrue(stringMatch("http://happyvalley.com/elegib", obj.identifier[0].system))
        assertTrue(stringMatch("52346", obj.identifier[0].value))
        assertTrue(stringMatch("active", obj.status))
        assertTrue(stringMatch("normal", obj.priority!!.coding[0].code))
        assertTrue(stringMatch("Patient/pat1", obj.patient!!.reference))
        assertEquals("2014-09-17", obj.servicedDate.toString())
        assertEquals("2014-08-16", obj.created.toString())
        assertTrue(stringMatch("http://happyvalleyclinic.com/", obj.enterer!!.identifier!!.system))
        assertTrue(stringMatch("14", obj.enterer!!.identifier!!.value))
        assertTrue(stringMatch("http://happyvalleyclinic.com/", obj.provider!!.identifier!!.system))
        assertTrue(stringMatch("18", obj.provider!!.identifier!!.value))
        assertTrue(stringMatch("Organization/1", obj.organization!!.reference))
        assertTrue(stringMatch("Organization/2", obj.insurer!!.reference))
        assertTrue(stringMatch("http://statecliniclicensor.co", obj.facility!!.identifier!!.system))
        assertTrue(stringMatch("G35B9", obj.facility!!.identifier!!.value))
        assertTrue(stringMatch("Coverage/9876B1", obj.coverage!!.reference))
        assertTrue(stringMatch("NB8742", obj.businessArrangement))
        assertTrue(stringMatch("http://hl7.org/fhir/benefit-c", obj.benefitCategory!!.coding[0].system))
        assertTrue(stringMatch("medical", obj.benefitCategory!!.coding[0].code))
        assertTrue(stringMatch("http://hl7.org/fhir/benefit-s", obj.benefitSubCategory!!.coding[0].system))
        assertTrue(stringMatch("69", obj.benefitSubCategory!!.coding[0].code))
    }

    @Test
    fun `eligibilityrequest-example-2 942 Test`() {
        val json = File("./src/test/resources/model/sample_data/eligibilityrequest-example-2.json").readTextAndClose()
        val obj = mapper.fromJson(json, EligibilityRequest::class.java)
        assertTrue(stringMatch("Maternity", obj.benefitSubCategory!!.coding[0].display))
    }

    @Test
    fun `eligibilityrequest-example 943 Test`() {
        val json = File("./src/test/resources/model/sample_data/eligibilityrequest-example.json").readTextAndClose()
        val obj = mapper.fromJson(json, EligibilityRequest::class.java)
        assertTrue(stringMatch("EligibilityRequest", obj.resourceType))
        assertTrue(stringMatch("52345", obj.id))
        assertTrue(stringMatch("generated", obj.text!!.status))
        assertTrue(stringMatch("<div xmlns=\"http://www.w3.org", obj.text!!.div))
        assertTrue(stringMatch("http://happyvalley.com/elegib", obj.identifier[0].system))
        assertTrue(stringMatch("52345", obj.identifier[0].value))
        assertTrue(stringMatch("active", obj.status))
        assertTrue(stringMatch("normal", obj.priority!!.coding[0].code))
        assertTrue(stringMatch("Patient/pat1", obj.patient!!.reference))
        assertEquals("2014-08-16", obj.created.toString())
        assertTrue(stringMatch("Organization/1", obj.organization!!.reference))
        assertTrue(stringMatch("Organization/2", obj.insurer!!.reference))
        assertTrue(stringMatch("Coverage/9876B1", obj.coverage!!.reference))
    }
}
