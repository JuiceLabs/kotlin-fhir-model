//
//  Generated from FHIR Version 3.0.1.11917 on 2018-11-29T05:04:14.592 
//
//   2018, JuiceLab, LLC
//  
package com.juicelabs.fhir.model

import com.juicelabs.fhir.base.FhirDate
import kotlin.collections.List

/**
 * Medical device request
 *
 * Represents a request for a patient to employ a medical device. The device may be an implantable device, or an external assistive device, such as a walker.
 */
open class DeviceRequest() : DomainResource() {
    val identifier: List<Identifier> = mutableListOf<Identifier>()

    val definition: List<Reference> = mutableListOf<Reference>()

    val basedOn: List<Reference> = mutableListOf<Reference>()

    val priorRequest: List<Reference> = mutableListOf<Reference>()

    /**
     * Identifier of composite request
     */
    var groupIdentifier: Identifier? = null

    /**
     * draft | active | suspended | completed | entered-in-error | cancelled
     */
    var status: String? = null

    /**
     * proposal | plan | original-order | encoded | reflex-order
     */
    var intent: CodeableConcept = CodeableConcept()

    /**
     * Indicates how quickly the {{title}} should be addressed with respect to other requests
     */
    var priority: String? = null

    /**
     * Device requested
     */
    var codeReference: Reference = Reference()

    /**
     * Device requested
     */
    var codeCodeableConcept: CodeableConcept = CodeableConcept()

    /**
     * Focus of request
     */
    var subject: Reference = Reference()

    /**
     * Encounter or Episode motivating request
     */
    var context: Reference? = null

    /**
     * Desired time or schedule for use
     */
    var occurrenceDateTime: FhirDate? = null

    /**
     * Desired time or schedule for use
     */
    var occurrencePeriod: Period? = null

    /**
     * Desired time or schedule for use
     */
    var occurrenceTiming: Timing? = null

    /**
     * When recorded
     */
    var authoredOn: FhirDate? = null

    /**
     * Who/what is requesting diagnostics
     */
    var requester: DeviceRequestRequester? = null

    /**
     * Fille role
     */
    var performerType: CodeableConcept? = null

    /**
     * Requested Filler
     */
    var performer: Reference? = null

    val reasonCode: List<CodeableConcept> = mutableListOf<CodeableConcept>()

    val reasonReference: List<Reference> = mutableListOf<Reference>()

    val supportingInfo: List<Reference> = mutableListOf<Reference>()

    val note: List<Annotation> = mutableListOf<Annotation>()

    val relevantHistory: List<Reference> = mutableListOf<Reference>()
}

/**
 * Who/what is requesting diagnostics
 *
 * The individual who initiated the request and has responsibility for its activation.
 */
open class DeviceRequestRequester() : BackboneElement() {
    /**
     * Individual making the request
     */
    var agent: Reference = Reference()

    /**
     * Organization agent is acting for
     */
    var onBehalfOf: Reference? = null
}
