//
//  Generated from FHIR Version 3.0.1.11917 on 2018-11-29T14:32:35.293 
//
//   2018, JuiceLab, LLC
//  
package com.juicelabs.fhir.model

import kotlin.collections.List

/**
 * EligibilityResponse resource
 *
 * This resource provides eligibility and plan details from the processing of an Eligibility resource.
 */
open class EligibilityResponse() : DomainResource() {
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
     * Responsible practitioner
     */
    var requestProvider: Reference? = null

    /**
     * Responsible organization
     */
    var requestOrganization: Reference? = null

    /**
     * Eligibility reference
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
     * Insurer issuing the coverage
     */
    var insurer: Reference? = null

    /**
     * Coverage inforce indicator
     */
    var inforce: Boolean? = null

    val insurance: List<EligibilityResponseInsurance> =
            mutableListOf<EligibilityResponseInsurance>()

    /**
     * Printed Form Identifier
     */
    var form: CodeableConcept? = null

    val error: List<EligibilityResponseError> = mutableListOf<EligibilityResponseError>()
}

/**
 * Details by insurance coverage
 *
 * The insurer may provide both the details for the requested coverage as well as details for additional coverages known to the insurer.
 */
open class EligibilityResponseInsurance() : BackboneElement() {
    /**
     * Updated Coverage details
     */
    var coverage: Reference? = null

    /**
     * Contract details
     */
    var contract: Reference? = null

    val benefitBalance: List<EligibilityResponseInsuranceBenefitBalance> =
            mutableListOf<EligibilityResponseInsuranceBenefitBalance>()
}

/**
 * Benefits by Category
 *
 * Benefits and optionally current balances by Category.
 */
open class EligibilityResponseInsuranceBenefitBalance() : BackboneElement() {
    /**
     * Type of services covered
     */
    var category: CodeableConcept = CodeableConcept()

    /**
     * Detailed services covered within the type
     */
    var subCategory: CodeableConcept? = null

    /**
     * Excluded from the plan
     */
    var excluded: Boolean? = null

    /**
     * Short name for the benefit
     */
    var name: String? = null

    /**
     * Description of the benefit or services covered
     */
    var description: String? = null

    /**
     * In or out of network
     */
    var network: CodeableConcept? = null

    /**
     * Individual or family
     */
    var unit: CodeableConcept? = null

    /**
     * Annual or lifetime
     */
    var term: CodeableConcept? = null

    val financial: List<EligibilityResponseInsuranceBenefitBalanceFinancial> =
            mutableListOf<EligibilityResponseInsuranceBenefitBalanceFinancial>()
}

/**
 * Benefit Summary
 *
 * Benefits Used to date.
 */
open class EligibilityResponseInsuranceBenefitBalanceFinancial() : BackboneElement() {
    /**
     * Deductable, visits, benefit amount
     */
    var type: CodeableConcept = CodeableConcept()

    /**
     * Benefits allowed
     */
    var allowedUnsignedInt: Int? = null

    /**
     * Benefits allowed
     */
    var allowedString: String? = null

    /**
     * Benefits allowed
     */
    var allowedMoney: Money? = null

    /**
     * Benefits used
     */
    var usedUnsignedInt: Int? = null

    /**
     * Benefits used
     */
    var usedMoney: Money? = null
}

/**
 * Processing errors
 *
 * Mutually exclusive with Services Provided (Item).
 */
open class EligibilityResponseError() : BackboneElement() {
    /**
     * Error code detailing processing issues
     */
    var code: CodeableConcept = CodeableConcept()
}
