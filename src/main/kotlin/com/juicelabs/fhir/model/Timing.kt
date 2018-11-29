//
//  Generated from FHIR Version 3.0.1.11917 on 2018-11-29T05:04:15.019 
//
//   2018, JuiceLab, LLC
//  
package com.juicelabs.fhir.model

import com.google.gson.annotations.SerializedName
import com.juicelabs.fhir.base.FhirDate
import kotlin.collections.List

/**
 * A timing schedule that specifies an event that may occur multiple times
 *
 * Specifies an event that may occur multiple times. Timing schedules are used to record when things are planned, expected or requested to occur. The most common usage is in dosage instructions for medications. They are also used when planning care of various kinds, and may be used for reporting the schedule to which past regular activities were carried out.
 */
open class Timing() : Element() {
    val event: List<FhirDate> = mutableListOf<FhirDate>()

    /**
     * When the event is to occur
     */
    var repeat: TimingRepeat? = null

    /**
     * BID | TID | QID | AM | PM | QD | QOD | Q4H | Q6H +
     */
    var code: CodeableConcept? = null
}

/**
 * When the event is to occur
 *
 * A set of rules that describe when the event is scheduled.
 */
open class TimingRepeat() : Element() {
    /**
     * Length/Range of lengths, or (Start and/or end) limits
     */
    var boundsDuration: Duration? = null

    /**
     * Length/Range of lengths, or (Start and/or end) limits
     */
    var boundsRange: Range? = null

    /**
     * Length/Range of lengths, or (Start and/or end) limits
     */
    var boundsPeriod: Period? = null

    /**
     * Number of times to repeat
     */
    var count: Int? = null

    /**
     * Maximum number of times to repeat
     */
    var countMax: Int? = null

    /**
     * How long when it happens
     */
    var duration: Float? = null

    /**
     * How long when it happens (Max)
     */
    var durationMax: Float? = null

    /**
     * s | min | h | d | wk | mo | a - unit of time (UCUM)
     */
    var durationUnit: String? = null

    /**
     * Event occurs frequency times per period
     */
    var frequency: Int? = null

    /**
     * Event occurs up to frequencyMax times per period
     */
    var frequencyMax: Int? = null

    /**
     * Event occurs frequency times per period
     */
    var period: Float? = null

    /**
     * Upper limit of period (3-4 hours)
     */
    var periodMax: Float? = null

    /**
     * s | min | h | d | wk | mo | a - unit of time (UCUM)
     */
    var periodUnit: String? = null

    val dayOfWeek: List<String> = mutableListOf<String>()

    val timeOfDay: List<FhirDate> = mutableListOf<FhirDate>()

    @SerializedName("when")
    val when_fhir: List<String> = mutableListOf<String>()

    /**
     * Minutes from event (before or after)
     */
    var offset: Int? = null
}
