//
//  Generated from FHIR Version 3.0.1.11917 on 2018-11-29T05:04:14.803 
//
//   2018, JuiceLab, LLC
//  
package com.juicelabs.fhir.model

/**
 * Set of values bounded by low and high
 *
 * A set of ordered Quantities defined by a low and high limit.
 */
open class Range() : Element() {
    /**
     * Low limit
     */
    var low: Quantity? = null

    /**
     * High limit
     */
    var high: Quantity? = null
}
