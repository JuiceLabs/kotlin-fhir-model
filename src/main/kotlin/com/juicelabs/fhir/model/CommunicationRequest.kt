//
//  Generated from FHIR Version 3.0.1.11917 on 2018-11-27T12:50:39.897 
//
//   2018, JuiceLab, LLC
//  
package com.juicelabs.fhir.model

import com.juicelabs.fhir.base.FhirDate
import kotlin.collections.List

/**
 * A request for information to be sent to a receiver
 *
 * A request to convey information; e.g. the CDS system proposes that an alert be sent to a responsible provider, the CDS system proposes that the public health agency be notified about a reportable condition.
 */
open class CommunicationRequest() : DomainResource() {
    val identifier: List<Identifier> = mutableListOf<Identifier>()

    val basedOn: List<Reference> = mutableListOf<Reference>()

    val replaces: List<Reference> = mutableListOf<Reference>()

    /**
     * Composite request this is part of
     */
    var groupIdentifier: Identifier? = null

    /**
     * draft | active | suspended | cancelled | completed | entered-in-error | unknown
     */
    var status: String = ""

    val category: List<CodeableConcept> = mutableListOf<CodeableConcept>()

    /**
     * Message urgency
     */
    var priority: String? = null

    val medium: List<CodeableConcept> = mutableListOf<CodeableConcept>()

    /**
     * Focus of message
     */
    var subject: Reference? = null

    val recipient: List<Reference> = mutableListOf<Reference>()

    val topic: List<Reference> = mutableListOf<Reference>()

    /**
     * Encounter or episode leading to message
     */
    var context: Reference? = null

    val payload: List<CommunicationRequestPayload> = mutableListOf<CommunicationRequestPayload>()

    /**
     * When scheduled
     */
    var occurrenceDateTime: FhirDate? = null

    /**
     * When scheduled
     */
    var occurrencePeriod: Period? = null

    /**
     * When request transitioned to being actionable
     */
    var authoredOn: FhirDate? = null

    /**
     * Message sender
     */
    var sender: Reference? = null

    /**
     * Who/what is requesting service
     */
    var requester: CommunicationRequestRequester? = null

    val reasonCode: List<CodeableConcept> = mutableListOf<CodeableConcept>()

    val reasonReference: List<Reference> = mutableListOf<Reference>()

    val note: List<Annotation> = mutableListOf<Annotation>()
}

/**
 * Message payload
 *
 * Text, attachment(s), or resource(s) to be communicated to the recipient.
 */
open class CommunicationRequestPayload() : BackboneElement() {
    /**
     * Message part content
     */
    var contentString: String = ""

    /**
     * Message part content
     */
    var contentAttachment: Attachment = Attachment()

    /**
     * Message part content
     */
    var contentReference: Reference = Reference()
}

/**
 * Who/what is requesting service
 *
 * The individual who initiated the request and has responsibility for its activation.
 */
open class CommunicationRequestRequester() : BackboneElement() {
    /**
     * Individual making the request
     */
    var agent: Reference = Reference()

    /**
     * Organization agent is acting for
     */
    var onBehalfOf: Reference? = null
}
