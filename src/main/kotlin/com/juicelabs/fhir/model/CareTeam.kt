//
//  Generated from FHIR Version 3.0.1.11917 on 2018-11-29T05:04:14.936 
//
//   2018, JuiceLab, LLC
//  
package com.juicelabs.fhir.model

import kotlin.collections.List

/**
 * Planned participants in the coordination and delivery of care for a patient or group
 *
 * The Care Team includes all the people and organizations who plan to participate in the coordination and delivery of care for a patient.
 */
open class CareTeam() : DomainResource() {
    val identifier: List<Identifier> = mutableListOf<Identifier>()

    /**
     * proposed | active | suspended | inactive | entered-in-error
     */
    var status: String? = null

    val category: List<CodeableConcept> = mutableListOf<CodeableConcept>()

    /**
     * Name of the team, such as crisis assessment team
     */
    var name: String? = null

    /**
     * Who care team is for
     */
    var subject: Reference? = null

    /**
     * Encounter or episode associated with CareTeam
     */
    var context: Reference? = null

    /**
     * Time period team covers
     */
    var period: Period? = null

    val participant: List<CareTeamParticipant> = mutableListOf<CareTeamParticipant>()

    val reasonCode: List<CodeableConcept> = mutableListOf<CodeableConcept>()

    val reasonReference: List<Reference> = mutableListOf<Reference>()

    val managingOrganization: List<Reference> = mutableListOf<Reference>()

    val note: List<Annotation> = mutableListOf<Annotation>()
}

/**
 * Members of the team
 *
 * Identifies all people and organizations who are expected to be involved in the care team.
 */
open class CareTeamParticipant() : BackboneElement() {
    /**
     * Type of involvement
     */
    var role: CodeableConcept? = null

    /**
     * Who is involved
     */
    var member: Reference? = null

    /**
     * Organization of the practitioner
     */
    var onBehalfOf: Reference? = null

    /**
     * Time period of participant
     */
    var period: Period? = null
}
