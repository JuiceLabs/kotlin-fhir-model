//
//  Generated from FHIR Version 3.0.1.11917 on 2018-11-29T14:32:35.743 
//
//   2018, JuiceLab, LLC
//  
package com.juicelabs.fhir.model

import kotlin.collections.List

/**
 * Key Object Selection
 *
 * A text description of the DICOM SOP instances selected in the ImagingManifest; or the reason for, or significance of, the selection.
 */
open class ImagingManifest() : DomainResource() {
    /**
     * SOP Instance UID
     */
    var identifier: Identifier? = null

    /**
     * Patient of the selected objects
     */
    var patient: Reference = Reference()

    /**
     * Time when the selection of instances was made
     */
    var authoringTime: String? = null

    /**
     * Author (human or machine)
     */
    var author: Reference? = null

    /**
     * Description text
     */
    var description: String? = null

    val study: List<ImagingManifestStudy> = mutableListOf<ImagingManifestStudy>()
}

/**
 * Study identity of the selected instances
 *
 * Study identity and locating information of the DICOM SOP instances in the selection.
 */
open class ImagingManifestStudy() : BackboneElement() {
    /**
     * Study instance UID
     */
    var uid: String? = null

    /**
     * Reference to ImagingStudy
     */
    var imagingStudy: Reference? = null

    val endpoint: List<Reference> = mutableListOf<Reference>()

    val series: List<ImagingManifestStudySeries> = mutableListOf<ImagingManifestStudySeries>()
}

/**
 * Series identity of the selected instances
 *
 * Series identity and locating information of the DICOM SOP instances in the selection.
 */
open class ImagingManifestStudySeries() : BackboneElement() {
    /**
     * Series instance UID
     */
    var uid: String? = null

    val endpoint: List<Reference> = mutableListOf<Reference>()

    val instance: List<ImagingManifestStudySeriesInstance> =
            mutableListOf<ImagingManifestStudySeriesInstance>()
}

/**
 * The selected instance
 *
 * Identity and locating information of the selected DICOM SOP instances.
 */
open class ImagingManifestStudySeriesInstance() : BackboneElement() {
    /**
     * SOP class UID of instance
     */
    var sopClass: String? = null

    /**
     * Selected instance UID
     */
    var uid: String? = null
}
