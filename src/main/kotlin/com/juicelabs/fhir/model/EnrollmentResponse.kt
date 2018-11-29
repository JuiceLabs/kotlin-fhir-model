//
//  Generated from FHIR Version 3.0.1.11917 on 2018-11-29T14:32:35.803 
//
//   2018, JuiceLab, LLC
//  
package com.juicelabs.fhir.model

import kotlin.collections.List

/**
 * EnrollmentResponse resource
 *
 * This resource provides enrollment and plan details from the processing of an Enrollment resource.
 */
open class EnrollmentResponse() : DomainResource() {
    val identifier: List<Identifier> = mutableListOf<Identifier>()

    /**
     * active | cancelled | draft | entered-in-error
     */
    var status: String? = null

    /**
     * Claim reference
     */
    var request: Reference? = null

    /**
     * complete | error | partial
     */
    var outcome: CodeableConcept? = null

    /**
     * Disposition Message
     */
    var disposition: String? = null

    /**
     * Creation date
     */
    var created: String? = null

    /**
     * Insurer
     */
    var organization: Reference? = null

    /**
     * Responsible practitioner
     */
    var requestProvider: Reference? = null

    /**
     * Responsible organization
     */
    var requestOrganization: Reference? = null
}
