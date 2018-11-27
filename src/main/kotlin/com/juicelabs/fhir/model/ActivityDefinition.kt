//
//  Generated from FHIR Version 3.0.1.11917 on 2018-11-27T12:50:39.851 
//
//   2018, JuiceLab, LLC
//  
package com.juicelabs.fhir.model

import com.juicelabs.fhir.base.FhirDate
import kotlin.collections.List

/**
 * The definition of a specific activity to be taken, independent of any particular patient or context
 *
 * This resource allows for the definition of some activity to be performed, independent of a particular patient, practitioner, or other performance context.
 */
open class ActivityDefinition() : DomainResource() {
    /**
     * Logical URI to reference this activity definition (globally unique)
     */
    var url: String? = null

    val identifier: List<Identifier> = mutableListOf<Identifier>()

    /**
     * Business version of the activity definition
     */
    var version: String? = null

    /**
     * Name for this activity definition (computer friendly)
     */
    var name: String? = null

    /**
     * Name for this activity definition (human friendly)
     */
    var title: String? = null

    /**
     * draft | active | retired | unknown
     */
    var status: String = ""

    /**
     * For testing purposes, not real usage
     */
    var experimental: Boolean? = null

    /**
     * Date this was last changed
     */
    var date: FhirDate? = null

    /**
     * Name of the publisher (organization or individual)
     */
    var publisher: String? = null

    /**
     * Natural language description of the activity definition
     */
    var description: String? = null

    /**
     * Why this activity definition is defined
     */
    var purpose: String? = null

    /**
     * Describes the clinical usage of the asset
     */
    var usage: String? = null

    /**
     * When the activity definition was approved by publisher
     */
    var approvalDate: FhirDate? = null

    /**
     * When the activity definition was last reviewed
     */
    var lastReviewDate: FhirDate? = null

    /**
     * When the activity definition is expected to be used
     */
    var effectivePeriod: Period? = null

    val useContext: List<UsageContext> = mutableListOf<UsageContext>()

    val jurisdiction: List<CodeableConcept> = mutableListOf<CodeableConcept>()

    val topic: List<CodeableConcept> = mutableListOf<CodeableConcept>()

    val contributor: List<Contributor> = mutableListOf<Contributor>()

    val contact: List<ContactDetail> = mutableListOf<ContactDetail>()

    /**
     * Use and/or publishing restrictions
     */
    var copyright: String? = null

    val relatedArtifact: List<RelatedArtifact> = mutableListOf<RelatedArtifact>()

    val library: List<Reference> = mutableListOf<Reference>()

    /**
     * Kind of resource
     */
    var kind: String? = null

    /**
     * Detail type of activity
     */
    var code: CodeableConcept? = null

    /**
     * When activity is to occur
     */
    var timingTiming: Timing? = null

    /**
     * When activity is to occur
     */
    var timingDateTime: FhirDate? = null

    /**
     * When activity is to occur
     */
    var timingPeriod: Period? = null

    /**
     * When activity is to occur
     */
    var timingRange: Range? = null

    /**
     * Where it should happen
     */
    var location: Reference? = null

    val participant: List<ActivityDefinitionParticipant> =
            mutableListOf<ActivityDefinitionParticipant>()

    /**
     * What's administered/supplied
     */
    var productReference: Reference? = null

    /**
     * What's administered/supplied
     */
    var productCodeableConcept: CodeableConcept? = null

    /**
     * How much is administered/consumed/supplied
     */
    var quantity: Quantity? = null

    val dosage: List<Dosage> = mutableListOf<Dosage>()

    val bodySite: List<CodeableConcept> = mutableListOf<CodeableConcept>()

    /**
     * Transform to apply the template
     */
    var transform: Reference? = null

    val dynamicValue: List<ActivityDefinitionDynamicValue> =
            mutableListOf<ActivityDefinitionDynamicValue>()
}

/**
 * Who should participate in the action
 *
 * Indicates who should participate in performing the action described.
 */
open class ActivityDefinitionParticipant() : BackboneElement() {
    /**
     * patient | practitioner | related-person
     */
    var type: String = ""

    /**
     * E.g. Nurse, Surgeon, Parent, etc
     */
    var role: CodeableConcept? = null
}

/**
 * Dynamic aspects of the definition
 *
 * Dynamic values that will be evaluated to produce values for elements of the resulting resource. For example, if the dosage of a medication must be computed based on the patient's weight, a dynamic value would be used to specify an expression that calculated the weight, and the path on the intent resource that would contain the result.
 */
open class ActivityDefinitionDynamicValue() : BackboneElement() {
    /**
     * Natural language description of the dynamic value
     */
    var description: String? = null

    /**
     * The path to the element to be set dynamically
     */
    var path: String? = null

    /**
     * Language of the expression
     */
    var language: String? = null

    /**
     * An expression that provides the dynamic value for the customization
     */
    var expression: String? = null
}
