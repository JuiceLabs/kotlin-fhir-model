package com.juicelabs.fhir.model

import java.io.File
import kotlin.test.assertEquals
import kotlin.test.assertTrue
import org.junit.jupiter.api.Test

class Bundle32DataTest : DataTests() {
    @Test
    fun `questionnaire-profile-example-ussg-fht 401 Test`() {
        val json = File("./src/test/resources/model/sample_data/questionnaire-profile-example-ussg-fht.json").readTextAndClose()
        val obj = mapper.fromJson(json, Bundle::class.java)
        assertTrue(stringMatch("2.1.1.4.1.1", (obj.entry[0].resource!! as ConceptMap).group[0].element[16].code))
        assertTrue(stringMatch("54112-8", (obj.entry[0].resource!! as ConceptMap).group[0].element[16].target[0].code))
        assertTrue(stringMatch("2.1.1.4.1.2", (obj.entry[0].resource!! as ConceptMap).group[0].element[17].code))
        assertTrue(stringMatch("54113-6", (obj.entry[0].resource!! as ConceptMap).group[0].element[17].target[0].code))
        assertTrue(stringMatch("2.1.1.4.2.1", (obj.entry[0].resource!! as ConceptMap).group[0].element[18].code))
        assertTrue(stringMatch("54124-3", (obj.entry[0].resource!! as ConceptMap).group[0].element[18].target[0].code))
        assertTrue(stringMatch("2.1.1.4.2.2", (obj.entry[0].resource!! as ConceptMap).group[0].element[19].code))
        assertTrue(stringMatch("54141-7", (obj.entry[0].resource!! as ConceptMap).group[0].element[19].target[0].code))
        assertTrue(stringMatch("2.1.1.5", (obj.entry[0].resource!! as ConceptMap).group[0].element[20].code))
        assertTrue(stringMatch("54121-9", (obj.entry[0].resource!! as ConceptMap).group[0].element[20].target[0].code))
        assertTrue(stringMatch("2.1.1.6", (obj.entry[0].resource!! as ConceptMap).group[0].element[21].code))
        assertTrue(stringMatch("54122-7", (obj.entry[0].resource!! as ConceptMap).group[0].element[21].target[0].code))
        assertTrue(stringMatch("2.1.1.7", (obj.entry[0].resource!! as ConceptMap).group[0].element[22].code))
        assertTrue(stringMatch("54119-3", (obj.entry[0].resource!! as ConceptMap).group[0].element[22].target[0].code))
        assertTrue(stringMatch("2.1.1.8", (obj.entry[0].resource!! as ConceptMap).group[0].element[23].code))
        assertTrue(stringMatch("54120-1", (obj.entry[0].resource!! as ConceptMap).group[0].element[23].target[0].code))
        assertTrue(stringMatch("2.1.2.1", (obj.entry[0].resource!! as ConceptMap).group[0].element[24].code))
        assertTrue(stringMatch("54116-9", (obj.entry[0].resource!! as ConceptMap).group[0].element[24].target[0].code))
        assertTrue(stringMatch("2.1.2.2", (obj.entry[0].resource!! as ConceptMap).group[0].element[25].code))
        assertTrue(stringMatch("54115-1", (obj.entry[0].resource!! as ConceptMap).group[0].element[25].target[0].code))
        assertTrue(stringMatch("PUT", obj.entry[0].request!!.method))
        assertTrue(stringMatch("http://hl7.org/fhir/us/sdc/Co", obj.entry[0].request!!.url))
        assertTrue(stringMatch("http://hl7.org/fhir/us/sdc/Qu", obj.entry[1].fullUrl))
        assertTrue(stringMatch("Questionnaire", (obj.entry[1].resource!! as Questionnaire).resourceType))
        assertTrue(stringMatch("54127-6", (obj.entry[1].resource!! as Questionnaire).id))
        assertTrue(stringMatch("http://hl7.org/fhir/us/sdc/St", (obj.entry[1].resource!! as Questionnaire).meta!!.profile[0]))
        assertTrue(stringMatch("generated", (obj.entry[1].resource!! as Questionnaire).text!!.status))
        assertTrue(stringMatch("<div xmlns=\"http://www.w3.org", (obj.entry[1].resource!! as Questionnaire).text!!.div))
        assertTrue(stringMatch("ValueSet", ((obj.entry[1].resource!! as Questionnaire).contained[0] as ValueSet).resourceType))
        assertTrue(stringMatch("length", ((obj.entry[1].resource!! as Questionnaire).contained[0] as ValueSet).id))
        assertTrue(stringMatch("http://hl7.org/fhir/us/sdc/St", ((obj.entry[1].resource!! as Questionnaire).contained[0] as ValueSet).meta!!.profile[0]))
        assertTrue(stringMatch("Length Units", ((obj.entry[1].resource!! as Questionnaire).contained[0] as ValueSet).name))
        assertTrue(stringMatch("active", ((obj.entry[1].resource!! as Questionnaire).contained[0] as ValueSet).status))
        assertTrue(stringMatch("Length units", ((obj.entry[1].resource!! as Questionnaire).contained[0] as ValueSet).description))
        assertEquals(true, if (((obj.entry[1].resource!! as Questionnaire).contained[0] as ValueSet).immutable != null) ((obj.entry[1].resource!! as Questionnaire).contained[0] as ValueSet).immutable else false, "Field: ((obj.entry[1].resource!! as Questionnaire).contained[0] as ValueSet).immutable")
        assertEquals(false, if (((obj.entry[1].resource!! as Questionnaire).contained[0] as ValueSet).extensible != null) ((obj.entry[1].resource!! as Questionnaire).contained[0] as ValueSet).extensible else false, "Field: ((obj.entry[1].resource!! as Questionnaire).contained[0] as ValueSet).extensible")
        assertTrue(stringMatch("http://unitsofmeasure.org", ((obj.entry[1].resource!! as Questionnaire).contained[0] as ValueSet).compose!!.include[0].system))
        assertTrue(stringMatch("[in_i]", ((obj.entry[1].resource!! as Questionnaire).contained[0] as ValueSet).compose!!.include[0].concept[0].code))
        assertTrue(stringMatch("inches", ((obj.entry[1].resource!! as Questionnaire).contained[0] as ValueSet).compose!!.include[0].concept[0].display))
        assertTrue(stringMatch("cm", ((obj.entry[1].resource!! as Questionnaire).contained[0] as ValueSet).compose!!.include[0].concept[1].code))
        assertTrue(stringMatch("centimeters", ((obj.entry[1].resource!! as Questionnaire).contained[0] as ValueSet).compose!!.include[0].concept[1].display))
        assertTrue(stringMatch("ValueSet", ((obj.entry[1].resource!! as Questionnaire).contained[1] as ValueSet).resourceType))
        assertTrue(stringMatch("weight", ((obj.entry[1].resource!! as Questionnaire).contained[1] as ValueSet).id))
        assertTrue(stringMatch("http://hl7.org/fhir/us/sdc/St", ((obj.entry[1].resource!! as Questionnaire).contained[1] as ValueSet).meta!!.profile[0]))
        assertTrue(stringMatch("Weight Units", ((obj.entry[1].resource!! as Questionnaire).contained[1] as ValueSet).name))
        assertTrue(stringMatch("active", ((obj.entry[1].resource!! as Questionnaire).contained[1] as ValueSet).status))
        assertTrue(stringMatch("Weight units", ((obj.entry[1].resource!! as Questionnaire).contained[1] as ValueSet).description))
        assertEquals(true, if (((obj.entry[1].resource!! as Questionnaire).contained[1] as ValueSet).immutable != null) ((obj.entry[1].resource!! as Questionnaire).contained[1] as ValueSet).immutable else false, "Field: ((obj.entry[1].resource!! as Questionnaire).contained[1] as ValueSet).immutable")
        assertEquals(false, if (((obj.entry[1].resource!! as Questionnaire).contained[1] as ValueSet).extensible != null) ((obj.entry[1].resource!! as Questionnaire).contained[1] as ValueSet).extensible else false, "Field: ((obj.entry[1].resource!! as Questionnaire).contained[1] as ValueSet).extensible")
        assertTrue(stringMatch("http://unitsofmeasure.org", ((obj.entry[1].resource!! as Questionnaire).contained[1] as ValueSet).compose!!.include[0].system))
        assertTrue(stringMatch("[lb_i]", ((obj.entry[1].resource!! as Questionnaire).contained[1] as ValueSet).compose!!.include[0].concept[0].code))
        assertTrue(stringMatch("pounds", ((obj.entry[1].resource!! as Questionnaire).contained[1] as ValueSet).compose!!.include[0].concept[0].display))
        assertTrue(stringMatch("km", ((obj.entry[1].resource!! as Questionnaire).contained[1] as ValueSet).compose!!.include[0].concept[1].code))
        assertTrue(stringMatch("kilograms", ((obj.entry[1].resource!! as Questionnaire).contained[1] as ValueSet).compose!!.include[0].concept[1].display))
        assertTrue(stringMatch("http://hl7.org/fhir/us/sdc/Qu", (obj.entry[1].resource!! as Questionnaire).url))
        assertTrue(stringMatch("http://example.org/panel-id", (obj.entry[1].resource!! as Questionnaire).identifier[0].system))
        assertTrue(stringMatch("54127-6", (obj.entry[1].resource!! as Questionnaire).identifier[0].value))
        assertTrue(stringMatch("US Surgeon General - Family H", (obj.entry[1].resource!! as Questionnaire).title))
        assertTrue(stringMatch("active", (obj.entry[1].resource!! as Questionnaire).status))
        assertEquals(true, if ((obj.entry[1].resource!! as Questionnaire).experimental != null) (obj.entry[1].resource!! as Questionnaire).experimental else false, "Field: (obj.entry[1].resource!! as Questionnaire).experimental")
        assertEquals("2015", (obj.entry[1].resource!! as Questionnaire).date.toString())
        assertTrue(stringMatch("Regenstrief Institute, Inc an", (obj.entry[1].resource!! as Questionnaire).publisher))
        assertTrue(stringMatch("This represents an implementa", (obj.entry[1].resource!! as Questionnaire).description))
        assertTrue(stringMatch("Captures basic family history", (obj.entry[1].resource!! as Questionnaire).purpose))
        assertEquals("2015-10-31", (obj.entry[1].resource!! as Questionnaire).approvalDate.toString())
        assertEquals("2017-03-15", (obj.entry[1].resource!! as Questionnaire).lastReviewDate.toString())
        assertTrue(stringMatch("http://hl7.org/fhir/usage-con", (obj.entry[1].resource!! as Questionnaire).useContext[0].code.system))
        assertTrue(stringMatch("species", (obj.entry[1].resource!! as Questionnaire).useContext[0].code.code))
        assertTrue(stringMatch("http://snomed.info/sct", (obj.entry[1].resource!! as Questionnaire).useContext[0].valueCodeableConcept.coding[0].system))
        assertTrue(stringMatch("337915000", (obj.entry[1].resource!! as Questionnaire).useContext[0].valueCodeableConcept.coding[0].code))
        assertTrue(stringMatch("Homo sapiens", (obj.entry[1].resource!! as Questionnaire).useContext[0].valueCodeableConcept.coding[0].display))
    }
}
