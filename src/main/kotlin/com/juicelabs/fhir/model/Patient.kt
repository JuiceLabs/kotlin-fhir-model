//
//  Generated from FHIR Version 3.0.1.11917 on 2018-11-29T14:32:35.793 
//
//   2018, JuiceLab, LLC
//  
package com.juicelabs.fhir.model

import kotlin.collections.List

/**
 * Information about an individual or animal receiving health care services
 *
 * Demographics and other administrative information about an individual or animal receiving care or other health-related services.
 */
open class Patient() : DomainResource() {
    val identifier: List<Identifier> = mutableListOf<Identifier>()

    /**
     * Whether this patient's record is in active use
     */
    var active: Boolean? = null

    val name: List<HumanName> = mutableListOf<HumanName>()

    val telecom: List<ContactPoint> = mutableListOf<ContactPoint>()

    /**
     * male | female | other | unknown
     */
    var gender: String? = null

    /**
     * The date of birth for the individual
     */
    var birthDate: String? = null

    /**
     * Indicates if the individual is deceased or not
     */
    var deceasedBoolean: Boolean? = null

    /**
     * Indicates if the individual is deceased or not
     */
    var deceasedDateTime: String? = null

    val address: List<Address> = mutableListOf<Address>()

    /**
     * Marital (civil) status of a patient
     */
    var maritalStatus: CodeableConcept? = null

    /**
     * Whether patient is part of a multiple birth
     */
    var multipleBirthBoolean: Boolean? = null

    /**
     * Whether patient is part of a multiple birth
     */
    var multipleBirthInteger: Int? = null

    val photo: List<Attachment> = mutableListOf<Attachment>()

    val contact: List<PatientContact> = mutableListOf<PatientContact>()

    /**
     * This patient is known to be an animal (non-human)
     */
    var animal: PatientAnimal? = null

    val communication: List<PatientCommunication> = mutableListOf<PatientCommunication>()

    val generalPractitioner: List<Reference> = mutableListOf<Reference>()

    /**
     * Organization that is the custodian of the patient record
     */
    var managingOrganization: Reference? = null

    val link: List<PatientLink> = mutableListOf<PatientLink>()
}

/**
 * A contact party (e.g. guardian, partner, friend) for the patient
 *
 * A contact party (e.g. guardian, partner, friend) for the patient.
 */
open class PatientContact() : BackboneElement() {
    val relationship: List<CodeableConcept> = mutableListOf<CodeableConcept>()

    /**
     * A name associated with the contact person
     */
    var name: HumanName? = null

    val telecom: List<ContactPoint> = mutableListOf<ContactPoint>()

    /**
     * Address for the contact person
     */
    var address: Address? = null

    /**
     * male | female | other | unknown
     */
    var gender: String? = null

    /**
     * Organization that is associated with the contact
     */
    var organization: Reference? = null

    /**
     * The period during which this contact person or organization is valid to be contacted relating to this patient
     */
    var period: Period? = null
}

/**
 * This patient is known to be an animal (non-human)
 *
 * This patient is known to be an animal.
 */
open class PatientAnimal() : BackboneElement() {
    /**
     * E.g. Dog, Cow
     */
    var species: CodeableConcept = CodeableConcept()

    /**
     * E.g. Poodle, Angus
     */
    var breed: CodeableConcept? = null

    /**
     * E.g. Neutered, Intact
     */
    var genderStatus: CodeableConcept? = null
}

/**
 * A list of Languages which may be used to communicate with the patient about his or her health
 *
 * Languages which may be used to communicate with the patient about his or her health.
 */
open class PatientCommunication() : BackboneElement() {
    /**
     * The language which can be used to communicate with the patient about his or her health
     */
    var language: CodeableConcept = CodeableConcept()

    /**
     * Language preference indicator
     */
    var preferred: Boolean? = null
}

/**
 * Link to another patient resource that concerns the same actual person
 *
 * Link to another patient resource that concerns the same actual patient.
 */
open class PatientLink() : BackboneElement() {
    /**
     * The other patient or related person resource that the link refers to
     */
    var other: Reference = Reference()

    /**
     * replaced-by | replaces | refer | seealso - type of link
     */
    var type: String? = null
}
