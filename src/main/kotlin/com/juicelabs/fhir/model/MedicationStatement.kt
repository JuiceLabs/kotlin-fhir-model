//
//  Generated from FHIR Version 3.0.1.11917 on 2018-11-29T05:04:14.887 
//
//   2018, JuiceLab, LLC
//  
package com.juicelabs.fhir.model

import com.juicelabs.fhir.base.FhirDate
import kotlin.collections.List

/**
 * Record of medication being taken by a patient
 *
 * A record of a medication that is being consumed by a patient.   A MedicationStatement may indicate that the patient may be taking the medication now, or has taken the medication in the past or will be taking the medication in the future.  The source of this information can be the patient, significant other (such as a family member or spouse), or a clinician.  A common scenario where this information is captured is during the history taking process during a patient visit or stay.   The medication information may come from sources such as the patient's memory, from a prescription bottle,  or from a list of medications the patient, clinician or other party maintains The primary difference between a medication statement and a medication administration is that the medication administration has complete administration information and is based on actual administration information from the person who administered the medication.  A medication statement is often, if not always, less specific.  There is no required date/time when the medication was administered, in fact we only know that a source has reported the patient is taking this medication, where details such as time, quantity, or rate or even medication product may be incomplete or missing or less precise.  As stated earlier, the medication statement information may come from the patient's memory, from a prescription bottle or from a list of medications the patient, clinician or other party maintains.  Medication administration is more formal and is not missing detailed information.
 */
open class MedicationStatement() : DomainResource() {
    val identifier: List<Identifier> = mutableListOf<Identifier>()

    val basedOn: List<Reference> = mutableListOf<Reference>()

    val partOf: List<Reference> = mutableListOf<Reference>()

    /**
     * Encounter / Episode associated with MedicationStatement
     */
    var context: Reference? = null

    /**
     * active | completed | entered-in-error | intended | stopped | on-hold
     */
    var status: String? = null

    /**
     * Type of medication usage
     */
    var category: CodeableConcept? = null

    /**
     * What medication was taken
     */
    var medicationCodeableConcept: CodeableConcept = CodeableConcept()

    /**
     * What medication was taken
     */
    var medicationReference: Reference = Reference()

    /**
     * The date/time or interval when the medication was taken
     */
    var effectiveDateTime: FhirDate? = null

    /**
     * The date/time or interval when the medication was taken
     */
    var effectivePeriod: Period? = null

    /**
     * When the statement was asserted?
     */
    var dateAsserted: FhirDate? = null

    /**
     * Person or organization that provided the information about the taking of this medication
     */
    var informationSource: Reference? = null

    /**
     * Who is/was taking  the medication
     */
    var subject: Reference = Reference()

    val derivedFrom: List<Reference> = mutableListOf<Reference>()

    /**
     * y | n | unk | na
     */
    var taken: String? = null

    val reasonNotTaken: List<CodeableConcept> = mutableListOf<CodeableConcept>()

    val reasonCode: List<CodeableConcept> = mutableListOf<CodeableConcept>()

    val reasonReference: List<Reference> = mutableListOf<Reference>()

    val note: List<Annotation> = mutableListOf<Annotation>()

    val dosage: List<Dosage> = mutableListOf<Dosage>()
}
