//
//  Generated from FHIR Version 3.0.1.11917 on 2018-11-29T14:32:35.444 
//
//   2018, JuiceLab, LLC
//  
package com.juicelabs.fhir.model

import kotlin.collections.List

/**
 * A set of images produced in single study (one or more series of references images)
 *
 * Representation of the content produced in a DICOM imaging study. A study comprises a set of series, each of which includes a set of Service-Object Pair Instances (SOP Instances - images or other data) acquired or produced in a common context.  A series is of only one modality (e.g. X-ray, CT, MR, ultrasound), but a study may have multiple series of different modalities.
 */
open class ImagingStudy() : DomainResource() {
    /**
     * Formal DICOM identifier for the study
     */
    var uid: String? = null

    /**
     * Related workflow identifier ("Accession Number")
     */
    var accession: Identifier? = null

    val identifier: List<Identifier> = mutableListOf<Identifier>()

    /**
     * ONLINE | OFFLINE | NEARLINE | UNAVAILABLE
     */
    var availability: String? = null

    val modalityList: List<Coding> = mutableListOf<Coding>()

    /**
     * Who the images are of
     */
    var patient: Reference = Reference()

    /**
     * Originating context
     */
    var context: Reference? = null

    /**
     * When the study was started
     */
    var started: String? = null

    val basedOn: List<Reference> = mutableListOf<Reference>()

    /**
     * Referring physician
     */
    var referrer: Reference? = null

    val interpreter: List<Reference> = mutableListOf<Reference>()

    val endpoint: List<Reference> = mutableListOf<Reference>()

    /**
     * Number of Study Related Series
     */
    var numberOfSeries: Int? = null

    /**
     * Number of Study Related Instances
     */
    var numberOfInstances: Int? = null

    val procedureReference: List<Reference> = mutableListOf<Reference>()

    val procedureCode: List<CodeableConcept> = mutableListOf<CodeableConcept>()

    /**
     * Why the study was requested
     */
    var reason: CodeableConcept? = null

    /**
     * Institution-generated description
     */
    var description: String? = null

    val series: List<ImagingStudySeries> = mutableListOf<ImagingStudySeries>()
}

/**
 * Each study has one or more series of instances
 *
 * Each study has one or more series of images or other content.
 */
open class ImagingStudySeries() : BackboneElement() {
    /**
     * Formal DICOM identifier for this series
     */
    var uid: String? = null

    /**
     * Numeric identifier of this series
     */
    var number: Int? = null

    /**
     * The modality of the instances in the series
     */
    var modality: Coding = Coding()

    /**
     * A short human readable summary of the series
     */
    var description: String? = null

    /**
     * Number of Series Related Instances
     */
    var numberOfInstances: Int? = null

    /**
     * ONLINE | OFFLINE | NEARLINE | UNAVAILABLE
     */
    var availability: String? = null

    val endpoint: List<Reference> = mutableListOf<Reference>()

    /**
     * Body part examined
     */
    var bodySite: Coding? = null

    /**
     * Body part laterality
     */
    var laterality: Coding? = null

    /**
     * When the series started
     */
    var started: String? = null

    val performer: List<Reference> = mutableListOf<Reference>()

    val instance: List<ImagingStudySeriesInstance> = mutableListOf<ImagingStudySeriesInstance>()
}

/**
 * A single SOP instance from the series
 *
 * A single SOP instance within the series, e.g. an image, or presentation state.
 */
open class ImagingStudySeriesInstance() : BackboneElement() {
    /**
     * Formal DICOM identifier for this instance
     */
    var uid: String? = null

    /**
     * The number of this instance in the series
     */
    var number: Int? = null

    /**
     * DICOM class type
     */
    var sopClass: String? = null

    /**
     * Description of instance
     */
    var title: String? = null
}
