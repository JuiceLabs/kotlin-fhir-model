//
//  Generated from FHIR Version 3.0.1.11917 on 2018-12-02T21:16:28.087 
//
//   2018, JuiceLab, LLC
//  
package com.juicelabs.fhir.model

import kotlin.collections.List

/**
 * PaymentNotice request
 *
 * This resource provides the status of the payment for goods and services rendered, and the request and response resource references.
 */
open class PaymentNotice() : DomainResource() {
    /**
     * Creation date
     */
    var created: String? = null

    val identifier: List<Identifier> = mutableListOf<Identifier>()

    /**
     * Responsible organization
     */
    var organization: Reference? = null

    /**
     * Whether payment has been sent or cleared
     */
    var paymentStatus: CodeableConcept? = null

    /**
     * Responsible practitioner
     */
    var provider: Reference? = null

    /**
     * Request reference
     */
    var request: Reference? = null

    /**
     * Response reference
     */
    var response: Reference? = null

    /**
     * active | cancelled | draft | entered-in-error
     */
    var status: String? = null

    /**
     * Payment or clearing date
     */
    var statusDate: String? = null

    /**
     * Insurer or Regulatory body
     */
    var target: Reference? = null
}
