//
//  Generated from FHIR Version 3.0.1.11917 on 2018-11-29T05:04:14.922 
//
//   2018, JuiceLab, LLC
//  
package com.juicelabs.fhir.model

/**
 * Details of a Technology mediated contact point (phone, fax, email, etc.)
 *
 * Details for all kinds of technology mediated contact points for a person or organization, including telephone, email, etc.
 */
open class ContactPoint() : Element() {
    /**
     * phone | fax | email | pager | url | sms | other
     */
    var system: String? = null

    /**
     * The actual contact point details
     */
    var value: String? = null

    /**
     * home | work | temp | old | mobile - purpose of this contact point
     */
    var use: String? = null

    /**
     * Specify preferred order of use (1 = highest)
     */
    var rank: Int? = null

    /**
     * Time period when the contact point was/is in use
     */
    var period: Period? = null
}
