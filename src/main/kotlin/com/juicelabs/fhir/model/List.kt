//
//  Generated from FHIR Version 3.0.1.11917 on 2018-11-29T14:32:35.697 
//
//   2018, JuiceLab, LLC
//  
package com.juicelabs.fhir.model

/**
 * Entries in the list
 *
 * Entries in this list.
 */
open class ListEntry() : BackboneElement() {
    /**
     * Status/Workflow information about this item
     */
    var flag: CodeableConcept? = null

    /**
     * If this item is actually marked as deleted
     */
    var deleted: Boolean? = null

    /**
     * When item added to list
     */
    var date: String? = null

    /**
     * Actual entry
     */
    var item: Reference = Reference()
}
