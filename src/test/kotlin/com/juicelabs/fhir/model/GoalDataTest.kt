package com.juicelabs.fhir.model

import java.io.File
import kotlin.test.assertEquals
import kotlin.test.assertTrue
import org.junit.jupiter.api.Test

class GoalDataTest : DataTests() {
    @Test
    fun `goal-example 183 Test`() {
        val json = File("./src/test/resources/model/sample_data/goal-example.json").readTextAndClose()
        val obj = mapper.fromJson(json, Goal::class.java)
        assertTrue(stringMatch("Goal", obj.resourceType))
        assertTrue(stringMatch("example", obj.id))
        assertTrue(stringMatch("additional", obj.text!!.status))
        assertTrue(stringMatch("<div xmlns=\"http://www.w3.org", obj.text!!.div))
        assertTrue(stringMatch("123", obj.identifier[0].value))
        assertTrue(stringMatch("on-hold", obj.status))
        assertTrue(stringMatch("http://hl7.org/fhir/goal-cate", obj.category[0].coding[0].system))
        assertTrue(stringMatch("dietary", obj.category[0].coding[0].code))
        assertTrue(stringMatch("http://hl7.org/fhir/goal-prio", obj.priority!!.coding[0].system))
        assertTrue(stringMatch("high-priority", obj.priority!!.coding[0].code))
        assertTrue(stringMatch("High Priority", obj.priority!!.coding[0].display))
        assertTrue(stringMatch("high", obj.priority!!.text))
        assertTrue(stringMatch("Target weight is 160 to 180 l", obj.description.text))
        assertTrue(stringMatch("Patient/example", obj.subject!!.reference))
        assertTrue(stringMatch("Peter James Chalmers", obj.subject!!.display))
        assertEquals("2015-04-05", obj.startDate.toString())
        assertTrue(stringMatch("http://loinc.org", obj.target!!.measure!!.coding[0].system))
        assertTrue(stringMatch("3141-9", obj.target!!.measure!!.coding[0].code))
        assertTrue(stringMatch("Weight Measured", obj.target!!.measure!!.coding[0].display))
        assertTrue(stringMatch("%.2f".format(160f), "%.2f".format(obj.target!!.detailRange!!.low!!.value)))
        assertTrue(stringMatch("lbs", obj.target!!.detailRange!!.low!!.unit))
        assertTrue(stringMatch("http://unitsofmeasure.org", obj.target!!.detailRange!!.low!!.system))
        assertTrue(stringMatch("[lb_av]", obj.target!!.detailRange!!.low!!.code))
        assertTrue(stringMatch("%.2f".format(180f), "%.2f".format(obj.target!!.detailRange!!.high!!.value)))
        assertTrue(stringMatch("lbs", obj.target!!.detailRange!!.high!!.unit))
        assertTrue(stringMatch("http://unitsofmeasure.org", obj.target!!.detailRange!!.high!!.system))
        assertTrue(stringMatch("[lb_av]", obj.target!!.detailRange!!.high!!.code))
        assertEquals("2016-04-05", obj.target!!.dueDate.toString())
        assertEquals("2016-02-14", obj.statusDate.toString())
        assertTrue(stringMatch("Patient wants to defer weight", obj.statusReason))
        assertTrue(stringMatch("Patient/example", obj.expressedBy!!.reference))
        assertTrue(stringMatch("Peter James Chalmers", obj.expressedBy!!.display))
        assertTrue(stringMatch("obesity condition", obj.addresses[0].display))
        assertTrue(stringMatch("Observation/example", obj.outcomeReference[0].reference))
        assertTrue(stringMatch("Body Weight Measured", obj.outcomeReference[0].display))
    }

    @Test
    fun `goal-example-stop-smoking 184 Test`() {
        val json = File("./src/test/resources/model/sample_data/goal-example-stop-smoking.json").readTextAndClose()
        val obj = mapper.fromJson(json, Goal::class.java)
        assertTrue(stringMatch("Goal", obj.resourceType))
        assertTrue(stringMatch("stop-smoking", obj.id))
        assertTrue(stringMatch("additional", obj.text!!.status))
        assertTrue(stringMatch("<div xmlns=\"http://www.w3.org", obj.text!!.div))
        assertTrue(stringMatch("123", obj.identifier[0].value))
    }

    @Test
    fun `goal-example-stop-smoking 185 Test`() {
        val json = File("./src/test/resources/model/sample_data/goal-example-stop-smoking.json").readTextAndClose()
        val obj = mapper.fromJson(json, Goal::class.java)
        assertTrue(stringMatch("achieved", obj.status))
        assertTrue(stringMatch("Stop smoking", obj.description.text))
        assertTrue(stringMatch("Patient/example", obj.subject!!.reference))
        assertTrue(stringMatch("Peter James Chalmers", obj.subject!!.display))
        assertEquals("2015-04-05", obj.startDate.toString())
        assertTrue(stringMatch("http://snomed.info/sct", obj.outcomeCode[0].coding[0].system))
        assertTrue(stringMatch("8517006", obj.outcomeCode[0].coding[0].code))
        assertTrue(stringMatch("Ex-smoker (finding)", obj.outcomeCode[0].coding[0].display))
        assertTrue(stringMatch("Former smoker", obj.outcomeCode[0].text))
    }
}
