//
//  Generated from FHIR Version 3.0.1.11917 on 2018-11-27T12:50:39.784 
//
//   2018, JuiceLab, LLC
//  
package com.juicelabs.fhir.model

import com.juicelabs.fhir.base.FhirDate
import kotlin.collections.List

/**
 * Information about patient's relatives, relevant for patient
 *
 * Significant health events and conditions for a person related to the patient relevant in the context of care for the patient.
 */
open class FamilyMemberHistory() : DomainResource() {
    val identifier: List<Identifier> = mutableListOf<Identifier>()

    val definition: List<Reference> = mutableListOf<Reference>()

    /**
     * partial | completed | entered-in-error | health-unknown
     */
    var status: String = ""

    /**
     * The taking of a family member's history did not occur
     */
    var notDone: Boolean? = null

    /**
     * subject-unknown | withheld | unable-to-obtain | deferred
     */
    var notDoneReason: CodeableConcept? = null

    /**
     * Patient history is about
     */
    var patient: Reference = Reference()

    /**
     * When history was captured/updated
     */
    var date: FhirDate? = null

    /**
     * The family member described
     */
    var name: String? = null

    /**
     * Relationship to the subject
     */
    var relationship: CodeableConcept = CodeableConcept()

    /**
     * male | female | other | unknown
     */
    var gender: String? = null

    /**
     * (approximate) date of birth
     */
    var bornPeriod: Period? = null

    /**
     * (approximate) date of birth
     */
    var bornDate: FhirDate? = null

    /**
     * (approximate) date of birth
     */
    var bornString: String? = null

    /**
     * (approximate) age
     */
    var ageAge: Age? = null

    /**
     * (approximate) age
     */
    var ageRange: Range? = null

    /**
     * (approximate) age
     */
    var ageString: String? = null

    /**
     * Age is estimated?
     */
    var estimatedAge: Boolean? = null

    /**
     * Dead? How old/when?
     */
    var deceasedBoolean: Boolean? = null

    /**
     * Dead? How old/when?
     */
    var deceasedAge: Age? = null

    /**
     * Dead? How old/when?
     */
    var deceasedRange: Range? = null

    /**
     * Dead? How old/when?
     */
    var deceasedDate: FhirDate? = null

    /**
     * Dead? How old/when?
     */
    var deceasedString: String? = null

    val reasonCode: List<CodeableConcept> = mutableListOf<CodeableConcept>()

    val reasonReference: List<Reference> = mutableListOf<Reference>()

    val note: List<Annotation> = mutableListOf<Annotation>()

    val condition: List<FamilyMemberHistoryCondition> =
            mutableListOf<FamilyMemberHistoryCondition>()
}

/**
 * Condition that the related person had
 *
 * The significant Conditions (or condition) that the family member had. This is a repeating section to allow a system to represent more than one condition per resource, though there is nothing stopping multiple resources - one per condition.
 */
open class FamilyMemberHistoryCondition() : BackboneElement() {
    /**
     * Condition suffered by relation
     */
    var code: CodeableConcept = CodeableConcept()

    /**
     * deceased | permanent disability | etc.
     */
    var outcome: CodeableConcept? = null

    /**
     * When condition first manifested
     */
    var onsetAge: Age? = null

    /**
     * When condition first manifested
     */
    var onsetRange: Range? = null

    /**
     * When condition first manifested
     */
    var onsetPeriod: Period? = null

    /**
     * When condition first manifested
     */
    var onsetString: String? = null

    val note: List<Annotation> = mutableListOf<Annotation>()
}
