package com.juicelabs.fhir.model

import java.io.File
import kotlin.test.assertEquals
import kotlin.test.assertTrue
import org.junit.jupiter.api.Test

class EligibilityResponseDataTest : DataTests() {
    @Test
    fun `eligibilityresponse-example-benefits-2 302 Test`() {
        val json = File("./src/test/resources/model/sample_data/eligibilityresponse-example-benefits-2.json").readTextAndClose()
        val obj = mapper.fromJson(json, EligibilityResponse::class.java)
        assertTrue(stringMatch("EligibilityResponse", obj.resourceType))
        assertTrue(stringMatch("E2502", obj.id))
        assertTrue(stringMatch("generated", obj.text!!.status))
        assertTrue(stringMatch("<div xmlns=\"http://www.w3.org", obj.text!!.div))
        assertTrue(stringMatch("Patient", (obj.contained[0] as Patient).resourceType))
        assertTrue(stringMatch("patient-1", (obj.contained[0] as Patient).id))
        assertTrue(stringMatch("official", (obj.contained[0] as Patient).name[0].use))
        assertTrue(stringMatch("Donald", (obj.contained[0] as Patient).name[0].family))
        assertTrue(stringMatch("Duck", (obj.contained[0] as Patient).name[0].given[0]))
        assertTrue(stringMatch("male", (obj.contained[0] as Patient).gender))
        assertEquals("1986-05-17", (obj.contained[0] as Patient).birthDate.toString())
        assertTrue(stringMatch("home", (obj.contained[0] as Patient).address[0].use))
        assertTrue(stringMatch("1234 Main Street", (obj.contained[0] as Patient).address[0].line[0]))
        assertTrue(stringMatch("Vancouver", (obj.contained[0] as Patient).address[0].city))
        assertTrue(stringMatch("V2H1Y3", (obj.contained[0] as Patient).address[0].postalCode))
        assertTrue(stringMatch("CAD", (obj.contained[0] as Patient).address[0].country))
        assertTrue(stringMatch("Coverage", (obj.contained[1] as Coverage).resourceType))
        assertTrue(stringMatch("coverage-1", (obj.contained[1] as Coverage).id))
        assertTrue(stringMatch("http://benefitsinc.com/certif", (obj.contained[1] as Coverage).identifier[0].system))
        assertTrue(stringMatch("12345", (obj.contained[1] as Coverage).identifier[0].value))
        assertTrue(stringMatch("active", (obj.contained[1] as Coverage).status))
        assertTrue(stringMatch("http://hl7.org/fhir/v3/ActCod", (obj.contained[1] as Coverage).type!!.coding[0].system))
        assertTrue(stringMatch("EHCPOL", (obj.contained[1] as Coverage).type!!.coding[0].code))
        assertTrue(stringMatch("#patient-1", (obj.contained[1] as Coverage).subscriber!!.reference))
        assertTrue(stringMatch("#patient-1", (obj.contained[1] as Coverage).beneficiary!!.reference))
        assertTrue(stringMatch("self", (obj.contained[1] as Coverage).relationship!!.coding[0].code))
        assertTrue(stringMatch("http://www.bindb.com/bin", (obj.contained[1] as Coverage).payor[0].identifier!!.system))
        assertTrue(stringMatch("123456", (obj.contained[1] as Coverage).payor[0].identifier!!.value))
        assertTrue(stringMatch("CBI35", (obj.contained[1] as Coverage).grouping!!.plan))
        assertTrue(stringMatch("Corporate Baker's Inc. Plan#3", (obj.contained[1] as Coverage).grouping!!.planDisplay))
        assertTrue(stringMatch("123", (obj.contained[1] as Coverage).grouping!!.subPlan))
        assertTrue(stringMatch("Trainee Part-time Benefits", (obj.contained[1] as Coverage).grouping!!.subPlanDisplay))
        assertTrue(stringMatch("1", (obj.contained[1] as Coverage).dependent))
        assertTrue(stringMatch("1", (obj.contained[1] as Coverage).sequence))
        assertTrue(stringMatch("http://www.BenefitsInc.com/fh", obj.identifier[0].system))
        assertTrue(stringMatch("8812342", obj.identifier[0].value))
        assertTrue(stringMatch("active", obj.status))
        assertEquals("2014-09-16", obj.created.toString())
        assertTrue(stringMatch("http://national.org/provider", obj.requestProvider!!.identifier!!.system))
        assertTrue(stringMatch("PR9876", obj.requestProvider!!.identifier!!.value))
        assertTrue(stringMatch("http://national.org/clinic", obj.requestOrganization!!.identifier!!.system))
        assertTrue(stringMatch("OR1234", obj.requestOrganization!!.identifier!!.value))
        assertTrue(stringMatch("http://www.BenefitsInc.com/fh", obj.request!!.reference))
        assertTrue(stringMatch("http://hl7.org/fhir/remittanc", obj.outcome!!.coding[0].system))
        assertTrue(stringMatch("complete", obj.outcome!!.coding[0].code))
        assertTrue(stringMatch("Policy is currently in-force.", obj.disposition))
        assertTrue(stringMatch("Organization/2", obj.insurer!!.reference))
        assertEquals(true, if (obj.inforce != null) obj.inforce else false, "Field: obj.inforce")
        assertTrue(stringMatch("#coverage-1", obj.insurance[0].coverage!!.reference))
        assertTrue(stringMatch("http://www.BenefitsInc.com/fh", obj.insurance[0].contract!!.reference))
        assertTrue(stringMatch("http://hl7.org/fhir/benefit-c", obj.insurance[0].benefitBalance[0].category.coding[0].system))
        assertTrue(stringMatch("medical", obj.insurance[0].benefitBalance[0].category.coding[0].code))
        assertTrue(stringMatch("http://hl7.org/fhir/benefit-s", obj.insurance[0].benefitBalance[0].subCategory!!.coding[0].system))
        assertTrue(stringMatch("30", obj.insurance[0].benefitBalance[0].subCategory!!.coding[0].code))
        assertTrue(stringMatch("Health Benefit Plan Coverage", obj.insurance[0].benefitBalance[0].subCategory!!.coding[0].display))
        assertTrue(stringMatch("http://hl7.org/fhir/benefit-n", obj.insurance[0].benefitBalance[0].network!!.coding[0].system))
        assertTrue(stringMatch("in", obj.insurance[0].benefitBalance[0].network!!.coding[0].code))
        assertTrue(stringMatch("http://hl7.org/fhir/benefit-u", obj.insurance[0].benefitBalance[0].unit!!.coding[0].system))
        assertTrue(stringMatch("individual", obj.insurance[0].benefitBalance[0].unit!!.coding[0].code))
        assertTrue(stringMatch("http://hl7.org/fhir/benefit-t", obj.insurance[0].benefitBalance[0].term!!.coding[0].system))
        assertTrue(stringMatch("annual", obj.insurance[0].benefitBalance[0].term!!.coding[0].code))
        assertTrue(stringMatch("benefit", obj.insurance[0].benefitBalance[0].financial[0].type.coding[0].code))
        assertTrue(stringMatch("%.2f".format(500000f), "%.2f".format(obj.insurance[0].benefitBalance[0].financial[0].allowedMoney!!.value)))
        assertTrue(stringMatch("urn:iso:std:iso:4217", obj.insurance[0].benefitBalance[0].financial[0].allowedMoney!!.system))
        assertTrue(stringMatch("USD", obj.insurance[0].benefitBalance[0].financial[0].allowedMoney!!.code))
        assertTrue(stringMatch("%.2f".format(3748.00f), "%.2f".format(obj.insurance[0].benefitBalance[0].financial[0].usedMoney!!.value)))
        assertTrue(stringMatch("urn:iso:std:iso:4217", obj.insurance[0].benefitBalance[0].financial[0].usedMoney!!.system))
        assertTrue(stringMatch("USD", obj.insurance[0].benefitBalance[0].financial[0].usedMoney!!.code))
        assertTrue(stringMatch("copay-maximum", obj.insurance[0].benefitBalance[0].financial[1].type.coding[0].code))
    }

    @Test
    fun `eligibilityresponse-example-benefits-2 303 Test`() {
        val json = File("./src/test/resources/model/sample_data/eligibilityresponse-example-benefits-2.json").readTextAndClose()
        val obj = mapper.fromJson(json, EligibilityResponse::class.java)
        assertTrue(stringMatch("%.2f".format(100f), "%.2f".format(obj.insurance[0].benefitBalance[0].financial[1].allowedMoney!!.value)))
        assertTrue(stringMatch("urn:iso:std:iso:4217", obj.insurance[0].benefitBalance[0].financial[1].allowedMoney!!.system))
        assertTrue(stringMatch("USD", obj.insurance[0].benefitBalance[0].financial[1].allowedMoney!!.code))
        assertTrue(stringMatch("copay-percent", obj.insurance[0].benefitBalance[0].financial[2].type.coding[0].code))
        assertEquals(20, obj.insurance[0].benefitBalance[0].financial[2].allowedUnsignedInt)
        assertTrue(stringMatch("http://hl7.org/fhir/benefit-c", obj.insurance[0].benefitBalance[1].category.coding[0].system))
        assertTrue(stringMatch("medical", obj.insurance[0].benefitBalance[1].category.coding[0].code))
        assertTrue(stringMatch("http://hl7.org/fhir/benefit-s", obj.insurance[0].benefitBalance[1].subCategory!!.coding[0].system))
        assertTrue(stringMatch("69", obj.insurance[0].benefitBalance[1].subCategory!!.coding[0].code))
        assertTrue(stringMatch("Maternity", obj.insurance[0].benefitBalance[1].subCategory!!.coding[0].display))
        assertTrue(stringMatch("http://hl7.org/fhir/benefit-n", obj.insurance[0].benefitBalance[1].network!!.coding[0].system))
        assertTrue(stringMatch("in", obj.insurance[0].benefitBalance[1].network!!.coding[0].code))
        assertTrue(stringMatch("http://hl7.org/fhir/benefit-u", obj.insurance[0].benefitBalance[1].unit!!.coding[0].system))
        assertTrue(stringMatch("individual", obj.insurance[0].benefitBalance[1].unit!!.coding[0].code))
        assertTrue(stringMatch("http://hl7.org/fhir/benefit-t", obj.insurance[0].benefitBalance[1].term!!.coding[0].system))
        assertTrue(stringMatch("annual", obj.insurance[0].benefitBalance[1].term!!.coding[0].code))
        assertTrue(stringMatch("benefit", obj.insurance[0].benefitBalance[1].financial[0].type.coding[0].code))
        assertTrue(stringMatch("%.2f".format(15000f), "%.2f".format(obj.insurance[0].benefitBalance[1].financial[0].allowedMoney!!.value)))
        assertTrue(stringMatch("urn:iso:std:iso:4217", obj.insurance[0].benefitBalance[1].financial[0].allowedMoney!!.system))
        assertTrue(stringMatch("USD", obj.insurance[0].benefitBalance[1].financial[0].allowedMoney!!.code))
        assertTrue(stringMatch("http://hl7.org/fhir/benefit-c", obj.insurance[0].benefitBalance[2].category.coding[0].system))
        assertTrue(stringMatch("oral", obj.insurance[0].benefitBalance[2].category.coding[0].code))
        assertTrue(stringMatch("http://hl7.org/fhir/benefit-s", obj.insurance[0].benefitBalance[2].subCategory!!.coding[0].system))
        assertTrue(stringMatch("F3", obj.insurance[0].benefitBalance[2].subCategory!!.coding[0].code))
        assertTrue(stringMatch("Dental Coverage", obj.insurance[0].benefitBalance[2].subCategory!!.coding[0].display))
        assertTrue(stringMatch("http://hl7.org/fhir/benefit-n", obj.insurance[0].benefitBalance[2].network!!.coding[0].system))
        assertTrue(stringMatch("in", obj.insurance[0].benefitBalance[2].network!!.coding[0].code))
        assertTrue(stringMatch("http://hl7.org/fhir/benefit-u", obj.insurance[0].benefitBalance[2].unit!!.coding[0].system))
        assertTrue(stringMatch("individual", obj.insurance[0].benefitBalance[2].unit!!.coding[0].code))
        assertTrue(stringMatch("http://hl7.org/fhir/benefit-t", obj.insurance[0].benefitBalance[2].term!!.coding[0].system))
        assertTrue(stringMatch("annual", obj.insurance[0].benefitBalance[2].term!!.coding[0].code))
        assertTrue(stringMatch("benefit", obj.insurance[0].benefitBalance[2].financial[0].type.coding[0].code))
        assertTrue(stringMatch("%.2f".format(2000f), "%.2f".format(obj.insurance[0].benefitBalance[2].financial[0].allowedMoney!!.value)))
        assertTrue(stringMatch("urn:iso:std:iso:4217", obj.insurance[0].benefitBalance[2].financial[0].allowedMoney!!.system))
        assertTrue(stringMatch("USD", obj.insurance[0].benefitBalance[2].financial[0].allowedMoney!!.code))
        assertTrue(stringMatch("http://hl7.org/fhir/benefit-c", obj.insurance[0].benefitBalance[3].category.coding[0].system))
        assertTrue(stringMatch("vision", obj.insurance[0].benefitBalance[3].category.coding[0].code))
        assertTrue(stringMatch("http://hl7.org/fhir/benefit-s", obj.insurance[0].benefitBalance[3].subCategory!!.coding[0].system))
        assertTrue(stringMatch("F6", obj.insurance[0].benefitBalance[3].subCategory!!.coding[0].code))
        assertTrue(stringMatch("Vision Coverage", obj.insurance[0].benefitBalance[3].subCategory!!.coding[0].display))
        assertEquals(true, if (obj.insurance[0].benefitBalance[3].excluded != null) obj.insurance[0].benefitBalance[3].excluded else false, "Field: obj.insurance[0].benefitBalance[3].excluded")
        assertTrue(stringMatch("Vision", obj.insurance[0].benefitBalance[3].name))
        assertTrue(stringMatch("Vision products and services ", obj.insurance[0].benefitBalance[3].description))
        assertTrue(stringMatch("http://national.org/form", obj.form!!.coding[0].system))
        assertTrue(stringMatch("ELRSP/2017/01", obj.form!!.coding[0].code))
    }

    @Test
    fun `eligibilityresponse-example-error 304 Test`() {
        val json = File("./src/test/resources/model/sample_data/eligibilityresponse-example-error.json").readTextAndClose()
        val obj = mapper.fromJson(json, EligibilityResponse::class.java)
        assertTrue(stringMatch("EligibilityResponse", obj.resourceType))
        assertTrue(stringMatch("E2503", obj.id))
        assertTrue(stringMatch("generated", obj.text!!.status))
        assertTrue(stringMatch("<div xmlns=\"http://www.w3.org", obj.text!!.div))
        assertTrue(stringMatch("http://www.BenefitsInc.com/fh", obj.identifier[0].system))
        assertTrue(stringMatch("8812343", obj.identifier[0].value))
        assertTrue(stringMatch("active", obj.status))
        assertEquals("2014-09-16", obj.created.toString())
        assertTrue(stringMatch("http://national.org/provider", obj.requestProvider!!.identifier!!.system))
        assertTrue(stringMatch("PR9876", obj.requestProvider!!.identifier!!.value))
        assertTrue(stringMatch("http://national.org/clinic", obj.requestOrganization!!.identifier!!.system))
        assertTrue(stringMatch("OR1234", obj.requestOrganization!!.identifier!!.value))
        assertTrue(stringMatch("http://www.BenefitsInc.com/fh", obj.request!!.reference))
        assertTrue(stringMatch("http://hl7.org/fhir/remittanc", obj.outcome!!.coding[0].system))
        assertTrue(stringMatch("error", obj.outcome!!.coding[0].code))
        assertTrue(stringMatch("Eligibiliy request could not ", obj.disposition))
        assertTrue(stringMatch("Organization/2", obj.insurer!!.reference))
        assertTrue(stringMatch("http://national.org/form", obj.form!!.coding[0].system))
        assertTrue(stringMatch("ELRSP/2017/01", obj.form!!.coding[0].code))
        assertTrue(stringMatch("http://hl7.org/fhir/adjudicat", obj.error[0].code.coding[0].system))
        assertTrue(stringMatch("a001", obj.error[0].code.coding[0].code))
    }

    @Test
    fun `eligibilityresponse-example 305 Test`() {
        val json = File("./src/test/resources/model/sample_data/eligibilityresponse-example.json").readTextAndClose()
        val obj = mapper.fromJson(json, EligibilityResponse::class.java)
        assertTrue(stringMatch("EligibilityResponse", obj.resourceType))
        assertTrue(stringMatch("E2500", obj.id))
        assertTrue(stringMatch("generated", obj.text!!.status))
        assertTrue(stringMatch("<div xmlns=\"http://www.w3.org", obj.text!!.div))
        assertTrue(stringMatch("http://www.BenefitsInc.com/fh", obj.identifier[0].system))
    }

    @Test
    fun `eligibilityresponse-example 306 Test`() {
        val json = File("./src/test/resources/model/sample_data/eligibilityresponse-example.json").readTextAndClose()
        val obj = mapper.fromJson(json, EligibilityResponse::class.java)
        assertTrue(stringMatch("881234", obj.identifier[0].value))
        assertTrue(stringMatch("active", obj.status))
        assertEquals("2014-08-16", obj.created.toString())
        assertTrue(stringMatch("http://www.BenefitsInc.com/fh", obj.request!!.reference))
        assertTrue(stringMatch("http://hl7.org/fhir/remittanc", obj.outcome!!.coding[0].system))
        assertTrue(stringMatch("complete", obj.outcome!!.coding[0].code))
        assertTrue(stringMatch("Policy is currently in-force.", obj.disposition))
        assertTrue(stringMatch("Organization/2", obj.insurer!!.reference))
        assertEquals(true, if (obj.inforce != null) obj.inforce else false, "Field: obj.inforce")
    }

    @Test
    fun `eligibilityresponse-example-benefits 307 Test`() {
        val json = File("./src/test/resources/model/sample_data/eligibilityresponse-example-benefits.json").readTextAndClose()
        val obj = mapper.fromJson(json, EligibilityResponse::class.java)
        assertTrue(stringMatch("EligibilityResponse", obj.resourceType))
        assertTrue(stringMatch("E2501", obj.id))
        assertTrue(stringMatch("generated", obj.text!!.status))
        assertTrue(stringMatch("<div xmlns=\"http://www.w3.org", obj.text!!.div))
        assertTrue(stringMatch("http://www.BenefitsInc.com/fh", obj.identifier[0].system))
        assertTrue(stringMatch("881234", obj.identifier[0].value))
        assertTrue(stringMatch("active", obj.status))
        assertEquals("2014-08-16", obj.created.toString())
        assertTrue(stringMatch("http://www.BenefitsInc.com/fh", obj.request!!.reference))
        assertTrue(stringMatch("http://hl7.org/fhir/remittanc", obj.outcome!!.coding[0].system))
        assertTrue(stringMatch("complete", obj.outcome!!.coding[0].code))
        assertTrue(stringMatch("Policy is currently in-force.", obj.disposition))
        assertTrue(stringMatch("Organization/2", obj.insurer!!.reference))
        assertEquals(true, if (obj.inforce != null) obj.inforce else false, "Field: obj.inforce")
        assertTrue(stringMatch("http://hl7.org/fhir/benefit-c", obj.insurance[0].benefitBalance[0].category.coding[0].system))
        assertTrue(stringMatch("medical", obj.insurance[0].benefitBalance[0].category.coding[0].code))
        assertTrue(stringMatch("http://hl7.org/fhir/benefit-s", obj.insurance[0].benefitBalance[0].subCategory!!.coding[0].system))
        assertTrue(stringMatch("30", obj.insurance[0].benefitBalance[0].subCategory!!.coding[0].code))
        assertTrue(stringMatch("Health Benefit Plan Coverage", obj.insurance[0].benefitBalance[0].subCategory!!.coding[0].display))
        assertTrue(stringMatch("http://hl7.org/fhir/benefit-n", obj.insurance[0].benefitBalance[0].network!!.coding[0].system))
        assertTrue(stringMatch("in", obj.insurance[0].benefitBalance[0].network!!.coding[0].code))
        assertTrue(stringMatch("http://hl7.org/fhir/benefit-u", obj.insurance[0].benefitBalance[0].unit!!.coding[0].system))
        assertTrue(stringMatch("individual", obj.insurance[0].benefitBalance[0].unit!!.coding[0].code))
        assertTrue(stringMatch("http://hl7.org/fhir/benefit-t", obj.insurance[0].benefitBalance[0].term!!.coding[0].system))
        assertTrue(stringMatch("annual", obj.insurance[0].benefitBalance[0].term!!.coding[0].code))
        assertTrue(stringMatch("benefit", obj.insurance[0].benefitBalance[0].financial[0].type.coding[0].code))
        assertTrue(stringMatch("%.2f".format(500000f), "%.2f".format(obj.insurance[0].benefitBalance[0].financial[0].allowedMoney!!.value)))
        assertTrue(stringMatch("urn:iso:std:iso:4217", obj.insurance[0].benefitBalance[0].financial[0].allowedMoney!!.system))
        assertTrue(stringMatch("SAR", obj.insurance[0].benefitBalance[0].financial[0].allowedMoney!!.code))
        assertTrue(stringMatch("copay-maximum", obj.insurance[0].benefitBalance[0].financial[1].type.coding[0].code))
        assertTrue(stringMatch("%.2f".format(100f), "%.2f".format(obj.insurance[0].benefitBalance[0].financial[1].allowedMoney!!.value)))
        assertTrue(stringMatch("urn:iso:std:iso:4217", obj.insurance[0].benefitBalance[0].financial[1].allowedMoney!!.system))
        assertTrue(stringMatch("SAR", obj.insurance[0].benefitBalance[0].financial[1].allowedMoney!!.code))
        assertTrue(stringMatch("copay-percent", obj.insurance[0].benefitBalance[0].financial[2].type.coding[0].code))
        assertEquals(20, obj.insurance[0].benefitBalance[0].financial[2].allowedUnsignedInt)
        assertTrue(stringMatch("http://hl7.org/fhir/benefit-c", obj.insurance[0].benefitBalance[1].category.coding[0].system))
        assertTrue(stringMatch("medical", obj.insurance[0].benefitBalance[1].category.coding[0].code))
        assertTrue(stringMatch("http://hl7.org/fhir/benefit-s", obj.insurance[0].benefitBalance[1].subCategory!!.coding[0].system))
        assertTrue(stringMatch("69", obj.insurance[0].benefitBalance[1].subCategory!!.coding[0].code))
        assertTrue(stringMatch("Maternity", obj.insurance[0].benefitBalance[1].subCategory!!.coding[0].display))
        assertTrue(stringMatch("http://hl7.org/fhir/benefit-n", obj.insurance[0].benefitBalance[1].network!!.coding[0].system))
        assertTrue(stringMatch("in", obj.insurance[0].benefitBalance[1].network!!.coding[0].code))
        assertTrue(stringMatch("http://hl7.org/fhir/benefit-u", obj.insurance[0].benefitBalance[1].unit!!.coding[0].system))
        assertTrue(stringMatch("individual", obj.insurance[0].benefitBalance[1].unit!!.coding[0].code))
        assertTrue(stringMatch("http://hl7.org/fhir/benefit-t", obj.insurance[0].benefitBalance[1].term!!.coding[0].system))
        assertTrue(stringMatch("annual", obj.insurance[0].benefitBalance[1].term!!.coding[0].code))
        assertTrue(stringMatch("benefit", obj.insurance[0].benefitBalance[1].financial[0].type.coding[0].code))
        assertTrue(stringMatch("%.2f".format(15000f), "%.2f".format(obj.insurance[0].benefitBalance[1].financial[0].allowedMoney!!.value)))
        assertTrue(stringMatch("urn:iso:std:iso:4217", obj.insurance[0].benefitBalance[1].financial[0].allowedMoney!!.system))
        assertTrue(stringMatch("SAR", obj.insurance[0].benefitBalance[1].financial[0].allowedMoney!!.code))
        assertTrue(stringMatch("http://hl7.org/fhir/benefit-c", obj.insurance[0].benefitBalance[2].category.coding[0].system))
        assertTrue(stringMatch("oral", obj.insurance[0].benefitBalance[2].category.coding[0].code))
        assertTrue(stringMatch("http://hl7.org/fhir/benefit-s", obj.insurance[0].benefitBalance[2].subCategory!!.coding[0].system))
        assertTrue(stringMatch("F3", obj.insurance[0].benefitBalance[2].subCategory!!.coding[0].code))
        assertTrue(stringMatch("Dental Coverage", obj.insurance[0].benefitBalance[2].subCategory!!.coding[0].display))
        assertTrue(stringMatch("http://hl7.org/fhir/benefit-n", obj.insurance[0].benefitBalance[2].network!!.coding[0].system))
        assertTrue(stringMatch("in", obj.insurance[0].benefitBalance[2].network!!.coding[0].code))
        assertTrue(stringMatch("http://hl7.org/fhir/benefit-u", obj.insurance[0].benefitBalance[2].unit!!.coding[0].system))
        assertTrue(stringMatch("individual", obj.insurance[0].benefitBalance[2].unit!!.coding[0].code))
        assertTrue(stringMatch("http://hl7.org/fhir/benefit-t", obj.insurance[0].benefitBalance[2].term!!.coding[0].system))
        assertTrue(stringMatch("annual", obj.insurance[0].benefitBalance[2].term!!.coding[0].code))
        assertTrue(stringMatch("benefit", obj.insurance[0].benefitBalance[2].financial[0].type.coding[0].code))
    }

    @Test
    fun `eligibilityresponse-example-benefits 308 Test`() {
        val json = File("./src/test/resources/model/sample_data/eligibilityresponse-example-benefits.json").readTextAndClose()
        val obj = mapper.fromJson(json, EligibilityResponse::class.java)
        assertTrue(stringMatch("%.2f".format(2000f), "%.2f".format(obj.insurance[0].benefitBalance[2].financial[0].allowedMoney!!.value)))
        assertTrue(stringMatch("urn:iso:std:iso:4217", obj.insurance[0].benefitBalance[2].financial[0].allowedMoney!!.system))
        assertTrue(stringMatch("SAR", obj.insurance[0].benefitBalance[2].financial[0].allowedMoney!!.code))
        assertTrue(stringMatch("http://hl7.org/fhir/benefit-c", obj.insurance[0].benefitBalance[3].category.coding[0].system))
        assertTrue(stringMatch("vision", obj.insurance[0].benefitBalance[3].category.coding[0].code))
        assertTrue(stringMatch("http://hl7.org/fhir/benefit-s", obj.insurance[0].benefitBalance[3].subCategory!!.coding[0].system))
        assertTrue(stringMatch("F6", obj.insurance[0].benefitBalance[3].subCategory!!.coding[0].code))
        assertTrue(stringMatch("Vision Coverage", obj.insurance[0].benefitBalance[3].subCategory!!.coding[0].display))
        assertTrue(stringMatch("http://hl7.org/fhir/benefit-n", obj.insurance[0].benefitBalance[3].network!!.coding[0].system))
        assertTrue(stringMatch("in", obj.insurance[0].benefitBalance[3].network!!.coding[0].code))
        assertTrue(stringMatch("http://hl7.org/fhir/benefit-u", obj.insurance[0].benefitBalance[3].unit!!.coding[0].system))
        assertTrue(stringMatch("individual", obj.insurance[0].benefitBalance[3].unit!!.coding[0].code))
        assertTrue(stringMatch("http://hl7.org/fhir/benefit-t", obj.insurance[0].benefitBalance[3].term!!.coding[0].system))
        assertTrue(stringMatch("annual", obj.insurance[0].benefitBalance[3].term!!.coding[0].code))
        assertTrue(stringMatch("benefit", obj.insurance[0].benefitBalance[3].financial[0].type.coding[0].code))
        assertTrue(stringMatch("%.2f".format(400f), "%.2f".format(obj.insurance[0].benefitBalance[3].financial[0].allowedMoney!!.value)))
        assertTrue(stringMatch("urn:iso:std:iso:4217", obj.insurance[0].benefitBalance[3].financial[0].allowedMoney!!.system))
        assertTrue(stringMatch("SAR", obj.insurance[0].benefitBalance[3].financial[0].allowedMoney!!.code))
        assertTrue(stringMatch("http://hl7.org/fhir/benefit-c", obj.insurance[0].benefitBalance[4].category.coding[0].system))
        assertTrue(stringMatch("vision", obj.insurance[0].benefitBalance[4].category.coding[0].code))
        assertTrue(stringMatch("http://hl7.org/fhir/benefit-s", obj.insurance[0].benefitBalance[4].subCategory!!.coding[0].system))
        assertTrue(stringMatch("49", obj.insurance[0].benefitBalance[4].subCategory!!.coding[0].code))
        assertTrue(stringMatch("Hospital Room and Board", obj.insurance[0].benefitBalance[4].subCategory!!.coding[0].display))
        assertTrue(stringMatch("http://hl7.org/fhir/benefit-n", obj.insurance[0].benefitBalance[4].network!!.coding[0].system))
        assertTrue(stringMatch("in", obj.insurance[0].benefitBalance[4].network!!.coding[0].code))
        assertTrue(stringMatch("http://hl7.org/fhir/benefit-u", obj.insurance[0].benefitBalance[4].unit!!.coding[0].system))
        assertTrue(stringMatch("individual", obj.insurance[0].benefitBalance[4].unit!!.coding[0].code))
        assertTrue(stringMatch("http://hl7.org/fhir/benefit-t", obj.insurance[0].benefitBalance[4].term!!.coding[0].system))
        assertTrue(stringMatch("day", obj.insurance[0].benefitBalance[4].term!!.coding[0].code))
        assertTrue(stringMatch("room", obj.insurance[0].benefitBalance[4].financial[0].type.coding[0].code))
        assertTrue(stringMatch("shared", obj.insurance[0].benefitBalance[4].financial[0].allowedString))
        assertTrue(stringMatch("benefit", obj.insurance[0].benefitBalance[4].financial[1].type.coding[0].code))
        assertTrue(stringMatch("%.2f".format(600f), "%.2f".format(obj.insurance[0].benefitBalance[4].financial[1].allowedMoney!!.value)))
        assertTrue(stringMatch("urn:iso:std:iso:4217", obj.insurance[0].benefitBalance[4].financial[1].allowedMoney!!.system))
        assertTrue(stringMatch("SAR", obj.insurance[0].benefitBalance[4].financial[1].allowedMoney!!.code))
    }
}
