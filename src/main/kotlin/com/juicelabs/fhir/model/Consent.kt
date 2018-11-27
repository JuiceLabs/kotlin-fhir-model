//
//  Generated from FHIR Version 3.0.1.11917 on 2018-11-27T12:50:39.891 
//
//   2018, JuiceLab, LLC
//  
package com.juicelabs.fhir.model

import com.google.gson.annotations.SerializedName
import com.juicelabs.fhir.base.FhirDate
import kotlin.collections.List

/**
 * A healthcare consumer's policy choices to permits or denies recipients or roles to perform actions for specific purposes and periods of time
 *
 * A record of a healthcare consumer’s policy choices, which permits or denies identified recipient(s) or recipient role(s) to perform one or more actions within a given policy context, for specific purposes and periods of time.
 */
open class Consent() : DomainResource() {
    /**
     * Identifier for this record (external references)
     */
    var identifier: Identifier? = null

    /**
     * draft | proposed | active | rejected | inactive | entered-in-error
     */
    var status: String = ""

    val category: List<CodeableConcept> = mutableListOf<CodeableConcept>()

    /**
     * Who the consent applies to
     */
    var patient: Reference = Reference()

    /**
     * Period that this consent applies
     */
    var period: Period? = null

    /**
     * When this Consent was created or indexed
     */
    var dateTime: FhirDate? = null

    val consentingParty: List<Reference> = mutableListOf<Reference>()

    val actor: List<ConsentActor> = mutableListOf<ConsentActor>()

    val action: List<CodeableConcept> = mutableListOf<CodeableConcept>()

    val organization: List<Reference> = mutableListOf<Reference>()

    /**
     * Source from which this consent is taken
     */
    var sourceAttachment: Attachment? = null

    /**
     * Source from which this consent is taken
     */
    var sourceIdentifier: Identifier? = null

    /**
     * Source from which this consent is taken
     */
    var sourceReference: Reference? = null

    val policy: List<ConsentPolicy> = mutableListOf<ConsentPolicy>()

    /**
     * Policy that this consents to
     */
    var policyRule: String? = null

    val securityLabel: List<Coding> = mutableListOf<Coding>()

    val purpose: List<Coding> = mutableListOf<Coding>()

    /**
     * Timeframe for data controlled by this consent
     */
    var dataPeriod: Period? = null

    val data: List<ConsentData> = mutableListOf<ConsentData>()

    val except: List<ConsentExcept> = mutableListOf<ConsentExcept>()
}

/**
 * Who|what controlled by this consent (or group, by role)
 *
 * Who or what is controlled by this consent. Use group to identify a set of actors by some property they share (e.g. 'admitting officers').
 */
open class ConsentActor() : BackboneElement() {
    /**
     * How the actor is involved
     */
    var role: CodeableConcept = CodeableConcept()

    /**
     * Resource for the actor (or group, by role)
     */
    var reference: Reference = Reference()
}

/**
 * Policies covered by this consent
 *
 * The references to the policies that are included in this consent scope. Policies may be organizational, but are often defined jurisdictionally, or in law.
 */
open class ConsentPolicy() : BackboneElement() {
    /**
     * Enforcement source for policy
     */
    var authority: String? = null

    /**
     * Specific policy covered by this consent
     */
    var uri: String? = null
}

/**
 * Data controlled by this consent
 *
 * The resources controlled by this consent, if specific resources are referenced.
 */
open class ConsentData() : BackboneElement() {
    /**
     * instance | related | dependents | authoredby
     */
    var meaning: String = ""

    /**
     * The actual data reference
     */
    var reference: Reference = Reference()
}

/**
 * Additional rule -  addition or removal of permissions
 *
 * An exception to the base policy of this consent. An exception can be an addition or removal of access permissions.
 */
open class ConsentExcept() : BackboneElement() {
    /**
     * deny | permit
     */
    var type: String = ""

    /**
     * Timeframe for this exception
     */
    var period: Period? = null

    val actor: List<ConsentExceptActor> = mutableListOf<ConsentExceptActor>()

    val action: List<CodeableConcept> = mutableListOf<CodeableConcept>()

    val securityLabel: List<Coding> = mutableListOf<Coding>()

    val purpose: List<Coding> = mutableListOf<Coding>()

    @SerializedName("class")
    val class_fhir: List<Coding> = mutableListOf<Coding>()

    val code: List<Coding> = mutableListOf<Coding>()

    /**
     * Timeframe for data controlled by this exception
     */
    var dataPeriod: Period? = null

    val data: List<ConsentExceptData> = mutableListOf<ConsentExceptData>()
}

/**
 * Who|what controlled by this exception (or group, by role)
 *
 * Who or what is controlled by this Exception. Use group to identify a set of actors by some property they share (e.g. 'admitting officers').
 */
open class ConsentExceptActor() : BackboneElement() {
    /**
     * How the actor is involved
     */
    var role: CodeableConcept = CodeableConcept()

    /**
     * Resource for the actor (or group, by role)
     */
    var reference: Reference = Reference()
}

/**
 * Data controlled by this exception
 *
 * The resources controlled by this exception, if specific resources are referenced.
 */
open class ConsentExceptData() : BackboneElement() {
    /**
     * instance | related | dependents | authoredby
     */
    var meaning: String = ""

    /**
     * The actual data reference
     */
    var reference: Reference = Reference()
}
