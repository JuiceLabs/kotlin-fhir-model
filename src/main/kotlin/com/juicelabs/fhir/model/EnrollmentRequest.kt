//
//  Generated from FHIR Version 3.0.1.11917 on 2018-12-01T08:36:55.120 
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
    /**
     * Insurance information
     */
    var coverage: Reference? = null

    /**
     * Creation date
     */
    var created: String? = null

    val identifier: List<Identifier> = mutableListOf<Identifier>()

    /**
     * Target
     */
    var insurer: Reference? = null

    /**
     * Responsible organization
     */
    var organization: Reference? = null

    /**
     * Responsible practitioner
     */
    var provider: Reference? = null

    /**
     * active | cancelled | draft | entered-in-error
     */
    var status: String? = null

    /**
     * The subject of the Products and Services
     */
    var subject: Reference? = null
}
