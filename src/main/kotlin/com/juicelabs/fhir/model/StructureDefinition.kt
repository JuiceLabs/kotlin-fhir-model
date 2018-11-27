//
//  Generated from FHIR Version 3.0.1.11917 on 2018-11-27T12:50:39.497 
//
//   2018, JuiceLab, LLC
//  
package com.juicelabs.fhir.model

import com.juicelabs.fhir.base.FhirDate
import kotlin.collections.List

/**
 * Structural Definition
 *
 * A definition of a FHIR structure. This resource is used to describe the underlying resources, data types defined in FHIR, and also for describing extensions and constraints on resources and data types.
 */
open class StructureDefinition() : DomainResource() {
    /**
     * Logical URI to reference this structure definition (globally unique)
     */
    var url: String = ""

    val identifier: List<Identifier> = mutableListOf<Identifier>()

    /**
     * Business version of the structure definition
     */
    var version: String? = null

    /**
     * Name for this structure definition (computer friendly)
     */
    var name: String = ""

    /**
     * Name for this structure definition (human friendly)
     */
    var title: String? = null

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

    /**
     * Natural language description of the structure definition
     */
    var description: String? = null

    val useContext: List<UsageContext> = mutableListOf<UsageContext>()

    val jurisdiction: List<CodeableConcept> = mutableListOf<CodeableConcept>()

    /**
     * Why this structure definition is defined
     */
    var purpose: String? = null

    /**
     * Use and/or publishing restrictions
     */
    var copyright: String? = null

    val keyword: List<Coding> = mutableListOf<Coding>()

    /**
     * FHIR Version this StructureDefinition targets
     */
    var fhirVersion: String? = null

    val mapping: List<StructureDefinitionMapping> = mutableListOf<StructureDefinitionMapping>()

    /**
     * primitive-type | complex-type | resource | logical
     */
    var kind: String = ""

    /**
     * Whether the structure is abstract
     */
    var abstract: Boolean = false

    /**
     * resource | datatype | extension
     */
    var contextType: String? = null

    val context: List<String> = mutableListOf<String>()

    val contextInvariant: List<String> = mutableListOf<String>()

    /**
     * Type defined or constrained by this structure
     */
    var type: String = ""

    /**
     * Definition that this type is constrained/specialized from
     */
    var baseDefinition: String? = null

    /**
     * specialization | constraint - How relates to base definition
     */
    var derivation: String? = null

    /**
     * Snapshot view of the structure
     */
    var snapshot: StructureDefinitionSnapshot? = null

    /**
     * Differential view of the structure
     */
    var differential: StructureDefinitionDifferential? = null
}

/**
 * External specification that the content is mapped to
 *
 * An external specification that the content is mapped to.
 */
open class StructureDefinitionMapping() : BackboneElement() {
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
     * Versions, Issues, Scope limitations etc.
     */
    var comment: String? = null
}

/**
 * Snapshot view of the structure
 *
 * A snapshot view is expressed in a stand alone form that can be used and interpreted without considering the base StructureDefinition.
 */
open class StructureDefinitionSnapshot() : BackboneElement() {
    val element: List<ElementDefinition> = mutableListOf<ElementDefinition>()
}

/**
 * Differential view of the structure
 *
 * A differential view is expressed relative to the base StructureDefinition - a statement of differences that it applies.
 */
open class StructureDefinitionDifferential() : BackboneElement() {
    val element: List<ElementDefinition> = mutableListOf<ElementDefinition>()
}
