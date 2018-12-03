//
//  Generated from FHIR Version 3.0.1.11917 on 2018-12-02T21:16:28.174 
//
//   2018, JuiceLab, LLC
//  
package com.juicelabs.fhir.model

import kotlin.collections.List

/**
 * Specific and identified anatomical location
 *
 * Record details about the anatomical location of a specimen or body part.  This resource may be used when a coded concept does not provide the necessary detail needed for the use case.
 */
open class BodySite() : DomainResource() {
    /**
     * Whether this body site record is in active use
     */
    var active: Boolean? = null

    /**
     * Named anatomical location
     */
    var code: CodeableConcept? = null

    /**
     * Anatomical location description
     */
    var description: String? = null

    val identifier: List<Identifier> = mutableListOf<Identifier>()

    val image: List<Attachment> = mutableListOf<Attachment>()

    /**
     * Who this is about
     */
    var patient: Reference = Reference()

    val qualifier: List<CodeableConcept> = mutableListOf<CodeableConcept>()
}
