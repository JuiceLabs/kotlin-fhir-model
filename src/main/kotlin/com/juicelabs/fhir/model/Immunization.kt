//
//  Generated from FHIR Version 3.0.1.11917 on 2018-11-27T12:50:39.913 
//
//   2018, JuiceLab, LLC
//  
package com.juicelabs.fhir.model

import com.juicelabs.fhir.base.FhirDate
import kotlin.collections.List

/**
 * Immunization event information
 *
 * Describes the event of a patient being administered a vaccination or a record of a vaccination as reported by a patient, a clinician or another party and may include vaccine reaction information and what vaccination protocol was followed.
 */
open class Immunization() : DomainResource() {
    val identifier: List<Identifier> = mutableListOf<Identifier>()

    /**
     * completed | entered-in-error
     */
    var status: String = ""

    /**
     * Flag for whether immunization was given
     */
    var notGiven: Boolean = false

    /**
     * Vaccine product administered
     */
    var vaccineCode: CodeableConcept = CodeableConcept()

    /**
     * Who was immunized
     */
    var patient: Reference = Reference()

    /**
     * Encounter administered as part of
     */
    var encounter: Reference? = null

    /**
     * Vaccination administration date
     */
    var date: FhirDate? = null

    /**
     * Indicates context the data was recorded in
     */
    var primarySource: Boolean = false

    /**
     * Indicates the source of a secondarily reported record
     */
    var reportOrigin: CodeableConcept? = null

    /**
     * Where vaccination occurred
     */
    var location: Reference? = null

    /**
     * Vaccine manufacturer
     */
    var manufacturer: Reference? = null

    /**
     * Vaccine lot number
     */
    var lotNumber: String? = null

    /**
     * Vaccine expiration date
     */
    var expirationDate: FhirDate? = null

    /**
     * Body site vaccine  was administered
     */
    var site: CodeableConcept? = null

    /**
     * How vaccine entered body
     */
    var route: CodeableConcept? = null

    /**
     * Amount of vaccine administered
     */
    var doseQuantity: Quantity? = null

    val practitioner: List<ImmunizationPractitioner> = mutableListOf<ImmunizationPractitioner>()

    val note: List<Annotation> = mutableListOf<Annotation>()

    /**
     * Administration/non-administration reasons
     */
    var explanation: ImmunizationExplanation? = null

    val reaction: List<ImmunizationReaction> = mutableListOf<ImmunizationReaction>()

    val vaccinationProtocol: List<ImmunizationVaccinationProtocol> =
            mutableListOf<ImmunizationVaccinationProtocol>()
}

/**
 * Who performed event
 *
 * Indicates who or what performed the event.
 */
open class ImmunizationPractitioner() : BackboneElement() {
    /**
     * What type of performance was done
     */
    var role: CodeableConcept? = null

    /**
     * Individual who was performing
     */
    var actor: Reference = Reference()
}

/**
 * Administration/non-administration reasons
 *
 * Reasons why a vaccine was or was not administered.
 */
open class ImmunizationExplanation() : BackboneElement() {
    val reason: List<CodeableConcept> = mutableListOf<CodeableConcept>()

    val reasonNotGiven: List<CodeableConcept> = mutableListOf<CodeableConcept>()
}

/**
 * Details of a reaction that follows immunization
 *
 * Categorical data indicating that an adverse event is associated in time to an immunization.
 */
open class ImmunizationReaction() : BackboneElement() {
    /**
     * When reaction started
     */
    var date: FhirDate? = null

    /**
     * Additional information on reaction
     */
    var detail: Reference? = null

    /**
     * Indicates self-reported reaction
     */
    var reported: Boolean? = null
}

/**
 * What protocol was followed
 *
 * Contains information about the protocol(s) under which the vaccine was administered.
 */
open class ImmunizationVaccinationProtocol() : BackboneElement() {
    /**
     * Dose number within series
     */
    var doseSequence: Int? = null

    /**
     * Details of vaccine protocol
     */
    var description: String? = null

    /**
     * Who is responsible for protocol
     */
    var authority: Reference? = null

    /**
     * Name of vaccine series
     */
    var series: String? = null

    /**
     * Recommended number of doses for immunity
     */
    var seriesDoses: Int? = null

    val targetDisease: List<CodeableConcept> = mutableListOf<CodeableConcept>()

    /**
     * Indicates if dose counts towards immunity
     */
    var doseStatus: CodeableConcept = CodeableConcept()

    /**
     * Why dose does (not) count
     */
    var doseStatusReason: CodeableConcept? = null
}
