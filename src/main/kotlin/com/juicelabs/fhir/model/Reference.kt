//
//  Generated from FHIR Version 3.0.1.11917 on 2018-11-29T14:32:35.645 
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
     * Literal reference, Relative, internal or absolute URL
     */
    var reference: String? = null

    /**
     * Logical reference, when literal reference is not known
     */
    var identifier: Identifier? = null

    /**
     * Text alternative for the resource
     */
    var display: String? = null
}
