//
//  Generated from FHIR Version 3.0.1.11917 on 2018-11-29T05:04:14.654 
//
//   2018, JuiceLab, LLC
//  
package com.juicelabs.fhir.model

/**
 * An identifier intended for computation
 *
 * A technical identifier - identifies some entity uniquely and unambiguously.
 */
open class Identifier() : Element() {
    /**
     * usual | official | temp | secondary (If known)
     */
    var use: String? = null

    /**
     * Description of identifier
     */
    var type: CodeableConcept? = null

    /**
     * The namespace for the identifier value
     */
    var system: String? = null

    /**
     * The value that is unique
     */
    var value: String? = null

    /**
     * Time period when id is/was valid for use
     */
    var period: Period? = null

    /**
     * Organization that issued id (may be just text)
     */
    var assigner: Reference? = null
}
