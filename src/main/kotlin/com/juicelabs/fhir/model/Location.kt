//
//  Generated from FHIR Version 3.0.1.11917 on 2018-11-29T05:04:15.158 
//
//   2018, JuiceLab, LLC
//  
package com.juicelabs.fhir.model

import kotlin.collections.List

/**
 * Details and position information for a physical place
 *
 * Details and position information for a physical place where services are provided  and resources and participants may be stored, found, contained or accommodated.
 */
open class Location() : DomainResource() {
    val identifier: List<Identifier> = mutableListOf<Identifier>()

    /**
     * active | suspended | inactive
     */
    var status: String? = null

    /**
     * The Operational status of the location (typically only for a bed/room)
     */
    var operationalStatus: Coding? = null

    /**
     * Name of the location as used by humans
     */
    var name: String? = null

    val alias: List<String> = mutableListOf<String>()

    /**
     * Additional details about the location that could be displayed as further information to identify the location beyond its name
     */
    var description: String? = null

    /**
     * instance | kind
     */
    var mode: String? = null

    /**
     * Type of function performed
     */
    var type: CodeableConcept? = null

    val telecom: List<ContactPoint> = mutableListOf<ContactPoint>()

    /**
     * Physical location
     */
    var address: Address? = null

    /**
     * Physical form of the location
     */
    var physicalType: CodeableConcept? = null

    /**
     * The absolute geographic location
     */
    var position: LocationPosition? = null

    /**
     * Organization responsible for provisioning and upkeep
     */
    var managingOrganization: Reference? = null

    /**
     * Another Location this one is physically part of
     */
    var partOf: Reference? = null

    val endpoint: List<Reference> = mutableListOf<Reference>()
}

/**
 * The absolute geographic location
 *
 * The absolute geographic location of the Location, expressed using the WGS84 datum (This is the same co-ordinate system used in KML).
 */
open class LocationPosition() : BackboneElement() {
    /**
     * Longitude with WGS84 datum
     */
    var longitude: Float? = null

    /**
     * Latitude with WGS84 datum
     */
    var latitude: Float? = null

    /**
     * Altitude with WGS84 datum
     */
    var altitude: Float? = null
}
