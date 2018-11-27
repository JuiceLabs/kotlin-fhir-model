//
//  Generated from FHIR Version 3.0.1.11917 on 2018-11-27T12:50:39.838 
//
//   2018, JuiceLab, LLC
//  
package com.juicelabs.fhir.model

import com.juicelabs.fhir.base.FhirDate
import kotlin.collections.List

/**
 * Resource data element
 *
 * The formal description of a single piece of information that can be gathered and reported.
 */
open class DataElement() : DomainResource() {
    /**
     * Logical URI to reference this data element (globally unique)
     */
    var url: String? = null

    val identifier: List<Identifier> = mutableListOf<Identifier>()

    /**
     * Business version of the data element
     */
    var version: String? = null

    /**
     * draft | active | retired | unknown
     */
    var status: String = ""

    /**
     * For testing purposes, not real usage
     */
    var experimental: Boolean? = null

    /**
     * Date this was last changed
     */
    var date: FhirDate? = null

    /**
     * Name of the publisher (organization or individual)
     */
    var publisher: String? = null

    /**
     * Name for this data element (computer friendly)
     */
    var name: String? = null

    /**
     * Name for this data element (human friendly)
     */
    var title: String? = null

    val contact: List<ContactDetail> = mutableListOf<ContactDetail>()

    val useContext: List<UsageContext> = mutableListOf<UsageContext>()

    val jurisdiction: List<CodeableConcept> = mutableListOf<CodeableConcept>()

    /**
     * Use and/or publishing restrictions
     */
    var copyright: String? = null

    /**
     * comparable | fully-specified | equivalent | convertable | scaleable | flexible
     */
    var stringency: String? = null

    val mapping: List<DataElementMapping> = mutableListOf<DataElementMapping>()

    val element: List<ElementDefinition> = mutableListOf<ElementDefinition>()
}

/**
 * External specification mapped to
 *
 * Identifies a specification (other than a terminology) that the elements which make up the DataElement have some correspondence with.
 */
open class DataElementMapping() : BackboneElement() {
    /**
     * Internal id when this mapping is used
     */
    var identity: String = ""

    /**
     * Identifies what this mapping refers to
     */
    var uri: String? = null

    /**
     * Names what this mapping refers to
     */
    var name: String? = null

    /**
     * Versions, issues, scope limitations, etc.
     */
    var comment: String? = null
}
