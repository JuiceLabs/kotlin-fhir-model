//
//  Generated from FHIR Version 3.0.1.11917 on 2018-12-02T21:16:28.022 
//
//   2018, JuiceLab, LLC
//  
package com.juicelabs.fhir.model

import kotlin.collections.List

/**
 * Metadata about a resource
 *
 * The metadata about a resource. This is content in the resource that is maintained by the infrastructure. Changes to the content may not always be associated with version changes to the resource.
 */
open class Meta() : Element() {
    /**
     * When the resource version last changed
     */
    var lastUpdated: String? = null

    val profile: List<String> = mutableListOf<String>()

    val security: List<Coding> = mutableListOf<Coding>()

    val tag: List<Coding> = mutableListOf<Coding>()

    /**
     * Version specific identifier
     */
    var versionId: String? = null
}
