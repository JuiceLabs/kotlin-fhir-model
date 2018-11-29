//
//  Generated from FHIR Version 3.0.1.11917 on 2018-11-29T14:32:35.738 
//
//   2018, JuiceLab, LLC
//  
package com.juicelabs.fhir.model

import kotlin.collections.List

/**
 * Resource for non-supported content
 *
 * Basic is used for handling concepts not yet defined in FHIR, narrative-only resources that don't map to an existing resource, and custom resources not appropriate for inclusion in the FHIR specification.
 */
open class Basic() : DomainResource() {
    val identifier: List<Identifier> = mutableListOf<Identifier>()

    /**
     * Kind of Resource
     */
    var code: CodeableConcept = CodeableConcept()

    /**
     * Identifies the focus of this resource
     */
    var subject: Reference? = null

    /**
     * When created
     */
    var created: String? = null

    /**
     * Who created
     */
    var author: Reference? = null
}
