//
//  Generated from FHIR Version 3.0.1.11917 on 2018-11-27T12:50:39.746 
//
//   2018, JuiceLab, LLC
//  
package com.juicelabs.fhir.model

import com.juicelabs.fhir.base.FhirDate
import kotlin.collections.List

/**
 * The formal response to a guidance request
 *
 * A guidance response is the formal response to a guidance request, including any output parameters returned by the evaluation, as well as the description of any proposed actions to be taken.
 */
open class GuidanceResponse() : DomainResource() {
    /**
     * The id of the request associated with this response, if any
     */
    var requestId: String? = null

    /**
     * Business identifier
     */
    var identifier: Identifier? = null

    /**
     * A reference to a knowledge module
     */
    var module: Reference = Reference()

    /**
     * success | data-requested | data-required | in-progress | failure | entered-in-error
     */
    var status: String = ""

    /**
     * Patient the request was performed for
     */
    var subject: Reference? = null

    /**
     * Encounter or Episode during which the response was returned
     */
    var context: Reference? = null

    /**
     * When the guidance response was processed
     */
    var occurrenceDateTime: FhirDate? = null

    /**
     * Device returning the guidance
     */
    var performer: Reference? = null

    /**
     * Reason for the response
     */
    var reasonCodeableConcept: CodeableConcept? = null

    /**
     * Reason for the response
     */
    var reasonReference: Reference? = null

    val note: List<Annotation> = mutableListOf<Annotation>()

    val evaluationMessage: List<Reference> = mutableListOf<Reference>()

    /**
     * The output parameters of the evaluation, if any
     */
    var outputParameters: Reference? = null

    /**
     * Proposed actions, if any
     */
    var result: Reference? = null

    val dataRequirement: List<DataRequirement> = mutableListOf<DataRequirement>()
}
