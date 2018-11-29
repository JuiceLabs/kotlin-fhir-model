//
//  Generated from FHIR Version 3.0.1.11917 on 2018-11-29T05:04:15.069 
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
     * usual | official | temp | nickname | anonymous | old | maiden
     */
    var use: String? = null

    /**
     * Text representation of the full name
     */
    var text: String? = null

    /**
     * Family name (often called 'Surname')
     */
    var family: String? = null

    val given: List<String> = mutableListOf<String>()

    val prefix: List<String> = mutableListOf<String>()

    val suffix: List<String> = mutableListOf<String>()

    /**
     * Time period when name was/is in use
     */
    var period: Period? = null
}
