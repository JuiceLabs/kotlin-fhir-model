//
//  Generated from FHIR Version 3.0.1.11917 on 2018-11-29T05:04:15.130 
//
//   2018, JuiceLab, LLC
//  
package com.juicelabs.fhir.model

import com.juicelabs.fhir.base.FhirDate
import kotlin.collections.List

/**
 * PaymentReconciliation resource
 *
 * This resource provides payment details and claim references supporting a bulk payment.
 */
open class PaymentReconciliation() : DomainResource() {
    val identifier: List<Identifier> = mutableListOf<Identifier>()

    /**
     * active | cancelled | draft | entered-in-error
     */
    var status: String? = null

    /**
     * Period covered
     */
    var period: Period? = null

    /**
     * Creation date
     */
    var created: FhirDate? = null

    /**
     * Insurer
     */
    var organization: Reference? = null

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
     * Responsible practitioner
     */
    var requestProvider: Reference? = null

    /**
     * Responsible organization
     */
    var requestOrganization: Reference? = null

    val detail: List<PaymentReconciliationDetail> = mutableListOf<PaymentReconciliationDetail>()

    /**
     * Printed Form Identifier
     */
    var form: CodeableConcept? = null

    /**
     * Total amount of Payment
     */
    var total: Money? = null

    val processNote: List<PaymentReconciliationProcessNote> =
            mutableListOf<PaymentReconciliationProcessNote>()
}

/**
 * List of settlements
 *
 * List of individual settlement amounts and the corresponding transaction.
 */
open class PaymentReconciliationDetail() : BackboneElement() {
    /**
     * Type code
     */
    var type: CodeableConcept = CodeableConcept()

    /**
     * Claim
     */
    var request: Reference? = null

    /**
     * Claim Response
     */
    var response: Reference? = null

    /**
     * Organization which submitted the claim
     */
    var submitter: Reference? = null

    /**
     * Organization which is receiving the payment
     */
    var payee: Reference? = null

    /**
     * Invoice date
     */
    var date: FhirDate? = null

    /**
     * Amount being paid
     */
    var amount: Money? = null
}

/**
 * Processing comments
 *
 * Suite of notes.
 */
open class PaymentReconciliationProcessNote() : BackboneElement() {
    /**
     * display | print | printoper
     */
    var type: CodeableConcept? = null

    /**
     * Comment on the processing
     */
    var text: String? = null
}
