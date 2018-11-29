//
//  Generated from FHIR Version 3.0.1.11917 on 2018-11-29T05:04:15.076 
//
//   2018, JuiceLab, LLC
//  
package com.juicelabs.fhir.model

import com.juicelabs.fhir.base.FhirDate
import kotlin.collections.List

/**
 * A statement of system capabilities
 *
 * A Capability Statement documents a set of capabilities (behaviors) of a FHIR Server that may be used as a statement of actual server functionality or a statement of required or desired server implementation.
 */
open class CapabilityStatement() : DomainResource() {
    /**
     * Logical URI to reference this capability statement (globally unique)
     */
    var url: String? = null

    /**
     * Business version of the capability statement
     */
    var version: String? = null

    /**
     * Name for this capability statement (computer friendly)
     */
    var name: String? = null

    /**
     * Name for this capability statement (human friendly)
     */
    var title: String? = null

    /**
     * draft | active | retired | unknown
     */
    var status: String? = null

    /**
     * For testing purposes, not real usage
     */
    var experimental: Boolean? = null

    /**
     * Date this was last changed
     */
    var date: FhirDate? = null

    /**
     * Name of the publisher (organization or individual)
     */
    var publisher: String? = null

    val contact: List<ContactDetail> = mutableListOf<ContactDetail>()

    /**
     * Natural language description of the capability statement
     */
    var description: String? = null

    val useContext: List<UsageContext> = mutableListOf<UsageContext>()

    val jurisdiction: List<CodeableConcept> = mutableListOf<CodeableConcept>()

    /**
     * Why this capability statement is defined
     */
    var purpose: String? = null

    /**
     * Use and/or publishing restrictions
     */
    var copyright: String? = null

    /**
     * instance | capability | requirements
     */
    var kind: String? = null

    val instantiates: List<String> = mutableListOf<String>()

    /**
     * Software that is covered by this capability statement
     */
    var software: CapabilityStatementSoftware? = null

    /**
     * If this describes a specific instance
     */
    var implementation: CapabilityStatementImplementation? = null

    /**
     * FHIR Version the system uses
     */
    var fhirVersion: String? = null

    /**
     * no | extensions | elements | both
     */
    var acceptUnknown: String? = null

    val format: List<String> = mutableListOf<String>()

    val patchFormat: List<String> = mutableListOf<String>()

    val implementationGuide: List<String> = mutableListOf<String>()

    val profile: List<Reference> = mutableListOf<Reference>()

    val rest: List<CapabilityStatementRest> = mutableListOf<CapabilityStatementRest>()

    val messaging: List<CapabilityStatementMessaging> =
            mutableListOf<CapabilityStatementMessaging>()

    val document: List<CapabilityStatementDocument> = mutableListOf<CapabilityStatementDocument>()
}

/**
 * Software that is covered by this capability statement
 *
 * Software that is covered by this capability statement.  It is used when the capability statement describes the capabilities of a particular software version, independent of an installation.
 */
open class CapabilityStatementSoftware() : BackboneElement() {
    /**
     * A name the software is known by
     */
    var name: String? = null

    /**
     * Version covered by this statement
     */
    var version: String? = null

    /**
     * Date this version released
     */
    var releaseDate: FhirDate? = null
}

/**
 * If this describes a specific instance
 *
 * Identifies a specific implementation instance that is described by the capability statement - i.e. a particular installation, rather than the capabilities of a software program.
 */
open class CapabilityStatementImplementation() : BackboneElement() {
    /**
     * Describes this specific instance
     */
    var description: String? = null

    /**
     * Base URL for the installation
     */
    var url: String? = null
}

/**
 * If the endpoint is a RESTful one
 *
 * A definition of the restful capabilities of the solution, if any.
 */
open class CapabilityStatementRest() : BackboneElement() {
    /**
     * client | server
     */
    var mode: String? = null

    /**
     * General description of implementation
     */
    var documentation: String? = null

    /**
     * Information about security of implementation
     */
    var security: CapabilityStatementRestSecurity? = null

    val resource: List<CapabilityStatementRestResource> =
            mutableListOf<CapabilityStatementRestResource>()

    val interaction: List<CapabilityStatementRestInteraction> =
            mutableListOf<CapabilityStatementRestInteraction>()

    val searchParam: List<CapabilityStatementRestResourceSearchParam> =
            mutableListOf<CapabilityStatementRestResourceSearchParam>()

    val operation: List<CapabilityStatementRestOperation> =
            mutableListOf<CapabilityStatementRestOperation>()

    val compartment: List<String> = mutableListOf<String>()
}

/**
 * Information about security of implementation
 *
 * Information about security implementation from an interface perspective - what a client needs to know.
 */
open class CapabilityStatementRestSecurity() : BackboneElement() {
    /**
     * Adds CORS Headers (http://enable-cors.org/)
     */
    var cors: Boolean? = null

    val service: List<CodeableConcept> = mutableListOf<CodeableConcept>()

    /**
     * General description of how security works
     */
    var description: String? = null

    val certificate: List<CapabilityStatementRestSecurityCertificate> =
            mutableListOf<CapabilityStatementRestSecurityCertificate>()
}

/**
 * Certificates associated with security profiles
 *
 * Certificates associated with security profiles.
 */
open class CapabilityStatementRestSecurityCertificate() : BackboneElement() {
    /**
     * Mime type for certificates
     */
    var type: String? = null

    /**
     * Actual certificate
     */
    var blob: String? = null
}

/**
 * Resource served on the REST interface
 *
 * A specification of the restful capabilities of the solution for a specific resource type.
 */
open class CapabilityStatementRestResource() : BackboneElement() {
    /**
     * A resource type that is supported
     */
    var type: String? = null

    /**
     * Base System profile for all uses of resource
     */
    var profile: Reference? = null

    /**
     * Additional information about the use of the resource type
     */
    var documentation: String? = null

    val interaction: List<CapabilityStatementRestResourceInteraction> =
            mutableListOf<CapabilityStatementRestResourceInteraction>()

    /**
     * no-version | versioned | versioned-update
     */
    var versioning: String? = null

    /**
     * Whether vRead can return past versions
     */
    var readHistory: Boolean? = null

    /**
     * If update can commit to a new identity
     */
    var updateCreate: Boolean? = null

    /**
     * If allows/uses conditional create
     */
    var conditionalCreate: Boolean? = null

    /**
     * not-supported | modified-since | not-match | full-support
     */
    var conditionalRead: String? = null

    /**
     * If allows/uses conditional update
     */
    var conditionalUpdate: Boolean? = null

    /**
     * not-supported | single | multiple - how conditional delete is supported
     */
    var conditionalDelete: String? = null

    val referencePolicy: List<String> = mutableListOf<String>()

    val searchInclude: List<String> = mutableListOf<String>()

    val searchRevInclude: List<String> = mutableListOf<String>()

    val searchParam: List<CapabilityStatementRestResourceSearchParam> =
            mutableListOf<CapabilityStatementRestResourceSearchParam>()
}

/**
 * What operations are supported?
 *
 * Identifies a restful operation supported by the solution.
 */
open class CapabilityStatementRestResourceInteraction() : BackboneElement() {
    /**
     * read | vread | update | patch | delete | history-instance | history-type | create | search-type
     */
    var code: String? = null

    /**
     * Anything special about operation behavior
     */
    var documentation: String? = null
}

/**
 * Search parameters supported by implementation
 *
 * Search parameters for implementations to support and/or make use of - either references to ones defined in the specification, or additional ones defined for/by the implementation.
 */
open class CapabilityStatementRestResourceSearchParam() : BackboneElement() {
    /**
     * Name of search parameter
     */
    var name: String? = null

    /**
     * Source of definition for parameter
     */
    var definition: String? = null

    /**
     * number | date | string | token | reference | composite | quantity | uri
     */
    var type: String? = null

    /**
     * Server-specific usage
     */
    var documentation: String? = null
}

/**
 * What operations are supported?
 *
 * A specification of restful operations supported by the system.
 */
open class CapabilityStatementRestInteraction() : BackboneElement() {
    /**
     * transaction | batch | search-system | history-system
     */
    var code: String? = null

    /**
     * Anything special about operation behavior
     */
    var documentation: String? = null
}

/**
 * Definition of an operation or a custom query
 *
 * Definition of an operation or a named query together with its parameters and their meaning and type.
 */
open class CapabilityStatementRestOperation() : BackboneElement() {
    /**
     * Name by which the operation/query is invoked
     */
    var name: String? = null

    /**
     * The defined operation/query
     */
    var definition: Reference = Reference()
}

/**
 * If messaging is supported
 *
 * A description of the messaging capabilities of the solution.
 */
open class CapabilityStatementMessaging() : BackboneElement() {
    val endpoint: List<CapabilityStatementMessagingEndpoint> =
            mutableListOf<CapabilityStatementMessagingEndpoint>()

    /**
     * Reliable Message Cache Length (min)
     */
    var reliableCache: Int? = null

    /**
     * Messaging interface behavior details
     */
    var documentation: String? = null

    val supportedMessage: List<CapabilityStatementMessagingSupportedMessage> =
            mutableListOf<CapabilityStatementMessagingSupportedMessage>()

    val event: List<CapabilityStatementMessagingEvent> =
            mutableListOf<CapabilityStatementMessagingEvent>()
}

/**
 * Where messages should be sent
 *
 * An endpoint (network accessible address) to which messages and/or replies are to be sent.
 */
open class CapabilityStatementMessagingEndpoint() : BackboneElement() {
    /**
     * http | ftp | mllp +
     */
    var protocol: Coding = Coding()

    /**
     * Network address or identifier of the end-point
     */
    var address: String? = null
}

/**
 * Messages supported by this system
 *
 * References to message definitions for messages this system can send or receive.
 */
open class CapabilityStatementMessagingSupportedMessage() : BackboneElement() {
    /**
     * sender | receiver
     */
    var mode: String? = null

    /**
     * Message supported by this system
     */
    var definition: Reference = Reference()
}

/**
 * Declare support for this event
 *
 * A description of the solution's support for an event at this end-point.
 */
open class CapabilityStatementMessagingEvent() : BackboneElement() {
    /**
     * Event type
     */
    var code: Coding = Coding()

    /**
     * Consequence | Currency | Notification
     */
    var category: String? = null

    /**
     * sender | receiver
     */
    var mode: String? = null

    /**
     * Resource that's focus of message
     */
    var focus: String? = null

    /**
     * Profile that describes the request
     */
    var request: Reference = Reference()

    /**
     * Profile that describes the response
     */
    var response: Reference = Reference()

    /**
     * Endpoint-specific event documentation
     */
    var documentation: String? = null
}

/**
 * Document definition
 *
 * A document definition.
 */
open class CapabilityStatementDocument() : BackboneElement() {
    /**
     * producer | consumer
     */
    var mode: String? = null

    /**
     * Description of document support
     */
    var documentation: String? = null

    /**
     * Constraint on a resource used in the document
     */
    var profile: Reference = Reference()
}
