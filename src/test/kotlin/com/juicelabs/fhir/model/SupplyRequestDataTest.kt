package com.juicelabs.fhir.model

import java.io.File
import kotlin.test.assertEquals
import kotlin.test.assertTrue
import org.junit.jupiter.api.Test

class SupplyRequestDataTest : DataTests() {
    @Test
    fun `supplyrequest-example-simpleorder 957 Test`() {
        val json = File("./src/test/resources/model/sample_data/supplyrequest-example-simpleorder.json").readTextAndClose()
        val obj = mapper.fromJson(json, SupplyRequest::class.java)
        assertTrue(stringMatch("SupplyRequest", obj.resourceType))
        assertTrue(stringMatch("simpleorder", obj.id))
        assertTrue(stringMatch("generated", obj.text!!.status))
        assertTrue(stringMatch("<div xmlns=\"http://www.w3.org", obj.text!!.div))
        assertTrue(stringMatch("Order10284", obj.identifier!!.value))
        assertTrue(stringMatch("active", obj.status))
        assertTrue(stringMatch("central", obj.category!!.coding[0].code))
        assertTrue(stringMatch("Central Stock Resupply", obj.category!!.coding[0].display))
        assertTrue(stringMatch("asap", obj.priority))
        assertTrue(stringMatch("%.2f".format(10f), "%.2f".format(obj.orderedItem!!.quantity.value)))
        assertTrue(stringMatch("BlueTubes", obj.orderedItem!!.itemCodeableConcept!!.coding[0].code))
        assertTrue(stringMatch("Blood collect tubes blue cap", obj.orderedItem!!.itemCodeableConcept!!.coding[0].display))
        assertEquals("2016-12-31", obj.occurrenceDateTime.toString())
        assertEquals("2016-12-31", obj.authoredOn.toString())
        assertTrue(stringMatch("Henry Seven", obj.requester!!.agent.display))
        assertTrue(stringMatch("Purchasing Dept", obj.requester!!.onBehalfOf!!.display))
        assertTrue(stringMatch("Vendor1", obj.supplier[0].display))
    }

    @Test
    fun `supplyrequest-example-simpleorder 958 Test`() {
        val json = File("./src/test/resources/model/sample_data/supplyrequest-example-simpleorder.json").readTextAndClose()
        val obj = mapper.fromJson(json, SupplyRequest::class.java)
        assertTrue(stringMatch("stock_low", obj.reasonCodeableConcept!!.coding[0].code))
        assertTrue(stringMatch("Refill due to low stock", obj.reasonCodeableConcept!!.coding[0].display))
        assertTrue(stringMatch("Location 1", obj.deliverFrom!!.display))
        assertTrue(stringMatch("GoodHealth Clinic Receiving", obj.deliverTo!!.display))
    }
}
