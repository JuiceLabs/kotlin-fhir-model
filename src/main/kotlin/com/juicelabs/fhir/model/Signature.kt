//
//  Generated from FHIR Version 3.0.1.11917 on 2018-11-29T05:04:14.795 
//
//   2018, JuiceLab, LLC
//  
package com.juicelabs.fhir.model

import com.google.gson.annotations.SerializedName
import com.juicelabs.fhir.base.FhirDate
import kotlin.collections.List

/**
 * A digital Signature - XML DigSig, JWT, Graphical image of signature, etc.
 *
 * A digital signature along with supporting context. The signature may be electronic/cryptographic in nature, or a graphical image representing a hand-written signature, or a signature process. Different signature approaches have different utilities.
 */
open class Signature() : Element() {
    val type: List<Coding> = mutableListOf<Coding>()

    /**
     * When the signature was created
     */
    @SerializedName("when")
    var when_fhir: FhirDate? = null

    /**
     * Who signed
     */
    var whoUri: String? = null

    /**
     * Who signed
     */
    var whoReference: Reference = Reference()

    /**
     * The party represented
     */
    var onBehalfOfUri: String? = null

    /**
     * The party represented
     */
    var onBehalfOfReference: Reference? = null

    /**
     * The technical format of the signature
     */
    var contentType: String? = null

    /**
     * The actual signature content (XML DigSig. JWT, picture, etc.)
     */
    var blob: String? = null
}
