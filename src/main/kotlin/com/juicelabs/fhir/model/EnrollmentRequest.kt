//
//  Generated from FHIR Version 3.0.1.11917 on 2018-11-29T14:32:35.818 
//
//   2018, JuiceLab, LLC
//  
package com.juicelabs.fhir.model

import kotlin.collections.List

/**
 * Enrollment request
 *
 * This resource provides the insurance enrollment details to the insurer regarding a specified coverage.
 */
open class EnrollmentRequest() : DomainResource() {
    val identifier: List<Identifier> = mutableListOf<Identifier>()

    /**
     * active | cancelled | draft | entered-in-error
     */
    var status: String? = null

    /**
     * Creation date
     */
    var created: String? = null

    /**
     * Target
     */
    var insurer: Reference? = null

    /**
     * Responsible practitioner
     */
    var provider: Reference? = null

    /**
     * Responsible organization
     */
    var organization: Reference? = null

    /**
     * The subject of the Products and Services
     */
    var subject: Reference? = null

    /**
     * Insurance information
     */
    var coverage: Reference? = null
}
