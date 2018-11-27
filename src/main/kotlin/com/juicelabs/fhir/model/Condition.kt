//
//  Generated from FHIR Version 3.0.1.11917 on 2018-11-27T12:50:39.902 
//
//   2018, JuiceLab, LLC
//  
package com.juicelabs.fhir.model

import com.juicelabs.fhir.base.FhirDate
import kotlin.collections.List

/**
 * Detailed information about conditions, problems or diagnoses
 *
 * A clinical condition, problem, diagnosis, or other event, situation, issue, or clinical concept that has risen to a level of concern.
 */
open class Condition() : DomainResource() {
    val identifier: List<Identifier> = mutableListOf<Identifier>()

    /**
     * active | recurrence | inactive | remission | resolved
     */
    var clinicalStatus: String? = null

    /**
     * provisional | differential | confirmed | refuted | entered-in-error | unknown
     */
    var verificationStatus: String? = null

    val category: List<CodeableConcept> = mutableListOf<CodeableConcept>()

    /**
     * Subjective severity of condition
     */
    var severity: CodeableConcept? = null

    /**
     * Identification of the condition, problem or diagnosis
     */
    var code: CodeableConcept? = null

    val bodySite: List<CodeableConcept> = mutableListOf<CodeableConcept>()

    /**
     * Who has the condition?
     */
    var subject: Reference = Reference()

    /**
     * Encounter or episode when condition first asserted
     */
    var context: Reference? = null

    /**
     * Estimated or actual date,  date-time, or age
     */
    var onsetDateTime: FhirDate? = null

    /**
     * Estimated or actual date,  date-time, or age
     */
    var onsetAge: Age? = null

    /**
     * Estimated or actual date,  date-time, or age
     */
    var onsetPeriod: Period? = null

    /**
     * Estimated or actual date,  date-time, or age
     */
    var onsetRange: Range? = null

    /**
     * Estimated or actual date,  date-time, or age
     */
    var onsetString: String? = null

    /**
     * If/when in resolution/remission
     */
    var abatementDateTime: FhirDate? = null

    /**
     * If/when in resolution/remission
     */
    var abatementAge: Age? = null

    /**
     * If/when in resolution/remission
     */
    var abatementBoolean: Boolean? = null

    /**
     * If/when in resolution/remission
     */
    var abatementPeriod: Period? = null

    /**
     * If/when in resolution/remission
     */
    var abatementRange: Range? = null

    /**
     * If/when in resolution/remission
     */
    var abatementString: String? = null

    /**
     * Date record was believed accurate
     */
    var assertedDate: FhirDate? = null

    /**
     * Person who asserts this condition
     */
    var asserter: Reference? = null

    /**
     * Stage/grade, usually assessed formally
     */
    var stage: ConditionStage? = null

    val evidence: List<ConditionEvidence> = mutableListOf<ConditionEvidence>()

    val note: List<Annotation> = mutableListOf<Annotation>()
}

/**
 * Stage/grade, usually assessed formally
 *
 * Clinical stage or grade of a condition. May include formal severity assessments.
 */
open class ConditionStage() : BackboneElement() {
    /**
     * Simple summary (disease specific)
     */
    var summary: CodeableConcept? = null

    val assessment: List<Reference> = mutableListOf<Reference>()
}

/**
 * Supporting evidence
 *
 * Supporting Evidence / manifestations that are the basis on which this condition is suspected or confirmed.
 */
open class ConditionEvidence() : BackboneElement() {
    val code: List<CodeableConcept> = mutableListOf<CodeableConcept>()

    val detail: List<Reference> = mutableListOf<Reference>()
}
