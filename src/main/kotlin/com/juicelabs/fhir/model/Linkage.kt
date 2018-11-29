//
//  Generated from FHIR Version 3.0.1.11917 on 2018-11-29T14:32:35.521 
//
//   2018, JuiceLab, LLC
//  
package com.juicelabs.fhir.model

import kotlin.collections.List

/**
 * Links records for 'same' item
 *
 * Identifies two or more records (resource instances) that are referring to the same real-world "occurrence".
 */
open class Linkage() : DomainResource() {
    /**
     * Whether this linkage assertion is active or not
     */
    var active: Boolean? = null

    /**
     * Who is responsible for linkages
     */
    var author: Reference? = null

    val item: List<LinkageItem> = mutableListOf<LinkageItem>()
}

/**
 * Item to be linked
 *
 * Identifies one of the records that is considered to refer to the same real-world occurrence as well as how the items hould be evaluated within the collection of linked items.
 */
open class LinkageItem() : BackboneElement() {
    /**
     * source | alternate | historical
     */
    var type: String? = null

    /**
     * Resource being linked
     */
    var resource: Reference = Reference()
}
