//
//  Generated from FHIR Version 3.0.1.11917 on 2018-11-29T14:32:35.458 
//
//   2018, JuiceLab, LLC
//  
package com.juicelabs.fhir.model

import kotlin.collections.List

/**
 * Remittance resource
 *
 * This resource provides the adjudication details from the processing of a Claim resource.
 */
open class ClaimResponse() : DomainResource() {
    val identifier: List<Identifier> = mutableListOf<Identifier>()

    /**
     * active | cancelled | draft | entered-in-error
     */
    var status: String? = null

    /**
     * The subject of the Products and Services
     */
    var patient: Reference? = null

    /**
     * Creation date
     */
    var created: String? = null

    /**
     * Insurance issuing organization
     */
    var insurer: Reference? = null

    /**
     * Responsible practitioner
     */
    var requestProvider: Reference? = null

    /**
     * Responsible organization
     */
    var requestOrganization: Reference? = null

    /**
     * Id of resource triggering adjudication
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
     * Party to be paid any benefits payable
     */
    var payeeType: CodeableConcept? = null

    val item: List<ClaimResponseItem> = mutableListOf<ClaimResponseItem>()

    val addItem: List<ClaimResponseAddItem> = mutableListOf<ClaimResponseAddItem>()

    val error: List<ClaimResponseError> = mutableListOf<ClaimResponseError>()

    /**
     * Total Cost of service from the Claim
     */
    var totalCost: Money? = null

    /**
     * Unallocated deductible
     */
    var unallocDeductable: Money? = null

    /**
     * Total benefit payable for the Claim
     */
    var totalBenefit: Money? = null

    /**
     * Payment details, if paid
     */
    var payment: ClaimResponsePayment? = null

    /**
     * Funds reserved status
     */
    var reserved: Coding? = null

    /**
     * Printed Form Identifier
     */
    var form: CodeableConcept? = null

    val processNote: List<ClaimResponseProcessNote> = mutableListOf<ClaimResponseProcessNote>()

    val communicationRequest: List<Reference> = mutableListOf<Reference>()

    val insurance: List<ClaimResponseInsurance> = mutableListOf<ClaimResponseInsurance>()
}

/**
 * Line items
 *
 * The first tier service adjudications for submitted services.
 */
open class ClaimResponseItem() : BackboneElement() {
    /**
     * Service instance
     */
    var sequenceLinkId: Int? = null

    val noteNumber: List<Int> = mutableListOf<Int>()

    val adjudication: List<ClaimResponseItemAdjudication> =
            mutableListOf<ClaimResponseItemAdjudication>()

    val detail: List<ClaimResponseItemDetail> = mutableListOf<ClaimResponseItemDetail>()
}

/**
 * Adjudication details
 *
 * The adjudication results.
 */
open class ClaimResponseItemAdjudication() : BackboneElement() {
    /**
     * Adjudication category such as co-pay, eligible, benefit, etc.
     */
    var category: CodeableConcept = CodeableConcept()

    /**
     * Explanation of Adjudication outcome
     */
    var reason: CodeableConcept? = null

    /**
     * Monetary amount
     */
    var amount: Money? = null

    /**
     * Non-monetary value
     */
    var value: Float? = null
}

/**
 * Detail line items
 *
 * The second tier service adjudications for submitted services.
 */
open class ClaimResponseItemDetail() : BackboneElement() {
    /**
     * Service instance
     */
    var sequenceLinkId: Int? = null

    val noteNumber: List<Int> = mutableListOf<Int>()

    val adjudication: List<ClaimResponseItemAdjudication> =
            mutableListOf<ClaimResponseItemAdjudication>()

    val subDetail: List<ClaimResponseItemDetailSubDetail> =
            mutableListOf<ClaimResponseItemDetailSubDetail>()
}

/**
 * Subdetail line items
 *
 * The third tier service adjudications for submitted services.
 */
open class ClaimResponseItemDetailSubDetail() : BackboneElement() {
    /**
     * Service instance
     */
    var sequenceLinkId: Int? = null

    val noteNumber: List<Int> = mutableListOf<Int>()

    val adjudication: List<ClaimResponseItemAdjudication> =
            mutableListOf<ClaimResponseItemAdjudication>()
}

/**
 * Insurer added line items
 *
 * The first tier service adjudications for payor added services.
 */
open class ClaimResponseAddItem() : BackboneElement() {
    val sequenceLinkId: List<Int> = mutableListOf<Int>()

    /**
     * Revenue or cost center code
     */
    var revenue: CodeableConcept? = null

    /**
     * Type of service or product
     */
    var category: CodeableConcept? = null

    /**
     * Group, Service or Product
     */
    var service: CodeableConcept? = null

    val modifier: List<CodeableConcept> = mutableListOf<CodeableConcept>()

    /**
     * Professional fee or Product charge
     */
    var fee: Money? = null

    val noteNumber: List<Int> = mutableListOf<Int>()

    val adjudication: List<ClaimResponseItemAdjudication> =
            mutableListOf<ClaimResponseItemAdjudication>()

    val detail: List<ClaimResponseAddItemDetail> = mutableListOf<ClaimResponseAddItemDetail>()
}

/**
 * Added items details
 *
 * The second tier service adjudications for payor added services.
 */
open class ClaimResponseAddItemDetail() : BackboneElement() {
    /**
     * Revenue or cost center code
     */
    var revenue: CodeableConcept? = null

    /**
     * Type of service or product
     */
    var category: CodeableConcept? = null

    /**
     * Service or Product
     */
    var service: CodeableConcept? = null

    val modifier: List<CodeableConcept> = mutableListOf<CodeableConcept>()

    /**
     * Professional fee or Product charge
     */
    var fee: Money? = null

    val noteNumber: List<Int> = mutableListOf<Int>()

    val adjudication: List<ClaimResponseItemAdjudication> =
            mutableListOf<ClaimResponseItemAdjudication>()
}

/**
 * Processing errors
 *
 * Mutually exclusive with Services Provided (Item).
 */
open class ClaimResponseError() : BackboneElement() {
    /**
     * Item sequence number
     */
    var sequenceLinkId: Int? = null

    /**
     * Detail sequence number
     */
    var detailSequenceLinkId: Int? = null

    /**
     * Subdetail sequence number
     */
    var subdetailSequenceLinkId: Int? = null

    /**
     * Error code detailing processing issues
     */
    var code: CodeableConcept = CodeableConcept()
}

/**
 * Payment details, if paid
 *
 * Payment details for the claim if the claim has been paid.
 */
open class ClaimResponsePayment() : BackboneElement() {
    /**
     * Partial or Complete
     */
    var type: CodeableConcept? = null

    /**
     * Payment adjustment for non-Claim issues
     */
    var adjustment: Money? = null

    /**
     * Explanation for the non-claim adjustment
     */
    var adjustmentReason: CodeableConcept? = null

    /**
     * Expected data of Payment
     */
    var date: String? = null

    /**
     * Payable amount after adjustment
     */
    var amount: Money? = null

    /**
     * Identifier of the payment instrument
     */
    var identifier: Identifier? = null
}

/**
 * Processing notes
 *
 * Note text.
 */
open class ClaimResponseProcessNote() : BackboneElement() {
    /**
     * Sequence Number for this note
     */
    var number: Int? = null

    /**
     * display | print | printoper
     */
    var type: CodeableConcept? = null

    /**
     * Note explanatory text
     */
    var text: String? = null

    /**
     * Language if different from the resource
     */
    var language: CodeableConcept? = null
}

/**
 * Insurance or medical plan
 *
 * Financial instrument by which payment information for health care.
 */
open class ClaimResponseInsurance() : BackboneElement() {
    /**
     * Service instance identifier
     */
    var sequence: Int? = null

    /**
     * Is the focal Coverage
     */
    var focal: Boolean? = null

    /**
     * Insurance information
     */
    var coverage: Reference = Reference()

    /**
     * Business agreement
     */
    var businessArrangement: String? = null

    val preAuthRef: List<String> = mutableListOf<String>()

    /**
     * Adjudication results
     */
    var claimResponse: Reference? = null
}
