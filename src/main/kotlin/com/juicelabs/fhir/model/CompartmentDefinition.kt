//
//  Generated from FHIR Version 3.0.1.11917 on 2018-11-29T14:32:35.388 
//
//   2018, JuiceLab, LLC
//  
package com.juicelabs.fhir.model

import kotlin.collections.List

/**
 * Compartment Definition for a resource
 *
 * A compartment definition that defines how resources are accessed on a server.
 */
open class CompartmentDefinition() : DomainResource() {
    /**
     * Logical URI to reference this compartment definition (globally unique)
     */
    var url: String? = null

    /**
     * Name for this compartment definition (computer friendly)
     */
    var name: String? = null

    /**
     * Name for this compartment definition (human friendly)
     */
    var title: String? = null

    /**
     * draft | active | retired | unknown
     */
    var status: String? = null

    /**
     * For testing purposes, not real usage
     */
    var experimental: Boolean? = null

    /**
     * Date this was last changed
     */
    var date: String? = null

    /**
     * Name of the publisher (organization or individual)
     */
    var publisher: String? = null

    val contact: List<ContactDetail> = mutableListOf<ContactDetail>()

    /**
     * Natural language description of the compartment definition
     */
    var description: String? = null

    /**
     * Why this compartment definition is defined
     */
    var purpose: String? = null

    val useContext: List<UsageContext> = mutableListOf<UsageContext>()

    val jurisdiction: List<CodeableConcept> = mutableListOf<CodeableConcept>()

    /**
     * Patient | Encounter | RelatedPerson | Practitioner | Device
     */
    var code: String? = null

    /**
     * Whether the search syntax is supported
     */
    var search: Boolean? = null

    val resource: List<CompartmentDefinitionResource> =
            mutableListOf<CompartmentDefinitionResource>()
}

/**
 * How a resource is related to the compartment
 *
 * Information about how a resource is related to the compartment.
 */
open class CompartmentDefinitionResource() : BackboneElement() {
    /**
     * Name of resource type
     */
    var code: String? = null

    val param: List<String> = mutableListOf<String>()

    /**
     * Additional documentation about the resource and compartment
     */
    var documentation: String? = null
}
