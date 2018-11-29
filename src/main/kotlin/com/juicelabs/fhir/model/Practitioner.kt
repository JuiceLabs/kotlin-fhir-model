//
//  Generated from FHIR Version 3.0.1.11917 on 2018-11-29T05:04:14.679 
//
//   2018, JuiceLab, LLC
//  
package com.juicelabs.fhir.model

import com.juicelabs.fhir.base.FhirDate
import kotlin.collections.List

/**
 * A person with a  formal responsibility in the provisioning of healthcare or related services
 *
 * A person who is directly or indirectly involved in the provisioning of healthcare.
 */
open class Practitioner() : DomainResource() {
    val identifier: List<Identifier> = mutableListOf<Identifier>()

    /**
     * Whether this practitioner's record is in active use
     */
    var active: Boolean? = null

    val name: List<HumanName> = mutableListOf<HumanName>()

    val telecom: List<ContactPoint> = mutableListOf<ContactPoint>()

    val address: List<Address> = mutableListOf<Address>()

    /**
     * male | female | other | unknown
     */
    var gender: String? = null

    /**
     * The date  on which the practitioner was born
     */
    var birthDate: FhirDate? = null

    val photo: List<Attachment> = mutableListOf<Attachment>()

    val qualification: List<PractitionerQualification> = mutableListOf<PractitionerQualification>()

    val communication: List<CodeableConcept> = mutableListOf<CodeableConcept>()
}

/**
 * Qualifications obtained by training and certification
 *
 * Qualifications obtained by training and certification.
 */
open class PractitionerQualification() : BackboneElement() {
    val identifier: List<Identifier> = mutableListOf<Identifier>()

    /**
     * Coded representation of the qualification
     */
    var code: CodeableConcept = CodeableConcept()

    /**
     * Period during which the qualification is valid
     */
    var period: Period? = null

    /**
     * Organization that regulates and issues the qualification
     */
    var issuer: Reference? = null
}
