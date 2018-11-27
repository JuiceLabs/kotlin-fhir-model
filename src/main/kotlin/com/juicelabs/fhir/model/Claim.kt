//
//  Generated from FHIR Version 3.0.1.11917 on 2018-11-27T12:50:39.868 
//
//   2018, JuiceLab, LLC
//  
package com.juicelabs.fhir.model

import com.juicelabs.fhir.base.FhirDate
import kotlin.collections.List

/**
 * Claim, Pre-determination or Pre-authorization
 *
 * A provider issued list of services and products provided, or to be provided, to a patient which is provided to an insurer for payment recovery.
 */
open class Claim() : DomainResource() {
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
     * complete | proposed | exploratory | other
     */
    var use: String? = null

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
     * Target
     */
    var insurer: Reference? = null

    /**
     * Responsible provider
     */
    var provider: Reference? = null

    /**
     * Responsible organization
     */
    var organization: Reference? = null

    /**
     * Desired processing priority
     */
    var priority: CodeableConcept? = null

    /**
     * Funds requested to be reserved
     */
    var fundsReserve: CodeableConcept? = null

    val related: List<ClaimRelated> = mutableListOf<ClaimRelated>()

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
    var payee: ClaimPayee? = null

    /**
     * Treatment Referral
     */
    var referral: Reference? = null

    /**
     * Servicing Facility
     */
    var facility: Reference? = null

    val careTeam: List<ClaimCareTeam> = mutableListOf<ClaimCareTeam>()

    val information: List<ClaimInformation> = mutableListOf<ClaimInformation>()

    val diagnosis: List<ClaimDiagnosis> = mutableListOf<ClaimDiagnosis>()

    val procedure: List<ClaimProcedure> = mutableListOf<ClaimProcedure>()

    val insurance: List<ClaimInsurance> = mutableListOf<ClaimInsurance>()

    /**
     * Details about an accident
     */
    var accident: ClaimAccident? = null

    /**
     * Period unable to work
     */
    var employmentImpacted: Period? = null

    /**
     * Period in hospital
     */
    var hospitalization: Period? = null

    val item: List<ClaimItem> = mutableListOf<ClaimItem>()

    /**
     * Total claim cost
     */
    var total: Money? = null
}

/**
 * Related Claims which may be revelant to processing this claimn
 *
 * Other claims which are related to this claim such as prior claim versions or for related services.
 */
open class ClaimRelated() : BackboneElement() {
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
open class ClaimPayee() : BackboneElement() {
    /**
     * Type of party: Subscriber, Provider, other
     */
    var type: CodeableConcept = CodeableConcept()

    /**
     * organization | patient | practitioner | relatedperson
     */
    var resourceType: Coding? = null

    /**
     * Party to receive the payable
     */
    var party: Reference? = null
}

/**
 * Members of the care team
 *
 * The members of the team who provided the overall service as well as their role and whether responsible and qualifications.
 */
open class ClaimCareTeam() : BackboneElement() {
    /**
     * Number to covey order of careTeam
     */
    var sequence: Int = 0

    /**
     * Provider individual or organization
     */
    var provider: Reference = Reference()

    /**
     * Billing provider
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
 * Exceptions, special considerations, the condition, situation, prior or concurrent issues
 *
 * Additional information codes regarding exceptions, special considerations, the condition, situation, prior or concurrent issues. Often there are mutiple jurisdiction specific valuesets which are required.
 */
open class ClaimInformation() : BackboneElement() {
    /**
     * Information instance identifier
     */
    var sequence: Int = 0

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
    var reason: CodeableConcept? = null
}

/**
 * List of Diagnosis
 *
 * List of patient diagnosis for which care is sought.
 */
open class ClaimDiagnosis() : BackboneElement() {
    /**
     * Number to covey order of diagnosis
     */
    var sequence: Int = 0

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
open class ClaimProcedure() : BackboneElement() {
    /**
     * Procedure sequence for reference
     */
    var sequence: Int = 0

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
open class ClaimInsurance() : BackboneElement() {
    /**
     * Service instance identifier
     */
    var sequence: Int = 0

    /**
     * Is the focal Coverage
     */
    var focal: Boolean = false

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

/**
 * Details about an accident
 *
 * An accident which resulted in the need for healthcare services.
 */
open class ClaimAccident() : BackboneElement() {
    /**
     * When the accident occurred
     * see information codes
     * see information codes
     */
    var date: FhirDate = FhirDate.now()

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
open class ClaimItem() : BackboneElement() {
    /**
     * Service instance
     */
    var sequence: Int = 0

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

    val detail: List<ClaimItemDetail> = mutableListOf<ClaimItemDetail>()
}

/**
 * Additional items
 *
 * Second tier of goods and services.
 */
open class ClaimItemDetail() : BackboneElement() {
    /**
     * Service instance
     */
    var sequence: Int = 0

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

    val subDetail: List<ClaimItemDetailSubDetail> = mutableListOf<ClaimItemDetailSubDetail>()
}

/**
 * Additional items
 *
 * Third tier of goods and services.
 */
open class ClaimItemDetailSubDetail() : BackboneElement() {
    /**
     * Service instance
     */
    var sequence: Int = 0

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
}
