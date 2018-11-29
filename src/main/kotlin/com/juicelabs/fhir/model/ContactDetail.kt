//
//  Generated from FHIR Version 3.0.1.11917 on 2018-11-29T05:04:14.981 
//
//   2018, JuiceLab, LLC
//  
package com.juicelabs.fhir.model

import kotlin.collections.List

/**
 * Contact information
 *
 * Specifies contact information for a person or organization.
 */
open class ContactDetail() : Element() {
    /**
     * Name of an individual to contact
     */
    var name: String? = null

    val telecom: List<ContactPoint> = mutableListOf<ContactPoint>()
}
