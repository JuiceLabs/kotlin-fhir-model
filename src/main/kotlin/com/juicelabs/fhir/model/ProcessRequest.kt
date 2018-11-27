//
//  Generated from FHIR Version 3.0.1.11917 on 2018-11-27T12:50:39.738 
//
//   2018, JuiceLab, LLC
//  
package com.juicelabs.fhir.model

import com.juicelabs.fhir.base.FhirDate
import kotlin.collections.List

/**
 * Request to perform some action on or in regards to an existing resource
 *
 * This resource provides the target, request and response, and action details for an action to be performed by the target on or about existing resources.
 */
open class ProcessRequest() : DomainResource() {
    val identifier: List<Identifier> = mutableListOf<Identifier>()

    /**
     * active | cancelled | draft | entered-in-error
     */
    var status: String? = null

    /**
     * cancel | poll | reprocess | status
     */
    var action: String? = null

    /**
     * Party which is the target of the request
     */
    var target: Reference? = null

    /**
     * Creation date
     */
    var created: FhirDate? = null

    /**
     * Responsible practitioner
     */
    var provider: Reference? = null

    /**
     * Responsible organization
     */
    var organization: Reference? = null

    /**
     * Reference to the Request resource
     */
    var request: Reference? = null

    /**
     * Reference to the Response resource
     */
    var response: Reference? = null

    /**
     * Remove history
     */
    var nullify: Boolean? = null

    /**
     * Reference number/string
     */
    var reference: String? = null

    val item: List<ProcessRequestItem> = mutableListOf<ProcessRequestItem>()

    val include: List<String> = mutableListOf<String>()

    val exclude: List<String> = mutableListOf<String>()

    /**
     * Selection period
     */
    var period: Period? = null
}

/**
 * Items to re-adjudicate
 *
 * List of top level items to be re-adjudicated, if none specified then the entire submission is re-adjudicated.
 */
open class ProcessRequestItem() : BackboneElement() {
    /**
     * Service instance
     */
    var sequenceLinkId: Int = 0
}
