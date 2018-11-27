//
//  Generated from FHIR Version 3.0.1.11917 on 2018-11-27T12:50:39.831 
//
//   2018, JuiceLab, LLC
//  
package com.juicelabs.fhir.model

import kotlin.collections.List

/**
 * Investigation to increase healthcare-related patient-independent knowledge
 *
 * A process where a researcher or organization plans and then executes a series of steps intended to increase the field of healthcare-related knowledge.  This includes studies of safety, efficacy, comparative effectiveness and other information about medications, devices, therapies and other interventional and investigative techniques.  A ResearchStudy involves the gathering of information about human or animal subjects.
 */
open class ResearchStudy() : DomainResource() {
    val identifier: List<Identifier> = mutableListOf<Identifier>()

    /**
     * Name for this study
     */
    var title: String? = null

    val protocol: List<Reference> = mutableListOf<Reference>()

    val partOf: List<Reference> = mutableListOf<Reference>()

    /**
     * draft | in-progress | suspended | stopped | completed | entered-in-error
     */
    var status: String = ""

    val category: List<CodeableConcept> = mutableListOf<CodeableConcept>()

    val focus: List<CodeableConcept> = mutableListOf<CodeableConcept>()

    val contact: List<ContactDetail> = mutableListOf<ContactDetail>()

    val relatedArtifact: List<RelatedArtifact> = mutableListOf<RelatedArtifact>()

    val keyword: List<CodeableConcept> = mutableListOf<CodeableConcept>()

    val jurisdiction: List<CodeableConcept> = mutableListOf<CodeableConcept>()

    /**
     * What this is study doing
     */
    var description: String? = null

    val enrollment: List<Reference> = mutableListOf<Reference>()

    /**
     * When the study began and ended
     */
    var period: Period? = null

    /**
     * Organization responsible for the study
     */
    var sponsor: Reference? = null

    /**
     * The individual responsible for the study
     */
    var principalInvestigator: Reference? = null

    val site: List<Reference> = mutableListOf<Reference>()

    /**
     * Reason for terminating study early
     */
    var reasonStopped: CodeableConcept? = null

    val note: List<Annotation> = mutableListOf<Annotation>()

    val arm: List<ResearchStudyArm> = mutableListOf<ResearchStudyArm>()
}

/**
 * Defined path through the study for a subject
 *
 * Describes an expected sequence of events for one of the participants of a study.  E.g. Exposure to drug A, wash-out, exposure to drug B, wash-out, follow-up.
 */
open class ResearchStudyArm() : BackboneElement() {
    /**
     * Label for study arm
     */
    var name: String = ""

    /**
     * Categorization of study arm
     */
    var code: CodeableConcept? = null

    /**
     * Short explanation of study path
     */
    var description: String? = null
}
