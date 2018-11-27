package com.juicelabs.fhir.model

import java.io.File
import kotlin.test.assertEquals
import kotlin.test.assertTrue
import org.junit.jupiter.api.Test

class PaymentNoticeDataTest : DataTests() {
    @Test
    fun `paymentnotice-example 1007 Test`() {
        val json = File("./src/test/resources/model/sample_data/paymentnotice-example.json").readTextAndClose()
        val obj = mapper.fromJson(json, PaymentNotice::class.java)
        assertTrue(stringMatch("PaymentNotice", obj.resourceType))
        assertTrue(stringMatch("77654", obj.id))
        assertTrue(stringMatch("generated", obj.text!!.status))
        assertTrue(stringMatch("<div xmlns=\"http://www.w3.org", obj.text!!.div))
        assertTrue(stringMatch("http://benefitsinc.com/paymen", obj.identifier[0].system))
        assertTrue(stringMatch("776543", obj.identifier[0].value))
        assertTrue(stringMatch("active", obj.status))
        assertTrue(stringMatch("http://benefitsinc.com/fhir/c", obj.request!!.reference))
        assertTrue(stringMatch("http://benefitsinc.com/fhir/c", obj.response!!.reference))
        assertEquals("2014-08-15", obj.statusDate.toString())
        assertEquals("2014-08-16", obj.created.toString())
        assertTrue(stringMatch("http://regulators.gov", obj.target!!.identifier!!.system))
        assertTrue(stringMatch("AB123", obj.target!!.identifier!!.value))
        assertTrue(stringMatch("http://npid.org/provider", obj.provider!!.identifier!!.system))
        assertTrue(stringMatch("PR957857", obj.provider!!.identifier!!.value))
        assertTrue(stringMatch("Organization/1", obj.organization!!.reference))
        assertTrue(stringMatch("http://hl7.org/fhir/paymentst", obj.paymentStatus!!.coding[0].system))
        assertTrue(stringMatch("paid", obj.paymentStatus!!.coding[0].code))
    }
}
