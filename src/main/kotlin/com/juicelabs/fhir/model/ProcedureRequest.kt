//
//  Generated from FHIR Version 3.0.1.11917 on 2018-11-29T14:32:35.673 
//
//   2018, JuiceLab, LLC
//  
package com.juicelabs.fhir.model

import kotlin.collections.List

/**
 * A request for a procedure or diagnostic to be performed
 *
 * A record of a request for diagnostic investigations, treatments, or operations to be performed.
 */
open class ProcedureRequest() : DomainResource() {
    val identifier: List<Identifier> = mutableListOf<Identifier>()

    val definition: List<Reference> = mutableListOf<Reference>()

    val basedOn: List<Reference> = mutableListOf<Reference>()

    val replaces: List<Reference> = mutableListOf<Reference>()

    /**
     * Composite Request ID
     */
    var requisition: Identifier? = null

    /**
     * draft | active | suspended | completed | entered-in-error | cancelled
     */
    var status: String? = null

    /**
     * proposal | plan | order +
     */
    var intent: String? = null

    /**
     * routine | urgent | asap | stat
     */
    var priority: String? = null

    /**
     * True if procedure should not be performed
     */
    var doNotPerform: Boolean? = null

    val category: List<CodeableConcept> = mutableListOf<CodeableConcept>()

    /**
     * What is being requested/ordered
     */
    var code: CodeableConcept = CodeableConcept()

    /**
     * Individual the service is ordered for
     */
    var subject: Reference = Reference()

    /**
     * Encounter or Episode during which request was created
     */
    var context: Reference? = null

    /**
     * When procedure should occur
     */
    var occurrenceDateTime: String? = null

    /**
     * When procedure should occur
     */
    var occurrencePeriod: Period? = null

    /**
     * When procedure should occur
     */
    var occurrenceTiming: Timing? = null

    /**
     * Preconditions for procedure or diagnostic
     */
    var asNeededBoolean: Boolean? = null

    /**
     * Preconditions for procedure or diagnostic
     */
    var asNeededCodeableConcept: CodeableConcept? = null

    /**
     * Date request signed
     */
    var authoredOn: String? = null

    /**
     * Who/what is requesting procedure or diagnostic
     */
    var requester: ProcedureRequestRequester? = null

    /**
     * Performer role
     */
    var performerType: CodeableConcept? = null

    /**
     * Requested perfomer
     */
    var performer: Reference? = null

    val reasonCode: List<CodeableConcept> = mutableListOf<CodeableConcept>()

    val reasonReference: List<Reference> = mutableListOf<Reference>()

    val supportingInfo: List<Reference> = mutableListOf<Reference>()

    val specimen: List<Reference> = mutableListOf<Reference>()

    val bodySite: List<CodeableConcept> = mutableListOf<CodeableConcept>()

    val note: List<Annotation> = mutableListOf<Annotation>()

    val relevantHistory: List<Reference> = mutableListOf<Reference>()
}

/**
 * Who/what is requesting procedure or diagnostic
 *
 * The individual who initiated the request and has responsibility for its activation.
 */
open class ProcedureRequestRequester() : BackboneElement() {
    /**
     * Individual making the request
     */
    var agent: Reference = Reference()

    /**
     * Organization agent is acting for
     */
    var onBehalfOf: Reference? = null
}
