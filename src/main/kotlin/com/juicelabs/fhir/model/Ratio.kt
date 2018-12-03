//
//  Generated from FHIR Version 3.0.1.11917 on 2018-12-02T21:16:28.209 
//
//   2018, JuiceLab, LLC
//  
package com.juicelabs.fhir.model

/**
 * A ratio of two Quantity values - a numerator and a denominator
 *
 * A relationship of two Quantity values - expressed as a numerator and a denominator.
 */
open class Ratio() : Element() {
    /**
     * Denominator value
     */
    var denominator: Quantity? = null

    /**
     * Numerator value
     */
    var numerator: Quantity? = null
}
