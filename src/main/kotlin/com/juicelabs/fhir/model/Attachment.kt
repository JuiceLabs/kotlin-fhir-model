//
//  Generated from FHIR Version 3.0.1.11917 on 2018-11-27T12:50:39.954 
//
//   2018, JuiceLab, LLC
//  
package com.juicelabs.fhir.model

import com.juicelabs.fhir.base.FhirDate

/**
 * Content in a format defined elsewhere
 *
 * For referring to data content defined in other formats.
 */
open class Attachment() : Element() {
    /**
     * Mime type of the content, with charset etc.
     */
    var contentType: String? = null

    /**
     * Human language of the content (BCP-47)
     */
    var language: String? = null

    /**
     * Data inline, base64ed
     */
    var data: String? = null

    /**
     * Uri where the data can be found
     */
    var url: String? = null

    /**
     * Number of bytes of content (if url provided)
     */
    var size: Int? = null

    /**
     * Hash of the data (sha-1, base64ed)
     */
    var hash: String? = null

    /**
     * Label to display in place of the data
     */
    var title: String? = null

    /**
     * Date attachment was first created
     */
    var creation: FhirDate? = null
}
