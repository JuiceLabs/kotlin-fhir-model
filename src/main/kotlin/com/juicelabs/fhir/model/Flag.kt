//
//  Generated from FHIR Version 3.0.1.11917 on 2018-12-02T21:16:28.082 
//
//   2018, JuiceLab, LLC
//  
package com.juicelabs.fhir.model

import kotlin.collections.List

/**
 * Key information to flag to healthcare providers
 *
 * Prospective warnings of potential issues when providing care to the patient.
 */
open class Flag() : DomainResource() {
    /**
     * Flag creator
     */
    var author: Reference? = null

    /**
     * Clinical, administrative, etc.
     */
    var category: CodeableConcept? = null

    /**
     * Coded or textual message to display to user
     */
    var code: CodeableConcept = CodeableConcept()

    /**
     * Alert relevant during encounter
     */
    var encounter: Reference? = null

    val identifier: List<Identifier> = mutableListOf<Identifier>()

    /**
     * Time period when flag is active
     */
    var period: Period? = null

    /**
     * active | inactive | entered-in-error
     */
    var status: String? = null

    /**
     * Who/What is flag about?
     */
    var subject: Reference = Reference()
}
