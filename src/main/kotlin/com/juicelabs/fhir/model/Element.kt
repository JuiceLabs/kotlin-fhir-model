//
//  Generated from FHIR Version 3.0.1.11917 on 2018-12-02T21:16:27.958 
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
    val extension: List<Extension> = mutableListOf<Extension>()

    /**
     * xml:id (or equivalent in JSON)
     */
    var id: String? = null
}
