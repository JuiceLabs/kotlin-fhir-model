//
//  Generated from FHIR Version 3.0.1.11917 on 2018-11-29T05:04:14.942 
//
//   2018, JuiceLab, LLC
//  
package com.juicelabs.fhir.model

import kotlin.collections.List

/**
 * A grouping of people or organizations with a common purpose
 *
 * A formally or informally recognized grouping of people or organizations formed for the purpose of achieving some form of collective action.  Includes companies, institutions, corporations, departments, community groups, healthcare practice groups, etc.
 */
open class Organization() : DomainResource() {
    val identifier: List<Identifier> = mutableListOf<Identifier>()

    /**
     * Whether the organization's record is still in active use
     */
    var active: Boolean? = null

    val type: List<CodeableConcept> = mutableListOf<CodeableConcept>()

    /**
     * Name used for the organization
     */
    var name: String? = null

    val alias: List<String> = mutableListOf<String>()

    val telecom: List<ContactPoint> = mutableListOf<ContactPoint>()

    val address: List<Address> = mutableListOf<Address>()

    /**
     * The organization of which this organization forms a part
     */
    var partOf: Reference? = null

    val contact: List<OrganizationContact> = mutableListOf<OrganizationContact>()

    val endpoint: List<Reference> = mutableListOf<Reference>()
}

/**
 * Contact for the organization for a certain purpose
 *
 * Contact for the organization for a certain purpose.
 */
open class OrganizationContact() : BackboneElement() {
    /**
     * The type of contact
     */
    var purpose: CodeableConcept? = null

    /**
     * A name associated with the contact
     */
    var name: HumanName? = null

    val telecom: List<ContactPoint> = mutableListOf<ContactPoint>()

    /**
     * Visiting or postal addresses for the contact
     */
    var address: Address? = null
}
