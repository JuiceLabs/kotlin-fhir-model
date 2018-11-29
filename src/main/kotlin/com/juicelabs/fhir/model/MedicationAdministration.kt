//
//  Generated from FHIR Version 3.0.1.11917 on 2018-11-29T14:32:35.650 
//
//   2018, JuiceLab, LLC
//  
package com.juicelabs.fhir.model

import kotlin.collections.List

/**
 * Administration of medication to a patient
 *
 * Describes the event of a patient consuming or otherwise being administered a medication.  This may be as simple as swallowing a tablet or it may be a long running infusion.  Related resources tie this event to the authorizing prescription, and the specific encounter between patient and health care practitioner.
 */
open class MedicationAdministration() : DomainResource() {
    val identifier: List<Identifier> = mutableListOf<Identifier>()

    val definition: List<Reference> = mutableListOf<Reference>()

    val partOf: List<Reference> = mutableListOf<Reference>()

    /**
     * in-progress | on-hold | completed | entered-in-error | stopped | unknown
     */
    var status: String? = null

    /**
     * Type of medication usage
     */
    var category: CodeableConcept? = null

    /**
     * What was administered
     */
    var medicationCodeableConcept: CodeableConcept = CodeableConcept()

    /**
     * What was administered
     */
    var medicationReference: Reference = Reference()

    /**
     * Who received medication
     */
    var subject: Reference = Reference()

    /**
     * Encounter or Episode of Care administered as part of
     */
    var context: Reference? = null

    val supportingInformation: List<Reference> = mutableListOf<Reference>()

    /**
     * Start and end time of administration
     */
    var effectiveDateTime: String? = null

    /**
     * Start and end time of administration
     */
    var effectivePeriod: Period = Period()

    val performer: List<MedicationAdministrationPerformer> =
            mutableListOf<MedicationAdministrationPerformer>()

    /**
     * True if medication not administered
     */
    var notGiven: Boolean? = null

    val reasonNotGiven: List<CodeableConcept> = mutableListOf<CodeableConcept>()

    val reasonCode: List<CodeableConcept> = mutableListOf<CodeableConcept>()

    val reasonReference: List<Reference> = mutableListOf<Reference>()

    /**
     * Request administration performed against
     */
    var prescription: Reference? = null

    val device: List<Reference> = mutableListOf<Reference>()

    val note: List<Annotation> = mutableListOf<Annotation>()

    /**
     * Details of how medication was taken
     */
    var dosage: MedicationAdministrationDosage? = null

    val eventHistory: List<Reference> = mutableListOf<Reference>()
}

/**
 * Who administered substance
 *
 * The individual who was responsible for giving the medication to the patient.
 */
open class MedicationAdministrationPerformer() : BackboneElement() {
    /**
     * Individual who was performing
     */
    var actor: Reference = Reference()

    /**
     * Organization organization was acting for
     */
    var onBehalfOf: Reference? = null
}

/**
 * Details of how medication was taken
 *
 * Describes the medication dosage information details e.g. dose, rate, site, route, etc.
 */
open class MedicationAdministrationDosage() : BackboneElement() {
    /**
     * Free text dosage instructions e.g. SIG
     */
    var text: String? = null

    /**
     * Body site administered to
     */
    var site: CodeableConcept? = null

    /**
     * Path of substance into body
     */
    var route: CodeableConcept? = null

    /**
     * How drug was administered
     */
    var method: CodeableConcept? = null

    /**
     * Amount of medication per dose
     */
    var dose: Quantity? = null

    /**
     * Dose quantity per unit of time
     */
    var rateRatio: Ratio? = null

    /**
     * Dose quantity per unit of time
     */
    var rateQuantity: Quantity? = null
}
