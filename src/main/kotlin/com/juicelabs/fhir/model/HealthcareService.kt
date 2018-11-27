//
//  Generated from FHIR Version 3.0.1.11917 on 2018-11-27T12:50:39.526 
//
//   2018, JuiceLab, LLC
//  
package com.juicelabs.fhir.model

import com.juicelabs.fhir.base.FhirDate
import kotlin.collections.List

/**
 * The details of a healthcare service available at a location
 *
 * The details of a healthcare service available at a location.
 */
open class HealthcareService() : DomainResource() {
    val identifier: List<Identifier> = mutableListOf<Identifier>()

    /**
     * Whether this healthcareservice is in active use
     */
    var active: Boolean? = null

    /**
     * Organization that provides this service
     */
    var providedBy: Reference? = null

    /**
     * Broad category of service being performed or delivered
     */
    var category: CodeableConcept? = null

    val type: List<CodeableConcept> = mutableListOf<CodeableConcept>()

    val specialty: List<CodeableConcept> = mutableListOf<CodeableConcept>()

    val location: List<Reference> = mutableListOf<Reference>()

    /**
     * Description of service as presented to a consumer while searching
     */
    var name: String? = null

    /**
     * Additional description and/or any specific issues not covered elsewhere
     */
    var comment: String? = null

    /**
     * Extra details about the service that can't be placed in the other fields
     */
    var extraDetails: String? = null

    /**
     * Facilitates quick identification of the service
     */
    var photo: Attachment? = null

    val telecom: List<ContactPoint> = mutableListOf<ContactPoint>()

    val coverageArea: List<Reference> = mutableListOf<Reference>()

    val serviceProvisionCode: List<CodeableConcept> = mutableListOf<CodeableConcept>()

    /**
     * Specific eligibility requirements required to use the service
     */
    var eligibility: CodeableConcept? = null

    /**
     * Describes the eligibility conditions for the service
     */
    var eligibilityNote: String? = null

    val programName: List<String> = mutableListOf<String>()

    val characteristic: List<CodeableConcept> = mutableListOf<CodeableConcept>()

    val referralMethod: List<CodeableConcept> = mutableListOf<CodeableConcept>()

    /**
     * If an appointment is required for access to this service
     */
    var appointmentRequired: Boolean? = null

    val availableTime: List<HealthcareServiceAvailableTime> =
            mutableListOf<HealthcareServiceAvailableTime>()

    val notAvailable: List<HealthcareServiceNotAvailable> =
            mutableListOf<HealthcareServiceNotAvailable>()

    /**
     * Description of availability exceptions
     */
    var availabilityExceptions: String? = null

    val endpoint: List<Reference> = mutableListOf<Reference>()
}

/**
 * Times the Service Site is available
 *
 * A collection of times that the Service Site is available.
 */
open class HealthcareServiceAvailableTime() : BackboneElement() {
    val daysOfWeek: List<String> = mutableListOf<String>()

    /**
     * Always available? e.g. 24 hour service
     */
    var allDay: Boolean? = null

    /**
     * Opening time of day (ignored if allDay = true)
     */
    var availableStartTime: FhirDate? = null

    /**
     * Closing time of day (ignored if allDay = true)
     */
    var availableEndTime: FhirDate? = null
}

/**
 * Not available during this time due to provided reason
 *
 * The HealthcareService is not available during this period of time due to the provided reason.
 */
open class HealthcareServiceNotAvailable() : BackboneElement() {
    /**
     * Reason presented to the user explaining why time not available
     */
    var description: String = ""

    /**
     * Service not availablefrom this date
     */
    var during: Period? = null
}
