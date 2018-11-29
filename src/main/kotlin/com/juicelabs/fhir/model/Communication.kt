//
//  Generated from FHIR Version 3.0.1.11917 on 2018-11-29T14:32:35.665 
//
//   2018, JuiceLab, LLC
//  
package com.juicelabs.fhir.model

import kotlin.collections.List

/**
 * A record of information transmitted from a sender to a receiver
 *
 * An occurrence of information being transmitted; e.g. an alert that was sent to a responsible provider, a public health agency was notified about a reportable condition.
 */
open class Communication() : DomainResource() {
    val identifier: List<Identifier> = mutableListOf<Identifier>()

    val definition: List<Reference> = mutableListOf<Reference>()

    val basedOn: List<Reference> = mutableListOf<Reference>()

    val partOf: List<Reference> = mutableListOf<Reference>()

    /**
     * preparation | in-progress | suspended | aborted | completed | entered-in-error
     */
    var status: String? = null

    /**
     * Communication did not occur
     */
    var notDone: Boolean? = null

    /**
     * Why communication did not occur
     */
    var notDoneReason: CodeableConcept? = null

    val category: List<CodeableConcept> = mutableListOf<CodeableConcept>()

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

    /**
     * When sent
     */
    var sent: String? = null

    /**
     * When received
     */
    var received: String? = null

    /**
     * Message sender
     */
    var sender: Reference? = null

    val reasonCode: List<CodeableConcept> = mutableListOf<CodeableConcept>()

    val reasonReference: List<Reference> = mutableListOf<Reference>()

    val payload: List<CommunicationPayload> = mutableListOf<CommunicationPayload>()

    val note: List<Annotation> = mutableListOf<Annotation>()
}

/**
 * Message payload
 *
 * Text, attachment(s), or resource(s) that was communicated to the recipient.
 */
open class CommunicationPayload() : BackboneElement() {
    /**
     * Message part content
     */
    var contentString: String? = null

    /**
     * Message part content
     */
    var contentAttachment: Attachment = Attachment()

    /**
     * Message part content
     */
    var contentReference: Reference = Reference()
}
