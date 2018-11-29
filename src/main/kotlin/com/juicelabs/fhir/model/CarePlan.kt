//
//  Generated from FHIR Version 3.0.1.11917 on 2018-11-29T14:32:35.367 
//
//   2018, JuiceLab, LLC
//  
package com.juicelabs.fhir.model

import kotlin.collections.List

/**
 * Healthcare plan for patient or group
 *
 * Describes the intention of how one or more practitioners intend to deliver care for a particular patient, group or community for a period of time, possibly limited to care for a specific condition or set of conditions.
 */
open class CarePlan() : DomainResource() {
    val identifier: List<Identifier> = mutableListOf<Identifier>()

    val definition: List<Reference> = mutableListOf<Reference>()

    val basedOn: List<Reference> = mutableListOf<Reference>()

    val replaces: List<Reference> = mutableListOf<Reference>()

    val partOf: List<Reference> = mutableListOf<Reference>()

    /**
     * draft | active | suspended | completed | entered-in-error | cancelled | unknown
     */
    var status: String? = null

    /**
     * proposal | plan | order | option
     */
    var intent: String? = null

    val category: List<CodeableConcept> = mutableListOf<CodeableConcept>()

    /**
     * Human-friendly name for the CarePlan
     */
    var title: String? = null

    /**
     * Summary of nature of plan
     */
    var description: String? = null

    /**
     * Who care plan is for
     */
    var subject: Reference = Reference()

    /**
     * Created in context of
     */
    var context: Reference? = null

    /**
     * Time period plan covers
     */
    var period: Period? = null

    val author: List<Reference> = mutableListOf<Reference>()

    val careTeam: List<Reference> = mutableListOf<Reference>()

    val addresses: List<Reference> = mutableListOf<Reference>()

    val supportingInfo: List<Reference> = mutableListOf<Reference>()

    val goal: List<Reference> = mutableListOf<Reference>()

    val activity: List<CarePlanActivity> = mutableListOf<CarePlanActivity>()

    val note: List<Annotation> = mutableListOf<Annotation>()
}

/**
 * Action to occur as part of plan
 *
 * Identifies a planned action to occur as part of the plan.  For example, a medication to be used, lab tests to perform, self-monitoring, education, etc.
 */
open class CarePlanActivity() : BackboneElement() {
    val outcomeCodeableConcept: List<CodeableConcept> = mutableListOf<CodeableConcept>()

    val outcomeReference: List<Reference> = mutableListOf<Reference>()

    val progress: List<Annotation> = mutableListOf<Annotation>()

    /**
     * Activity details defined in specific resource
     */
    var reference: Reference? = null

    /**
     * In-line definition of activity
     */
    var detail: CarePlanActivityDetail? = null
}

/**
 * In-line definition of activity
 *
 * A simple summary of a planned activity suitable for a general care plan system (e.g. form driven) that doesn't know about specific resources such as procedure etc.
 */
open class CarePlanActivityDetail() : BackboneElement() {
    /**
     * diet | drug | encounter | observation | procedure | supply | other
     */
    var category: CodeableConcept? = null

    /**
     * Protocol or definition
     */
    var definition: Reference? = null

    /**
     * Detail type of activity
     */
    var code: CodeableConcept? = null

    val reasonCode: List<CodeableConcept> = mutableListOf<CodeableConcept>()

    val reasonReference: List<Reference> = mutableListOf<Reference>()

    val goal: List<Reference> = mutableListOf<Reference>()

    /**
     * not-started | scheduled | in-progress | on-hold | completed | cancelled | unknown
     */
    var status: String? = null

    /**
     * Reason for current status
     */
    var statusReason: String? = null

    /**
     * Do NOT do
     */
    var prohibited: Boolean? = null

    /**
     * When activity is to occur
     */
    var scheduledTiming: Timing? = null

    /**
     * When activity is to occur
     */
    var scheduledPeriod: Period? = null

    /**
     * When activity is to occur
     */
    var scheduledString: String? = null

    /**
     * Where it should happen
     */
    var location: Reference? = null

    val performer: List<Reference> = mutableListOf<Reference>()

    /**
     * What is to be administered/supplied
     */
    var productCodeableConcept: CodeableConcept? = null

    /**
     * What is to be administered/supplied
     */
    var productReference: Reference? = null

    /**
     * How to consume/day?
     */
    var dailyAmount: Quantity? = null

    /**
     * How much to administer/supply/consume
     */
    var quantity: Quantity? = null

    /**
     * Extra info describing activity to perform
     */
    var description: String? = null
}
