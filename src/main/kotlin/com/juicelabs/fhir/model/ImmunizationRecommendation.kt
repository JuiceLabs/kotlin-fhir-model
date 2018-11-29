//
//  Generated from FHIR Version 3.0.1.11917 on 2018-11-29T05:04:15.100 
//
//   2018, JuiceLab, LLC
//  
package com.juicelabs.fhir.model

import com.juicelabs.fhir.base.FhirDate
import kotlin.collections.List

/**
 * Guidance or advice relating to an immunization
 *
 * A patient's point-in-time immunization and recommendation (i.e. forecasting a patient's immunization eligibility according to a published schedule) with optional supporting justification.
 */
open class ImmunizationRecommendation() : DomainResource() {
    val identifier: List<Identifier> = mutableListOf<Identifier>()

    /**
     * Who this profile is for
     */
    var patient: Reference = Reference()

    val recommendation: List<ImmunizationRecommendationRecommendation> =
            mutableListOf<ImmunizationRecommendationRecommendation>()
}

/**
 * Vaccine administration recommendations
 *
 * Vaccine administration recommendations.
 */
open class ImmunizationRecommendationRecommendation() : BackboneElement() {
    /**
     * Date recommendation created
     */
    var date: FhirDate? = null

    /**
     * Vaccine recommendation applies to
     */
    var vaccineCode: CodeableConcept? = null

    /**
     * Disease to be immunized against
     */
    var targetDisease: CodeableConcept? = null

    /**
     * Recommended dose number
     */
    var doseNumber: Int? = null

    /**
     * Vaccine administration status
     */
    var forecastStatus: CodeableConcept = CodeableConcept()

    val dateCriterion: List<ImmunizationRecommendationRecommendationDateCriterion> =
            mutableListOf<ImmunizationRecommendationRecommendationDateCriterion>()

    /**
     * Protocol used by recommendation
     */
    var protocol: ImmunizationRecommendationRecommendationProtocol? = null

    val supportingImmunization: List<Reference> = mutableListOf<Reference>()

    val supportingPatientInformation: List<Reference> = mutableListOf<Reference>()
}

/**
 * Dates governing proposed immunization
 *
 * Vaccine date recommendations.  For example, earliest date to administer, latest date to administer, etc.
 */
open class ImmunizationRecommendationRecommendationDateCriterion() : BackboneElement() {
    /**
     * Type of date
     */
    var code: CodeableConcept = CodeableConcept()

    /**
     * Recommended date
     */
    var value: FhirDate? = null
}

/**
 * Protocol used by recommendation
 *
 * Contains information about the protocol under which the vaccine was administered.
 */
open class ImmunizationRecommendationRecommendationProtocol() : BackboneElement() {
    /**
     * Dose number within sequence
     */
    var doseSequence: Int? = null

    /**
     * Protocol details
     */
    var description: String? = null

    /**
     * Who is responsible for protocol
     */
    var authority: Reference? = null

    /**
     * Name of vaccination series
     */
    var series: String? = null
}
