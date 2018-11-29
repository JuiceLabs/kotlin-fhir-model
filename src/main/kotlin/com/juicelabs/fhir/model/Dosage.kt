//
//  Generated from FHIR Version 3.0.1.11917 on 2018-11-29T14:32:35.439 
//
//   2018, JuiceLab, LLC
//  
package com.juicelabs.fhir.model

import kotlin.collections.List

/**
 * How the medication is/was taken or should be taken
 *
 * Indicates how the medication is/was taken or should be taken by the patient.
 */
open class Dosage() : Element() {
    /**
     * The order of the dosage instructions
     */
    var sequence: Int? = null

    /**
     * Free text dosage instructions e.g. SIG
     */
    var text: String? = null

    val additionalInstruction: List<CodeableConcept> = mutableListOf<CodeableConcept>()

    /**
     * Patient or consumer oriented instructions
     */
    var patientInstruction: String? = null

    /**
     * When medication should be administered
     */
    var timing: Timing? = null

    /**
     * Take "as needed" (for x)
     */
    var asNeededBoolean: Boolean? = null

    /**
     * Take "as needed" (for x)
     */
    var asNeededCodeableConcept: CodeableConcept? = null

    /**
     * Body site to administer to
     */
    var site: CodeableConcept? = null

    /**
     * How drug should enter body
     */
    var route: CodeableConcept? = null

    /**
     * Technique for administering medication
     */
    var method: CodeableConcept? = null

    /**
     * Amount of medication per dose
     */
    var doseRange: Range? = null

    /**
     * Amount of medication per dose
     */
    var doseQuantity: Quantity? = null

    /**
     * Upper limit on medication per unit of time
     */
    var maxDosePerPeriod: Ratio? = null

    /**
     * Upper limit on medication per administration
     */
    var maxDosePerAdministration: Quantity? = null

    /**
     * Upper limit on medication per lifetime of the patient
     */
    var maxDosePerLifetime: Quantity? = null

    /**
     * Amount of medication per unit of time
     */
    var rateRatio: Ratio? = null

    /**
     * Amount of medication per unit of time
     */
    var rateRange: Range? = null

    /**
     * Amount of medication per unit of time
     */
    var rateQuantity: Quantity? = null
}
