//
//  Generated from FHIR Version 3.0.1.11917 on 2018-11-29T05:04:14.656 
//
//   2018, JuiceLab, LLC
//  
package com.juicelabs.fhir.model

import com.juicelabs.fhir.base.FhirDate
import kotlin.collections.List

/**
 * Results of a measure evaluation
 *
 * The MeasureReport resource contains the results of evaluating a measure.
 */
open class MeasureReport() : DomainResource() {
    /**
     * Additional identifier for the Report
     */
    var identifier: Identifier? = null

    /**
     * complete | pending | error
     */
    var status: String? = null

    /**
     * individual | patient-list | summary
     */
    var type: String? = null

    /**
     * What measure was evaluated
     */
    var measure: Reference = Reference()

    /**
     * What patient the report is for
     */
    var patient: Reference? = null

    /**
     * When the report was generated
     */
    var date: FhirDate? = null

    /**
     * Who is reporting the data
     */
    var reportingOrganization: Reference? = null

    /**
     * What period the report covers
     */
    var period: Period = Period()

    val group: List<MeasureReportGroup> = mutableListOf<MeasureReportGroup>()

    /**
     * What data was evaluated to produce the measure score
     */
    var evaluatedResources: Reference? = null
}

/**
 * Measure results for each group
 *
 * The results of the calculation, one for each population group in the measure.
 */
open class MeasureReportGroup() : BackboneElement() {
    /**
     * What group of the measure
     */
    var identifier: Identifier = Identifier()

    val population: List<MeasureReportGroupPopulation> =
            mutableListOf<MeasureReportGroupPopulation>()

    /**
     * What score this group achieved
     */
    var measureScore: Float? = null

    val stratifier: List<MeasureReportGroupStratifier> =
            mutableListOf<MeasureReportGroupStratifier>()
}

/**
 * The populations in the group
 *
 * The populations that make up the population group, one for each type of population appropriate for the measure.
 */
open class MeasureReportGroupPopulation() : BackboneElement() {
    /**
     * Population identifier as defined in the measure
     */
    var identifier: Identifier? = null

    /**
     * initial-population | numerator | numerator-exclusion | denominator | denominator-exclusion | denominator-exception | measure-population | measure-population-exclusion | measure-score
     */
    var code: CodeableConcept? = null

    /**
     * Size of the population
     */
    var count: Int? = null

    /**
     * For patient-list reports, the patients in this population
     */
    var patients: Reference? = null
}

/**
 * Stratification results
 *
 * When a measure includes multiple stratifiers, there will be a stratifier group for each stratifier defined by the measure.
 */
open class MeasureReportGroupStratifier() : BackboneElement() {
    /**
     * What stratifier of the group
     */
    var identifier: Identifier? = null

    val stratum: List<MeasureReportGroupStratifierStratum> =
            mutableListOf<MeasureReportGroupStratifierStratum>()
}

/**
 * Stratum results, one for each unique value in the stratifier
 *
 * This element contains the results for a single stratum within the stratifier. For example, when stratifying on administrative gender, there will be four strata, one for each possible gender value.
 */
open class MeasureReportGroupStratifierStratum() : BackboneElement() {
    /**
     * The stratum value, e.g. male
     */
    var value: String? = null

    val population: List<MeasureReportGroupStratifierStratumPopulation> =
            mutableListOf<MeasureReportGroupStratifierStratumPopulation>()

    /**
     * What score this stratum achieved
     */
    var measureScore: Float? = null
}

/**
 * Population results in this stratum
 *
 * The populations that make up the stratum, one for each type of population appropriate to the measure.
 */
open class MeasureReportGroupStratifierStratumPopulation() : BackboneElement() {
    /**
     * Population identifier as defined in the measure
     */
    var identifier: Identifier? = null

    /**
     * initial-population | numerator | numerator-exclusion | denominator | denominator-exclusion | denominator-exception | measure-population | measure-population-exclusion | measure-score
     */
    var code: CodeableConcept? = null

    /**
     * Size of the population
     */
    var count: Int? = null

    /**
     * For patient-list reports, the patients in this population
     */
    var patients: Reference? = null
}
