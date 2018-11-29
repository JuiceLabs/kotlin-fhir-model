//
//  Generated from FHIR Version 3.0.1.11917 on 2018-11-29T05:04:15.026 
//
//   2018, JuiceLab, LLC
//  
package com.juicelabs.fhir.model

import com.juicelabs.fhir.base.FhirDate
import kotlin.collections.List

/**
 * Event record kept for security purposes
 *
 * A record of an event made for purposes of maintaining a security log. Typical uses include detection of intrusion attempts and monitoring for inappropriate usage.
 */
open class AuditEvent() : DomainResource() {
    /**
     * Type/identifier of event
     */
    var type: Coding = Coding()

    val subtype: List<Coding> = mutableListOf<Coding>()

    /**
     * Type of action performed during the event
     */
    var action: String? = null

    /**
     * Time when the event occurred on source
     */
    var recorded: FhirDate? = null

    /**
     * Whether the event succeeded or failed
     */
    var outcome: String? = null

    /**
     * Description of the event outcome
     */
    var outcomeDesc: String? = null

    val purposeOfEvent: List<CodeableConcept> = mutableListOf<CodeableConcept>()

    val agent: List<AuditEventAgent> = mutableListOf<AuditEventAgent>()

    /**
     * Audit Event Reporter
     */
    var source: AuditEventSource = AuditEventSource()

    val entity: List<AuditEventEntity> = mutableListOf<AuditEventEntity>()
}

/**
 * Actor involved in the event
 *
 * An actor taking an active role in the event or activity that is logged.
 */
open class AuditEventAgent() : BackboneElement() {
    val role: List<CodeableConcept> = mutableListOf<CodeableConcept>()

    /**
     * Direct reference to resource
     */
    var reference: Reference? = null

    /**
     * Unique identifier for the user
     */
    var userId: Identifier? = null

    /**
     * Alternative User id e.g. authentication
     */
    var altId: String? = null

    /**
     * Human-meaningful name for the agent
     */
    var name: String? = null

    /**
     * Whether user is initiator
     */
    var requestor: Boolean? = null

    /**
     * Where
     */
    var location: Reference? = null

    val policy: List<String> = mutableListOf<String>()

    /**
     * Type of media
     */
    var media: Coding? = null

    /**
     * Logical network location for application activity
     */
    var network: AuditEventAgentNetwork? = null

    val purposeOfUse: List<CodeableConcept> = mutableListOf<CodeableConcept>()
}

/**
 * Logical network location for application activity
 *
 * Logical network location for application activity, if the activity has a network location.
 */
open class AuditEventAgentNetwork() : BackboneElement() {
    /**
     * Identifier for the network access point of the user device
     */
    var address: String? = null

    /**
     * The type of network access point
     */
    var type: String? = null
}

/**
 * Audit Event Reporter
 *
 * The system that is reporting the event.
 */
open class AuditEventSource() : BackboneElement() {
    /**
     * Logical source location within the enterprise
     */
    var site: String? = null

    /**
     * The identity of source detecting the event
     */
    var identifier: Identifier = Identifier()

    val type: List<Coding> = mutableListOf<Coding>()
}

/**
 * Data or objects used
 *
 * Specific instances of data or objects that have been accessed.
 */
open class AuditEventEntity() : BackboneElement() {
    /**
     * Specific instance of object
     */
    var identifier: Identifier? = null

    /**
     * Specific instance of resource
     */
    var reference: Reference? = null

    /**
     * Type of entity involved
     */
    var type: Coding? = null

    /**
     * What role the entity played
     */
    var role: Coding? = null

    /**
     * Life-cycle stage for the entity
     */
    var lifecycle: Coding? = null

    val securityLabel: List<Coding> = mutableListOf<Coding>()

    /**
     * Descriptor for entity
     */
    var name: String? = null

    /**
     * Descriptive text
     */
    var description: String? = null

    /**
     * Query parameters
     */
    var query: String? = null

    val detail: List<AuditEventEntityDetail> = mutableListOf<AuditEventEntityDetail>()
}

/**
 * Additional Information about the entity
 *
 * Tagged value pairs for conveying additional information about the entity.
 */
open class AuditEventEntityDetail() : BackboneElement() {
    /**
     * Name of the property
     */
    var type: String? = null

    /**
     * Property value
     */
    var value: String? = null
}
