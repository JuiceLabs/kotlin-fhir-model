//
//  Generated from FHIR Version 3.0.1.11917 on 2018-11-29T05:04:14.769 
//
//   2018, JuiceLab, LLC
//  
package com.juicelabs.fhir.model

import com.juicelabs.fhir.base.FhirDate
import kotlin.collections.List

/**
 * ProcessResponse resource
 *
 * This resource provides processing status, errors and notes from the processing of a resource.
 */
open class ProcessResponse() : DomainResource() {
    val identifier: List<Identifier> = mutableListOf<Identifier>()

    /**
     * active | cancelled | draft | entered-in-error
     */
    var status: String? = null

    /**
     * Creation date
     */
    var created: FhirDate? = null

    /**
     * Authoring Organization
     */
    var organization: Reference? = null

    /**
     * Request reference
     */
    var request: Reference? = null

    /**
     * Processing outcome
     */
    var outcome: CodeableConcept? = null

    /**
     * Disposition Message
     */
    var disposition: String? = null

    /**
     * Responsible Practitioner
     */
    var requestProvider: Reference? = null

    /**
     * Responsible organization
     */
    var requestOrganization: Reference? = null

    /**
     * Printed Form Identifier
     */
    var form: CodeableConcept? = null

    val processNote: List<ProcessResponseProcessNote> = mutableListOf<ProcessResponseProcessNote>()

    val error: List<CodeableConcept> = mutableListOf<CodeableConcept>()

    val communicationRequest: List<Reference> = mutableListOf<Reference>()
}

/**
 * Processing comments or additional requirements
 *
 * Suite of processing notes or additional requirements if the processing has been held.
 */
open class ProcessResponseProcessNote() : BackboneElement() {
    /**
     * display | print | printoper
     */
    var type: CodeableConcept? = null

    /**
     * Comment on the processing
     */
    var text: String? = null
}
