//
//  Generated from FHIR Version 3.0.1.11917 on 2018-11-29T05:04:14.960 
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
     * Numerator value
     */
    var numerator: Quantity? = null

    /**
     * Denominator value
     */
    var denominator: Quantity? = null
}
