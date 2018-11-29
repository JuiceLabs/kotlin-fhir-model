//
//  Generated from FHIR Version 3.0.1.11917 on 2018-11-29T05:04:14.962 
//
//   2018, JuiceLab, LLC
//  
package com.juicelabs.fhir.model

import com.juicelabs.fhir.base.FhirDate
import kotlin.collections.List

/**
 * A resource that describes a message that is exchanged between systems
 *
 * The header for a message exchange that is either requesting or responding to an action.  The reference(s) that are the subject of the action as well as other information related to the action are typically transmitted in a bundle in which the MessageHeader resource instance is the first resource in the bundle.
 */
open class MessageHeader() : DomainResource() {
    /**
     * Code for the event this message represents
     */
    var event: Coding = Coding()

    val destination: List<MessageHeaderDestination> = mutableListOf<MessageHeaderDestination>()

    /**
     * Intended "real-world" recipient for the data
     */
    var receiver: Reference? = null

    /**
     * Real world sender of the message
     */
    var sender: Reference? = null

    /**
     * Time that the message was sent
     */
    var timestamp: FhirDate? = null

    /**
     * The source of the data entry
     */
    var enterer: Reference? = null

    /**
     * The source of the decision
     */
    var author: Reference? = null

    /**
     * Message source application
     */
    var source: MessageHeaderSource = MessageHeaderSource()

    /**
     * Final responsibility for event
     */
    var responsible: Reference? = null

    /**
     * Cause of event
     */
    var reason: CodeableConcept? = null

    /**
     * If this is a reply to prior message
     */
    var response: MessageHeaderResponse? = null

    val focus: List<Reference> = mutableListOf<Reference>()
}

/**
 * Message destination application(s)
 *
 * The destination application which the message is intended for.
 */
open class MessageHeaderDestination() : BackboneElement() {
    /**
     * Name of system
     */
    var name: String? = null

    /**
     * Particular delivery destination within the destination
     */
    var target: Reference? = null

    /**
     * Actual destination address or id
     */
    var endpoint: String? = null
}

/**
 * Message source application
 *
 * The source application from which this message originated.
 */
open class MessageHeaderSource() : BackboneElement() {
    /**
     * Name of system
     */
    var name: String? = null

    /**
     * Name of software running the system
     */
    var software: String? = null

    /**
     * Version of software running
     */
    var version: String? = null

    /**
     * Human contact for problems
     */
    var contact: ContactPoint? = null

    /**
     * Actual message source address or id
     */
    var endpoint: String? = null
}

/**
 * If this is a reply to prior message
 *
 * Information about the message that this message is a response to.  Only present if this message is a response.
 */
open class MessageHeaderResponse() : BackboneElement() {
    /**
     * Id of original message
     */
    var identifier: String? = null

    /**
     * ok | transient-error | fatal-error
     */
    var code: String? = null

    /**
     * Specific list of hints/warnings/errors
     */
    var details: Reference? = null
}
