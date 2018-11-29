//
//  Generated from FHIR Version 3.0.1.11917 on 2018-11-29T05:04:15.112 
//
//   2018, JuiceLab, LLC
//  
package com.juicelabs.fhir.model

import com.juicelabs.fhir.base.FhirDate
import kotlin.collections.List

/**
 * Sample for analysis
 *
 * A sample to be used for analysis.
 */
open class Specimen() : DomainResource() {
    val identifier: List<Identifier> = mutableListOf<Identifier>()

    /**
     * Identifier assigned by the lab
     */
    var accessionIdentifier: Identifier? = null

    /**
     * available | unavailable | unsatisfactory | entered-in-error
     */
    var status: String? = null

    /**
     * Kind of material that forms the specimen
     */
    var type: CodeableConcept? = null

    /**
     * Where the specimen came from. This may be from the patient(s) or from the environment or a device
     */
    var subject: Reference = Reference()

    /**
     * The time when specimen was received for processing
     */
    var receivedTime: FhirDate? = null

    val parent: List<Reference> = mutableListOf<Reference>()

    val request: List<Reference> = mutableListOf<Reference>()

    /**
     * Collection details
     */
    var collection: SpecimenCollection? = null

    val processing: List<SpecimenProcessing> = mutableListOf<SpecimenProcessing>()

    val container: List<SpecimenContainer> = mutableListOf<SpecimenContainer>()

    val note: List<Annotation> = mutableListOf<Annotation>()
}

/**
 * Collection details
 *
 * Details concerning the specimen collection.
 */
open class SpecimenCollection() : BackboneElement() {
    /**
     * Who collected the specimen
     */
    var collector: Reference? = null

    /**
     * Collection time
     */
    var collectedDateTime: FhirDate? = null

    /**
     * Collection time
     */
    var collectedPeriod: Period? = null

    /**
     * The quantity of specimen collected
     */
    var quantity: Quantity? = null

    /**
     * Technique used to perform collection
     */
    var method: CodeableConcept? = null

    /**
     * Anatomical collection site
     */
    var bodySite: CodeableConcept? = null
}

/**
 * Processing and processing step details
 *
 * Details concerning processing and processing steps for the specimen.
 */
open class SpecimenProcessing() : BackboneElement() {
    /**
     * Textual description of procedure
     */
    var description: String? = null

    /**
     * Indicates the treatment step  applied to the specimen
     */
    var procedure: CodeableConcept? = null

    val additive: List<Reference> = mutableListOf<Reference>()

    /**
     * Date and time of specimen processing
     */
    var timeDateTime: FhirDate? = null

    /**
     * Date and time of specimen processing
     */
    var timePeriod: Period? = null
}

/**
 * Direct container of specimen (tube/slide, etc.)
 *
 * The container holding the specimen.  The recursive nature of containers; i.e. blood in tube in tray in rack is not addressed here.
 */
open class SpecimenContainer() : BackboneElement() {
    val identifier: List<Identifier> = mutableListOf<Identifier>()

    /**
     * Textual description of the container
     */
    var description: String? = null

    /**
     * Kind of container directly associated with specimen
     */
    var type: CodeableConcept? = null

    /**
     * Container volume or size
     */
    var capacity: Quantity? = null

    /**
     * Quantity of specimen within container
     */
    var specimenQuantity: Quantity? = null

    /**
     * Additive associated with container
     */
    var additiveCodeableConcept: CodeableConcept? = null

    /**
     * Additive associated with container
     */
    var additiveReference: Reference? = null
}
