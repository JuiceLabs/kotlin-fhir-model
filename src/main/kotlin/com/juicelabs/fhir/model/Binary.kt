//
//  Generated from FHIR Version 3.0.1.11917 on 2018-11-27T12:50:39.667 
//
//   2018, JuiceLab, LLC
//  
package com.juicelabs.fhir.model

/**
 * Pure binary content defined by a format other than FHIR
 *
 * A binary resource can contain any content, whether text, image, pdf, zip archive, etc.
 */
open class Binary() : Resource() {
    /**
     * MimeType of the binary content
     */
    var contentType: String = ""

    /**
     * Access Control Management
     */
    var securityContext: Reference? = null

    /**
     * The actual content
     */
    var content: String = ""
}
