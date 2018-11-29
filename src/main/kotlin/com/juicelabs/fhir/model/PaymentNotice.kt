//
//  Generated from FHIR Version 3.0.1.11917 on 2018-11-29T14:32:35.477 
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
    val identifier: List<Identifier> = mutableListOf<Identifier>()

    /**
     * active | cancelled | draft | entered-in-error
     */
    var status: String? = null

    /**
     * Request reference
     */
    var request: Reference? = null

    /**
     * Response reference
     */
    var response: Reference? = null

    /**
     * Payment or clearing date
     */
    var statusDate: String? = null

    /**
     * Creation date
     */
    var created: String? = null

    /**
     * Insurer or Regulatory body
     */
    var target: Reference? = null

    /**
     * Responsible practitioner
     */
    var provider: Reference? = null

    /**
     * Responsible organization
     */
    var organization: Reference? = null

    /**
     * Whether payment has been sent or cleared
     */
    var paymentStatus: CodeableConcept? = null
}
