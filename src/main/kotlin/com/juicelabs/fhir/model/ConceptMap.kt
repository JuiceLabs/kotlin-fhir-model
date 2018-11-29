//
//  Generated from FHIR Version 3.0.1.11917 on 2018-11-29T14:32:35.578 
//
//   2018, JuiceLab, LLC
//  
package com.juicelabs.fhir.model

import kotlin.collections.List

/**
 * A map from one set of concepts to one or more other concepts
 *
 * A statement of relationships from one set of concepts to one or more other concepts - either code systems or data elements, or classes in class models.
 */
open class ConceptMap() : DomainResource() {
    /**
     * Logical URI to reference this concept map (globally unique)
     */
    var url: String? = null

    /**
     * Additional identifier for the concept map
     */
    var identifier: Identifier? = null

    /**
     * Business version of the concept map
     */
    var version: String? = null

    /**
     * Name for this concept map (computer friendly)
     */
    var name: String? = null

    /**
     * Name for this concept map (human friendly)
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
     * Natural language description of the concept map
     */
    var description: String? = null

    val useContext: List<UsageContext> = mutableListOf<UsageContext>()

    val jurisdiction: List<CodeableConcept> = mutableListOf<CodeableConcept>()

    /**
     * Why this concept map is defined
     */
    var purpose: String? = null

    /**
     * Use and/or publishing restrictions
     */
    var copyright: String? = null

    /**
     * Identifies the source of the concepts which are being mapped
     */
    var sourceUri: String? = null

    /**
     * Identifies the source of the concepts which are being mapped
     */
    var sourceReference: Reference? = null

    /**
     * Provides context to the mappings
     */
    var targetUri: String? = null

    /**
     * Provides context to the mappings
     */
    var targetReference: Reference? = null

    val group: List<ConceptMapGroup> = mutableListOf<ConceptMapGroup>()
}

/**
 * Same source and target systems
 *
 * A group of mappings that all have the same source and target system.
 */
open class ConceptMapGroup() : BackboneElement() {
    /**
     * Code System (if value set crosses code systems)
     */
    var source: String? = null

    /**
     * Specific version of the  code system
     */
    var sourceVersion: String? = null

    /**
     * System of the target (if necessary)
     */
    var target: String? = null

    /**
     * Specific version of the  code system
     */
    var targetVersion: String? = null

    val element: List<ConceptMapGroupElement> = mutableListOf<ConceptMapGroupElement>()

    /**
     * When no match in the mappings
     */
    var unmapped: ConceptMapGroupUnmapped? = null
}

/**
 * Mappings for a concept from the source set
 *
 * Mappings for an individual concept in the source to one or more concepts in the target.
 */
open class ConceptMapGroupElement() : BackboneElement() {
    /**
     * Identifies element being mapped
     */
    var code: String? = null

    /**
     * Display for the code
     */
    var display: String? = null

    val target: List<ConceptMapGroupElementTarget> = mutableListOf<ConceptMapGroupElementTarget>()
}

/**
 * Concept in target system for element
 *
 * A concept from the target value set that this concept maps to.
 */
open class ConceptMapGroupElementTarget() : BackboneElement() {
    /**
     * Code that identifies the target element
     */
    var code: String? = null

    /**
     * Display for the code
     */
    var display: String? = null

    /**
     * relatedto | equivalent | equal | wider | subsumes | narrower | specializes | inexact | unmatched | disjoint
     */
    var equivalence: String? = null

    /**
     * Description of status/issues in mapping
     */
    var comment: String? = null

    val dependsOn: List<ConceptMapGroupElementTargetDependsOn> =
            mutableListOf<ConceptMapGroupElementTargetDependsOn>()

    val product: List<ConceptMapGroupElementTargetDependsOn> =
            mutableListOf<ConceptMapGroupElementTargetDependsOn>()
}

/**
 * Other elements required for this mapping (from context)
 *
 * A set of additional dependencies for this mapping to hold. This mapping is only applicable if the specified element can be resolved, and it has the specified value.
 */
open class ConceptMapGroupElementTargetDependsOn() : BackboneElement() {
    /**
     * Reference to property mapping depends on
     */
    var property: String? = null

    /**
     * Code System (if necessary)
     */
    var system: String? = null

    /**
     * Value of the referenced element
     */
    var code: String? = null

    /**
     * Display for the code
     */
    var display: String? = null
}

/**
 * When no match in the mappings
 *
 * What to do when there is no match in the mappings in the group.
 */
open class ConceptMapGroupUnmapped() : BackboneElement() {
    /**
     * provided | fixed | other-map
     */
    var mode: String? = null

    /**
     * Fixed code when mode = fixed
     */
    var code: String? = null

    /**
     * Display for the code
     */
    var display: String? = null

    /**
     * Canonical URL for other concept map
     */
    var url: String? = null
}
