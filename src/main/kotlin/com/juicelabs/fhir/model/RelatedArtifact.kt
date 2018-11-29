//
//  Generated from FHIR Version 3.0.1.11917 on 2018-11-29T14:32:35.309 
//
//   2018, JuiceLab, LLC
//  
package com.juicelabs.fhir.model

/**
 * Related artifacts for a knowledge resource
 *
 * Related artifacts such as additional documentation, justification, or bibliographic references.
 */
open class RelatedArtifact() : Element() {
    /**
     * documentation | justification | citation | predecessor | successor | derived-from | depends-on | composed-of
     */
    var type: String? = null

    /**
     * Brief description of the related artifact
     */
    var display: String? = null

    /**
     * Bibliographic citation for the artifact
     */
    var citation: String? = null

    /**
     * Where the artifact can be accessed
     */
    var url: String? = null

    /**
     * What document is being referenced
     */
    var document: Attachment? = null

    /**
     * What resource is being referenced
     */
    var resource: Reference? = null
}
