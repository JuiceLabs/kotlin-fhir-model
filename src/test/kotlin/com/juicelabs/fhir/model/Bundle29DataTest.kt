package com.juicelabs.fhir.model

import java.io.File
import kotlin.test.assertEquals
import kotlin.test.assertTrue
import org.junit.jupiter.api.Test

class Bundle29DataTest : DataTests() {
    @Test
    fun `document-example-dischargesummary 396 Test`() {
        val json = File("./src/test/resources/model/sample_data/document-example-dischargesummary.json").readTextAndClose()
        val obj = mapper.fromJson(json, Bundle::class.java)
        assertTrue(stringMatch("http://fhir.healthintersectio", (obj.entry[0].resource!! as Composition).encounter!!.reference))
        assertEquals("2013-02-01T12:30:02Z", (obj.entry[0].resource!! as Composition).date.toString())
        assertTrue(stringMatch("Practitioner/example", (obj.entry[0].resource!! as Composition).author[0].reference))
        assertTrue(stringMatch("Doctor Dave", (obj.entry[0].resource!! as Composition).author[0].display))
        assertTrue(stringMatch("Discharge Summary", (obj.entry[0].resource!! as Composition).title))
        assertTrue(stringMatch("N", (obj.entry[0].resource!! as Composition).confidentiality))
        assertTrue(stringMatch("Reason for admission", (obj.entry[0].resource!! as Composition).section[0].title))
        assertTrue(stringMatch("http://loinc.org", (obj.entry[0].resource!! as Composition).section[0].code!!.coding[0].system))
        assertTrue(stringMatch("29299-5", (obj.entry[0].resource!! as Composition).section[0].code!!.coding[0].code))
        assertTrue(stringMatch("Reason for visit Narrative", (obj.entry[0].resource!! as Composition).section[0].code!!.coding[0].display))
        assertTrue(stringMatch("additional", (obj.entry[0].resource!! as Composition).section[0].text!!.status))
        assertTrue(stringMatch("<div xmlns=\"http://www.w3.org", (obj.entry[0].resource!! as Composition).section[0].text!!.div))
        assertTrue(stringMatch("urn:uuid:541a72a8-df75-4484-a", (obj.entry[0].resource!! as Composition).section[0].entry[0].reference))
        assertTrue(stringMatch("Medications on Discharge", (obj.entry[0].resource!! as Composition).section[1].title))
        assertTrue(stringMatch("http://loinc.org", (obj.entry[0].resource!! as Composition).section[1].code!!.coding[0].system))
        assertTrue(stringMatch("10183-2", (obj.entry[0].resource!! as Composition).section[1].code!!.coding[0].code))
        assertTrue(stringMatch("Hospital discharge medication", (obj.entry[0].resource!! as Composition).section[1].code!!.coding[0].display))
        assertTrue(stringMatch("additional", (obj.entry[0].resource!! as Composition).section[1].text!!.status))
        assertTrue(stringMatch("<div xmlns=\"http://www.w3.org", (obj.entry[0].resource!! as Composition).section[1].text!!.div))
        assertTrue(stringMatch("working", (obj.entry[0].resource!! as Composition).section[1].mode))
        assertTrue(stringMatch("urn:uuid:124a6916-5d84-4b8c-b", (obj.entry[0].resource!! as Composition).section[1].entry[0].reference))
        assertTrue(stringMatch("urn:uuid:673f8db5-0ffd-4395-9", (obj.entry[0].resource!! as Composition).section[1].entry[1].reference))
        assertTrue(stringMatch("Known allergies", (obj.entry[0].resource!! as Composition).section[2].title))
        assertTrue(stringMatch("http://loinc.org", (obj.entry[0].resource!! as Composition).section[2].code!!.coding[0].system))
        assertTrue(stringMatch("48765-2", (obj.entry[0].resource!! as Composition).section[2].code!!.coding[0].code))
        assertTrue(stringMatch("Allergies and adverse reactio", (obj.entry[0].resource!! as Composition).section[2].code!!.coding[0].display))
        assertTrue(stringMatch("additional", (obj.entry[0].resource!! as Composition).section[2].text!!.status))
        assertTrue(stringMatch("<div xmlns=\"http://www.w3.org", (obj.entry[0].resource!! as Composition).section[2].text!!.div))
        assertTrue(stringMatch("urn:uuid:47600e0f-b6b5-4308-8", (obj.entry[0].resource!! as Composition).section[2].entry[0].reference))
        assertTrue(stringMatch("http://fhir.healthintersectio", obj.entry[1].fullUrl))
        assertTrue(stringMatch("Practitioner", (obj.entry[1].resource!! as Practitioner).resourceType))
        assertTrue(stringMatch("example", (obj.entry[1].resource!! as Practitioner).id))
        assertEquals("2013-05-05T16:13:03Z", (obj.entry[1].resource!! as Practitioner).meta!!.lastUpdated.toString())
        assertTrue(stringMatch("generated", (obj.entry[1].resource!! as Practitioner).text!!.status))
        assertTrue(stringMatch("<div xmlns=\"http://www.w3.org", (obj.entry[1].resource!! as Practitioner).text!!.div))
        assertTrue(stringMatch("http://www.acme.org/practitio", (obj.entry[1].resource!! as Practitioner).identifier[0].system))
        assertTrue(stringMatch("23", (obj.entry[1].resource!! as Practitioner).identifier[0].value))
        assertTrue(stringMatch("Careful", (obj.entry[1].resource!! as Practitioner).name[0].family))
        assertTrue(stringMatch("Adam", (obj.entry[1].resource!! as Practitioner).name[0].given[0]))
        assertTrue(stringMatch("Dr", (obj.entry[1].resource!! as Practitioner).name[0].prefix[0]))
        assertTrue(stringMatch("http://fhir.healthintersectio", obj.entry[2].fullUrl))
        assertTrue(stringMatch("Patient", (obj.entry[2].resource!! as Patient).resourceType))
        assertTrue(stringMatch("d1", (obj.entry[2].resource!! as Patient).id))
        assertTrue(stringMatch("generated", (obj.entry[2].resource!! as Patient).text!!.status))
        assertTrue(stringMatch("<div xmlns=\"http://www.w3.org", (obj.entry[2].resource!! as Patient).text!!.div))
        assertEquals(true, if ((obj.entry[2].resource!! as Patient).active != null) (obj.entry[2].resource!! as Patient).active else false, "Field: (obj.entry[2].resource!! as Patient).active")
        assertTrue(stringMatch("Eve Everywoman", (obj.entry[2].resource!! as Patient).name[0].text))
        assertTrue(stringMatch("Everywoman1", (obj.entry[2].resource!! as Patient).name[0].family))
        assertTrue(stringMatch("Eve", (obj.entry[2].resource!! as Patient).name[0].given[0]))
        assertTrue(stringMatch("phone", (obj.entry[2].resource!! as Patient).telecom[0].system))
        assertTrue(stringMatch("555-555-2003", (obj.entry[2].resource!! as Patient).telecom[0].value))
        assertTrue(stringMatch("work", (obj.entry[2].resource!! as Patient).telecom[0].use))
        assertTrue(stringMatch("female", (obj.entry[2].resource!! as Patient).gender))
        assertEquals("1955-01-06", (obj.entry[2].resource!! as Patient).birthDate.toString())
        assertTrue(stringMatch("home", (obj.entry[2].resource!! as Patient).address[0].use))
        assertTrue(stringMatch("2222 Home Street", (obj.entry[2].resource!! as Patient).address[0].line[0]))
        assertTrue(stringMatch("http://fhir.healthintersectio", obj.entry[3].fullUrl))
        assertTrue(stringMatch("Encounter", (obj.entry[3].resource!! as Encounter).resourceType))
        assertTrue(stringMatch("doc-example", (obj.entry[3].resource!! as Encounter).id))
        assertEquals("2013-05-05T16:13:03Z", (obj.entry[3].resource!! as Encounter).meta!!.lastUpdated.toString())
        assertTrue(stringMatch("generated", (obj.entry[3].resource!! as Encounter).text!!.status))
        assertTrue(stringMatch("<div xmlns=\"http://www.w3.org", (obj.entry[3].resource!! as Encounter).text!!.div))
        assertTrue(stringMatch("S100", (obj.entry[3].resource!! as Encounter).identifier[0].value))
        assertTrue(stringMatch("finished", (obj.entry[3].resource!! as Encounter).status))
        assertTrue(stringMatch("http://hl7.org/fhir/v3/ActCod", (obj.entry[3].resource!! as Encounter).class_fhir!!.system))
        assertTrue(stringMatch("IMP", (obj.entry[3].resource!! as Encounter).class_fhir!!.code))
        assertTrue(stringMatch("inpatient encounter", (obj.entry[3].resource!! as Encounter).class_fhir!!.display))
        assertTrue(stringMatch("Orthopedic Admission", (obj.entry[3].resource!! as Encounter).type[0].text))
        assertTrue(stringMatch("Patient/d1", (obj.entry[3].resource!! as Encounter).subject!!.reference))
        assertEquals("2013-01-20T12:30:02Z", (obj.entry[3].resource!! as Encounter).period!!.start.toString())
        assertEquals("2013-02-01T12:30:02Z", (obj.entry[3].resource!! as Encounter).period!!.end.toString())
    }
}
