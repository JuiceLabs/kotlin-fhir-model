//
//  Generated from FHIR Version 3.0.1.11917 on 2018-11-29T14:32:35.824 
//
//   2018, JuiceLab, LLC
//  
package com.juicelabs.fhir.model

import com.google.gson.annotations.SerializedName
import kotlin.collections.List

/**
 * An interaction during which services are provided to the patient
 *
 * An interaction between a patient and healthcare provider(s) for the purpose of providing healthcare service(s) or assessing the health status of a patient.
 */
open class Encounter() : DomainResource() {
    val identifier: List<Identifier> = mutableListOf<Identifier>()

    /**
     * planned | arrived | triaged | in-progress | onleave | finished | cancelled +
     */
    var status: String? = null

    val statusHistory: List<EncounterStatusHistory> = mutableListOf<EncounterStatusHistory>()

    /**
     * inpatient | outpatient | ambulatory | emergency +
     */
    @SerializedName("class")
    var class_fhir: Coding? = null

    val classHistory: List<EncounterClassHistory> = mutableListOf<EncounterClassHistory>()

    val type: List<CodeableConcept> = mutableListOf<CodeableConcept>()

    /**
     * Indicates the urgency of the encounter
     */
    var priority: CodeableConcept? = null

    /**
     * The patient ro group present at the encounter
     */
    var subject: Reference? = null

    val episodeOfCare: List<Reference> = mutableListOf<Reference>()

    val incomingReferral: List<Reference> = mutableListOf<Reference>()

    val participant: List<EncounterParticipant> = mutableListOf<EncounterParticipant>()

    /**
     * The appointment that scheduled this encounter
     */
    var appointment: Reference? = null

    /**
     * The start and end time of the encounter
     */
    var period: Period? = null

    /**
     * Quantity of time the encounter lasted (less time absent)
     */
    var length: Duration? = null

    val reason: List<CodeableConcept> = mutableListOf<CodeableConcept>()

    val diagnosis: List<EncounterDiagnosis> = mutableListOf<EncounterDiagnosis>()

    val account: List<Reference> = mutableListOf<Reference>()

    /**
     * Details about the admission to a healthcare service
     */
    var hospitalization: EncounterHospitalization? = null

    val location: List<EncounterLocation> = mutableListOf<EncounterLocation>()

    /**
     * The custodian organization of this Encounter record
     */
    var serviceProvider: Reference? = null

    /**
     * Another Encounter this encounter is part of
     */
    var partOf: Reference? = null
}

/**
 * List of past encounter statuses
 *
 * The status history permits the encounter resource to contain the status history without needing to read through the historical versions of the resource, or even have the server store them.
 */
open class EncounterStatusHistory() : BackboneElement() {
    /**
     * planned | arrived | triaged | in-progress | onleave | finished | cancelled +
     */
    var status: String? = null

    /**
     * The time that the episode was in the specified status
     */
    var period: Period = Period()
}

/**
 * List of past encounter classes
 *
 * The class history permits the tracking of the encounters transitions without needing to go  through the resource history.
 *
 * This would be used for a case where an admission starts of as an emergency encounter, then transisions into an inpatient scenario. Doing this and not restarting a new encounter ensures that any lab/diagnostic results can more easily follow the patient and not require re-processing and not get lost or cancelled during a kindof discharge from emergency to inpatient.
 */
open class EncounterClassHistory() : BackboneElement() {
    /**
     * inpatient | outpatient | ambulatory | emergency +
     */
    @SerializedName("class")
    var class_fhir: Coding = Coding()

    /**
     * The time that the episode was in the specified class
     */
    var period: Period = Period()
}

/**
 * List of participants involved in the encounter
 *
 * The list of people responsible for providing the service.
 */
open class EncounterParticipant() : BackboneElement() {
    val type: List<CodeableConcept> = mutableListOf<CodeableConcept>()

    /**
     * Period of time during the encounter that the participant participated
     */
    var period: Period? = null

    /**
     * Persons involved in the encounter other than the patient
     */
    var individual: Reference? = null
}

/**
 * The list of diagnosis relevant to this encounter
 *
 * The list of diagnosis relevant to this encounter.
 */
open class EncounterDiagnosis() : BackboneElement() {
    /**
     * Reason the encounter takes place (resource)
     */
    var condition: Reference = Reference()

    /**
     * Role that this diagnosis has within the encounter (e.g. admission, billing, discharge …)
     */
    var role: CodeableConcept? = null

    /**
     * Ranking of the diagnosis (for each role type)
     */
    var rank: Int? = null
}

/**
 * Details about the admission to a healthcare service
 *
 * Details about the admission to a healthcare service.
 */
open class EncounterHospitalization() : BackboneElement() {
    /**
     * Pre-admission identifier
     */
    var preAdmissionIdentifier: Identifier? = null

    /**
     * The location from which the patient came before admission
     */
    var origin: Reference? = null

    /**
     * From where patient was admitted (physician referral, transfer)
     */
    var admitSource: CodeableConcept? = null

    /**
     * The type of hospital re-admission that has occurred (if any). If the value is absent, then this is not identified as a readmission
     */
    var reAdmission: CodeableConcept? = null

    val dietPreference: List<CodeableConcept> = mutableListOf<CodeableConcept>()

    val specialCourtesy: List<CodeableConcept> = mutableListOf<CodeableConcept>()

    val specialArrangement: List<CodeableConcept> = mutableListOf<CodeableConcept>()

    /**
     * Location to which the patient is discharged
     */
    var destination: Reference? = null

    /**
     * Category or kind of location after discharge
     */
    var dischargeDisposition: CodeableConcept? = null
}

/**
 * List of locations where the patient has been
 *
 * List of locations where  the patient has been during this encounter.
 */
open class EncounterLocation() : BackboneElement() {
    /**
     * Location the encounter takes place
     */
    var location: Reference = Reference()

    /**
     * planned | active | reserved | completed
     */
    var status: String? = null

    /**
     * Time period during which the patient was present at the location
     */
    var period: Period? = null
}
