//
//  Generated from FHIR Version 3.0.1.11917 on 2018-11-29T05:04:14.666 
//
//   2018, JuiceLab, LLC
//  
package com.juicelabs.fhir.model

import com.juicelabs.fhir.base.FhirDate

/**
 * Time range defined by start and end date/time
 *
 * A time period defined by a start and end date and optionally time.
 */
open class Period() : Element() {
    /**
     * Starting time with inclusive boundary
     */
    var start: FhirDate? = null

    /**
     * End time with inclusive boundary, if not ongoing
     */
    var end: FhirDate? = null
}
