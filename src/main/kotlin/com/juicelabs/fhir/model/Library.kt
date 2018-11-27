//
//  Generated from FHIR Version 3.0.1.11917 on 2018-11-27T12:50:39.796 
//
//   2018, JuiceLab, LLC
//  
package com.juicelabs.fhir.model

import com.juicelabs.fhir.base.FhirDate
import kotlin.collections.List

/**
 * Represents a library of quality improvement components
 *
 * The Library resource is a general-purpose container for knowledge asset definitions. It can be used to describe and expose existing knowledge assets such as logic libraries and information model descriptions, as well as to describe a collection of knowledge assets.
 */
open class Library() : DomainResource() {
    /**
     * Logical URI to reference this library (globally unique)
     */
    var url: String? = null

    val identifier: List<Identifier> = mutableListOf<Identifier>()

    /**
     * Business version of the library
     */
    var version: String? = null

    /**
     * Name for this library (computer friendly)
     */
    var name: String? = null

    /**
     * Name for this library (human friendly)
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
     * logic-library | model-definition | asset-collection | module-definition
     */
    var type: CodeableConcept = CodeableConcept()

    /**
     * Date this was last changed
     */
    var date: FhirDate? = null

    /**
     * Name of the publisher (organization or individual)
     */
    var publisher: String? = null

    /**
     * Natural language description of the library
     */
    var description: String? = null

    /**
     * Why this library is defined
     */
    var purpose: String? = null

    /**
     * Describes the clinical usage of the library
     */
    var usage: String? = null

    /**
     * When the library was approved by publisher
     */
    var approvalDate: FhirDate? = null

    /**
     * When the library was last reviewed
     */
    var lastReviewDate: FhirDate? = null

    /**
     * When the library is expected to be used
     */
    var effectivePeriod: Period? = null

    val useContext: List<UsageContext> = mutableListOf<UsageContext>()

    val jurisdiction: List<CodeableConcept> = mutableListOf<CodeableConcept>()

    val topic: List<CodeableConcept> = mutableListOf<CodeableConcept>()

    val contributor: List<Contributor> = mutableListOf<Contributor>()

    val contact: List<ContactDetail> = mutableListOf<ContactDetail>()

    /**
     * Use and/or publishing restrictions
     */
    var copyright: String? = null

    val relatedArtifact: List<RelatedArtifact> = mutableListOf<RelatedArtifact>()

    val parameter: List<ParameterDefinition> = mutableListOf<ParameterDefinition>()

    val dataRequirement: List<DataRequirement> = mutableListOf<DataRequirement>()

    val content: List<Attachment> = mutableListOf<Attachment>()
}
