package com.juicelabs.fhir.model

import java.io.File
import kotlin.test.assertEquals
import kotlin.test.assertTrue
import org.junit.jupiter.api.Test

class Bundle44DataTest : DataTests() {
    @Test
    fun `questionnaire-profile-example-ussg-fht 413 Test`() {
        val json = File("./src/test/resources/model/sample_data/questionnaire-profile-example-ussg-fht.json").readTextAndClose()
        val obj = mapper.fromJson(json, Bundle::class.java)
        assertTrue(stringMatch("Neurological Disorders", (obj.entry[11].resource!! as ValueSet).compose!!.include[0].concept[47].display))
        assertTrue(stringMatch("LA10527-2", (obj.entry[11].resource!! as ValueSet).compose!!.include[0].concept[48].code))
        assertTrue(stringMatch("Osteoporosis", (obj.entry[11].resource!! as ValueSet).compose!!.include[0].concept[48].display))
        assertTrue(stringMatch("LA10535-5", (obj.entry[11].resource!! as ValueSet).compose!!.include[0].concept[49].code))
        assertTrue(stringMatch("Psychological Disorders", (obj.entry[11].resource!! as ValueSet).compose!!.include[0].concept[49].display))
        assertTrue(stringMatch("LA10574-4", (obj.entry[11].resource!! as ValueSet).compose!!.include[0].concept[50].code))
        assertTrue(stringMatch("-- Anxiety", (obj.entry[11].resource!! as ValueSet).compose!!.include[0].concept[50].display))
        assertTrue(stringMatch("LA10575-1", (obj.entry[11].resource!! as ValueSet).compose!!.include[0].concept[51].code))
        assertTrue(stringMatch("-- Bipolar/Manic Depressive D", (obj.entry[11].resource!! as ValueSet).compose!!.include[0].concept[51].display))
        assertTrue(stringMatch("LA10576-9", (obj.entry[11].resource!! as ValueSet).compose!!.include[0].concept[52].code))
        assertTrue(stringMatch("-- Depression", (obj.entry[11].resource!! as ValueSet).compose!!.include[0].concept[52].display))
        assertTrue(stringMatch("LA10577-7", (obj.entry[11].resource!! as ValueSet).compose!!.include[0].concept[53].code))
        assertTrue(stringMatch("-- Attention Deficit Hyper Ac", (obj.entry[11].resource!! as ValueSet).compose!!.include[0].concept[53].display))
        assertTrue(stringMatch("LA10578-5", (obj.entry[11].resource!! as ValueSet).compose!!.include[0].concept[54].code))
        assertTrue(stringMatch("-- Autism", (obj.entry[11].resource!! as ValueSet).compose!!.include[0].concept[54].display))
        assertTrue(stringMatch("LA10579-3", (obj.entry[11].resource!! as ValueSet).compose!!.include[0].concept[55].code))
        assertTrue(stringMatch("-- Personality Disorder", (obj.entry[11].resource!! as ValueSet).compose!!.include[0].concept[55].display))
        assertTrue(stringMatch("LA10580-1", (obj.entry[11].resource!! as ValueSet).compose!!.include[0].concept[56].code))
        assertTrue(stringMatch("-- Eating Disorder", (obj.entry[11].resource!! as ValueSet).compose!!.include[0].concept[56].display))
        assertTrue(stringMatch("LA10581-9", (obj.entry[11].resource!! as ValueSet).compose!!.include[0].concept[57].code))
        assertTrue(stringMatch("-- Obsessive Compulsive Disor", (obj.entry[11].resource!! as ValueSet).compose!!.include[0].concept[57].display))
        assertTrue(stringMatch("LA10582-7", (obj.entry[11].resource!! as ValueSet).compose!!.include[0].concept[58].code))
        assertTrue(stringMatch("-- Panic Disorder", (obj.entry[11].resource!! as ValueSet).compose!!.include[0].concept[58].display))
        assertTrue(stringMatch("LA10583-5", (obj.entry[11].resource!! as ValueSet).compose!!.include[0].concept[59].code))
        assertTrue(stringMatch("-- Post Traumatic Stress Diso", (obj.entry[11].resource!! as ValueSet).compose!!.include[0].concept[59].display))
        assertTrue(stringMatch("LA10584-3", (obj.entry[11].resource!! as ValueSet).compose!!.include[0].concept[60].code))
        assertTrue(stringMatch("-- Schizophrenia", (obj.entry[11].resource!! as ValueSet).compose!!.include[0].concept[60].display))
        assertTrue(stringMatch("LA10585-0", (obj.entry[11].resource!! as ValueSet).compose!!.include[0].concept[61].code))
        assertTrue(stringMatch("-- Social Phobia", (obj.entry[11].resource!! as ValueSet).compose!!.include[0].concept[61].display))
        assertTrue(stringMatch("LA10586-8", (obj.entry[11].resource!! as ValueSet).compose!!.include[0].concept[62].code))
        assertTrue(stringMatch("-- Dementia", (obj.entry[11].resource!! as ValueSet).compose!!.include[0].concept[62].display))
        assertTrue(stringMatch("LA10591-8", (obj.entry[11].resource!! as ValueSet).compose!!.include[0].concept[63].code))
        assertTrue(stringMatch("Septicemia", (obj.entry[11].resource!! as ValueSet).compose!!.include[0].concept[63].display))
        assertTrue(stringMatch("LA10522-3", (obj.entry[11].resource!! as ValueSet).compose!!.include[0].concept[64].code))
        assertTrue(stringMatch("Stroke/Brain Attack", (obj.entry[11].resource!! as ValueSet).compose!!.include[0].concept[64].display))
        assertTrue(stringMatch("LA10530-6", (obj.entry[11].resource!! as ValueSet).compose!!.include[0].concept[65].code))
        assertTrue(stringMatch("Sudden Infant Death Syndrome", (obj.entry[11].resource!! as ValueSet).compose!!.include[0].concept[65].display))
        assertTrue(stringMatch("LA10595-9", (obj.entry[11].resource!! as ValueSet).compose!!.include[0].concept[66].code))
        assertTrue(stringMatch("Cause of Death", (obj.entry[11].resource!! as ValueSet).compose!!.include[0].concept[66].display))
        assertTrue(stringMatch("LA10587-6", (obj.entry[11].resource!! as ValueSet).compose!!.include[0].concept[67].code))
        assertTrue(stringMatch("-- Suicide", (obj.entry[11].resource!! as ValueSet).compose!!.include[0].concept[67].display))
        assertTrue(stringMatch("LA10588-4", (obj.entry[11].resource!! as ValueSet).compose!!.include[0].concept[68].code))
        assertTrue(stringMatch("-- Accidental Death", (obj.entry[11].resource!! as ValueSet).compose!!.include[0].concept[68].display))
        assertTrue(stringMatch("LA10589-2", (obj.entry[11].resource!! as ValueSet).compose!!.include[0].concept[69].code))
        assertTrue(stringMatch("-- Other/Unexpected", (obj.entry[11].resource!! as ValueSet).compose!!.include[0].concept[69].display))
        assertTrue(stringMatch("PUT", obj.entry[11].request!!.method))
        assertTrue(stringMatch("http://hl7.org/fhir/us/sdc/Va", obj.entry[11].request!!.url))
    }

    @Test
    fun `endpoint-examples-general-template 414 Test`() {
        val json = File("./src/test/resources/model/sample_data/endpoint-examples-general-template.json").readTextAndClose()
        val obj = mapper.fromJson(json, Bundle::class.java)
        assertTrue(stringMatch("Bundle", obj.resourceType))
        assertTrue(stringMatch("b0a5e4277-83c4-4adb-87e2-e3ef", obj.id))
        assertEquals("2012-05-29T23:45:32Z", obj.meta!!.lastUpdated.toString())
        assertTrue(stringMatch("collection", obj.type))
        assertTrue(stringMatch("http://hl7.org/fhir/Endpoint/", obj.entry[0].fullUrl))
        assertTrue(stringMatch("Endpoint", (obj.entry[0].resource!! as Endpoint).resourceType))
        assertTrue(stringMatch("71", (obj.entry[0].resource!! as Endpoint).id))
        assertTrue(stringMatch("generated", (obj.entry[0].resource!! as Endpoint).text!!.status))
        assertTrue(stringMatch("<div xmlns=\"http://www.w3.org", (obj.entry[0].resource!! as Endpoint).text!!.div))
        assertTrue(stringMatch("active", (obj.entry[0].resource!! as Endpoint).status))
        assertTrue(stringMatch("http://hl7.org/fhir/endpoint-", (obj.entry[0].resource!! as Endpoint).connectionType.system))
        assertTrue(stringMatch("hl7-fhir-rest", (obj.entry[0].resource!! as Endpoint).connectionType.code))
        assertTrue(stringMatch("CarePlan repository", (obj.entry[0].resource!! as Endpoint).name))
        assertTrue(stringMatch("Telstra Health", (obj.entry[0].resource!! as Endpoint).managingOrganization!!.display))
        assertTrue(stringMatch("CarePlan", (obj.entry[0].resource!! as Endpoint).payloadType[0].coding[0].code))
        assertTrue(stringMatch("application/fhir+xml", (obj.entry[0].resource!! as Endpoint).payloadMimeType[0]))
        assertTrue(stringMatch("https://sqlonfhir-dstu2.azure", (obj.entry[0].resource!! as Endpoint).address))
        assertTrue(stringMatch("http://hl7.org/fhir/Endpoint/", obj.entry[1].fullUrl))
        assertTrue(stringMatch("Endpoint", (obj.entry[1].resource!! as Endpoint).resourceType))
        assertTrue(stringMatch("72", (obj.entry[1].resource!! as Endpoint).id))
        assertTrue(stringMatch("generated", (obj.entry[1].resource!! as Endpoint).text!!.status))
        assertTrue(stringMatch("<div xmlns=\"http://www.w3.org", (obj.entry[1].resource!! as Endpoint).text!!.div))
        assertTrue(stringMatch("active", (obj.entry[1].resource!! as Endpoint).status))
        assertTrue(stringMatch("http://hl7.org/fhir/endpoint-", (obj.entry[1].resource!! as Endpoint).connectionType.system))
    }
}