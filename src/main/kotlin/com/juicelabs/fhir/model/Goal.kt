//
//  Generated from FHIR Version 3.0.1.11917 on 2018-11-27T12:50:39.623 
//
//   2018, JuiceLab, LLC
//  
package com.juicelabs.fhir.model

import com.juicelabs.fhir.base.FhirDate
import kotlin.collections.List

/**
 * Describes the intended objective(s) for a patient, group or organization
 *
 * Describes the intended objective(s) for a patient, group or organization care, for example, weight loss, restoring an activity of daily living, obtaining herd immunity via immunization, meeting a process improvement objective, etc.
 */
open class Goal() : DomainResource() {
    val identifier: List<Identifier> = mutableListOf<Identifier>()

    /**
     * proposed | accepted | planned | in-progress | on-target | ahead-of-target | behind-target | sustaining | achieved | on-hold | cancelled | entered-in-error | rejected
     */
    var status: String = ""

    val category: List<CodeableConcept> = mutableListOf<CodeableConcept>()

    /**
     * high-priority | medium-priority | low-priority
     */
    var priority: CodeableConcept? = null

    /**
     * Code or text describing goal
     */
    var description: CodeableConcept = CodeableConcept()

    /**
     * Who this goal is intended for
     */
    var subject: Reference? = null

    /**
     * When goal pursuit begins
     */
    var startDate: FhirDate? = null

    /**
     * When goal pursuit begins
     */
    var startCodeableConcept: CodeableConcept? = null

    /**
     * Target outcome for the goal
     */
    var target: GoalTarget? = null

    /**
     * When goal status took effect
     */
    var statusDate: FhirDate? = null

    /**
     * Reason for current status
     */
    var statusReason: String? = null

    /**
     * Who's responsible for creating Goal?
     */
    var expressedBy: Reference? = null

    val addresses: List<Reference> = mutableListOf<Reference>()

    val note: List<Annotation> = mutableListOf<Annotation>()

    val outcomeCode: List<CodeableConcept> = mutableListOf<CodeableConcept>()

    val outcomeReference: List<Reference> = mutableListOf<Reference>()
}

/**
 * Target outcome for the goal
 *
 * Indicates what should be done by when.
 */
open class GoalTarget() : BackboneElement() {
    /**
     * The parameter whose value is being tracked
     */
    var measure: CodeableConcept? = null

    /**
     * The target value to be achieved
     */
    var detailQuantity: Quantity? = null

    /**
     * The target value to be achieved
     */
    var detailRange: Range? = null

    /**
     * The target value to be achieved
     */
    var detailCodeableConcept: CodeableConcept? = null

    /**
     * Reach goal on or before
     */
    var dueDate: FhirDate? = null

    /**
     * Reach goal on or before
     */
    var dueDuration: Duration? = null
}
