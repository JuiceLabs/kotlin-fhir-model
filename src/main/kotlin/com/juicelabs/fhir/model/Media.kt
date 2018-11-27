//
//  Generated from FHIR Version 3.0.1.11917 on 2018-11-27T12:50:39.947 
//
//   2018, JuiceLab, LLC
//  
package com.juicelabs.fhir.model

import com.juicelabs.fhir.base.FhirDate
import kotlin.collections.List

/**
 * A photo, video, or audio recording acquired or used in healthcare. The actual content may be inline or provided by direct reference
 *
 * A photo, video, or audio recording acquired or used in healthcare. The actual content may be inline or provided by direct reference.
 */
open class Media() : DomainResource() {
    val identifier: List<Identifier> = mutableListOf<Identifier>()

    val basedOn: List<Reference> = mutableListOf<Reference>()

    /**
     * photo | video | audio
     */
    var type: String = ""

    /**
     * The type of acquisition equipment/process
     */
    var subtype: CodeableConcept? = null

    /**
     * Imaging view, e.g. Lateral or Antero-posterior
     */
    var view: CodeableConcept? = null

    /**
     * Who/What this Media is a record of
     */
    var subject: Reference? = null

    /**
     * Encounter / Episode associated with media
     */
    var context: Reference? = null

    /**
     * When Media was collected
     */
    var occurrenceDateTime: FhirDate? = null

    /**
     * When Media was collected
     */
    var occurrencePeriod: Period? = null

    /**
     * The person who generated the image
     */
    var operator: Reference? = null

    val reasonCode: List<CodeableConcept> = mutableListOf<CodeableConcept>()

    /**
     * Body part in media
     */
    var bodySite: CodeableConcept? = null

    /**
     * Observing Device
     */
    var device: Reference? = null

    /**
     * Height of the image in pixels (photo/video)
     */
    var height: Int? = null

    /**
     * Width of the image in pixels (photo/video)
     */
    var width: Int? = null

    /**
     * Number of frames if > 1 (photo)
     */
    var frames: Int? = null

    /**
     * Length in seconds (audio / video)
     */
    var duration: Int? = null

    /**
     * Actual Media - reference or data
     */
    var content: Attachment = Attachment()

    val note: List<Annotation> = mutableListOf<Annotation>()
}
