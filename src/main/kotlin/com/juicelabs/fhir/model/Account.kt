//
//  Generated from FHIR Version 3.0.1.11917 on 2018-11-29T14:32:35.865 
//
//   2018, JuiceLab, LLC
//  
package com.juicelabs.fhir.model

import kotlin.collections.List

/**
 * Tracks balance, charges, for patient or cost center
 *
 * A financial tool for tracking value accrued for a particular purpose.  In the healthcare field, used to track charges for a patient, cost centers, etc.
 */
open class Account() : DomainResource() {
    val identifier: List<Identifier> = mutableListOf<Identifier>()

    /**
     * active | inactive | entered-in-error
     */
    var status: String? = null

    /**
     * E.g. patient, expense, depreciation
     */
    var type: CodeableConcept? = null

    /**
     * Human-readable label
     */
    var name: String? = null

    /**
     * What is account tied to?
     */
    var subject: Reference? = null

    /**
     * Transaction window
     */
    var period: Period? = null

    /**
     * Time window that transactions may be posted to this account
     */
    var active: Period? = null

    /**
     * How much is in account?
     */
    var balance: Money? = null

    val coverage: List<AccountCoverage> = mutableListOf<AccountCoverage>()

    /**
     * Who is responsible?
     */
    var owner: Reference? = null

    /**
     * Explanation of purpose/use
     */
    var description: String? = null

    val guarantor: List<AccountGuarantor> = mutableListOf<AccountGuarantor>()
}

/**
 * The party(s) that are responsible for covering the payment of this account, and what order should they be applied to the account
 *
 * The party(s) that are responsible for covering the payment of this account, and what order should they be applied to the account.
 */
open class AccountCoverage() : BackboneElement() {
    /**
     * The party(s) that are responsible for covering the payment of this account
     */
    var coverage: Reference = Reference()

    /**
     * The priority of the coverage in the context of this account
     */
    var priority: Int? = null
}

/**
 * Responsible for the account
 *
 * Parties financially responsible for the account.
 */
open class AccountGuarantor() : BackboneElement() {
    /**
     * Responsible entity
     */
    var party: Reference = Reference()

    /**
     * Credit or other hold applied
     */
    var onHold: Boolean? = null

    /**
     * Guarrantee account during
     */
    var period: Period? = null
}
