//
//  Generated from FHIR Version 3.0.1.11917 on 2018-11-29T05:04:14.919 
//
//   2018, JuiceLab, LLC
//  
package com.juicelabs.fhir.model

import com.juicelabs.fhir.base.FhirDate
import kotlin.collections.List

/**
 * Measurements and simple assertions
 *
 * Measurements and simple assertions made about a patient, device or other subject.
 */
open class Observation() : DomainResource() {
    val identifier: List<Identifier> = mutableListOf<Identifier>()

    val basedOn: List<Reference> = mutableListOf<Reference>()

    /**
     * registered | preliminary | final | amended +
     */
    var status: String? = null

    val category: List<CodeableConcept> = mutableListOf<CodeableConcept>()

    /**
     * Type of observation (code / type)
     */
    var code: CodeableConcept = CodeableConcept()

    /**
     * Who and/or what this is about
     */
    var subject: Reference? = null

    /**
     * Healthcare event during which this observation is made
     */
    var context: Reference? = null

    /**
     * Clinically relevant time/time-period for observation
     */
    var effectiveDateTime: FhirDate? = null

    /**
     * Clinically relevant time/time-period for observation
     */
    var effectivePeriod: Period? = null

    /**
     * Date/Time this was made available
     */
    var issued: FhirDate? = null

    val performer: List<Reference> = mutableListOf<Reference>()

    /**
     * Actual result
     */
    var valueQuantity: Quantity? = null

    /**
     * Actual result
     */
    var valueCodeableConcept: CodeableConcept? = null

    /**
     * Actual result
     */
    var valueString: String? = null

    /**
     * Actual result
     */
    var valueBoolean: Boolean? = null

    /**
     * Actual result
     */
    var valueRange: Range? = null

    /**
     * Actual result
     */
    var valueRatio: Ratio? = null

    /**
     * Actual result
     */
    var valueSampledData: SampledData? = null

    /**
     * Actual result
     */
    var valueAttachment: Attachment? = null

    /**
     * Actual result
     */
    var valueTime: FhirDate? = null

    /**
     * Actual result
     */
    var valueDateTime: FhirDate? = null

    /**
     * Actual result
     */
    var valuePeriod: Period? = null

    /**
     * Why the result is missing
     */
    var dataAbsentReason: CodeableConcept? = null

    /**
     * High, low, normal, etc.
     */
    var interpretation: CodeableConcept? = null

    /**
     * Comments about result
     */
    var comment: String? = null

    /**
     * Observed body part
     */
    var bodySite: CodeableConcept? = null

    /**
     * How it was done
     */
    var method: CodeableConcept? = null

    /**
     * Specimen used for this observation
     */
    var specimen: Reference? = null

    /**
     * (Measurement) Device
     */
    var device: Reference? = null

    val referenceRange: List<ObservationReferenceRange> = mutableListOf<ObservationReferenceRange>()

    val related: List<ObservationRelated> = mutableListOf<ObservationRelated>()

    val component: List<ObservationComponent> = mutableListOf<ObservationComponent>()
}

/**
 * Provides guide for interpretation
 *
 * Guidance on how to interpret the value by comparison to a normal or recommended range.
 */
open class ObservationReferenceRange() : BackboneElement() {
    /**
     * Low Range, if relevant
     */
    var low: Quantity? = null

    /**
     * High Range, if relevant
     */
    var high: Quantity? = null

    /**
     * Reference range qualifier
     */
    var type: CodeableConcept? = null

    val appliesTo: List<CodeableConcept> = mutableListOf<CodeableConcept>()

    /**
     * Applicable age range, if relevant
     */
    var age: Range? = null

    /**
     * Text based reference range in an observation
     */
    var text: String? = null
}

/**
 * Resource related to this observation
 *
 * A  reference to another resource (usually another Observation) whose relationship is defined by the relationship type code.
 */
open class ObservationRelated() : BackboneElement() {
    /**
     * has-member | derived-from | sequel-to | replaces | qualified-by | interfered-by
     */
    var type: String? = null

    /**
     * Resource that is related to this one
     */
    var target: Reference = Reference()
}

/**
 * Component results
 *
 * Some observations have multiple component observations.  These component observations are expressed as separate code value pairs that share the same attributes.  Examples include systolic and diastolic component observations for blood pressure measurement and multiple component observations for genetics observations.
 */
open class ObservationComponent() : BackboneElement() {
    /**
     * Type of component observation (code / type)
     */
    var code: CodeableConcept = CodeableConcept()

    /**
     * Actual component result
     */
    var valueQuantity: Quantity? = null

    /**
     * Actual component result
     */
    var valueCodeableConcept: CodeableConcept? = null

    /**
     * Actual component result
     */
    var valueString: String? = null

    /**
     * Actual component result
     */
    var valueRange: Range? = null

    /**
     * Actual component result
     */
    var valueRatio: Ratio? = null

    /**
     * Actual component result
     */
    var valueSampledData: SampledData? = null

    /**
     * Actual component result
     */
    var valueAttachment: Attachment? = null

    /**
     * Actual component result
     */
    var valueTime: FhirDate? = null

    /**
     * Actual component result
     */
    var valueDateTime: FhirDate? = null

    /**
     * Actual component result
     */
    var valuePeriod: Period? = null

    /**
     * Why the component result is missing
     */
    var dataAbsentReason: CodeableConcept? = null

    /**
     * High, low, normal, etc.
     */
    var interpretation: CodeableConcept? = null

    val referenceRange: List<ObservationReferenceRange> = mutableListOf<ObservationReferenceRange>()
}
