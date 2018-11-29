//
//  Generated from FHIR Version 3.0.1.11917 on 2018-11-29T14:32:35.730 
//
//   2018, JuiceLab, LLC
//  
package com.juicelabs.fhir.model

import kotlin.collections.List

/**
 * A generic person record
 *
 * Demographics and administrative information about a person independent of a specific health-related context.
 */
open class Person() : DomainResource() {
    val identifier: List<Identifier> = mutableListOf<Identifier>()

    val name: List<HumanName> = mutableListOf<HumanName>()

    val telecom: List<ContactPoint> = mutableListOf<ContactPoint>()

    /**
     * male | female | other | unknown
     */
    var gender: String? = null

    /**
     * The date on which the person was born
     */
    var birthDate: String? = null

    val address: List<Address> = mutableListOf<Address>()

    /**
     * Image of the person
     */
    var photo: Attachment? = null

    /**
     * The organization that is the custodian of the person record
     */
    var managingOrganization: Reference? = null

    /**
     * This person's record is in active use
     */
    var active: Boolean? = null

    val link: List<PersonLink> = mutableListOf<PersonLink>()
}

/**
 * Link to a resource that concerns the same actual person
 *
 * Link to a resource that concerns the same actual person.
 */
open class PersonLink() : BackboneElement() {
    /**
     * The resource to which this actual person is associated
     */
    var target: Reference = Reference()

    /**
     * level1 | level2 | level3 | level4
     */
    var assurance: String? = null
}
