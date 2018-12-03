package com.juicelabs.fhir.model

import java.io.File
import java.lang.SuppressWarnings
import kotlin.test.assertEquals
import kotlin.test.assertTrue
import org.junit.jupiter.api.Test

class StructureDefinitionDataTest : DataTests() {
    @Test
    fun `structuredefinition-example 368 Test`() {
        val json = File("./src/test/resources/model/sample_data/structuredefinition-example.json").readTextAndClose()
        val obj = mapper.fromJson(json, StructureDefinition::class.java)
        assertTrue(stringMatch("StructureDefinition", obj.resourceType))
        assertTrue(stringMatch("example", obj.id))
        assertTrue(stringMatch("generated", obj.text!!.status))
        assertTrue(stringMatch("<div xmlns=\"http://www.w3.org", obj.text!!.div))
        assertTrue(stringMatch("http://hl7.org/fhir/Structure", obj.url))
        assertTrue(stringMatch("urn:ietf:rfc:3986", obj.identifier[0].system))
        assertTrue(stringMatch("1.2.36.90146595217.4.2", obj.identifier[0].value))
        assertTrue(stringMatch("2", obj.version))
        assertTrue(stringMatch("LipidProfileExample", obj.name))
        assertTrue(stringMatch("Example Lipid Profile", obj.title))
        assertTrue(stringMatch("draft", obj.status))
        assertEquals(true, if (obj.experimental != null) obj.experimental else false, "Field: obj.experimental")
        assertTrue(stringMatch("2012-05-12", obj.date))
        assertTrue(stringMatch("Health Intersections Pty Ltd", obj.publisher))
        assertTrue(stringMatch("Grahame Grieve", obj.contact[0].name))
        assertTrue(stringMatch("email", obj.contact[0].telecom[0].system))
        assertTrue(stringMatch("grahame@healthintersections.c", obj.contact[0].telecom[0].value))
        assertTrue(stringMatch("Describes how the lab report ", obj.description))
        assertTrue(stringMatch("http://hl7.org/fhir/usage-con", obj.useContext[0].code.system))
        assertTrue(stringMatch("focus", obj.useContext[0].code.code))
        assertTrue(stringMatch("Clinical Focus", obj.useContext[0].code.display))
        assertTrue(stringMatch("http://snomed.info/sct", obj.useContext[0].valueCodeableConcept.coding[0].system))
        assertTrue(stringMatch("314079002", obj.useContext[0].valueCodeableConcept.coding[0].code))
        assertTrue(stringMatch("Hyperlipidemia screening test", obj.useContext[0].valueCodeableConcept.coding[0].display))
        assertTrue(stringMatch("urn:iso:std:iso:3166", obj.jurisdiction[0].coding[0].system))
        assertTrue(stringMatch("AU", obj.jurisdiction[0].coding[0].code))
        assertTrue(stringMatch("Provide an example to demonst", obj.purpose))
        assertTrue(stringMatch("Creative Commons 0, per FHIR ", obj.copyright))
        assertTrue(stringMatch("http://snomed.info/sct", obj.keyword[0].system))
        assertTrue(stringMatch("314079002", obj.keyword[0].code))
        assertTrue(stringMatch("Hyperlipidemia screening test", obj.keyword[0].display))
        assertTrue(stringMatch("1.0.0", obj.fhirVersion))
        assertTrue(stringMatch("m1", obj.mapping[0].identity))
        assertTrue(stringMatch("https://www.rcpa.edu.au/getat", obj.mapping[0].uri))
        assertTrue(stringMatch("RCPA Lipid Report recommendat", obj.mapping[0].name))
        assertTrue(stringMatch("Actual mappings haven't yet b", obj.mapping[0].comment))
        assertTrue(stringMatch("resource", obj.kind))
        assertEquals(false, if (obj.abstract != null) obj.abstract else false, "Field: obj.abstract")
        assertTrue(stringMatch("DiagnosticReport", obj.type))
        assertTrue(stringMatch("http://hl7.org/fhir/Structure", obj.baseDefinition))
        assertTrue(stringMatch("constraint", obj.derivation))
        assertTrue(stringMatch("DiagnosticReport", obj.snapshot!!.element[0].id))
        assertTrue(stringMatch("DiagnosticReport", obj.snapshot!!.element[0].path))
        assertTrue(stringMatch("Lipid Lab Report", obj.snapshot!!.element[0].short))
        assertTrue(stringMatch("The findings and interpretati", obj.snapshot!!.element[0].definition))
        assertTrue(stringMatch("In this profile, mustSupport ", obj.snapshot!!.element[0].comment))
        assertEquals(1, obj.snapshot!!.element[0].min)
        assertTrue(stringMatch("1", obj.snapshot!!.element[0].max))
        assertTrue(stringMatch("DiagnosticReport", obj.snapshot!!.element[0].base!!.path))
        assertEquals(1, obj.snapshot!!.element[0].base!!.min)
        assertTrue(stringMatch("1", obj.snapshot!!.element[0].base!!.max))
        assertEquals(false, if (obj.snapshot!!.element[0].isModifier != null) obj.snapshot!!.element[0].isModifier else false, "Field: obj.snapshot!!.element[0].isModifier")
        assertTrue(stringMatch("DiagnosticReport.extension", obj.snapshot!!.element[1].id))
        assertTrue(stringMatch("DiagnosticReport.extension", obj.snapshot!!.element[1].path))
        assertTrue(stringMatch("value", obj.snapshot!!.element[1].slicing!!.discriminator[0].type))
        assertTrue(stringMatch("url", obj.snapshot!!.element[1].slicing!!.discriminator[0].path))
        assertEquals(false, if (obj.snapshot!!.element[1].slicing!!.ordered != null) obj.snapshot!!.element[1].slicing!!.ordered else false, "Field: obj.snapshot!!.element[1].slicing!!.ordered")
        assertTrue(stringMatch("open", obj.snapshot!!.element[1].slicing!!.rules))
        assertTrue(stringMatch("Additional Content defined by", obj.snapshot!!.element[1].short))
        assertTrue(stringMatch("May be used to represent addi", obj.snapshot!!.element[1].definition))
        assertTrue(stringMatch("there can be no stigma associ", obj.snapshot!!.element[1].comment))
        assertEquals(0, obj.snapshot!!.element[1].min)
        assertTrue(stringMatch("*", obj.snapshot!!.element[1].max))
        assertTrue(stringMatch("DiagnosticReport.extension", obj.snapshot!!.element[1].base!!.path))
        assertEquals(0, obj.snapshot!!.element[1].base!!.min)
        assertTrue(stringMatch("*", obj.snapshot!!.element[1].base!!.max))
        assertTrue(stringMatch("Extension", obj.snapshot!!.element[1].type[0].code))
        assertEquals(false, if (obj.snapshot!!.element[1].isModifier != null) obj.snapshot!!.element[1].isModifier else false, "Field: obj.snapshot!!.element[1].isModifier")
        assertTrue(stringMatch("DiagnosticReport.text", obj.snapshot!!.element[2].id))
        assertTrue(stringMatch("DiagnosticReport.text", obj.snapshot!!.element[2].path))
        assertTrue(stringMatch("Text summary of the resource,", obj.snapshot!!.element[2].short))
        assertTrue(stringMatch("A human-readable narrative th", obj.snapshot!!.element[2].definition))
        assertTrue(stringMatch("Contained resources do not ha", obj.snapshot!!.element[2].comment))
        assertTrue(stringMatch("narrative", obj.snapshot!!.element[2].alias[0]))
        assertTrue(stringMatch("html", obj.snapshot!!.element[2].alias[1]))
        assertTrue(stringMatch("xhtml", obj.snapshot!!.element[2].alias[2]))
        assertTrue(stringMatch("display", obj.snapshot!!.element[2].alias[3]))
        assertEquals(0, obj.snapshot!!.element[2].min)
        assertTrue(stringMatch("1", obj.snapshot!!.element[2].max))
        assertTrue(stringMatch("DiagnosticReport.text", obj.snapshot!!.element[2].base!!.path))
        assertEquals(0, obj.snapshot!!.element[2].base!!.min)
        assertTrue(stringMatch("1", obj.snapshot!!.element[2].base!!.max))
        assertTrue(stringMatch("Narrative", obj.snapshot!!.element[2].type[0].code))
        assertEquals(false, if (obj.snapshot!!.element[2].isModifier != null) obj.snapshot!!.element[2].isModifier else false, "Field: obj.snapshot!!.element[2].isModifier")
        assertTrue(stringMatch("DiagnosticReport.contained", obj.snapshot!!.element[3].id))
        assertTrue(stringMatch("DiagnosticReport.contained", obj.snapshot!!.element[3].path))
        assertTrue(stringMatch("Contained, inline Resources", obj.snapshot!!.element[3].short))
        assertTrue(stringMatch("These resources do not have a", obj.snapshot!!.element[3].definition))
        assertTrue(stringMatch("This should never be done whe", obj.snapshot!!.element[3].comment))
        assertTrue(stringMatch("inline resources", obj.snapshot!!.element[3].alias[0]))
        assertTrue(stringMatch("anonymous resources", obj.snapshot!!.element[3].alias[1]))
        assertTrue(stringMatch("contained resources", obj.snapshot!!.element[3].alias[2]))
        assertEquals(0, obj.snapshot!!.element[3].min)
        assertTrue(stringMatch("*", obj.snapshot!!.element[3].max))
        assertTrue(stringMatch("DiagnosticReport.contained", obj.snapshot!!.element[3].base!!.path))
        assertEquals(0, obj.snapshot!!.element[3].base!!.min)
        assertTrue(stringMatch("*", obj.snapshot!!.element[3].base!!.max))
        assertTrue(stringMatch("Resource", obj.snapshot!!.element[3].type[0].code))
        assertEquals(false, if (obj.snapshot!!.element[3].isModifier != null) obj.snapshot!!.element[3].isModifier else false, "Field: obj.snapshot!!.element[3].isModifier")
        assertTrue(stringMatch("DiagnosticReport.status", obj.snapshot!!.element[4].id))
        assertTrue(stringMatch("DiagnosticReport.status", obj.snapshot!!.element[4].path))
        assertTrue(stringMatch("registered|interim|final|amen", obj.snapshot!!.element[4].short))
        assertTrue(stringMatch("The status of the diagnostic ", obj.snapshot!!.element[4].definition))
        assertTrue(stringMatch("This is labeled as \"Is Modifi", obj.snapshot!!.element[4].comment))
        assertEquals(1, obj.snapshot!!.element[4].min)
        assertTrue(stringMatch("1", obj.snapshot!!.element[4].max))
        assertTrue(stringMatch("DiagnosticReport.status", obj.snapshot!!.element[4].base!!.path))
        assertEquals(1, obj.snapshot!!.element[4].base!!.min)
        assertTrue(stringMatch("1", obj.snapshot!!.element[4].base!!.max))
        assertTrue(stringMatch("code", obj.snapshot!!.element[4].type[0].code))
        assertEquals(false, if (obj.snapshot!!.element[4].isModifier != null) obj.snapshot!!.element[4].isModifier else false, "Field: obj.snapshot!!.element[4].isModifier")
        assertTrue(stringMatch("required", obj.snapshot!!.element[4].binding!!.strength))
        assertTrue(stringMatch("http://hl7.org/fhir/ValueSet/", obj.snapshot!!.element[4].binding!!.valueSetReference!!.reference))
        assertTrue(stringMatch("DiagnosticReport.issued", obj.snapshot!!.element[5].id))
        assertTrue(stringMatch("DiagnosticReport.issued", obj.snapshot!!.element[5].path))
        assertTrue(stringMatch("Date this version was release", obj.snapshot!!.element[5].short))
        assertTrue(stringMatch("The date and/or time that thi", obj.snapshot!!.element[5].definition))
        assertTrue(stringMatch("May be different from the upd", obj.snapshot!!.element[5].comment))
        assertEquals(1, obj.snapshot!!.element[5].min)
        assertTrue(stringMatch("1", obj.snapshot!!.element[5].max))
        assertTrue(stringMatch("DiagnosticReport.issued", obj.snapshot!!.element[5].base!!.path))
        assertEquals(1, obj.snapshot!!.element[5].base!!.min)
        assertTrue(stringMatch("1", obj.snapshot!!.element[5].base!!.max))
        assertTrue(stringMatch("dateTime", obj.snapshot!!.element[5].type[0].code))
        assertEquals(false, if (obj.snapshot!!.element[5].isModifier != null) obj.snapshot!!.element[5].isModifier else false, "Field: obj.snapshot!!.element[5].isModifier")
        assertTrue(stringMatch("DiagnosticReport.subject", obj.snapshot!!.element[6].id))
        assertTrue(stringMatch("DiagnosticReport.subject", obj.snapshot!!.element[6].path))
        assertTrue(stringMatch("The subject of the report", obj.snapshot!!.element[6].short))
        assertTrue(stringMatch("The subject of the report. Us", obj.snapshot!!.element[6].definition))
        assertEquals(1, obj.snapshot!!.element[6].min)
        assertTrue(stringMatch("1", obj.snapshot!!.element[6].max))
        assertTrue(stringMatch("DiagnosticReport.subject", obj.snapshot!!.element[6].base!!.path))
        assertEquals(1, obj.snapshot!!.element[6].base!!.min)
        assertTrue(stringMatch("1", obj.snapshot!!.element[6].base!!.max))
        assertTrue(stringMatch("Reference", obj.snapshot!!.element[6].type[0].code))
        assertTrue(stringMatch("http://hl7.org/fhir/Structure", obj.snapshot!!.element[6].type[0].targetProfile))
        assertTrue(stringMatch("bundled", obj.snapshot!!.element[6].type[0].aggregation[0]))
        assertTrue(stringMatch("either", obj.snapshot!!.element[6].type[0].versioning))
        assertTrue(stringMatch("Reference", obj.snapshot!!.element[6].type[1].code))
        assertTrue(stringMatch("http://hl7.org/fhir/Structure", obj.snapshot!!.element[6].type[1].targetProfile))
        assertTrue(stringMatch("bundled", obj.snapshot!!.element[6].type[1].aggregation[0]))
        assertTrue(stringMatch("Reference", obj.snapshot!!.element[6].type[2].code))
        assertTrue(stringMatch("http://hl7.org/fhir/Structure", obj.snapshot!!.element[6].type[2].targetProfile))
        assertTrue(stringMatch("bundled", obj.snapshot!!.element[6].type[2].aggregation[0]))
        assertEquals(false, if (obj.snapshot!!.element[6].isModifier != null) obj.snapshot!!.element[6].isModifier else false, "Field: obj.snapshot!!.element[6].isModifier")
        assertTrue(stringMatch("DiagnosticReport.performer", obj.snapshot!!.element[7].id))
        assertTrue(stringMatch("DiagnosticReport.performer", obj.snapshot!!.element[7].path))
        assertTrue(stringMatch("Responsible Diagnostic Servic", obj.snapshot!!.element[7].short))
        assertTrue(stringMatch("The diagnostic service that i", obj.snapshot!!.element[7].definition))
        assertTrue(stringMatch("This is not necessarily the s", obj.snapshot!!.element[7].comment))
        assertEquals(1, obj.snapshot!!.element[7].min)
        assertTrue(stringMatch("1", obj.snapshot!!.element[7].max))
        assertTrue(stringMatch("DiagnosticReport.performer", obj.snapshot!!.element[7].base!!.path))
        assertEquals(1, obj.snapshot!!.element[7].base!!.min)
        assertTrue(stringMatch("1", obj.snapshot!!.element[7].base!!.max))
        assertTrue(stringMatch("Reference", obj.snapshot!!.element[7].type[0].code))
        assertTrue(stringMatch("http://hl7.org/fhir/Structure", obj.snapshot!!.element[7].type[0].targetProfile))
        assertEquals(false, if (obj.snapshot!!.element[7].isModifier != null) obj.snapshot!!.element[7].isModifier else false, "Field: obj.snapshot!!.element[7].isModifier")
        assertTrue(stringMatch("DiagnosticReport.identifier", obj.snapshot!!.element[8].id))
        assertTrue(stringMatch("DiagnosticReport.identifier", obj.snapshot!!.element[8].path))
        assertTrue(stringMatch("Id for external references to", obj.snapshot!!.element[8].short))
        assertTrue(stringMatch("The local ID assigned to the ", obj.snapshot!!.element[8].definition))
        assertEquals(0, obj.snapshot!!.element[8].min)
        assertTrue(stringMatch("1", obj.snapshot!!.element[8].max))
        assertTrue(stringMatch("DiagnosticReport.identifier", obj.snapshot!!.element[8].base!!.path))
        assertEquals(0, obj.snapshot!!.element[8].base!!.min)
        assertTrue(stringMatch("*", obj.snapshot!!.element[8].base!!.max))
        assertTrue(stringMatch("Identifier", obj.snapshot!!.element[8].type[0].code))
        assertEquals(false, if (obj.snapshot!!.element[8].isModifier != null) obj.snapshot!!.element[8].isModifier else false, "Field: obj.snapshot!!.element[8].isModifier")
        assertTrue(stringMatch("DiagnosticReport.request", obj.snapshot!!.element[9].id))
        assertTrue(stringMatch("DiagnosticReport.request", obj.snapshot!!.element[9].path))
        assertTrue(stringMatch("What was requested", obj.snapshot!!.element[9].short))
        assertTrue(stringMatch("Details concerning a single p", obj.snapshot!!.element[9].definition))
        assertTrue(stringMatch("Note: Usually there is one te", obj.snapshot!!.element[9].comment))
        assertEquals(0, obj.snapshot!!.element[9].min)
        assertTrue(stringMatch("*", obj.snapshot!!.element[9].max))
        assertTrue(stringMatch("DiagnosticReport.request", obj.snapshot!!.element[9].base!!.path))
        assertEquals(0, obj.snapshot!!.element[9].base!!.min)
        assertTrue(stringMatch("*", obj.snapshot!!.element[9].base!!.max))
        assertTrue(stringMatch("Reference", obj.snapshot!!.element[9].type[0].code))
        assertTrue(stringMatch("http://hl7.org/fhir/Structure", obj.snapshot!!.element[9].type[0].targetProfile))
        assertTrue(stringMatch("referenced", obj.snapshot!!.element[9].type[0].aggregation[0]))
        assertTrue(stringMatch("specific", obj.snapshot!!.element[9].type[0].versioning))
        assertEquals(false, if (obj.snapshot!!.element[9].isModifier != null) obj.snapshot!!.element[9].isModifier else false, "Field: obj.snapshot!!.element[9].isModifier")
        assertTrue(stringMatch("DiagnosticReport.category", obj.snapshot!!.element[10].id))
        assertTrue(stringMatch("DiagnosticReport.category", obj.snapshot!!.element[10].path))
        assertTrue(stringMatch("Biochemistry, Haematology etc", obj.snapshot!!.element[10].short))
        assertTrue(stringMatch("The section of the diagnostic", obj.snapshot!!.element[10].definition))
        assertEquals(0, obj.snapshot!!.element[10].min)
        assertTrue(stringMatch("1", obj.snapshot!!.element[10].max))
        assertTrue(stringMatch("DiagnosticReport.category", obj.snapshot!!.element[10].base!!.path))
        assertEquals(0, obj.snapshot!!.element[10].base!!.min)
        assertTrue(stringMatch("1", obj.snapshot!!.element[10].base!!.max))
        assertTrue(stringMatch("CodeableConcept", obj.snapshot!!.element[10].type[0].code))
        assertEquals(false, if (obj.snapshot!!.element[10].isModifier != null) obj.snapshot!!.element[10].isModifier else false, "Field: obj.snapshot!!.element[10].isModifier")
        assertTrue(stringMatch("preferred", obj.snapshot!!.element[10].binding!!.strength))
        assertTrue(stringMatch("http://hl7.org/fhir/ValueSet/", obj.snapshot!!.element[10].binding!!.valueSetReference!!.reference))
        assertTrue(stringMatch("DiagnosticReport.effectiveDat", obj.snapshot!!.element[11].id))
        assertTrue(stringMatch("DiagnosticReport.effectiveDat", obj.snapshot!!.element[11].path))
        assertTrue(stringMatch("Diagnostically relevant time ", obj.snapshot!!.element[11].short))
        assertTrue(stringMatch("The diagnostically relevant t", obj.snapshot!!.element[11].definition))
        assertTrue(stringMatch("If the diagnostic procedure w", obj.snapshot!!.element[11].comment))
        assertEquals(1, obj.snapshot!!.element[11].min)
        assertTrue(stringMatch("1", obj.snapshot!!.element[11].max))
        assertTrue(stringMatch("DiagnosticReport.effective[x]", obj.snapshot!!.element[11].base!!.path))
        assertEquals(1, obj.snapshot!!.element[11].base!!.min)
        assertTrue(stringMatch("1", obj.snapshot!!.element[11].base!!.max))
        assertTrue(stringMatch("dateTime", obj.snapshot!!.element[11].type[0].code))
        assertEquals(false, if (obj.snapshot!!.element[11].isModifier != null) obj.snapshot!!.element[11].isModifier else false, "Field: obj.snapshot!!.element[11].isModifier")
        assertTrue(stringMatch("DiagnosticReport.result", obj.snapshot!!.element[12].id))
        assertTrue(stringMatch("DiagnosticReport.result", obj.snapshot!!.element[12].path))
        assertTrue(stringMatch("value", obj.snapshot!!.element[12].slicing!!.discriminator[0].type))
        assertTrue(stringMatch("reference.resolve().code", obj.snapshot!!.element[12].slicing!!.discriminator[0].path))
        assertEquals(false, if (obj.snapshot!!.element[12].slicing!!.ordered != null) obj.snapshot!!.element[12].slicing!!.ordered else false, "Field: obj.snapshot!!.element[12].slicing!!.ordered")
        assertTrue(stringMatch("open", obj.snapshot!!.element[12].slicing!!.rules))
        assertTrue(stringMatch("Lipid Lab Results", obj.snapshot!!.element[12].short))
        assertTrue(stringMatch("Lipid Lab Results.", obj.snapshot!!.element[12].definition))
        assertEquals(4, obj.snapshot!!.element[12].min)
        assertTrue(stringMatch("4", obj.snapshot!!.element[12].max))
        assertTrue(stringMatch("DiagnosticReport.result", obj.snapshot!!.element[12].base!!.path))
        assertEquals(0, obj.snapshot!!.element[12].base!!.min)
        assertTrue(stringMatch("*", obj.snapshot!!.element[12].base!!.max))
        assertTrue(stringMatch("Reference", obj.snapshot!!.element[12].type[0].code))
        assertTrue(stringMatch("http://hl7.org/fhir/Structure", obj.snapshot!!.element[12].type[0].targetProfile))
        assertTrue(stringMatch("bundled", obj.snapshot!!.element[12].type[0].aggregation[0]))
        assertTrue(stringMatch("specific", obj.snapshot!!.element[12].type[0].versioning))
        assertEquals(false, if (obj.snapshot!!.element[12].isModifier != null) obj.snapshot!!.element[12].isModifier else false, "Field: obj.snapshot!!.element[12].isModifier")
        assertTrue(stringMatch("DiagnosticReport.result.Chole", obj.snapshot!!.element[13].id))
        assertTrue(stringMatch("DiagnosticReport.result", obj.snapshot!!.element[13].path))
        assertTrue(stringMatch("Cholesterol", obj.snapshot!!.element[13].sliceName))
        assertTrue(stringMatch("Cholesterol Result", obj.snapshot!!.element[13].short))
        assertTrue(stringMatch("Reference to Cholesterol Resu", obj.snapshot!!.element[13].definition))
        assertEquals(1, obj.snapshot!!.element[13].min)
        assertTrue(stringMatch("1", obj.snapshot!!.element[13].max))
        assertTrue(stringMatch("DiagnosticReport.result", obj.snapshot!!.element[13].base!!.path))
        assertEquals(0, obj.snapshot!!.element[13].base!!.min)
        assertTrue(stringMatch("*", obj.snapshot!!.element[13].base!!.max))
        assertTrue(stringMatch("Reference", obj.snapshot!!.element[13].type[0].code))
        assertTrue(stringMatch("http://hl7.org/fhir/Structure", obj.snapshot!!.element[13].type[0].targetProfile))
        assertTrue(stringMatch("bundled", obj.snapshot!!.element[13].type[0].aggregation[0]))
        assertTrue(stringMatch("specific", obj.snapshot!!.element[13].type[0].versioning))
        assertEquals(false, if (obj.snapshot!!.element[13].isModifier != null) obj.snapshot!!.element[13].isModifier else false, "Field: obj.snapshot!!.element[13].isModifier")
        assertTrue(stringMatch("DiagnosticReport.result.Trigl", obj.snapshot!!.element[14].id))
        assertTrue(stringMatch("DiagnosticReport.result", obj.snapshot!!.element[14].path))
        assertTrue(stringMatch("Triglyceride", obj.snapshot!!.element[14].sliceName))
        assertTrue(stringMatch("Triglyceride Result", obj.snapshot!!.element[14].short))
        assertTrue(stringMatch("Group of elements for Triglyc", obj.snapshot!!.element[14].definition))
        assertEquals(1, obj.snapshot!!.element[14].min)
        assertTrue(stringMatch("1", obj.snapshot!!.element[14].max))
        assertTrue(stringMatch("DiagnosticReport.result", obj.snapshot!!.element[14].base!!.path))
        assertEquals(0, obj.snapshot!!.element[14].base!!.min)
        assertTrue(stringMatch("*", obj.snapshot!!.element[14].base!!.max))
        assertTrue(stringMatch("Reference", obj.snapshot!!.element[14].type[0].code))
        assertTrue(stringMatch("http://hl7.org/fhir/Structure", obj.snapshot!!.element[14].type[0].targetProfile))
        assertTrue(stringMatch("bundled", obj.snapshot!!.element[14].type[0].aggregation[0]))
        assertTrue(stringMatch("specific", obj.snapshot!!.element[14].type[0].versioning))
        assertEquals(false, if (obj.snapshot!!.element[14].isModifier != null) obj.snapshot!!.element[14].isModifier else false, "Field: obj.snapshot!!.element[14].isModifier")
        assertTrue(stringMatch("DiagnosticReport.result.HDLCh", obj.snapshot!!.element[15].id))
        assertTrue(stringMatch("DiagnosticReport.result", obj.snapshot!!.element[15].path))
        assertTrue(stringMatch("HDLCholesterol", obj.snapshot!!.element[15].sliceName))
        assertTrue(stringMatch("HDL Cholesterol Result", obj.snapshot!!.element[15].short))
        assertTrue(stringMatch("Group of elements for HDL Cho", obj.snapshot!!.element[15].definition))
        assertEquals(1, obj.snapshot!!.element[15].min)
        assertTrue(stringMatch("1", obj.snapshot!!.element[15].max))
        assertTrue(stringMatch("DiagnosticReport.result", obj.snapshot!!.element[15].base!!.path))
        assertEquals(0, obj.snapshot!!.element[15].base!!.min)
        assertTrue(stringMatch("*", obj.snapshot!!.element[15].base!!.max))
        assertTrue(stringMatch("Reference", obj.snapshot!!.element[15].type[0].code))
        assertTrue(stringMatch("http://hl7.org/fhir/Structure", obj.snapshot!!.element[15].type[0].targetProfile))
        assertTrue(stringMatch("bundled", obj.snapshot!!.element[15].type[0].aggregation[0]))
        assertTrue(stringMatch("specific", obj.snapshot!!.element[15].type[0].versioning))
        assertEquals(false, if (obj.snapshot!!.element[15].isModifier != null) obj.snapshot!!.element[15].isModifier else false, "Field: obj.snapshot!!.element[15].isModifier")
        assertTrue(stringMatch("DiagnosticReport.result.LDLCh", obj.snapshot!!.element[16].id))
        assertTrue(stringMatch("DiagnosticReport.result", obj.snapshot!!.element[16].path))
        assertTrue(stringMatch("LDLCholesterol", obj.snapshot!!.element[16].sliceName))
        assertTrue(stringMatch("LDL Cholesterol result, if re", obj.snapshot!!.element[16].short))
        assertTrue(stringMatch("LDL Cholesterol result, if re", obj.snapshot!!.element[16].definition))
        assertEquals(0, obj.snapshot!!.element[16].min)
        assertTrue(stringMatch("1", obj.snapshot!!.element[16].max))
        assertTrue(stringMatch("DiagnosticReport.result", obj.snapshot!!.element[16].base!!.path))
        assertEquals(0, obj.snapshot!!.element[16].base!!.min)
        assertTrue(stringMatch("*", obj.snapshot!!.element[16].base!!.max))
        assertTrue(stringMatch("Reference", obj.snapshot!!.element[16].type[0].code))
        assertTrue(stringMatch("http://hl7.org/fhir/Structure", obj.snapshot!!.element[16].type[0].targetProfile))
        assertTrue(stringMatch("bundled", obj.snapshot!!.element[16].type[0].aggregation[0]))
        assertTrue(stringMatch("specific", obj.snapshot!!.element[16].type[0].versioning))
        assertEquals(false, if (obj.snapshot!!.element[16].isModifier != null) obj.snapshot!!.element[16].isModifier else false, "Field: obj.snapshot!!.element[16].isModifier")
        assertTrue(stringMatch("DiagnosticReport.conclusion", obj.snapshot!!.element[17].id))
        assertTrue(stringMatch("DiagnosticReport.conclusion", obj.snapshot!!.element[17].path))
        assertTrue(stringMatch("Clinical Interpretation of Li", obj.snapshot!!.element[17].short))
        assertTrue(stringMatch("May include diagnosis or sugg", obj.snapshot!!.element[17].definition))
        assertTrue(stringMatch("It's not unusual for the lab ", obj.snapshot!!.element[17].comment))
        assertEquals(0, obj.snapshot!!.element[17].min)
        assertTrue(stringMatch("1", obj.snapshot!!.element[17].max))
        assertTrue(stringMatch("DiagnosticReport.conclusion", obj.snapshot!!.element[17].base!!.path))
        assertEquals(0, obj.snapshot!!.element[17].base!!.min)
        assertTrue(stringMatch("1", obj.snapshot!!.element[17].base!!.max))
        assertTrue(stringMatch("string", obj.snapshot!!.element[17].type[0].code))
        assertEquals(false, if (obj.snapshot!!.element[17].isModifier != null) obj.snapshot!!.element[17].isModifier else false, "Field: obj.snapshot!!.element[17].isModifier")
        assertTrue(stringMatch("DiagnosticReport.representati", obj.snapshot!!.element[18].id))
        assertTrue(stringMatch("DiagnosticReport.representati", obj.snapshot!!.element[18].path))
        assertTrue(stringMatch("Entire Report as issued", obj.snapshot!!.element[18].short))
        assertTrue(stringMatch("Rich text representation of t", obj.snapshot!!.element[18].definition))
        assertTrue(stringMatch("Possible formats: text/html, ", obj.snapshot!!.element[18].comment))
        assertEquals(0, obj.snapshot!!.element[18].min)
        assertTrue(stringMatch("*", obj.snapshot!!.element[18].max))
        assertTrue(stringMatch("DiagnosticReport.representati", obj.snapshot!!.element[18].base!!.path))
        assertEquals(0, obj.snapshot!!.element[18].base!!.min)
        assertTrue(stringMatch("*", obj.snapshot!!.element[18].base!!.max))
        assertTrue(stringMatch("Attachment", obj.snapshot!!.element[18].type[0].code))
        assertEquals(false, if (obj.snapshot!!.element[18].isModifier != null) obj.snapshot!!.element[18].isModifier else false, "Field: obj.snapshot!!.element[18].isModifier")
    }

    fun `structuredefinition-example Init`(@SuppressWarnings("unused") obj: Bundle) {
        obj.identifier  // No-Op to suprress unused warnings
    }
}
