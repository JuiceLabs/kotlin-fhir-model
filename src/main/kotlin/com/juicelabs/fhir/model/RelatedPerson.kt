//
//  Generated from FHIR Version 3.0.1.11917 on 2018-11-27T12:50:39.660 
//
//   2018, JuiceLab, LLC
//  
package com.juicelabs.fhir.model

import com.juicelabs.fhir.base.FhirDate
import kotlin.collections.List

/**
 * An person that is related to a patient, but who is not a direct target of care
 *
 * Information about a person that is involved in the care for a patient, but who is not the target of healthcare, nor has a formal responsibility in the care process.
 */
open class RelatedPerson() : DomainResource() {
    val identifier: List<Identifier> = mutableListOf<Identifier>()

    /**
     * Whether this related person's record is in active use
     */
    var active: Boolean? = null

    /**
     * The patient this person is related to
     */
    var patient: Reference = Reference()

    /**
     * The nature of the relationship
     */
    var relationship: CodeableConcept? = null

    val name: List<HumanName> = mutableListOf<HumanName>()

    val telecom: List<ContactPoint> = mutableListOf<ContactPoint>()

    /**
     * male | female | other | unknown
     */
    var gender: String? = null

    /**
     * The date on which the related person was born
     */
    var birthDate: FhirDate? = null

    val address: List<Address> = mutableListOf<Address>()

    val photo: List<Attachment> = mutableListOf<Attachment>()

    /**
     * Period of time that this relationship is considered valid
     */
    var period: Period? = null
}
