//
//  Generated from FHIR Version 3.0.1.11917 on 2018-11-27T12:50:39.967 
//
//   2018, JuiceLab, LLC
//  
package com.juicelabs.fhir.model

import com.juicelabs.fhir.base.FhirDate
import kotlin.collections.List

/**
 * Ordering of medication for patient or group
 *
 * An order or request for both supply of the medication and the instructions for administration of the medication to a patient. The resource is called "MedicationRequest" rather than "MedicationPrescription" or "MedicationOrder" to generalize the use across inpatient and outpatient settings, including care plans, etc., and to harmonize with workflow patterns.
 */
open class MedicationRequest() : DomainResource() {
    val identifier: List<Identifier> = mutableListOf<Identifier>()

    val definition: List<Reference> = mutableListOf<Reference>()

    val basedOn: List<Reference> = mutableListOf<Reference>()

    /**
     * Composite request this is part of
     */
    var groupIdentifier: Identifier? = null

    /**
     * active | on-hold | cancelled | completed | entered-in-error | stopped | draft | unknown
     */
    var status: String? = null

    /**
     * proposal | plan | order | instance-order
     */
    var intent: String = ""

    /**
     * Type of medication usage
     */
    var category: CodeableConcept? = null

    /**
     * routine | urgent | stat | asap
     */
    var priority: String? = null

    /**
     * Medication to be taken
     */
    var medicationCodeableConcept: CodeableConcept = CodeableConcept()

    /**
     * Medication to be taken
     */
    var medicationReference: Reference = Reference()

    /**
     * Who or group medication request is for
     */
    var subject: Reference = Reference()

    /**
     * Created during encounter/admission/stay
     */
    var context: Reference? = null

    val supportingInformation: List<Reference> = mutableListOf<Reference>()

    /**
     * When request was initially authored
     */
    var authoredOn: FhirDate? = null

    /**
     * Who/What requested the Request
     */
    var requester: MedicationRequestRequester? = null

    /**
     * Person who entered the request
     */
    var recorder: Reference? = null

    val reasonCode: List<CodeableConcept> = mutableListOf<CodeableConcept>()

    val reasonReference: List<Reference> = mutableListOf<Reference>()

    val note: List<Annotation> = mutableListOf<Annotation>()

    val dosageInstruction: List<Dosage> = mutableListOf<Dosage>()

    /**
     * Medication supply authorization
     */
    var dispenseRequest: MedicationRequestDispenseRequest? = null

    /**
     * Any restrictions on medication substitution
     */
    var substitution: MedicationRequestSubstitution? = null

    /**
     * An order/prescription that is being replaced
     */
    var priorPrescription: Reference? = null

    val detectedIssue: List<Reference> = mutableListOf<Reference>()

    val eventHistory: List<Reference> = mutableListOf<Reference>()
}

/**
 * Who/What requested the Request
 *
 * The individual, organization or device that initiated the request and has responsibility for its activation.
 */
open class MedicationRequestRequester() : BackboneElement() {
    /**
     * Who ordered the initial medication(s)
     */
    var agent: Reference = Reference()

    /**
     * Organization agent is acting for
     */
    var onBehalfOf: Reference? = null
}

/**
 * Medication supply authorization
 *
 * Indicates the specific details for the dispense or medication supply part of a medication request (also known as a Medication Prescription or Medication Order).  Note that this information is not always sent with the order.  There may be in some settings (e.g. hospitals) institutional or system support for completing the dispense details in the pharmacy department.
 */
open class MedicationRequestDispenseRequest() : BackboneElement() {
    /**
     * Time period supply is authorized for
     */
    var validityPeriod: Period? = null

    /**
     * Number of refills authorized
     */
    var numberOfRepeatsAllowed: Int? = null

    /**
     * Amount of medication to supply per dispense
     */
    var quantity: Quantity? = null

    /**
     * Number of days supply per dispense
     */
    var expectedSupplyDuration: Duration? = null

    /**
     * Intended dispenser
     */
    var performer: Reference? = null
}

/**
 * Any restrictions on medication substitution
 *
 * Indicates whether or not substitution can or should be part of the dispense. In some cases substitution must happen, in other cases substitution must not happen. This block explains the prescriber's intent. If nothing is specified substitution may be done.
 */
open class MedicationRequestSubstitution() : BackboneElement() {
    /**
     * Whether substitution is allowed or not
     */
    var allowed: Boolean = false

    /**
     * Why should (not) substitution be made
     */
    var reason: CodeableConcept? = null
}
