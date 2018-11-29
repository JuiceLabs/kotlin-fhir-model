//
//  Generated from FHIR Version 3.0.1.11917 on 2018-11-29T05:04:14.754 
//
//   2018, JuiceLab, LLC
//  
package com.juicelabs.fhir.model

import com.juicelabs.fhir.base.FhirDate
import kotlin.collections.List

/**
 * Clinical issue with action
 *
 * Indicates an actual or potential clinical issue with or between one or more active or proposed clinical actions for a patient; e.g. Drug-drug interaction, Ineffective treatment frequency, Procedure-condition conflict, etc.
 */
open class DetectedIssue() : DomainResource() {
    /**
     * Unique id for the detected issue
     */
    var identifier: Identifier? = null

    /**
     * registered | preliminary | final | amended +
     */
    var status: String? = null

    /**
     * Issue Category, e.g. drug-drug, duplicate therapy, etc.
     */
    var category: CodeableConcept? = null

    /**
     * high | moderate | low
     */
    var severity: String? = null

    /**
     * Associated patient
     */
    var patient: Reference? = null

    /**
     * When identified
     */
    var date: FhirDate? = null

    /**
     * The provider or device that identified the issue
     */
    var author: Reference? = null

    val implicated: List<Reference> = mutableListOf<Reference>()

    /**
     * Description and context
     */
    var detail: String? = null

    /**
     * Authority for issue
     */
    var reference: String? = null

    val mitigation: List<DetectedIssueMitigation> = mutableListOf<DetectedIssueMitigation>()
}

/**
 * Step taken to address
 *
 * Indicates an action that has been taken or is committed to to reduce or eliminate the likelihood of the risk identified by the detected issue from manifesting.  Can also reflect an observation of known mitigating factors that may reduce/eliminate the need for any action.
 */
open class DetectedIssueMitigation() : BackboneElement() {
    /**
     * What mitigation?
     */
    var action: CodeableConcept = CodeableConcept()

    /**
     * Date committed
     */
    var date: FhirDate? = null

    /**
     * Who is committing?
     */
    var author: Reference? = null
}
