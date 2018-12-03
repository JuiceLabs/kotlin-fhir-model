//
//  Generated from FHIR Version 3.0.1.11917 on 2018-12-02T21:16:27.940 
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
     * Bibliographic citation for the artifact
     */
    var citation: String? = null

    /**
     * Brief description of the related artifact
     */
    var display: String? = null

    /**
     * What document is being referenced
     */
    var document: Attachment? = null

    /**
     * What resource is being referenced
     */
    var resource: Reference? = null

    /**
     * documentation | justification | citation | predecessor | successor | derived-from | depends-on | composed-of
     */
    var type: String? = null

    /**
     * Where the artifact can be accessed
     */
    var url: String? = null
}
