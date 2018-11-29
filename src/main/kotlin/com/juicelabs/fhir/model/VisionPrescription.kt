//
//  Generated from FHIR Version 3.0.1.11917 on 2018-11-29T05:04:14.875 
//
//   2018, JuiceLab, LLC
//  
package com.juicelabs.fhir.model

import com.juicelabs.fhir.base.FhirDate
import kotlin.collections.List

/**
 * Prescription for vision correction products for a patient
 *
 * An authorization for the supply of glasses and/or contact lenses to a patient.
 */
open class VisionPrescription() : DomainResource() {
    val identifier: List<Identifier> = mutableListOf<Identifier>()

    /**
     * active | cancelled | draft | entered-in-error
     */
    var status: String? = null

    /**
     * Who prescription is for
     */
    var patient: Reference? = null

    /**
     * Created during encounter / admission / stay
     */
    var encounter: Reference? = null

    /**
     * When prescription was authorized
     */
    var dateWritten: FhirDate? = null

    /**
     * Who authorizes the vision product
     */
    var prescriber: Reference? = null

    /**
     * Reason or indication for writing the prescription
     */
    var reasonCodeableConcept: CodeableConcept? = null

    /**
     * Reason or indication for writing the prescription
     */
    var reasonReference: Reference? = null

    val dispense: List<VisionPrescriptionDispense> = mutableListOf<VisionPrescriptionDispense>()
}

/**
 * Vision supply authorization
 *
 * Deals with details of the dispense part of the supply specification.
 */
open class VisionPrescriptionDispense() : BackboneElement() {
    /**
     * Product to be supplied
     */
    var product: CodeableConcept? = null

    /**
     * right | left
     */
    var eye: String? = null

    /**
     * Lens sphere
     */
    var sphere: Float? = null

    /**
     * Lens cylinder
     */
    var cylinder: Float? = null

    /**
     * Lens axis
     */
    var axis: Int? = null

    /**
     * Lens prism
     */
    var prism: Float? = null

    /**
     * up | down | in | out
     */
    var base: String? = null

    /**
     * Lens add
     */
    var add: Float? = null

    /**
     * Contact lens power
     */
    var power: Float? = null

    /**
     * Contact lens back curvature
     */
    var backCurve: Float? = null

    /**
     * Contact lens diameter
     */
    var diameter: Float? = null

    /**
     * Lens wear duration
     */
    var duration: Quantity? = null

    /**
     * Color required
     */
    var color: String? = null

    /**
     * Brand required
     */
    var brand: String? = null

    val note: List<Annotation> = mutableListOf<Annotation>()
}
