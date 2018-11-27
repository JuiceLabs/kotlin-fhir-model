//
//  Generated from FHIR Version 3.0.1.11917 on 2018-11-27T12:50:39.873 
//
//   2018, JuiceLab, LLC
//  
package com.juicelabs.fhir.model

import com.juicelabs.fhir.base.FhirDate
import kotlin.collections.List

/**
 * Search Parameter for a resource
 *
 * A search parameter that defines a named search item that can be used to search/filter on a resource.
 */
open class SearchParameter() : DomainResource() {
    /**
     * Logical URI to reference this search parameter (globally unique)
     */
    var url: String = ""

    /**
     * Business version of the search parameter
     */
    var version: String? = null

    /**
     * Name for this search parameter (computer friendly)
     */
    var name: String = ""

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

    val contact: List<ContactDetail> = mutableListOf<ContactDetail>()

    val useContext: List<UsageContext> = mutableListOf<UsageContext>()

    val jurisdiction: List<CodeableConcept> = mutableListOf<CodeableConcept>()

    /**
     * Why this search parameter is defined
     */
    var purpose: String? = null

    /**
     * Code used in URL
     */
    var code: String = ""

    val base: List<String> = mutableListOf<String>()

    /**
     * number | date | string | token | reference | composite | quantity | uri
     */
    var type: String = ""

    /**
     * Original Definition for the search parameter
     */
    var derivedFrom: String? = null

    /**
     * Natural language description of the search parameter
     */
    var description: String = ""

    /**
     * FHIRPath expression that extracts the values
     */
    var expression: String? = null

    /**
     * XPath that extracts the values
     */
    var xpath: String? = null

    /**
     * normal | phonetic | nearby | distance | other
     */
    var xpathUsage: String? = null

    val target: List<String> = mutableListOf<String>()

    val comparator: List<String> = mutableListOf<String>()

    val modifier: List<String> = mutableListOf<String>()

    val chain: List<String> = mutableListOf<String>()

    val component: List<SearchParameterComponent> = mutableListOf<SearchParameterComponent>()
}

/**
 * For Composite resources to define the parts
 *
 * Used to define the parts of a composite search parameter.
 */
open class SearchParameterComponent() : BackboneElement() {
    /**
     * Defines how the part works
     */
    var definition: Reference = Reference()

    /**
     * Subexpression relative to main expression
     */
    var expression: String = ""
}
