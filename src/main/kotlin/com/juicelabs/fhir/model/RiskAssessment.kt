//
//  Generated from FHIR Version 3.0.1.11917 on 2018-11-29T05:04:15.135 
//
//   2018, JuiceLab, LLC
//  
package com.juicelabs.fhir.model

import com.juicelabs.fhir.base.FhirDate
import kotlin.collections.List

/**
 * Potential outcomes for a subject with likelihood
 *
 * An assessment of the likely outcome(s) for a patient or other subject as well as the likelihood of each outcome.
 */
open class RiskAssessment() : DomainResource() {
    /**
     * Unique identifier for the assessment
     */
    var identifier: Identifier? = null

    /**
     * Request fulfilled by this assessment
     */
    var basedOn: Reference? = null

    /**
     * Part of this occurrence
     */
    var parent: Reference? = null

    /**
     * registered | preliminary | final | amended +
     */
    var status: String? = null

    /**
     * Evaluation mechanism
     */
    var method: CodeableConcept? = null

    /**
     * Type of assessment
     */
    var code: CodeableConcept? = null

    /**
     * Who/what does assessment apply to?
     */
    var subject: Reference? = null

    /**
     * Where was assessment performed?
     */
    var context: Reference? = null

    /**
     * When was assessment made?
     */
    var occurrenceDateTime: FhirDate? = null

    /**
     * When was assessment made?
     */
    var occurrencePeriod: Period? = null

    /**
     * Condition assessed
     */
    var condition: Reference? = null

    /**
     * Who did assessment?
     */
    var performer: Reference? = null

    /**
     * Why the assessment was necessary?
     */
    var reasonCodeableConcept: CodeableConcept? = null

    /**
     * Why the assessment was necessary?
     */
    var reasonReference: Reference? = null

    val basis: List<Reference> = mutableListOf<Reference>()

    val prediction: List<RiskAssessmentPrediction> = mutableListOf<RiskAssessmentPrediction>()

    /**
     * How to reduce risk
     */
    var mitigation: String? = null

    /**
     * Comments on the risk assessment
     */
    var comment: String? = null
}

/**
 * Outcome predicted
 *
 * Describes the expected outcome for the subject.
 */
open class RiskAssessmentPrediction() : BackboneElement() {
    /**
     * Possible outcome for the subject
     */
    var outcome: CodeableConcept = CodeableConcept()

    /**
     * Likelihood of specified outcome
     */
    var probabilityDecimal: Float? = null

    /**
     * Likelihood of specified outcome
     */
    var probabilityRange: Range? = null

    /**
     * Likelihood of specified outcome as a qualitative value
     */
    var qualitativeRisk: CodeableConcept? = null

    /**
     * Relative likelihood
     */
    var relativeRisk: Float? = null

    /**
     * Timeframe or age range
     */
    var whenPeriod: Period? = null

    /**
     * Timeframe or age range
     */
    var whenRange: Range? = null

    /**
     * Explanation of prediction
     */
    var rationale: String? = null
}
