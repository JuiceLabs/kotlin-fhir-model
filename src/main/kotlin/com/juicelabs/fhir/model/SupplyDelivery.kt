//
//  Generated from FHIR Version 3.0.1.11917 on 2018-11-27T12:50:39.790 
//
//   2018, JuiceLab, LLC
//  
package com.juicelabs.fhir.model

import com.juicelabs.fhir.base.FhirDate
import kotlin.collections.List

/**
 * Delivery of bulk Supplies
 *
 * Record of delivery of what is supplied.
 */
open class SupplyDelivery() : DomainResource() {
    /**
     * External identifier
     */
    var identifier: Identifier? = null

    val basedOn: List<Reference> = mutableListOf<Reference>()

    val partOf: List<Reference> = mutableListOf<Reference>()

    /**
     * in-progress | completed | abandoned | entered-in-error
     */
    var status: String? = null

    /**
     * Patient for whom the item is supplied
     */
    var patient: Reference? = null

    /**
     * Category of dispense event
     */
    var type: CodeableConcept? = null

    /**
     * The item that is delivered or supplied
     */
    var suppliedItem: SupplyDeliverySuppliedItem? = null

    /**
     * When event occurred
     */
    var occurrenceDateTime: FhirDate? = null

    /**
     * When event occurred
     */
    var occurrencePeriod: Period? = null

    /**
     * When event occurred
     */
    var occurrenceTiming: Timing? = null

    /**
     * Dispenser
     */
    var supplier: Reference? = null

    /**
     * Where the Supply was sent
     */
    var destination: Reference? = null

    val receiver: List<Reference> = mutableListOf<Reference>()
}

/**
 * The item that is delivered or supplied
 *
 * The item that is being delivered or has been supplied.
 */
open class SupplyDeliverySuppliedItem() : BackboneElement() {
    /**
     * Amount dispensed
     */
    var quantity: Quantity? = null

    /**
     * Medication, Substance, or Device supplied
     */
    var itemCodeableConcept: CodeableConcept? = null

    /**
     * Medication, Substance, or Device supplied
     */
    var itemReference: Reference? = null
}
