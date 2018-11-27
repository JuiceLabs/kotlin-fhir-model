package com.juicelabs.fhir.model

import java.io.File
import kotlin.test.assertEquals
import kotlin.test.assertTrue
import org.junit.jupiter.api.Test

class Bundle31DataTest : DataTests() {
    @Test
    fun `document-example-dischargesummary 398 Test`() {
        val json = File("./src/test/resources/model/sample_data/document-example-dischargesummary.json").readTextAndClose()
        val obj = mapper.fromJson(json, Bundle::class.java)
        assertEquals("2015-08-31T07:42:33+10:00", obj.signature!!.when_fhir.toString())
        assertTrue(stringMatch("Device/software", obj.signature!!.whoReference.reference))
        assertTrue(stringMatch("Organization/example", obj.signature!!.onBehalfOfReference!!.reference))
        assertTrue(stringMatch("image/jpg", obj.signature!!.contentType))
        assertTrue(stringMatch("/9j/4AAQSkZJRgABAQAAAQABAAD/2", obj.signature!!.blob))
    }

    @Test
    fun `location-examples-general 399 Test`() {
        val json = File("./src/test/resources/model/sample_data/location-examples-general.json").readTextAndClose()
        val obj = mapper.fromJson(json, Bundle::class.java)
        assertTrue(stringMatch("Bundle", obj.resourceType))
        assertTrue(stringMatch("3ad0687e-f477-468c-afd5-fcc2b", obj.id))
        assertTrue(stringMatch("collection", obj.type))
        assertTrue(stringMatch("http://hl7.org/fhir/Location/", obj.entry[0].fullUrl))
        assertTrue(stringMatch("Location", (obj.entry[0].resource!! as Location).resourceType))
        assertTrue(stringMatch("2", (obj.entry[0].resource!! as Location).id))
        assertTrue(stringMatch("generated", (obj.entry[0].resource!! as Location).text!!.status))
        assertTrue(stringMatch("<div xmlns=\"http://www.w3.org", (obj.entry[0].resource!! as Location).text!!.div))
        assertTrue(stringMatch("active", (obj.entry[0].resource!! as Location).status))
        assertTrue(stringMatch("USSS Enterprise-D", (obj.entry[0].resource!! as Location).name))
        assertTrue(stringMatch("instance", (obj.entry[0].resource!! as Location).mode))
        assertTrue(stringMatch("http://hl7.org/fhir/Location/", obj.entry[1].fullUrl))
        assertTrue(stringMatch("Location", (obj.entry[1].resource!! as Location).resourceType))
        assertTrue(stringMatch("3", (obj.entry[1].resource!! as Location).id))
        assertTrue(stringMatch("generated", (obj.entry[1].resource!! as Location).text!!.status))
        assertTrue(stringMatch("<div xmlns=\"http://www.w3.org", (obj.entry[1].resource!! as Location).text!!.div))
        assertTrue(stringMatch("active", (obj.entry[1].resource!! as Location).status))
        assertTrue(stringMatch("USSS Enterprise-D Sickbay", (obj.entry[1].resource!! as Location).name))
        assertTrue(stringMatch("instance", (obj.entry[1].resource!! as Location).mode))
        assertTrue(stringMatch("Location/2", (obj.entry[1].resource!! as Location).partOf!!.reference))
        assertTrue(stringMatch("USS Enterprise", (obj.entry[1].resource!! as Location).partOf!!.display))
    }

    @Test
    fun `questionnaire-profile-example-ussg-fht 400 Test`() {
        val json = File("./src/test/resources/model/sample_data/questionnaire-profile-example-ussg-fht.json").readTextAndClose()
        val obj = mapper.fromJson(json, Bundle::class.java)
        assertTrue(stringMatch("Bundle", obj.resourceType))
        assertTrue(stringMatch("ussg-fht", obj.id))
        assertTrue(stringMatch("transaction", obj.type))
        assertTrue(stringMatch("http://hl7.org/fhir/us/sdc/Co", obj.entry[0].fullUrl))
        assertTrue(stringMatch("ConceptMap", (obj.entry[0].resource!! as ConceptMap).resourceType))
        assertTrue(stringMatch("ussgfht-loincde", (obj.entry[0].resource!! as ConceptMap).id))
        assertTrue(stringMatch("generated", (obj.entry[0].resource!! as ConceptMap).text!!.status))
        assertTrue(stringMatch("<div xmlns=\"http://www.w3.org", (obj.entry[0].resource!! as ConceptMap).text!!.div))
        assertTrue(stringMatch("active", (obj.entry[0].resource!! as ConceptMap).status))
        assertTrue(stringMatch("http://hl7.org/fhir/us/sdc/Qu", (obj.entry[0].resource!! as ConceptMap).sourceUri))
        assertTrue(stringMatch("http://hl7.org/fhir/us/sdc/Da", (obj.entry[0].resource!! as ConceptMap).targetUri))
        assertTrue(stringMatch("http://hl7.org/fhir", (obj.entry[0].resource!! as ConceptMap).group[0].source))
        assertTrue(stringMatch("http://loinc.org", (obj.entry[0].resource!! as ConceptMap).group[0].target))
        assertTrue(stringMatch("1.1.1", (obj.entry[0].resource!! as ConceptMap).group[0].element[0].code))
        assertTrue(stringMatch("54125-0", (obj.entry[0].resource!! as ConceptMap).group[0].element[0].target[0].code))
        assertTrue(stringMatch("1.1.2", (obj.entry[0].resource!! as ConceptMap).group[0].element[1].code))
        assertTrue(stringMatch("54131-8", (obj.entry[0].resource!! as ConceptMap).group[0].element[1].target[0].code))
        assertTrue(stringMatch("1.1.3", (obj.entry[0].resource!! as ConceptMap).group[0].element[2].code))
        assertTrue(stringMatch("21112-8", (obj.entry[0].resource!! as ConceptMap).group[0].element[2].target[0].code))
        assertTrue(stringMatch("1.1.4", (obj.entry[0].resource!! as ConceptMap).group[0].element[3].code))
        assertTrue(stringMatch("54132-6", (obj.entry[0].resource!! as ConceptMap).group[0].element[3].target[0].code))
        assertTrue(stringMatch("1.1.5", (obj.entry[0].resource!! as ConceptMap).group[0].element[4].code))
        assertTrue(stringMatch("54128-4", (obj.entry[0].resource!! as ConceptMap).group[0].element[4].target[0].code))
        assertTrue(stringMatch("1.1.6", (obj.entry[0].resource!! as ConceptMap).group[0].element[5].code))
        assertTrue(stringMatch("54135-9", (obj.entry[0].resource!! as ConceptMap).group[0].element[5].target[0].code))
        assertTrue(stringMatch("1.1.7", (obj.entry[0].resource!! as ConceptMap).group[0].element[6].code))
        assertTrue(stringMatch("8302-2", (obj.entry[0].resource!! as ConceptMap).group[0].element[6].target[0].code))
        assertTrue(stringMatch("1.1.8", (obj.entry[0].resource!! as ConceptMap).group[0].element[7].code))
        assertTrue(stringMatch("29463-7", (obj.entry[0].resource!! as ConceptMap).group[0].element[7].target[0].code))
        assertTrue(stringMatch("1.1.10", (obj.entry[0].resource!! as ConceptMap).group[0].element[8].code))
        assertTrue(stringMatch("54134-2", (obj.entry[0].resource!! as ConceptMap).group[0].element[8].target[0].code))
        assertTrue(stringMatch("1.1.11", (obj.entry[0].resource!! as ConceptMap).group[0].element[9].code))
        assertTrue(stringMatch("54133-4", (obj.entry[0].resource!! as ConceptMap).group[0].element[9].target[0].code))
        assertTrue(stringMatch("1.2.1", (obj.entry[0].resource!! as ConceptMap).group[0].element[10].code))
        assertTrue(stringMatch("54140-9", (obj.entry[0].resource!! as ConceptMap).group[0].element[10].target[0].code))
        assertTrue(stringMatch("1.2.2", (obj.entry[0].resource!! as ConceptMap).group[0].element[11].code))
        assertTrue(stringMatch("54130-0", (obj.entry[0].resource!! as ConceptMap).group[0].element[11].target[0].code))
        assertTrue(stringMatch("2.1.1.1", (obj.entry[0].resource!! as ConceptMap).group[0].element[12].code))
        assertTrue(stringMatch("54136-7", (obj.entry[0].resource!! as ConceptMap).group[0].element[12].target[0].code))
        assertTrue(stringMatch("2.1.1.2", (obj.entry[0].resource!! as ConceptMap).group[0].element[13].code))
        assertTrue(stringMatch("54138-3", (obj.entry[0].resource!! as ConceptMap).group[0].element[13].target[0].code))
        assertTrue(stringMatch("2.1.1.3", (obj.entry[0].resource!! as ConceptMap).group[0].element[14].code))
        assertTrue(stringMatch("54123-5", (obj.entry[0].resource!! as ConceptMap).group[0].element[14].target[0].code))
        assertTrue(stringMatch("2.1.1.4", (obj.entry[0].resource!! as ConceptMap).group[0].element[15].code))
        assertTrue(stringMatch("54139-1", (obj.entry[0].resource!! as ConceptMap).group[0].element[15].target[0].code))
    }
}
