//
//  Generated from FHIR Version 3.0.1.11917 on 2018-11-27T12:50:39.811 
//
//   2018, JuiceLab, LLC
//  
package com.juicelabs.fhir.model

import com.juicelabs.fhir.base.FhirDate

/**
 * Text node with attribution
 *
 * A  text note which also  contains information about who made the statement and when.
 */
open class Annotation() : Element() {
    /**
     * Individual responsible for the annotation
     */
    var authorReference: Reference? = null

    /**
     * Individual responsible for the annotation
     */
    var authorString: String? = null

    /**
     * When the annotation was made
     */
    var time: FhirDate? = null

    /**
     * The annotation  - text content
     */
    var text: String = ""
}
