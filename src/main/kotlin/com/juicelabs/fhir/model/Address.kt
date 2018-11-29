//
//  Generated from FHIR Version 3.0.1.11917 on 2018-11-29T14:32:35.573 
//
//   2018, JuiceLab, LLC
//  
package com.juicelabs.fhir.model

import kotlin.collections.List

/**
 * An address expressed using postal conventions (as opposed to GPS or other location definition formats)
 *
 * An address expressed using postal conventions (as opposed to GPS or other location definition formats).  This data type may be used to convey addresses for use in delivering mail as well as for visiting locations which might not be valid for mail delivery.  There are a variety of postal address formats defined around the world.
 */
open class Address() : Element() {
    /**
     * home | work | temp | old - purpose of this address
     */
    var use: String? = null

    /**
     * postal | physical | both
     */
    var type: String? = null

    /**
     * Text representation of the address
     */
    var text: String? = null

    val line: List<String> = mutableListOf<String>()

    /**
     * Name of city, town etc.
     */
    var city: String? = null

    /**
     * District name (aka county)
     */
    var district: String? = null

    /**
     * Sub-unit of country (abbreviations ok)
     */
    var state: String? = null

    /**
     * Postal code for area
     */
    var postalCode: String? = null

    /**
     * Country (e.g. can be ISO 3166 2 or 3 letter code)
     */
    var country: String? = null

    /**
     * Time period when address was/is in use
     */
    var period: Period? = null
}
