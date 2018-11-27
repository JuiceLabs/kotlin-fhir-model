//
//  Generated from FHIR Version 3.0.1.11917 on 2018-11-27T12:50:39.944 
//
//   2018, JuiceLab, LLC
//  
package com.juicelabs.fhir.model

/**
 * A series of measurements taken by a device
 *
 * A series of measurements taken by a device, with upper and lower limits. There may be more than one dimension in the data.
 */
open class SampledData() : Element() {
    /**
     * Zero value and units
     */
    var origin: Quantity = Quantity()

    /**
     * Number of milliseconds between samples
     */
    var period: Float = 0.0f

    /**
     * Multiply data by this before adding to origin
     */
    var factor: Float? = null

    /**
     * Lower limit of detection
     */
    var lowerLimit: Float? = null

    /**
     * Upper limit of detection
     */
    var upperLimit: Float? = null

    /**
     * Number of sample points at each time point
     */
    var dimensions: Int = 0

    /**
     * Decimal values with spaces, or "E" | "U" | "L"
     */
    var data: String = ""
}
