//
//  Generated from FHIR Version 3.0.1.11917 on 2018-11-29T05:04:15.017 
//
//   2018, JuiceLab, LLC
//  
package com.juicelabs.fhir.model

/**
 * Base Resource
 *
 * This is the base resource type for everything.
 */
open class Resource() : FhirAbstractResource() {
    /**
     * Logical id of this artifact
     */
    var id: String? = null

    /**
     * Metadata about the resource
     */
    var meta: Meta? = null

    /**
     * A set of rules under which this content was created
     */
    var implicitRules: String? = null

    /**
     * Language of the resource content
     */
    var language: String? = null
}
