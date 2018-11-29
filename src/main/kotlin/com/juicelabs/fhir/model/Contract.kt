//
//  Generated from FHIR Version 3.0.1.11917 on 2018-11-29T14:32:35.375 
//
//   2018, JuiceLab, LLC
//  
package com.juicelabs.fhir.model

import kotlin.collections.List

/**
 * Legal Agreement
 *
 * A formal agreement between parties regarding the conduct of business, exchange of information or other matters.
 */
open class Contract() : DomainResource() {
    /**
     * Contract number
     */
    var identifier: Identifier? = null

    /**
     * amended | appended | cancelled | disputed | entered-in-error | executable | executed | negotiable | offered | policy | rejected | renewed | revoked | resolved | terminated
     */
    var status: String? = null

    /**
     * When this Contract was issued
     */
    var issued: String? = null

    /**
     * Effective time
     */
    var applies: Period? = null

    val subject: List<Reference> = mutableListOf<Reference>()

    val topic: List<Reference> = mutableListOf<Reference>()

    val authority: List<Reference> = mutableListOf<Reference>()

    val domain: List<Reference> = mutableListOf<Reference>()

    /**
     * Type or form
     */
    var type: CodeableConcept? = null

    val subType: List<CodeableConcept> = mutableListOf<CodeableConcept>()

    val action: List<CodeableConcept> = mutableListOf<CodeableConcept>()

    val actionReason: List<CodeableConcept> = mutableListOf<CodeableConcept>()

    /**
     * Decision by Grantor
     */
    var decisionType: CodeableConcept? = null

    /**
     * Content derived from the basal information
     */
    var contentDerivative: CodeableConcept? = null

    val securityLabel: List<Coding> = mutableListOf<Coding>()

    val agent: List<ContractAgent> = mutableListOf<ContractAgent>()

    val signer: List<ContractSigner> = mutableListOf<ContractSigner>()

    val valuedItem: List<ContractValuedItem> = mutableListOf<ContractValuedItem>()

    val term: List<ContractTerm> = mutableListOf<ContractTerm>()

    /**
     * Binding Contract
     */
    var bindingAttachment: Attachment? = null

    /**
     * Binding Contract
     */
    var bindingReference: Reference? = null

    val friendly: List<ContractFriendly> = mutableListOf<ContractFriendly>()

    val legal: List<ContractLegal> = mutableListOf<ContractLegal>()

    val rule: List<ContractRule> = mutableListOf<ContractRule>()
}

/**
 * Entity being ascribed responsibility
 *
 * An actor taking a role in an activity for which it can be assigned some degree of responsibility for the activity taking place.
 */
open class ContractAgent() : BackboneElement() {
    /**
     * Contract Agent Type
     */
    var actor: Reference = Reference()

    val role: List<CodeableConcept> = mutableListOf<CodeableConcept>()
}

/**
 * Contract Signatory
 *
 * Parties with legal standing in the Contract, including the principal parties, the grantor(s) and grantee(s), which are any person or organization bound by the contract, and any ancillary parties, which facilitate the execution of the contract such as a notary or witness.
 */
open class ContractSigner() : BackboneElement() {
    /**
     * Contract Signatory Role
     */
    var type: Coding = Coding()

    /**
     * Contract Signatory Party
     */
    var party: Reference = Reference()

    val signature: List<Signature> = mutableListOf<Signature>()
}

/**
 * Contract Valued Item List
 *
 * Contract Valued Item List.
 */
open class ContractValuedItem() : BackboneElement() {
    /**
     * Contract Valued Item Type
     */
    var entityCodeableConcept: CodeableConcept? = null

    /**
     * Contract Valued Item Type
     */
    var entityReference: Reference? = null

    /**
     * Contract Valued Item Number
     */
    var identifier: Identifier? = null

    /**
     * Contract Valued Item Effective Tiem
     */
    var effectiveTime: String? = null

    /**
     * Count of Contract Valued Items
     */
    var quantity: Quantity? = null

    /**
     * Contract Valued Item fee, charge, or cost
     */
    var unitPrice: Money? = null

    /**
     * Contract Valued Item Price Scaling Factor
     */
    var factor: Float? = null

    /**
     * Contract Valued Item Difficulty Scaling Factor
     */
    var points: Float? = null

    /**
     * Total Contract Valued Item Value
     */
    var net: Money? = null
}

/**
 * Contract Term List
 *
 * One or more Contract Provisions, which may be related and conveyed as a group, and may contain nested groups.
 */
open class ContractTerm() : BackboneElement() {
    /**
     * Contract Term Number
     */
    var identifier: Identifier? = null

    /**
     * Contract Term Issue Date Time
     */
    var issued: String? = null

    /**
     * Contract Term Effective Time
     */
    var applies: Period? = null

    /**
     * Contract Term Type or Form
     */
    var type: CodeableConcept? = null

    /**
     * Contract Term Type specific classification
     */
    var subType: CodeableConcept? = null

    val topic: List<Reference> = mutableListOf<Reference>()

    val action: List<CodeableConcept> = mutableListOf<CodeableConcept>()

    val actionReason: List<CodeableConcept> = mutableListOf<CodeableConcept>()

    val securityLabel: List<Coding> = mutableListOf<Coding>()

    val agent: List<ContractTermAgent> = mutableListOf<ContractTermAgent>()

    /**
     * Human readable Contract term text
     */
    var text: String? = null

    val valuedItem: List<ContractTermValuedItem> = mutableListOf<ContractTermValuedItem>()

    val group: List<ContractTerm> = mutableListOf<ContractTerm>()
}

/**
 * Contract Term Agent List
 *
 * An actor taking a role in an activity for which it can be assigned some degree of responsibility for the activity taking place.
 */
open class ContractTermAgent() : BackboneElement() {
    /**
     * Contract Term Agent Subject
     */
    var actor: Reference = Reference()

    val role: List<CodeableConcept> = mutableListOf<CodeableConcept>()
}

/**
 * Contract Term Valued Item List
 *
 * Contract Provision Valued Item List.
 */
open class ContractTermValuedItem() : BackboneElement() {
    /**
     * Contract Term Valued Item Type
     */
    var entityCodeableConcept: CodeableConcept? = null

    /**
     * Contract Term Valued Item Type
     */
    var entityReference: Reference? = null

    /**
     * Contract Term Valued Item Number
     */
    var identifier: Identifier? = null

    /**
     * Contract Term Valued Item Effective Tiem
     */
    var effectiveTime: String? = null

    /**
     * Contract Term Valued Item Count
     */
    var quantity: Quantity? = null

    /**
     * Contract Term Valued Item fee, charge, or cost
     */
    var unitPrice: Money? = null

    /**
     * Contract Term Valued Item Price Scaling Factor
     */
    var factor: Float? = null

    /**
     * Contract Term Valued Item Difficulty Scaling Factor
     */
    var points: Float? = null

    /**
     * Total Contract Term Valued Item Value
     */
    var net: Money? = null
}

/**
 * Contract Friendly Language
 *
 * The "patient friendly language" versionof the Contract in whole or in parts. "Patient friendly language" means the representation of the Contract and Contract Provisions in a manner that is readily accessible and understandable by a layperson in accordance with best practices for communication styles that ensure that those agreeing to or signing the Contract understand the roles, actions, obligations, responsibilities, and implication of the agreement.
 */
open class ContractFriendly() : BackboneElement() {
    /**
     * Easily comprehended representation of this Contract
     */
    var contentAttachment: Attachment = Attachment()

    /**
     * Easily comprehended representation of this Contract
     */
    var contentReference: Reference = Reference()
}

/**
 * Contract Legal Language
 *
 * List of Legal expressions or representations of this Contract.
 */
open class ContractLegal() : BackboneElement() {
    /**
     * Contract Legal Text
     */
    var contentAttachment: Attachment = Attachment()

    /**
     * Contract Legal Text
     */
    var contentReference: Reference = Reference()
}

/**
 * Computable Contract Language
 *
 * List of Computable Policy Rule Language Representations of this Contract.
 */
open class ContractRule() : BackboneElement() {
    /**
     * Computable Contract Rules
     */
    var contentAttachment: Attachment = Attachment()

    /**
     * Computable Contract Rules
     */
    var contentReference: Reference = Reference()
}
