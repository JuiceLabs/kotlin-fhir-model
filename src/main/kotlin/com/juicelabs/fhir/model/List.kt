//
//  Generated from FHIR Version 3.0.1.11917 on 2018-12-02T21:16:28.274 
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
     * When item added to list
     */
    var date: String? = null

    /**
     * If this item is actually marked as deleted
     */
    var deleted: Boolean? = null

    /**
     * Status/Workflow information about this item
     */
    var flag: CodeableConcept? = null

    /**
     * Actual entry
     */
    var item: Reference = Reference()
}
