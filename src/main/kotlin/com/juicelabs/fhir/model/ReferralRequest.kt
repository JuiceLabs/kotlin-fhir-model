//
//  Generated from FHIR Version 3.0.1.11917 on 2018-11-27T12:50:39.583 
//
//   2018, JuiceLab, LLC
//  
package com.juicelabs.fhir.model

import com.juicelabs.fhir.base.FhirDate
import kotlin.collections.List

/**
 * A request for referral or transfer of care
 *
 * Used to record and send details about a request for referral service or transfer of a patient to the care of another provider or provider organization.
 */
open class ReferralRequest() : DomainResource() {
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
    var status: String = ""

    /**
     * proposal | plan | order
     */
    var intent: String = ""

    /**
     * Referral/Transition of care request type
     */
    var type: CodeableConcept? = null

    /**
     * Urgency of referral / transfer of care request
     */
    var priority: String? = null

    val serviceRequested: List<CodeableConcept> = mutableListOf<CodeableConcept>()

    /**
     * Patient referred to care or transfer
     */
    var subject: Reference = Reference()

    /**
     * Originating encounter
     */
    var context: Reference? = null

    /**
     * When the service(s) requested in the referral should occur
     */
    var occurrenceDateTime: FhirDate? = null

    /**
     * When the service(s) requested in the referral should occur
     */
    var occurrencePeriod: Period? = null

    /**
     * Date of creation/activation
     */
    var authoredOn: FhirDate? = null

    /**
     * Who/what is requesting service
     */
    var requester: ReferralRequestRequester? = null

    /**
     * The clinical specialty (discipline) that the referral is requested for
     */
    var specialty: CodeableConcept? = null

    val recipient: List<Reference> = mutableListOf<Reference>()

    val reasonCode: List<CodeableConcept> = mutableListOf<CodeableConcept>()

    val reasonReference: List<Reference> = mutableListOf<Reference>()

    /**
     * A textual description of the referral
     */
    var description: String? = null

    val supportingInfo: List<Reference> = mutableListOf<Reference>()

    val note: List<Annotation> = mutableListOf<Annotation>()

    val relevantHistory: List<Reference> = mutableListOf<Reference>()
}

/**
 * Who/what is requesting service
 *
 * The individual who initiated the request and has responsibility for its activation.
 */
open class ReferralRequestRequester() : BackboneElement() {
    /**
     * Individual making the request
     */
    var agent: Reference = Reference()

    /**
     * Organization agent is acting for
     */
    var onBehalfOf: Reference? = null
}
