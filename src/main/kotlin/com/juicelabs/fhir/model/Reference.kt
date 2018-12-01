//
//  Generated from FHIR Version 3.0.1.11917 on 2018-12-01T08:36:55.020 
//
//   2018, JuiceLab, LLC
//  
package com.juicelabs.fhir.model

/**
 * A reference from one resource to another
 *
 * A reference from one resource to another.
 */
open class Reference() : Element() {
    /**
     * Text alternative for the resource
     */
    var display: String? = null

    /**
     * Logical reference, when literal reference is not known
     */
    var identifier: Identifier? = null

    /**
     * Literal reference, Relative, internal or absolute URL
     */
    var reference: String? = null
}
