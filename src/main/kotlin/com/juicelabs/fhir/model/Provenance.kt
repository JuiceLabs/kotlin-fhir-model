//
//  Generated from FHIR Version 3.0.1.11917 on 2018-11-27T12:50:39.952 
//
//   2018, JuiceLab, LLC
//  
package com.juicelabs.fhir.model

import com.juicelabs.fhir.base.FhirDate
import kotlin.collections.List

/**
 * Who, What, When for a set of resources
 *
 * Provenance of a resource is a record that describes entities and processes involved in producing and delivering or otherwise influencing that resource. Provenance provides a critical foundation for assessing authenticity, enabling trust, and allowing reproducibility. Provenance assertions are a form of contextual metadata and can themselves become important records with their own provenance. Provenance statement indicates clinical significance in terms of confidence in authenticity, reliability, and trustworthiness, integrity, and stage in lifecycle (e.g. Document Completion - has the artifact been legally authenticated), all of which may impact security, privacy, and trust policies.
 */
open class Provenance() : DomainResource() {
    val target: List<Reference> = mutableListOf<Reference>()

    /**
     * When the activity occurred
     */
    var period: Period? = null

    /**
     * When the activity was recorded / updated
     */
    var recorded: FhirDate = FhirDate.now()

    val policy: List<String> = mutableListOf<String>()

    /**
     * Where the activity occurred, if relevant
     */
    var location: Reference? = null

    val reason: List<Coding> = mutableListOf<Coding>()

    /**
     * Activity that occurred
     */
    var activity: Coding? = null

    val agent: List<ProvenanceAgent> = mutableListOf<ProvenanceAgent>()

    val entity: List<ProvenanceEntity> = mutableListOf<ProvenanceEntity>()

    val signature: List<Signature> = mutableListOf<Signature>()
}

/**
 * Actor involved
 *
 * An actor taking a role in an activity  for which it can be assigned some degree of responsibility for the activity taking place.
 */
open class ProvenanceAgent() : BackboneElement() {
    val role: List<CodeableConcept> = mutableListOf<CodeableConcept>()

    /**
     * Who participated
     */
    var whoUri: String = ""

    /**
     * Who participated
     */
    var whoReference: Reference = Reference()

    /**
     * Who the agent is representing
     */
    var onBehalfOfUri: String? = null

    /**
     * Who the agent is representing
     */
    var onBehalfOfReference: Reference? = null

    /**
     * Type of relationship between agents
     */
    var relatedAgentType: CodeableConcept? = null
}

/**
 * An entity used in this activity
 *
 * An entity used in this activity.
 */
open class ProvenanceEntity() : BackboneElement() {
    /**
     * derivation | revision | quotation | source | removal
     */
    var role: String = ""

    /**
     * Identity of entity
     */
    var whatUri: String = ""

    /**
     * Identity of entity
     */
    var whatReference: Reference = Reference()

    /**
     * Identity of entity
     */
    var whatIdentifier: Identifier = Identifier()

    val agent: List<ProvenanceAgent> = mutableListOf<ProvenanceAgent>()
}
