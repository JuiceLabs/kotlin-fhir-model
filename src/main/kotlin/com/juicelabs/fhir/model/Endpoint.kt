//
//  Generated from FHIR Version 3.0.1.11917 on 2018-11-29T14:32:35.546 
//
//   2018, JuiceLab, LLC
//  
package com.juicelabs.fhir.model

import kotlin.collections.List

/**
 * The technical details of an endpoint that can be used for electronic services
 *
 * The technical details of an endpoint that can be used for electronic services, such as for web services providing XDS.b or a REST endpoint for another FHIR server. This may include any security context information.
 */
open class Endpoint() : DomainResource() {
    val identifier: List<Identifier> = mutableListOf<Identifier>()

    /**
     * active | suspended | error | off | entered-in-error | test
     */
    var status: String? = null

    /**
     * Protocol/Profile/Standard to be used with this endpoint connection
     */
    var connectionType: Coding = Coding()

    /**
     * A name that this endpoint can be identified by
     */
    var name: String? = null

    /**
     * Organization that manages this endpoint (may not be the organization that exposes the endpoint)
     */
    var managingOrganization: Reference? = null

    val contact: List<ContactPoint> = mutableListOf<ContactPoint>()

    /**
     * Interval the endpoint is expected to be operational
     */
    var period: Period? = null

    val payloadType: List<CodeableConcept> = mutableListOf<CodeableConcept>()

    val payloadMimeType: List<String> = mutableListOf<String>()

    /**
     * The technical base address for connecting to this endpoint
     */
    var address: String? = null

    val header: List<String> = mutableListOf<String>()
}
