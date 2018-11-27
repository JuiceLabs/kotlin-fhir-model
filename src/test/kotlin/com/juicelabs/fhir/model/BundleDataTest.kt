package com.juicelabs.fhir.model

import java.io.File
import kotlin.test.assertEquals
import kotlin.test.assertTrue
import org.junit.jupiter.api.Test

class BundleDataTest : DataTests() {
    @Test
    fun `xds-example 363 Test`() {
        val json = File("./src/test/resources/model/sample_data/xds-example.json").readTextAndClose()
        val obj = mapper.fromJson(json, Bundle::class.java)
        assertTrue(stringMatch("Bundle", obj.resourceType))
        assertTrue(stringMatch("xds", obj.id))
        assertEquals("2013-07-01T13:11:33Z", obj.meta!!.lastUpdated.toString())
        assertTrue(stringMatch("transaction", obj.type))
        assertTrue(stringMatch("urn:uuid:3fdc72f4-a11d-4a9d-9", obj.entry[0].fullUrl))
        assertTrue(stringMatch("DocumentReference", (obj.entry[0].resource!! as DocumentReference).resourceType))
        assertEquals("2013-07-01T13:11:33Z", (obj.entry[0].resource!! as DocumentReference).meta!!.lastUpdated.toString())
        assertTrue(stringMatch("generated", (obj.entry[0].resource!! as DocumentReference).text!!.status))
        assertTrue(stringMatch("<div xmlns=\"http://www.w3.org", (obj.entry[0].resource!! as DocumentReference).text!!.div))
        assertTrue(stringMatch("urn:ietf:rfc:3986", (obj.entry[0].resource!! as DocumentReference).masterIdentifier!!.system))
        assertTrue(stringMatch("urn:oid:129.6.58.92.88336", (obj.entry[0].resource!! as DocumentReference).masterIdentifier!!.value))
        assertTrue(stringMatch("current", (obj.entry[0].resource!! as DocumentReference).status))
        assertTrue(stringMatch("http://ihe.net/connectathon/c", (obj.entry[0].resource!! as DocumentReference).type.coding[0].system))
        assertTrue(stringMatch("History and Physical", (obj.entry[0].resource!! as DocumentReference).type.coding[0].code))
        assertTrue(stringMatch("History and Physical", (obj.entry[0].resource!! as DocumentReference).type.coding[0].display))
        assertTrue(stringMatch("http://loinc.org", (obj.entry[0].resource!! as DocumentReference).class_fhir!!.coding[0].system))
        assertTrue(stringMatch("47039-3", (obj.entry[0].resource!! as DocumentReference).class_fhir!!.coding[0].code))
        assertTrue(stringMatch("Inpatient Admission history a", (obj.entry[0].resource!! as DocumentReference).class_fhir!!.coding[0].display))
        assertTrue(stringMatch("Patient/a2", (obj.entry[0].resource!! as DocumentReference).subject!!.reference))
        assertEquals("2005-12-24", (obj.entry[0].resource!! as DocumentReference).created.toString())
        assertEquals("2013-07-01T23:11:33+10:00", (obj.entry[0].resource!! as DocumentReference).indexed.toString())
        assertTrue(stringMatch("Practitioner/a3", (obj.entry[0].resource!! as DocumentReference).author[0].reference))
        assertTrue(stringMatch("Practitioner/a4", (obj.entry[0].resource!! as DocumentReference).author[1].reference))
        assertTrue(stringMatch("Physical", (obj.entry[0].resource!! as DocumentReference).description))
        assertTrue(stringMatch("http://hl7.org/fhir/v3/Confid", (obj.entry[0].resource!! as DocumentReference).securityLabel[0].coding[0].system))
        assertTrue(stringMatch("N", (obj.entry[0].resource!! as DocumentReference).securityLabel[0].coding[0].code))
        assertTrue(stringMatch("normal", (obj.entry[0].resource!! as DocumentReference).securityLabel[0].coding[0].display))
        assertTrue(stringMatch("text/plain", (obj.entry[0].resource!! as DocumentReference).content[0].attachment.contentType))
        assertTrue(stringMatch("en-us", (obj.entry[0].resource!! as DocumentReference).content[0].attachment.language))
        assertTrue(stringMatch("http://localhost:9556/svc/fhi", (obj.entry[0].resource!! as DocumentReference).content[0].attachment.url))
        assertTrue(stringMatch("urn:oid:1.3.6.1.4.1.19376.1.2", (obj.entry[0].resource!! as DocumentReference).content[0].format!!.system))
        assertTrue(stringMatch("urn:ihe:pcc:handp:2008", (obj.entry[0].resource!! as DocumentReference).content[0].format!!.code))
        assertEquals("2004-12-23T08:00:00+10:00", (obj.entry[0].resource!! as DocumentReference).context!!.period!!.start.toString())
        assertEquals("2004-12-23T08:01:00+10:00", (obj.entry[0].resource!! as DocumentReference).context!!.period!!.end.toString())
        assertTrue(stringMatch("http://ihe.net/connectathon/p", (obj.entry[0].resource!! as DocumentReference).context!!.practiceSetting!!.coding[0].system))
        assertTrue(stringMatch("General Medicine", (obj.entry[0].resource!! as DocumentReference).context!!.practiceSetting!!.coding[0].code))
        assertTrue(stringMatch("General Medicine", (obj.entry[0].resource!! as DocumentReference).context!!.practiceSetting!!.coding[0].display))
        assertTrue(stringMatch("POST", obj.entry[0].request!!.method))
        assertTrue(stringMatch("DocumentReference", obj.entry[0].request!!.url))
        assertTrue(stringMatch("http://localhost:9556/svc/fhi", obj.entry[1].fullUrl))
    }
}
