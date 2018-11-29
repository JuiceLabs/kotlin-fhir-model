//
//  Generated from FHIR Version 3.0.1.11917 on 2018-11-29T14:32:35.404 
//
//   2018, JuiceLab, LLC
//  
package com.juicelabs.fhir.model

import kotlin.collections.List

/**
 * A description of decision support service functionality
 *
 * The ServiceDefinition describes a unit of decision support functionality that is made available as a service, such as immunization modules or drug-drug interaction checking.
 */
open class ServiceDefinition() : DomainResource() {
    /**
     * Logical URI to reference this service definition (globally unique)
     */
    var url: String? = null

    val identifier: List<Identifier> = mutableListOf<Identifier>()

    /**
     * Business version of the service definition
     */
    var version: String? = null

    /**
     * Name for this service definition (computer friendly)
     */
    var name: String? = null

    /**
     * Name for this service definition (human friendly)
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

    /**
     * Natural language description of the service definition
     */
    var description: String? = null

    /**
     * Why this service definition is defined
     */
    var purpose: String? = null

    /**
     * Describes the clinical usage of the module
     */
    var usage: String? = null

    /**
     * When the service definition was approved by publisher
     */
    var approvalDate: String? = null

    /**
     * When the service definition was last reviewed
     */
    var lastReviewDate: String? = null

    /**
     * When the service definition is expected to be used
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

    val trigger: List<TriggerDefinition> = mutableListOf<TriggerDefinition>()

    val dataRequirement: List<DataRequirement> = mutableListOf<DataRequirement>()

    /**
     * Operation to invoke
     */
    var operationDefinition: Reference? = null
}
