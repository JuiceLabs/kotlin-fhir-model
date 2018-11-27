//
//  Generated from FHIR Version 3.0.1.11917 on 2018-11-27T12:50:39.833 
//
//   2018, JuiceLab, LLC
//  
package com.juicelabs.fhir.model

import com.juicelabs.fhir.base.FhirDate
import kotlin.collections.List

/**
 * A resource that defines a type of message that can be exchanged between systems
 *
 * Defines the characteristics of a message that can be shared between systems, including the type of event that initiates the message, the content to be transmitted and what response(s), if any, are permitted.
 */
open class MessageDefinition() : DomainResource() {
    /**
     * Logical URI to reference this message definition (globally unique)
     */
    var url: String? = null

    /**
     * Additional identifier for the message definition
     */
    var identifier: Identifier? = null

    /**
     * Business version of the message definition
     */
    var version: String? = null

    /**
     * Name for this message definition (computer friendly)
     */
    var name: String? = null

    /**
     * Name for this message definition (human friendly)
     */
    var title: String? = null

    /**
     * draft | active | retired | unknown
     */
    var status: String = ""

    /**
     * For testing purposes, not real usage
     */
    var experimental: Boolean? = null

    /**
     * Date this was last changed
     */
    var date: FhirDate = FhirDate.now()

    /**
     * Name of the publisher (organization or individual)
     */
    var publisher: String? = null

    val contact: List<ContactDetail> = mutableListOf<ContactDetail>()

    /**
     * Natural language description of the message definition
     */
    var description: String? = null

    val useContext: List<UsageContext> = mutableListOf<UsageContext>()

    val jurisdiction: List<CodeableConcept> = mutableListOf<CodeableConcept>()

    /**
     * Why this message definition is defined
     */
    var purpose: String? = null

    /**
     * Use and/or publishing restrictions
     */
    var copyright: String? = null

    /**
     * Definition this one is based on
     */
    var base: Reference? = null

    val parent: List<Reference> = mutableListOf<Reference>()

    val replaces: List<Reference> = mutableListOf<Reference>()

    /**
     * Event type
     */
    var event: Coding = Coding()

    /**
     * Consequence | Currency | Notification
     */
    var category: String? = null

    val focus: List<MessageDefinitionFocus> = mutableListOf<MessageDefinitionFocus>()

    /**
     * Is a response required?
     */
    var responseRequired: Boolean? = null

    val allowedResponse: List<MessageDefinitionAllowedResponse> =
            mutableListOf<MessageDefinitionAllowedResponse>()
}

/**
 * Resource(s) that are the subject of the event
 *
 * Identifies the resource (or resources) that are being addressed by the event.  For example, the Encounter for an admit message or two Account records for a merge.
 */
open class MessageDefinitionFocus() : BackboneElement() {
    /**
     * Type of resource
     */
    var code: String = ""

    /**
     * Profile that must be adhered to by focus
     */
    var profile: Reference? = null

    /**
     * Minimum number of focuses of this type
     */
    var min: Int? = null

    /**
     * Maximum number of focuses of this type
     */
    var max: String? = null
}

/**
 * Responses to this message
 *
 * Indicates what types of messages may be sent as an application-level response to this message.
 */
open class MessageDefinitionAllowedResponse() : BackboneElement() {
    /**
     * Reference to allowed message definition response
     */
    var message: Reference = Reference()

    /**
     * When should this response be used
     */
    var situation: String? = null
}
