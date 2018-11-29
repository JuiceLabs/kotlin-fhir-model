//
//  Generated from FHIR Version 3.0.1.11917 on 2018-11-29T05:04:14.862 
//
//   2018, JuiceLab, LLC
//  
package com.juicelabs.fhir.model

/**
 * A reference to a code defined by a terminology system
 *
 * A reference to a code defined by a terminology system.
 */
open class Coding() : Element() {
    /**
     * Identity of the terminology system
     */
    var system: String? = null

    /**
     * Version of the system - if relevant
     */
    var version: String? = null

    /**
     * Symbol in syntax defined by the system
     */
    var code: String? = null

    /**
     * Representation defined by the system
     */
    var display: String? = null

    /**
     * If this coding was chosen directly by the user
     */
    var userSelected: Boolean? = null
}
