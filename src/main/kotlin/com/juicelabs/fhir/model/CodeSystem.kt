//
//  Generated from FHIR Version 3.0.1.11917 on 2018-11-29T14:32:35.679 
//
//   2018, JuiceLab, LLC
//  
package com.juicelabs.fhir.model

import kotlin.collections.List

/**
 * A set of codes drawn from one or more code systems
 *
 * A code system resource specifies a set of codes drawn from one or more code systems.
 */
open class CodeSystem() : DomainResource() {
    /**
     * Logical URI to reference this code system (globally unique) (Coding.system)
     */
    var url: String? = null

    /**
     * Additional identifier for the code system
     */
    var identifier: Identifier? = null

    /**
     * Business version of the code system (Coding.version)
     */
    var version: String? = null

    /**
     * Name for this code system (computer friendly)
     */
    var name: String? = null

    /**
     * Name for this code system (human friendly)
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
     * Natural language description of the code system
     */
    var description: String? = null

    val useContext: List<UsageContext> = mutableListOf<UsageContext>()

    val jurisdiction: List<CodeableConcept> = mutableListOf<CodeableConcept>()

    /**
     * Why this code system is defined
     */
    var purpose: String? = null

    /**
     * Use and/or publishing restrictions
     */
    var copyright: String? = null

    /**
     * If code comparison is case sensitive
     */
    var caseSensitive: Boolean? = null

    /**
     * Canonical URL for value set with entire code system
     */
    var valueSet: String? = null

    /**
     * grouped-by | is-a | part-of | classified-with
     */
    var hierarchyMeaning: String? = null

    /**
     * If code system defines a post-composition grammar
     */
    var compositional: Boolean? = null

    /**
     * If definitions are not stable
     */
    var versionNeeded: Boolean? = null

    /**
     * not-present | example | fragment | complete
     */
    var content: String? = null

    /**
     * Total concepts in the code system
     */
    var count: Int? = null

    val filter: List<CodeSystemFilter> = mutableListOf<CodeSystemFilter>()

    val property: List<CodeSystemProperty> = mutableListOf<CodeSystemProperty>()

    val concept: List<CodeSystemConcept> = mutableListOf<CodeSystemConcept>()
}

/**
 * Filter that can be used in a value set
 *
 * A filter that can be used in a value set compose statement when selecting concepts using a filter.
 */
open class CodeSystemFilter() : BackboneElement() {
    /**
     * Code that identifies the filter
     */
    var code: String? = null

    /**
     * How or why the filter is used
     */
    var description: String? = null

    val operator: List<String> = mutableListOf<String>()

    /**
     * What to use for the value
     */
    var value: String? = null
}

/**
 * Additional information supplied about each concept
 *
 * A property defines an additional slot through which additional information can be provided about a concept.
 */
open class CodeSystemProperty() : BackboneElement() {
    /**
     * Identifies the property on the concepts, and when referred to in operations
     */
    var code: String? = null

    /**
     * Formal identifier for the property
     */
    var uri: String? = null

    /**
     * Why the property is defined, and/or what it conveys
     */
    var description: String? = null

    /**
     * code | Coding | string | integer | boolean | dateTime
     */
    var type: String? = null
}

/**
 * Concepts in the code system
 *
 * Concepts that are in the code system. The concept definitions are inherently hierarchical, but the definitions must be consulted to determine what the meaning of the hierarchical relationships are.
 */
open class CodeSystemConcept() : BackboneElement() {
    /**
     * Code that identifies concept
     */
    var code: String? = null

    /**
     * Text to display to the user
     */
    var display: String? = null

    /**
     * Formal definition
     */
    var definition: String? = null

    val designation: List<CodeSystemConceptDesignation> =
            mutableListOf<CodeSystemConceptDesignation>()

    val property: List<CodeSystemConceptProperty> = mutableListOf<CodeSystemConceptProperty>()

    val concept: List<CodeSystemConcept> = mutableListOf<CodeSystemConcept>()
}

/**
 * Additional representations for the concept
 *
 * Additional representations for the concept - other languages, aliases, specialized purposes, used for particular purposes, etc.
 */
open class CodeSystemConceptDesignation() : BackboneElement() {
    /**
     * Human language of the designation
     */
    var language: String? = null

    /**
     * Details how this designation would be used
     */
    var use: Coding? = null

    /**
     * The text value for this designation
     */
    var value: String? = null
}

/**
 * Property value for the concept
 *
 * A property value for this concept.
 */
open class CodeSystemConceptProperty() : BackboneElement() {
    /**
     * Reference to CodeSystem.property.code
     */
    var code: String? = null

    /**
     * Value of the property for this concept
     */
    var valueCode: String? = null

    /**
     * Value of the property for this concept
     */
    var valueCoding: Coding = Coding()

    /**
     * Value of the property for this concept
     */
    var valueString: String? = null

    /**
     * Value of the property for this concept
     */
    var valueInteger: Int? = null

    /**
     * Value of the property for this concept
     */
    var valueBoolean: Boolean? = null

    /**
     * Value of the property for this concept
     */
    var valueDateTime: String? = null
}
