//
//  Generated from FHIR Version 3.0.1.11917 on 2018-11-29T05:04:14.728 
//
//   2018, JuiceLab, LLC
//  
package com.juicelabs.fhir.model

import com.juicelabs.fhir.base.FhirDate
import kotlin.collections.List

/**
 * Explanation of Benefit resource
 *
 * This resource provides: the claim details; adjudication details from the processing of a Claim; and optionally account balance information, for informing the subscriber of the benefits provided.
 */
open class ExplanationOfBenefit() : DomainResource() {
    val identifier: List<Identifier> = mutableListOf<Identifier>()

    /**
     * active | cancelled | draft | entered-in-error
     */
    var status: String? = null

    /**
     * Type or discipline
     */
    var type: CodeableConcept? = null

    val subType: List<CodeableConcept> = mutableListOf<CodeableConcept>()

    /**
     * The subject of the Products and Services
     */
    var patient: Reference? = null

    /**
     * Period for charge submission
     */
    var billablePeriod: Period? = null

    /**
     * Creation date
     */
    var created: FhirDate? = null

    /**
     * Author
     */
    var enterer: Reference? = null

    /**
     * Insurer responsible for the EOB
     */
    var insurer: Reference? = null

    /**
     * Responsible provider for the claim
     */
    var provider: Reference? = null

    /**
     * Responsible organization for the claim
     */
    var organization: Reference? = null

    /**
     * Treatment Referral
     */
    var referral: Reference? = null

    /**
     * Servicing Facility
     */
    var facility: Reference? = null

    /**
     * Claim reference
     */
    var claim: Reference? = null

    /**
     * Claim response reference
     */
    var claimResponse: Reference? = null

    /**
     * complete | error | partial
     */
    var outcome: CodeableConcept? = null

    /**
     * Disposition Message
     */
    var disposition: String? = null

    val related: List<ExplanationOfBenefitRelated> = mutableListOf<ExplanationOfBenefitRelated>()

    /**
     * Prescription authorizing services or products
     */
    var prescription: Reference? = null

    /**
     * Original prescription if superceded by fulfiller
     */
    var originalPrescription: Reference? = null

    /**
     * Party to be paid any benefits payable
     */
    var payee: ExplanationOfBenefitPayee? = null

    val information: List<ExplanationOfBenefitInformation> =
            mutableListOf<ExplanationOfBenefitInformation>()

    val careTeam: List<ExplanationOfBenefitCareTeam> = mutableListOf<ExplanationOfBenefitCareTeam>()

    val diagnosis: List<ExplanationOfBenefitDiagnosis> =
            mutableListOf<ExplanationOfBenefitDiagnosis>()

    val procedure: List<ExplanationOfBenefitProcedure> =
            mutableListOf<ExplanationOfBenefitProcedure>()

    /**
     * Precedence (primary, secondary, etc.)
     */
    var precedence: Int? = null

    /**
     * Insurance or medical plan
     */
    var insurance: ExplanationOfBenefitInsurance? = null

    /**
     * Details of an accident
     */
    var accident: ExplanationOfBenefitAccident? = null

    /**
     * Period unable to work
     */
    var employmentImpacted: Period? = null

    /**
     * Period in hospital
     */
    var hospitalization: Period? = null

    val item: List<ExplanationOfBenefitItem> = mutableListOf<ExplanationOfBenefitItem>()

    val addItem: List<ExplanationOfBenefitAddItem> = mutableListOf<ExplanationOfBenefitAddItem>()

    /**
     * Total Cost of service from the Claim
     */
    var totalCost: Money? = null

    /**
     * Unallocated deductable
     */
    var unallocDeductable: Money? = null

    /**
     * Total benefit payable for the Claim
     */
    var totalBenefit: Money? = null

    /**
     * Payment (if paid)
     */
    var payment: ExplanationOfBenefitPayment? = null

    /**
     * Printed Form Identifier
     */
    var form: CodeableConcept? = null

    val processNote: List<ExplanationOfBenefitProcessNote> =
            mutableListOf<ExplanationOfBenefitProcessNote>()

    val benefitBalance: List<ExplanationOfBenefitBenefitBalance> =
            mutableListOf<ExplanationOfBenefitBenefitBalance>()
}

/**
 * Related Claims which may be revelant to processing this claim
 *
 * Other claims which are related to this claim such as prior claim versions or for related services.
 */
open class ExplanationOfBenefitRelated() : BackboneElement() {
    /**
     * Reference to the related claim
     */
    var claim: Reference? = null

    /**
     * How the reference claim is related
     */
    var relationship: CodeableConcept? = null

    /**
     * Related file or case reference
     */
    var reference: Identifier? = null
}

/**
 * Party to be paid any benefits payable
 *
 * The party to be reimbursed for the services.
 */
open class ExplanationOfBenefitPayee() : BackboneElement() {
    /**
     * Type of party: Subscriber, Provider, other
     */
    var type: CodeableConcept? = null

    /**
     * organization | patient | practitioner | relatedperson
     */
    var resourceType: CodeableConcept? = null

    /**
     * Party to receive the payable
     */
    var party: Reference? = null
}

/**
 * Exceptions, special considerations, the condition, situation, prior or concurrent issues
 *
 * Additional information codes regarding exceptions, special considerations, the condition, situation, prior or concurrent issues. Often there are mutiple jurisdiction specific valuesets which are required.
 */
open class ExplanationOfBenefitInformation() : BackboneElement() {
    /**
     * Information instance identifier
     */
    var sequence: Int? = null

    /**
     * General class of information
     */
    var category: CodeableConcept = CodeableConcept()

    /**
     * Type of information
     */
    var code: CodeableConcept? = null

    /**
     * When it occurred
     */
    var timingDate: FhirDate? = null

    /**
     * When it occurred
     */
    var timingPeriod: Period? = null

    /**
     * Additional Data or supporting information
     */
    var valueString: String? = null

    /**
     * Additional Data or supporting information
     */
    var valueQuantity: Quantity? = null

    /**
     * Additional Data or supporting information
     */
    var valueAttachment: Attachment? = null

    /**
     * Additional Data or supporting information
     */
    var valueReference: Reference? = null

    /**
     * Reason associated with the information
     */
    var reason: Coding? = null
}

/**
 * Care Team members
 *
 * The members of the team who provided the overall service as well as their role and whether responsible and qualifications.
 */
open class ExplanationOfBenefitCareTeam() : BackboneElement() {
    /**
     * Number to covey order of careteam
     */
    var sequence: Int? = null

    /**
     * Member of the Care Team
     */
    var provider: Reference = Reference()

    /**
     * Billing practitioner
     */
    var responsible: Boolean? = null

    /**
     * Role on the team
     */
    var role: CodeableConcept? = null

    /**
     * Type, classification or Specialization
     */
    var qualification: CodeableConcept? = null
}

/**
 * List of Diagnosis
 *
 * Ordered list of patient diagnosis for which care is sought.
 */
open class ExplanationOfBenefitDiagnosis() : BackboneElement() {
    /**
     * Number to covey order of diagnosis
     */
    var sequence: Int? = null

    /**
     * Patient's diagnosis
     */
    var diagnosisCodeableConcept: CodeableConcept = CodeableConcept()

    /**
     * Patient's diagnosis
     */
    var diagnosisReference: Reference = Reference()

    val type: List<CodeableConcept> = mutableListOf<CodeableConcept>()

    /**
     * Package billing code
     */
    var packageCode: CodeableConcept? = null
}

/**
 * Procedures performed
 *
 * Ordered list of patient procedures performed to support the adjudication.
 */
open class ExplanationOfBenefitProcedure() : BackboneElement() {
    /**
     * Procedure sequence for reference
     */
    var sequence: Int? = null

    /**
     * When the procedure was performed
     */
    var date: FhirDate? = null

    /**
     * Patient's list of procedures performed
     */
    var procedureCodeableConcept: CodeableConcept = CodeableConcept()

    /**
     * Patient's list of procedures performed
     */
    var procedureReference: Reference = Reference()
}

/**
 * Insurance or medical plan
 *
 * Financial instrument by which payment information for health care.
 */
open class ExplanationOfBenefitInsurance() : BackboneElement() {
    /**
     * Insurance information
     */
    var coverage: Reference? = null

    val preAuthRef: List<String> = mutableListOf<String>()
}

/**
 * Details of an accident
 *
 * An accident which resulted in the need for healthcare services.
 */
open class ExplanationOfBenefitAccident() : BackboneElement() {
    /**
     * When the accident occurred
     */
    var date: FhirDate? = null

    /**
     * The nature of the accident
     */
    var type: CodeableConcept? = null

    /**
     * Accident Place
     */
    var locationAddress: Address? = null

    /**
     * Accident Place
     */
    var locationReference: Reference? = null
}

/**
 * Goods and Services
 *
 * First tier of goods and services.
 */
open class ExplanationOfBenefitItem() : BackboneElement() {
    /**
     * Service instance
     */
    var sequence: Int? = null

    val careTeamLinkId: List<Int> = mutableListOf<Int>()

    val diagnosisLinkId: List<Int> = mutableListOf<Int>()

    val procedureLinkId: List<Int> = mutableListOf<Int>()

    val informationLinkId: List<Int> = mutableListOf<Int>()

    /**
     * Revenue or cost center code
     */
    var revenue: CodeableConcept? = null

    /**
     * Type of service or product
     */
    var category: CodeableConcept? = null

    /**
     * Billing Code
     */
    var service: CodeableConcept? = null

    val modifier: List<CodeableConcept> = mutableListOf<CodeableConcept>()

    val programCode: List<CodeableConcept> = mutableListOf<CodeableConcept>()

    /**
     * Date or dates of Service
     */
    var servicedDate: FhirDate? = null

    /**
     * Date or dates of Service
     */
    var servicedPeriod: Period? = null

    /**
     * Place of service
     */
    var locationCodeableConcept: CodeableConcept? = null

    /**
     * Place of service
     */
    var locationAddress: Address? = null

    /**
     * Place of service
     */
    var locationReference: Reference? = null

    /**
     * Count of Products or Services
     */
    var quantity: Quantity? = null

    /**
     * Fee, charge or cost per point
     */
    var unitPrice: Money? = null

    /**
     * Price scaling factor
     */
    var factor: Float? = null

    /**
     * Total item cost
     */
    var net: Money? = null

    val udi: List<Reference> = mutableListOf<Reference>()

    /**
     * Service Location
     */
    var bodySite: CodeableConcept? = null

    val subSite: List<CodeableConcept> = mutableListOf<CodeableConcept>()

    val encounter: List<Reference> = mutableListOf<Reference>()

    val noteNumber: List<Int> = mutableListOf<Int>()

    val adjudication: List<ExplanationOfBenefitItemAdjudication> =
            mutableListOf<ExplanationOfBenefitItemAdjudication>()

    val detail: List<ExplanationOfBenefitItemDetail> =
            mutableListOf<ExplanationOfBenefitItemDetail>()
}

/**
 * Adjudication details
 *
 * The adjudications results.
 */
open class ExplanationOfBenefitItemAdjudication() : BackboneElement() {
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
     * Non-monitory value
     */
    var value: Float? = null
}

/**
 * Additional items
 *
 * Second tier of goods and services.
 */
open class ExplanationOfBenefitItemDetail() : BackboneElement() {
    /**
     * Service instance
     */
    var sequence: Int? = null

    /**
     * Group or type of product or service
     */
    var type: CodeableConcept = CodeableConcept()

    /**
     * Revenue or cost center code
     */
    var revenue: CodeableConcept? = null

    /**
     * Type of service or product
     */
    var category: CodeableConcept? = null

    /**
     * Billing Code
     */
    var service: CodeableConcept? = null

    val modifier: List<CodeableConcept> = mutableListOf<CodeableConcept>()

    val programCode: List<CodeableConcept> = mutableListOf<CodeableConcept>()

    /**
     * Count of Products or Services
     */
    var quantity: Quantity? = null

    /**
     * Fee, charge or cost per point
     */
    var unitPrice: Money? = null

    /**
     * Price scaling factor
     */
    var factor: Float? = null

    /**
     * Total additional item cost
     */
    var net: Money? = null

    val udi: List<Reference> = mutableListOf<Reference>()

    val noteNumber: List<Int> = mutableListOf<Int>()

    val adjudication: List<ExplanationOfBenefitItemAdjudication> =
            mutableListOf<ExplanationOfBenefitItemAdjudication>()

    val subDetail: List<ExplanationOfBenefitItemDetailSubDetail> =
            mutableListOf<ExplanationOfBenefitItemDetailSubDetail>()
}

/**
 * Additional items
 *
 * Third tier of goods and services.
 */
open class ExplanationOfBenefitItemDetailSubDetail() : BackboneElement() {
    /**
     * Service instance
     */
    var sequence: Int? = null

    /**
     * Type of product or service
     */
    var type: CodeableConcept = CodeableConcept()

    /**
     * Revenue or cost center code
     */
    var revenue: CodeableConcept? = null

    /**
     * Type of service or product
     */
    var category: CodeableConcept? = null

    /**
     * Billing Code
     */
    var service: CodeableConcept? = null

    val modifier: List<CodeableConcept> = mutableListOf<CodeableConcept>()

    val programCode: List<CodeableConcept> = mutableListOf<CodeableConcept>()

    /**
     * Count of Products or Services
     */
    var quantity: Quantity? = null

    /**
     * Fee, charge or cost per point
     */
    var unitPrice: Money? = null

    /**
     * Price scaling factor
     */
    var factor: Float? = null

    /**
     * Net additional item cost
     */
    var net: Money? = null

    val udi: List<Reference> = mutableListOf<Reference>()

    val noteNumber: List<Int> = mutableListOf<Int>()

    val adjudication: List<ExplanationOfBenefitItemAdjudication> =
            mutableListOf<ExplanationOfBenefitItemAdjudication>()
}

/**
 * Insurer added line items
 *
 * The first tier service adjudications for payor added services.
 */
open class ExplanationOfBenefitAddItem() : BackboneElement() {
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
     * Billing Code
     */
    var service: CodeableConcept? = null

    val modifier: List<CodeableConcept> = mutableListOf<CodeableConcept>()

    /**
     * Professional fee or Product charge
     */
    var fee: Money? = null

    val noteNumber: List<Int> = mutableListOf<Int>()

    val adjudication: List<ExplanationOfBenefitItemAdjudication> =
            mutableListOf<ExplanationOfBenefitItemAdjudication>()

    val detail: List<ExplanationOfBenefitAddItemDetail> =
            mutableListOf<ExplanationOfBenefitAddItemDetail>()
}

/**
 * Added items details
 *
 * The second tier service adjudications for payor added services.
 */
open class ExplanationOfBenefitAddItemDetail() : BackboneElement() {
    /**
     * Revenue or cost center code
     */
    var revenue: CodeableConcept? = null

    /**
     * Type of service or product
     */
    var category: CodeableConcept? = null

    /**
     * Billing Code
     */
    var service: CodeableConcept? = null

    val modifier: List<CodeableConcept> = mutableListOf<CodeableConcept>()

    /**
     * Professional fee or Product charge
     */
    var fee: Money? = null

    val noteNumber: List<Int> = mutableListOf<Int>()

    val adjudication: List<ExplanationOfBenefitItemAdjudication> =
            mutableListOf<ExplanationOfBenefitItemAdjudication>()
}

/**
 * Payment (if paid)
 *
 * Payment details for the claim if the claim has been paid.
 */
open class ExplanationOfBenefitPayment() : BackboneElement() {
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
     * Expected date of Payment
     */
    var date: FhirDate? = null

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
open class ExplanationOfBenefitProcessNote() : BackboneElement() {
    /**
     * Sequence number for this note
     */
    var number: Int? = null

    /**
     * display | print | printoper
     */
    var type: CodeableConcept? = null

    /**
     * Note explanitory text
     */
    var text: String? = null

    /**
     * Language if different from the resource
     */
    var language: CodeableConcept? = null
}

/**
 * Balance by Benefit Category
 *
 * Balance by Benefit Category.
 */
open class ExplanationOfBenefitBenefitBalance() : BackboneElement() {
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

    val financial: List<ExplanationOfBenefitBenefitBalanceFinancial> =
            mutableListOf<ExplanationOfBenefitBenefitBalanceFinancial>()
}

/**
 * Benefit Summary
 *
 * Benefits Used to date.
 */
open class ExplanationOfBenefitBenefitBalanceFinancial() : BackboneElement() {
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
