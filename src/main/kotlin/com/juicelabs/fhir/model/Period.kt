//
//  Generated from FHIR Version 3.0.1.11917 on 2018-12-02T21:16:27.976 
//
//   2018, JuiceLab, LLC
//  
package com.juicelabs.fhir.model

/**
 * Time range defined by start and end date/time
 *
 * A time period defined by a start and end date and optionally time.
 */
open class Period() : Element() {
    /**
     * End time with inclusive boundary, if not ongoing
     */
    var end: String? = null

    /**
     * Starting time with inclusive boundary
     */
    var start: String? = null
}
