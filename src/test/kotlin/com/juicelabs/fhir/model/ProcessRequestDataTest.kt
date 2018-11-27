package com.juicelabs.fhir.model

import java.io.File
import kotlin.test.assertEquals
import kotlin.test.assertTrue
import org.junit.jupiter.api.Test

class ProcessRequestDataTest : DataTests() {
    @Test
    fun `processrequest-example-poll-exclusive 273 Test`() {
        val json = File("./src/test/resources/model/sample_data/processrequest-example-poll-exclusive.json").readTextAndClose()
        val obj = mapper.fromJson(json, ProcessRequest::class.java)
        assertTrue(stringMatch("ProcessRequest", obj.resourceType))
        assertTrue(stringMatch("1113", obj.id))
        assertTrue(stringMatch("generated", obj.text!!.status))
        assertTrue(stringMatch("<div xmlns=\"http://www.w3.org", obj.text!!.div))
        assertTrue(stringMatch("http://happyvalley.com/proces", obj.identifier[0].system))
        assertTrue(stringMatch("113", obj.identifier[0].value))
        assertTrue(stringMatch("active", obj.status))
        assertTrue(stringMatch("poll", obj.action))
        assertEquals("2014-08-16", obj.created.toString())
        assertTrue(stringMatch("Organization/1", obj.organization!!.reference))
        assertTrue(stringMatch("Communication", obj.exclude[0]))
        assertTrue(stringMatch("PaymentReconciliation", obj.exclude[1]))
    }

    @Test
    fun `processrequest-example-poll-eob 274 Test`() {
        val json = File("./src/test/resources/model/sample_data/processrequest-example-poll-eob.json").readTextAndClose()
        val obj = mapper.fromJson(json, ProcessRequest::class.java)
        assertTrue(stringMatch("ProcessRequest", obj.resourceType))
        assertTrue(stringMatch("1115", obj.id))
        assertTrue(stringMatch("generated", obj.text!!.status))
        assertTrue(stringMatch("<div xmlns=\"http://www.w3.org", obj.text!!.div))
        assertTrue(stringMatch("http://www.phr.com/patient/12", obj.identifier[0].system))
        assertTrue(stringMatch("115", obj.identifier[0].value))
        assertTrue(stringMatch("active", obj.status))
        assertTrue(stringMatch("poll", obj.action))
        assertEquals("2014-08-16", obj.created.toString())
        assertTrue(stringMatch("ExplanationOfBenefit", obj.include[0]))
    }

    @Test
    fun `processrequest-example-poll-specific 275 Test`() {
        val json = File("./src/test/resources/model/sample_data/processrequest-example-poll-specific.json").readTextAndClose()
        val obj = mapper.fromJson(json, ProcessRequest::class.java)
    }

    @Test
    fun `processrequest-example-poll-specific 276 Test`() {
        val json = File("./src/test/resources/model/sample_data/processrequest-example-poll-specific.json").readTextAndClose()
        val obj = mapper.fromJson(json, ProcessRequest::class.java)
        assertTrue(stringMatch("ProcessRequest", obj.resourceType))
        assertTrue(stringMatch("1111", obj.id))
        assertTrue(stringMatch("generated", obj.text!!.status))
        assertTrue(stringMatch("<div xmlns=\"http://www.w3.org", obj.text!!.div))
        assertTrue(stringMatch("http://happyvalley.com/proces", obj.identifier[0].system))
        assertTrue(stringMatch("111", obj.identifier[0].value))
        assertTrue(stringMatch("active", obj.status))
        assertTrue(stringMatch("poll", obj.action))
        assertTrue(stringMatch("http://ninsurers.org/payorid", obj.target!!.identifier!!.system))
        assertTrue(stringMatch("WI12345", obj.target!!.identifier!!.value))
        assertEquals("2014-08-16", obj.created.toString())
        assertTrue(stringMatch("http://npid.org/providerid", obj.provider!!.identifier!!.system))
        assertTrue(stringMatch("AF12345", obj.provider!!.identifier!!.value))
        assertTrue(stringMatch("Organization/1", obj.organization!!.reference))
        assertTrue(stringMatch("http://benefitco.com/oralheal", obj.request!!.reference))
    }

    @Test
    fun `processrequest-example-poll-inclusive 277 Test`() {
        val json = File("./src/test/resources/model/sample_data/processrequest-example-poll-inclusive.json").readTextAndClose()
        val obj = mapper.fromJson(json, ProcessRequest::class.java)
        assertTrue(stringMatch("ProcessRequest", obj.resourceType))
        assertTrue(stringMatch("1112", obj.id))
        assertTrue(stringMatch("generated", obj.text!!.status))
        assertTrue(stringMatch("<div xmlns=\"http://www.w3.org", obj.text!!.div))
        assertTrue(stringMatch("http://happyvalley.com/proces", obj.identifier[0].system))
        assertTrue(stringMatch("112", obj.identifier[0].value))
        assertTrue(stringMatch("active", obj.status))
        assertTrue(stringMatch("poll", obj.action))
        assertEquals("2014-08-16", obj.created.toString())
        assertTrue(stringMatch("Organization/1", obj.organization!!.reference))
        assertTrue(stringMatch("PaymentReconciliation", obj.include[0]))
    }

    @Test
    fun `processrequest-example-poll-payrec 278 Test`() {
        val json = File("./src/test/resources/model/sample_data/processrequest-example-poll-payrec.json").readTextAndClose()
        val obj = mapper.fromJson(json, ProcessRequest::class.java)
        assertTrue(stringMatch("ProcessRequest", obj.resourceType))
        assertTrue(stringMatch("1114", obj.id))
        assertTrue(stringMatch("generated", obj.text!!.status))
        assertTrue(stringMatch("<div xmlns=\"http://www.w3.org", obj.text!!.div))
        assertTrue(stringMatch("http://happyvalley.com/proces", obj.identifier[0].system))
        assertTrue(stringMatch("114", obj.identifier[0].value))
        assertTrue(stringMatch("active", obj.status))
        assertTrue(stringMatch("poll", obj.action))
        assertEquals("2014-08-16", obj.created.toString())
        assertTrue(stringMatch("Organization/1", obj.organization!!.reference))
        assertTrue(stringMatch("PaymentReconciliation", obj.include[0]))
        assertEquals("2014-08-10", obj.period!!.start.toString())
        assertEquals("2014-08-20", obj.period!!.end.toString())
    }

    @Test
    fun `processrequest-example 279 Test`() {
        val json = File("./src/test/resources/model/sample_data/processrequest-example.json").readTextAndClose()
        val obj = mapper.fromJson(json, ProcessRequest::class.java)
        assertTrue(stringMatch("ProcessRequest", obj.resourceType))
        assertTrue(stringMatch("1110", obj.id))
        assertTrue(stringMatch("generated", obj.text!!.status))
        assertTrue(stringMatch("<div xmlns=\"http://www.w3.org", obj.text!!.div))
        assertTrue(stringMatch("http://happyvalley.com/proces", obj.identifier[0].system))
        assertTrue(stringMatch("110", obj.identifier[0].value))
        assertTrue(stringMatch("active", obj.status))
        assertTrue(stringMatch("poll", obj.action))
        assertEquals("2014-08-16", obj.created.toString())
        assertTrue(stringMatch("Organization/1", obj.organization!!.reference))
    }

    @Test
    fun `processrequest-example-reverse 280 Test`() {
        val json = File("./src/test/resources/model/sample_data/processrequest-example-reverse.json").readTextAndClose()
        val obj = mapper.fromJson(json, ProcessRequest::class.java)
        assertTrue(stringMatch("ProcessRequest", obj.resourceType))
        assertTrue(stringMatch("87654", obj.id))
        assertTrue(stringMatch("generated", obj.text!!.status))
        assertTrue(stringMatch("<div xmlns=\"http://www.w3.org", obj.text!!.div))
        assertTrue(stringMatch("http://happyvalley.com/proces", obj.identifier[0].system))
        assertTrue(stringMatch("76543", obj.identifier[0].value))
        assertTrue(stringMatch("active", obj.status))
        assertTrue(stringMatch("cancel", obj.action))
        assertEquals("2014-08-16", obj.created.toString())
        assertTrue(stringMatch("Organization/1", obj.organization!!.reference))
        assertTrue(stringMatch("http://BenefitsInc.com/fhir/c", obj.request!!.reference))
        assertEquals(false, if (obj.nullify != null) obj.nullify else false, "Field: obj.nullify")
    }

    @Test
    fun `processrequest-example-reprocess 281 Test`() {
        val json = File("./src/test/resources/model/sample_data/processrequest-example-reprocess.json").readTextAndClose()
        val obj = mapper.fromJson(json, ProcessRequest::class.java)
        assertTrue(stringMatch("ProcessRequest", obj.resourceType))
        assertTrue(stringMatch("44654", obj.id))
        assertTrue(stringMatch("generated", obj.text!!.status))
        assertTrue(stringMatch("<div xmlns=\"http://www.w3.org", obj.text!!.div))
        assertTrue(stringMatch("http://happyvalley.com/proces", obj.identifier[0].system))
        assertTrue(stringMatch("44543", obj.identifier[0].value))
        assertTrue(stringMatch("active", obj.status))
        assertTrue(stringMatch("reprocess", obj.action))
        assertEquals("2014-08-16", obj.created.toString())
        assertTrue(stringMatch("Organization/1", obj.organization!!.reference))
    }

    @Test
    fun `processrequest-example-reprocess 282 Test`() {
        val json = File("./src/test/resources/model/sample_data/processrequest-example-reprocess.json").readTextAndClose()
        val obj = mapper.fromJson(json, ProcessRequest::class.java)
        assertTrue(stringMatch("http://BenefitsInc.com/fhir/c", obj.request!!.reference))
        assertTrue(stringMatch("ABC12345G", obj.reference))
        assertEquals(1, obj.item[0].sequenceLinkId)
    }

    @Test
    fun `processrequest-example-status 283 Test`() {
        val json = File("./src/test/resources/model/sample_data/processrequest-example-status.json").readTextAndClose()
        val obj = mapper.fromJson(json, ProcessRequest::class.java)
        assertTrue(stringMatch("ProcessRequest", obj.resourceType))
        assertTrue(stringMatch("87655", obj.id))
        assertTrue(stringMatch("generated", obj.text!!.status))
        assertTrue(stringMatch("<div xmlns=\"http://www.w3.org", obj.text!!.div))
        assertTrue(stringMatch("http://happyvalley.com/proces", obj.identifier[0].system))
        assertTrue(stringMatch("1776543", obj.identifier[0].value))
        assertTrue(stringMatch("active", obj.status))
        assertTrue(stringMatch("status", obj.action))
        assertEquals("2014-08-16", obj.created.toString())
        assertTrue(stringMatch("Organization/1", obj.organization!!.reference))
        assertTrue(stringMatch("http://happyvalley.com/claim/", obj.request!!.reference))
        assertTrue(stringMatch("http://BenefitsInc.com/fhir/c", obj.response!!.reference))
    }
}
