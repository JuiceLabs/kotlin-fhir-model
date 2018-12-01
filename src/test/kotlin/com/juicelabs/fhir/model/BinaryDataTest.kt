package com.juicelabs.fhir.model

import java.io.File
import kotlin.test.assertTrue
import org.junit.jupiter.api.Test

class BinaryDataTest : DataTests() {
    @Test
    fun `binary-example 425 Test`() {
        val json = File("./src/test/resources/model/sample_data/binary-example.json").readTextAndClose()
        val obj = mapper.fromJson(json, Binary::class.java)
        assertTrue(stringMatch("Binary", obj.resourceType))
        assertTrue(stringMatch("example", obj.id))
        assertTrue(stringMatch("application/pdf", obj.contentType))
        assertTrue(stringMatch("DocumentReference/example", obj.securityContext!!.reference))
        assertTrue(stringMatch("JVBERi0xLjUNJeLjz9MNCjEwIDAgb", obj.content))
    }

    fun `binary-example Init`(obj: Bundle) {
    }
}
