//
//  Generated from FHIR Version 3.0.1.11917 on 2018-11-29T05:04:14.912 
//
//   2018, JuiceLab, LLC
//  
package com.juicelabs.fhir.model

import com.juicelabs.fhir.base.FhirDate
import kotlin.collections.List

/**
 * Allergy or Intolerance (generally: Risk of adverse reaction to a substance)
 *
 * Risk of harmful or undesirable, physiological response which is unique to an individual and associated with exposure to a substance.
 */
open class AllergyIntolerance() : DomainResource() {
    val identifier: List<Identifier> = mutableListOf<Identifier>()

    /**
     * active | inactive | resolved
     */
    var clinicalStatus: String? = null

    /**
     * unconfirmed | confirmed | refuted | entered-in-error
     */
    var verificationStatus: String? = null

    /**
     * allergy | intolerance - Underlying mechanism (if known)
     */
    var type: String? = null

    val category: List<String> = mutableListOf<String>()

    /**
     * low | high | unable-to-assess
     */
    var criticality: String? = null

    /**
     * Code that identifies the allergy or intolerance
     */
    var code: CodeableConcept? = null

    /**
     * Who the sensitivity is for
     */
    var patient: Reference = Reference()

    /**
     * When allergy or intolerance was identified
     */
    var onsetDateTime: FhirDate? = null

    /**
     * When allergy or intolerance was identified
     */
    var onsetAge: Age? = null

    /**
     * When allergy or intolerance was identified
     */
    var onsetPeriod: Period? = null

    /**
     * When allergy or intolerance was identified
     */
    var onsetRange: Range? = null

    /**
     * When allergy or intolerance was identified
     */
    var onsetString: String? = null

    /**
     * Date record was believed accurate
     */
    var assertedDate: FhirDate? = null

    /**
     * Who recorded the sensitivity
     */
    var recorder: Reference? = null

    /**
     * Source of the information about the allergy
     */
    var asserter: Reference? = null

    /**
     * Date(/time) of last known occurrence of a reaction
     */
    var lastOccurrence: FhirDate? = null

    val note: List<Annotation> = mutableListOf<Annotation>()

    val reaction: List<AllergyIntoleranceReaction> = mutableListOf<AllergyIntoleranceReaction>()
}

/**
 * Adverse Reaction Events linked to exposure to substance
 *
 * Details about each adverse reaction event linked to exposure to the identified substance.
 */
open class AllergyIntoleranceReaction() : BackboneElement() {
    /**
     * Specific substance or pharmaceutical product considered to be responsible for event
     */
    var substance: CodeableConcept? = null

    val manifestation: List<CodeableConcept> = mutableListOf<CodeableConcept>()

    /**
     * Description of the event as a whole
     */
    var description: String? = null

    /**
     * Date(/time) when manifestations showed
     */
    var onset: FhirDate? = null

    /**
     * mild | moderate | severe (of event as a whole)
     */
    var severity: String? = null

    /**
     * How the subject was exposed to the substance
     */
    var exposureRoute: CodeableConcept? = null

    val note: List<Annotation> = mutableListOf<Annotation>()
}
