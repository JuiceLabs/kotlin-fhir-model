//
//  Generated from FHIR Version 3.0.1.11917 on 2018-12-01T08:36:54.841 
//
//   2018, JuiceLab, LLC
//  
package com.juicelabs.fhir.model

import kotlin.collections.List

/**
 * A resource with narrative, extensions, and contained resources
 *
 * A resource that includes narrative, extensions, and contained resources.
 */
open class DomainResource() : Resource() {
    val contained: List<Resource> = mutableListOf<Resource>()

    val extension: List<Extension> = mutableListOf<Extension>()

    val modifierExtension: List<Extension> = mutableListOf<Extension>()

    /**
     * Text summary of the resource, for human interpretation
     */
    var text: Narrative? = null
}
