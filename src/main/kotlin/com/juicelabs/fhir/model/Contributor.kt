//
//  Generated from FHIR Version 3.0.1.11917 on 2018-11-29T14:32:35.781 
//
//   2018, JuiceLab, LLC
//  
package com.juicelabs.fhir.model

import kotlin.collections.List

/**
 * Contributor information
 *
 * A contributor to the content of a knowledge asset, including authors, editors, reviewers, and endorsers.
 */
open class Contributor() : Element() {
    /**
     * author | editor | reviewer | endorser
     */
    var type: String? = null

    /**
     * Who contributed the content
     */
    var name: String? = null

    val contact: List<ContactDetail> = mutableListOf<ContactDetail>()
}
