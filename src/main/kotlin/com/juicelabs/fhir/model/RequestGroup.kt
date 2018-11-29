//
//  Generated from FHIR Version 3.0.1.11917 on 2018-11-29T14:32:35.529 
//
//   2018, JuiceLab, LLC
//  
package com.juicelabs.fhir.model

import kotlin.collections.List

/**
 * A group of related requests
 *
 * A group of related requests that can be used to capture intended activities that have inter-dependencies such as "give this medication after that one".
 */
open class RequestGroup() : DomainResource() {
    val identifier: List<Identifier> = mutableListOf<Identifier>()

    val definition: List<Reference> = mutableListOf<Reference>()

    val basedOn: List<Reference> = mutableListOf<Reference>()

    val replaces: List<Reference> = mutableListOf<Reference>()

    /**
     * Composite request this is part of
     */
    var groupIdentifier: Identifier? = null

    /**
     * draft | active | suspended | cancelled | completed | entered-in-error | unknown
     */
    var status: String? = null

    /**
     * proposal | plan | order
     */
    var intent: String? = null

    /**
     * routine | urgent | asap | stat
     */
    var priority: String? = null

    /**
     * Who the request group is about
     */
    var subject: Reference? = null

    /**
     * Encounter or Episode for the request group
     */
    var context: Reference? = null

    /**
     * When the request group was authored
     */
    var authoredOn: String? = null

    /**
     * Device or practitioner that authored the request group
     */
    var author: Reference? = null

    /**
     * Reason for the request group
     */
    var reasonCodeableConcept: CodeableConcept? = null

    /**
     * Reason for the request group
     */
    var reasonReference: Reference? = null

    val note: List<Annotation> = mutableListOf<Annotation>()

    val action: List<RequestGroupAction> = mutableListOf<RequestGroupAction>()
}

/**
 * Proposed actions, if any
 *
 * The actions, if any, produced by the evaluation of the artifact.
 */
open class RequestGroupAction() : BackboneElement() {
    /**
     * User-visible label for the action (e.g. 1. or A.)
     */
    var label: String? = null

    /**
     * User-visible title
     */
    var title: String? = null

    /**
     * Short description of the action
     */
    var description: String? = null

    /**
     * Static text equivalent of the action, used if the dynamic aspects cannot be interpreted by the receiving system
     */
    var textEquivalent: String? = null

    val code: List<CodeableConcept> = mutableListOf<CodeableConcept>()

    val documentation: List<RelatedArtifact> = mutableListOf<RelatedArtifact>()

    val condition: List<RequestGroupActionCondition> = mutableListOf<RequestGroupActionCondition>()

    val relatedAction: List<RequestGroupActionRelatedAction> =
            mutableListOf<RequestGroupActionRelatedAction>()

    /**
     * When the action should take place
     */
    var timingDateTime: String? = null

    /**
     * When the action should take place
     */
    var timingPeriod: Period? = null

    /**
     * When the action should take place
     */
    var timingDuration: Duration? = null

    /**
     * When the action should take place
     */
    var timingRange: Range? = null

    /**
     * When the action should take place
     */
    var timingTiming: Timing? = null

    val participant: List<Reference> = mutableListOf<Reference>()

    /**
     * create | update | remove | fire-event
     */
    var type: Coding? = null

    /**
     * visual-group | logical-group | sentence-group
     */
    var groupingBehavior: String? = null

    /**
     * any | all | all-or-none | exactly-one | at-most-one | one-or-more
     */
    var selectionBehavior: String? = null

    /**
     * must | could | must-unless-documented
     */
    var requiredBehavior: String? = null

    /**
     * yes | no
     */
    var precheckBehavior: String? = null

    /**
     * single | multiple
     */
    var cardinalityBehavior: String? = null

    /**
     * The target of the action
     */
    var resource: Reference? = null

    val action: List<RequestGroupAction> = mutableListOf<RequestGroupAction>()
}

/**
 * Whether or not the action is applicable
 *
 * An expression that describes applicability criteria, or start/stop conditions for the action.
 */
open class RequestGroupActionCondition() : BackboneElement() {
    /**
     * applicability | start | stop
     */
    var kind: String? = null

    /**
     * Natural language description of the condition
     */
    var description: String? = null

    /**
     * Language of the expression
     */
    var language: String? = null

    /**
     * Boolean-valued expression
     */
    var expression: String? = null
}

/**
 * Relationship to another action
 *
 * A relationship to another action such as "before" or "30-60 minutes after start of".
 */
open class RequestGroupActionRelatedAction() : BackboneElement() {
    /**
     * What action this is related to
     */
    var actionId: String? = null

    /**
     * before-start | before | before-end | concurrent-with-start | concurrent | concurrent-with-end | after-start | after | after-end
     */
    var relationship: String? = null

    /**
     * Time offset for the relationship
     */
    var offsetDuration: Duration? = null

    /**
     * Time offset for the relationship
     */
    var offsetRange: Range? = null
}
