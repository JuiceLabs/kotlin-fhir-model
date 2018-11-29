//
//  Generated from FHIR Version 3.0.1.11917 on 2018-11-29T05:04:14.878 
//
//   2018, JuiceLab, LLC
//  
package com.juicelabs.fhir.model

import com.google.gson.annotations.SerializedName
import com.juicelabs.fhir.base.FhirDate
import kotlin.collections.List

/**
 * A set of resources composed into a single coherent clinical statement with clinical attestation
 *
 * A set of healthcare-related information that is assembled together into a single logical document that provides a single coherent statement of meaning, establishes its own context and that has clinical attestation with regard to who is making the statement. While a Composition defines the structure, it does not actually contain the content: rather the full content of a document is contained in a Bundle, of which the Composition is the first resource contained.
 */
open class Composition() : DomainResource() {
    /**
     * Logical identifier of composition (version-independent)
     */
    var identifier: Identifier? = null

    /**
     * preliminary | final | amended | entered-in-error
     */
    var status: String? = null

    /**
     * Kind of composition (LOINC if possible)
     */
    var type: CodeableConcept = CodeableConcept()

    /**
     * Categorization of Composition
     */
    @SerializedName("class")
    var class_fhir: CodeableConcept? = null

    /**
     * Who and/or what the composition is about
     */
    var subject: Reference = Reference()

    /**
     * Context of the Composition
     */
    var encounter: Reference? = null

    /**
     * Composition editing time
     */
    var date: FhirDate? = null

    val author: List<Reference> = mutableListOf<Reference>()

    /**
     * Human Readable name/title
     */
    var title: String? = null

    /**
     * As defined by affinity domain
     */
    var confidentiality: String? = null

    val attester: List<CompositionAttester> = mutableListOf<CompositionAttester>()

    /**
     * Organization which maintains the composition
     */
    var custodian: Reference? = null

    val relatesTo: List<CompositionRelatesTo> = mutableListOf<CompositionRelatesTo>()

    val event: List<CompositionEvent> = mutableListOf<CompositionEvent>()

    val section: List<CompositionSection> = mutableListOf<CompositionSection>()
}

/**
 * Attests to accuracy of composition
 *
 * A participant who has attested to the accuracy of the composition/document.
 */
open class CompositionAttester() : BackboneElement() {
    val mode: List<String> = mutableListOf<String>()

    /**
     * When the composition was attested
     */
    var time: FhirDate? = null

    /**
     * Who attested the composition
     */
    var party: Reference? = null
}

/**
 * Relationships to other compositions/documents
 *
 * Relationships that this composition has with other compositions or documents that already exist.
 */
open class CompositionRelatesTo() : BackboneElement() {
    /**
     * replaces | transforms | signs | appends
     */
    var code: String? = null

    /**
     * Target of the relationship
     */
    var targetIdentifier: Identifier = Identifier()

    /**
     * Target of the relationship
     */
    var targetReference: Reference = Reference()
}

/**
 * The clinical service(s) being documented
 *
 * The clinical service, such as a colonoscopy or an appendectomy, being documented.
 */
open class CompositionEvent() : BackboneElement() {
    val code: List<CodeableConcept> = mutableListOf<CodeableConcept>()

    /**
     * The period covered by the documentation
     */
    var period: Period? = null

    val detail: List<Reference> = mutableListOf<Reference>()
}

/**
 * Composition is broken into sections
 *
 * The root of the sections that make up the composition.
 */
open class CompositionSection() : BackboneElement() {
    /**
     * Label for section (e.g. for ToC)
     */
    var title: String? = null

    /**
     * Classification of section (recommended)
     */
    var code: CodeableConcept? = null

    /**
     * Text summary of the section, for human interpretation
     */
    var text: Narrative? = null

    /**
     * working | snapshot | changes
     */
    var mode: String? = null

    /**
     * Order of section entries
     */
    var orderedBy: CodeableConcept? = null

    val entry: List<Reference> = mutableListOf<Reference>()

    /**
     * Why the section is empty
     */
    var emptyReason: CodeableConcept? = null

    val section: List<CompositionSection> = mutableListOf<CompositionSection>()
}
