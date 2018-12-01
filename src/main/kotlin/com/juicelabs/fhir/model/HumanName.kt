//
//  Generated from FHIR Version 3.0.1.11917 on 2018-12-01T08:36:55.074 
//
//   2018, JuiceLab, LLC
//  
package com.juicelabs.fhir.model

import kotlin.collections.List

/**
 * Name of a human - parts and usage
 *
 * A human's name with the ability to identify parts and usage.
 */
open class HumanName() : Element() {
    /**
     * Family name (often called 'Surname')
     */
    var family: String? = null

    val given: List<String> = mutableListOf<String>()

    /**
     * Time period when name was/is in use
     */
    var period: Period? = null

    val prefix: List<String> = mutableListOf<String>()

    val suffix: List<String> = mutableListOf<String>()

    /**
     * Text representation of the full name
     */
    var text: String? = null

    /**
     * usual | official | temp | nickname | anonymous | old | maiden
     */
    var use: String? = null
}
