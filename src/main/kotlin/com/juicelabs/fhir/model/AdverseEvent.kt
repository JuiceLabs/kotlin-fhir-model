//
//  Generated from FHIR Version 3.0.1.11917 on 2018-11-29T14:32:35.733 
//
//   2018, JuiceLab, LLC
//  
package com.juicelabs.fhir.model

import kotlin.collections.List

/**
 * Medical care, research study or other healthcare event causing physical injury
 *
 * Actual or  potential/avoided event causing unintended physical injury resulting from or contributed to by medical care, a research study or other healthcare setting factors that requires additional monitoring, treatment, or hospitalization, or that results in death.
 */
open class AdverseEvent() : DomainResource() {
    /**
     * Business identifier for the event
     */
    var identifier: Identifier? = null

    /**
     * AE | PAE An adverse event is an event that caused harm to a patient,  an adverse reaction is a something that is a subject-specific event that is a result of an exposure to a medication, food, device or environmental substance, a potential adverse event is something that occurred and that could have caused harm to a patient but did not
     */
    var category: String? = null

    /**
     * actual | potential
     */
    var type: CodeableConcept? = null

    /**
     * Subject or group impacted by event
     */
    var subject: Reference? = null

    /**
     * When the event occurred
     */
    var date: String? = null

    val reaction: List<Reference> = mutableListOf<Reference>()

    /**
     * Location where adverse event occurred
     */
    var location: Reference? = null

    /**
     * Mild | Moderate | Severe
     */
    var seriousness: CodeableConcept? = null

    /**
     * resolved | recovering | ongoing | resolvedWithSequelae | fatal | unknown
     */
    var outcome: CodeableConcept? = null

    /**
     * Who recorded the adverse event
     */
    var recorder: Reference? = null

    /**
     * Who  was involved in the adverse event or the potential adverse event
     */
    var eventParticipant: Reference? = null

    /**
     * Description of the adverse event
     */
    var description: String? = null

    val suspectEntity: List<AdverseEventSuspectEntity> = mutableListOf<AdverseEventSuspectEntity>()

    val subjectMedicalHistory: List<Reference> = mutableListOf<Reference>()

    val referenceDocument: List<Reference> = mutableListOf<Reference>()

    val study: List<Reference> = mutableListOf<Reference>()
}

/**
 * The suspected agent causing the adverse event
 *
 * Describes the entity that is suspected to have caused the adverse event.
 */
open class AdverseEventSuspectEntity() : BackboneElement() {
    /**
     * Refers to the specific entity that caused the adverse event
     */
    var instance: Reference = Reference()

    /**
     * causality1 | causality2
     */
    var causality: String? = null

    /**
     * assess1 | assess2
     */
    var causalityAssessment: CodeableConcept? = null

    /**
     * AdverseEvent.suspectEntity.causalityProductRelatedness
     */
    var causalityProductRelatedness: String? = null

    /**
     * method1 | method2
     */
    var causalityMethod: CodeableConcept? = null

    /**
     * AdverseEvent.suspectEntity.causalityAuthor
     */
    var causalityAuthor: Reference? = null

    /**
     * result1 | result2
     */
    var causalityResult: CodeableConcept? = null
}
