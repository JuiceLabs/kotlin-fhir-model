//
//  Generated from FHIR Version 3.0.1.11917 on 2018-12-02T21:16:28.347 
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
    /**
     * Creation date
     */
    var created: String? = null

    /**
     * Disposition Message
     */
    var disposition: String? = null

    val identifier: List<Identifier> = mutableListOf<Identifier>()

    /**
     * Insurer
     */
    var organization: Reference? = null

    /**
     * complete | error | partial
     */
    var outcome: CodeableConcept? = null

    /**
     * Claim reference
     */
    var request: Reference? = null

    /**
     * Responsible organization
     */
    var requestOrganization: Reference? = null

    /**
     * Responsible practitioner
     */
    var requestProvider: Reference? = null

    /**
     * active | cancelled | draft | entered-in-error
     */
    var status: String? = null
}
