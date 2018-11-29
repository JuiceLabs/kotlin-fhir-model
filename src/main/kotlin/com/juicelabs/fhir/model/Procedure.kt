//
//  Generated from FHIR Version 3.0.1.11917 on 2018-11-29T14:32:35.604 
//
//   2018, JuiceLab, LLC
//  
package com.juicelabs.fhir.model

import kotlin.collections.List

/**
 * An action that is being or was performed on a patient
 *
 * An action that is or was performed on a patient. This can be a physical intervention like an operation, or less invasive like counseling or hypnotherapy.
 */
open class Procedure() : DomainResource() {
    val identifier: List<Identifier> = mutableListOf<Identifier>()

    val definition: List<Reference> = mutableListOf<Reference>()

    val basedOn: List<Reference> = mutableListOf<Reference>()

    val partOf: List<Reference> = mutableListOf<Reference>()

    /**
     * preparation | in-progress | suspended | aborted | completed | entered-in-error | unknown
     */
    var status: String? = null

    /**
     * True if procedure was not performed as scheduled
     */
    var notDone: Boolean? = null

    /**
     * Reason procedure was not performed
     */
    var notDoneReason: CodeableConcept? = null

    /**
     * Classification of the procedure
     */
    var category: CodeableConcept? = null

    /**
     * Identification of the procedure
     */
    var code: CodeableConcept? = null

    /**
     * Who the procedure was performed on
     */
    var subject: Reference = Reference()

    /**
     * Encounter or episode associated with the procedure
     */
    var context: Reference? = null

    /**
     * Date/Period the procedure was performed
     */
    var performedDateTime: String? = null

    /**
     * Date/Period the procedure was performed
     */
    var performedPeriod: Period? = null

    val performer: List<ProcedurePerformer> = mutableListOf<ProcedurePerformer>()

    /**
     * Where the procedure happened
     */
    var location: Reference? = null

    val reasonCode: List<CodeableConcept> = mutableListOf<CodeableConcept>()

    val reasonReference: List<Reference> = mutableListOf<Reference>()

    val bodySite: List<CodeableConcept> = mutableListOf<CodeableConcept>()

    /**
     * The result of procedure
     */
    var outcome: CodeableConcept? = null

    val report: List<Reference> = mutableListOf<Reference>()

    val complication: List<CodeableConcept> = mutableListOf<CodeableConcept>()

    val complicationDetail: List<Reference> = mutableListOf<Reference>()

    val followUp: List<CodeableConcept> = mutableListOf<CodeableConcept>()

    val note: List<Annotation> = mutableListOf<Annotation>()

    val focalDevice: List<ProcedureFocalDevice> = mutableListOf<ProcedureFocalDevice>()

    val usedReference: List<Reference> = mutableListOf<Reference>()

    val usedCode: List<CodeableConcept> = mutableListOf<CodeableConcept>()
}

/**
 * The people who performed the procedure
 *
 * Limited to 'real' people rather than equipment.
 */
open class ProcedurePerformer() : BackboneElement() {
    /**
     * The role the actor was in
     */
    var role: CodeableConcept? = null

    /**
     * The reference to the practitioner
     */
    var actor: Reference = Reference()

    /**
     * Organization the device or practitioner was acting for
     */
    var onBehalfOf: Reference? = null
}

/**
 * Device changed in procedure
 *
 * A device that is implanted, removed or otherwise manipulated (calibration, battery replacement, fitting a prosthesis, attaching a wound-vac, etc.) as a focal portion of the Procedure.
 */
open class ProcedureFocalDevice() : BackboneElement() {
    /**
     * Kind of change to device
     */
    var action: CodeableConcept? = null

    /**
     * Device that was changed
     */
    var manipulated: Reference = Reference()
}
