//
//  Generated from FHIR Version 3.0.1.11917 on 2018-11-27T12:50:39.856 
//
//   2018, JuiceLab, LLC
//  
package com.juicelabs.fhir.model

import com.juicelabs.fhir.base.FhirDate
import kotlin.collections.List

/**
 * A booking of a healthcare event among patient(s), practitioner(s), related person(s) and/or device(s) for a specific date/time. This may result in one or more Encounter(s)
 *
 * A booking of a healthcare event among patient(s), practitioner(s), related person(s) and/or device(s) for a specific date/time. This may result in one or more Encounter(s).
 */
open class Appointment() : DomainResource() {
    val identifier: List<Identifier> = mutableListOf<Identifier>()

    /**
     * proposed | pending | booked | arrived | fulfilled | cancelled | noshow | entered-in-error
     */
    var status: String = ""

    /**
     * A broad categorisation of the service that is to be performed during this appointment
     */
    var serviceCategory: CodeableConcept? = null

    val serviceType: List<CodeableConcept> = mutableListOf<CodeableConcept>()

    val specialty: List<CodeableConcept> = mutableListOf<CodeableConcept>()

    /**
     * The style of appointment or patient that has been booked in the slot (not service type)
     */
    var appointmentType: CodeableConcept? = null

    val reason: List<CodeableConcept> = mutableListOf<CodeableConcept>()

    val indication: List<Reference> = mutableListOf<Reference>()

    /**
     * Used to make informed decisions if needing to re-prioritize
     */
    var priority: Int? = null

    /**
     * Shown on a subject line in a meeting request, or appointment list
     */
    var description: String? = null

    val supportingInformation: List<Reference> = mutableListOf<Reference>()

    /**
     * When appointment is to take place
     */
    var start: FhirDate? = null

    /**
     * When appointment is to conclude
     */
    var end: FhirDate? = null

    /**
     * Can be less than start/end (e.g. estimate)
     */
    var minutesDuration: Int? = null

    val slot: List<Reference> = mutableListOf<Reference>()

    /**
     * The date that this appointment was initially created
     */
    var created: FhirDate? = null

    /**
     * Additional comments
     */
    var comment: String? = null

    val incomingReferral: List<Reference> = mutableListOf<Reference>()

    val participant: List<AppointmentParticipant> = mutableListOf<AppointmentParticipant>()

    val requestedPeriod: List<Period> = mutableListOf<Period>()
}

/**
 * Participants involved in appointment
 *
 * List of participants involved in the appointment.
 */
open class AppointmentParticipant() : BackboneElement() {
    val type: List<CodeableConcept> = mutableListOf<CodeableConcept>()

    /**
     * Person, Location/HealthcareService or Device
     */
    var actor: Reference? = null

    /**
     * required | optional | information-only
     */
    var required: String? = null

    /**
     * accepted | declined | tentative | needs-action
     */
    var status: String = ""
}
