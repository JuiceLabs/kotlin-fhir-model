//
//  Generated from FHIR Version 3.0.1.11917 on 2018-12-01T08:36:54.963 
//
//   2018, JuiceLab, LLC
//  
package com.juicelabs.fhir.model

/**
 * Defines an expected trigger for a module
 *
 * A description of a triggering event.
 */
open class TriggerDefinition() : Element() {
    /**
     * Triggering data of the event
     */
    var eventData: DataRequirement? = null

    /**
     * Triggering event name
     */
    var eventName: String? = null

    /**
     * Timing of the event
     */
    var eventTimingDate: String? = null

    /**
     * Timing of the event
     */
    var eventTimingDateTime: String? = null

    /**
     * Timing of the event
     */
    var eventTimingReference: Reference? = null

    /**
     * Timing of the event
     */
    var eventTimingTiming: Timing? = null

    /**
     * named-event | periodic | data-added | data-modified | data-removed | data-accessed | data-access-ended
     */
    var type: String? = null
}
