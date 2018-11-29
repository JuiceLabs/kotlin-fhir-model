//
//  Generated from FHIR Version 3.0.1.11917 on 2018-11-29T14:32:35.331 
//
//   2018, JuiceLab, LLC
//  
package com.juicelabs.fhir.model

import kotlin.collections.List

/**
 * Base for all elements
 *
 * Base definition for all elements in a resource.
 */
open class Element() {
    /**
     * xml:id (or equivalent in JSON)
     */
    var id: String? = null

    val extension: List<Extension> = mutableListOf<Extension>()
}
