//
//  Generated from FHIR Version 3.0.1.11917 on 2018-11-29T14:32:35.351 
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
     * Starting time with inclusive boundary
     */
    var start: String? = null

    /**
     * End time with inclusive boundary, if not ongoing
     */
    var end: String? = null
}
