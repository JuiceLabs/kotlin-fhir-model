//
//  Generated from FHIR Version 3.0.1.11917 on 2018-11-29T14:32:35.711 
//
//   2018, JuiceLab, LLC
//  
package com.juicelabs.fhir.model

import kotlin.collections.List

/**
 * A quality measure definition
 *
 * The Measure resource provides the definition of a quality measure.
 */
open class Measure() : DomainResource() {
    /**
     * Logical URI to reference this measure (globally unique)
     */
    var url: String? = null

    val identifier: List<Identifier> = mutableListOf<Identifier>()

    /**
     * Business version of the measure
     */
    var version: String? = null

    /**
     * Name for this measure (computer friendly)
     */
    var name: String? = null

    /**
     * Name for this measure (human friendly)
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
     * Natural language description of the measure
     */
    var description: String? = null

    /**
     * Why this measure is defined
     */
    var purpose: String? = null

    /**
     * Describes the clinical usage of the measure
     */
    var usage: String? = null

    /**
     * When the measure was approved by publisher
     */
    var approvalDate: String? = null

    /**
     * When the measure was last reviewed
     */
    var lastReviewDate: String? = null

    /**
     * When the measure is expected to be used
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

    val library: List<Reference> = mutableListOf<Reference>()

    /**
     * Disclaimer for use of the measure or its referenced content
     */
    var disclaimer: String? = null

    /**
     * proportion | ratio | continuous-variable | cohort
     */
    var scoring: CodeableConcept? = null

    /**
     * opportunity | all-or-nothing | linear | weighted
     */
    var compositeScoring: CodeableConcept? = null

    val type: List<CodeableConcept> = mutableListOf<CodeableConcept>()

    /**
     * How is risk adjustment applied for this measure
     */
    var riskAdjustment: String? = null

    /**
     * How is rate aggregation performed for this measure
     */
    var rateAggregation: String? = null

    /**
     * Why does this measure exist
     */
    var rationale: String? = null

    /**
     * Summary of clinical guidelines
     */
    var clinicalRecommendationStatement: String? = null

    /**
     * Improvement notation for the measure, e.g. higher score indicates better quality
     */
    var improvementNotation: String? = null

    val definition: List<String> = mutableListOf<String>()

    /**
     * Additional guidance for implementers
     */
    var guidance: String? = null

    /**
     * The measure set, e.g. Preventive Care and Screening
     */
    var set: String? = null

    val group: List<MeasureGroup> = mutableListOf<MeasureGroup>()

    val supplementalData: List<MeasureSupplementalData> = mutableListOf<MeasureSupplementalData>()
}

/**
 * Population criteria group
 *
 * A group of population criteria for the measure.
 */
open class MeasureGroup() : BackboneElement() {
    /**
     * Unique identifier
     */
    var identifier: Identifier = Identifier()

    /**
     * Short name
     */
    var name: String? = null

    /**
     * Summary description
     */
    var description: String? = null

    val population: List<MeasureGroupPopulation> = mutableListOf<MeasureGroupPopulation>()

    val stratifier: List<MeasureGroupStratifier> = mutableListOf<MeasureGroupStratifier>()
}

/**
 * Population criteria
 *
 * A population criteria for the measure.
 */
open class MeasureGroupPopulation() : BackboneElement() {
    /**
     * Unique identifier
     */
    var identifier: Identifier? = null

    /**
     * initial-population | numerator | numerator-exclusion | denominator | denominator-exclusion | denominator-exception | measure-population | measure-population-exclusion | measure-observation
     */
    var code: CodeableConcept? = null

    /**
     * Short name
     */
    var name: String? = null

    /**
     * The human readable description of this population criteria
     */
    var description: String? = null

    /**
     * The name of a valid referenced CQL expression (may be namespaced) that defines this population criteria
     */
    var criteria: String? = null
}

/**
 * Stratifier criteria for the measure
 *
 * The stratifier criteria for the measure report, specified as either the name of a valid CQL expression defined within a referenced library, or a valid FHIR Resource Path.
 */
open class MeasureGroupStratifier() : BackboneElement() {
    /**
     * The identifier for the stratifier used to coordinate the reported data back to this stratifier
     */
    var identifier: Identifier? = null

    /**
     * How the measure should be stratified
     */
    var criteria: String? = null

    /**
     * Path to the stratifier
     */
    var path: String? = null
}

/**
 * What other data should be reported with the measure
 *
 * The supplemental data criteria for the measure report, specified as either the name of a valid CQL expression within a referenced library, or a valid FHIR Resource Path.
 */
open class MeasureSupplementalData() : BackboneElement() {
    /**
     * Identifier, unique within the measure
     */
    var identifier: Identifier? = null

    val usage: List<CodeableConcept> = mutableListOf<CodeableConcept>()

    /**
     * Expression describing additional data to be reported
     */
    var criteria: String? = null

    /**
     * Path to the supplemental data element
     */
    var path: String? = null
}
