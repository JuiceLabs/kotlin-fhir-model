//
//  Generated from FHIR Version 3.0.1.11917 on 2018-11-29T14:32:35.289 
//
//   2018, JuiceLab, LLC
//  
package com.juicelabs.fhir.model

import kotlin.collections.List

/**
 * An instance of a medical-related component of a medical device
 *
 * The characteristics, operational status and capabilities of a medical-related component of a medical device.
 */
open class DeviceComponent() : DomainResource() {
    /**
     * Instance id assigned by the software stack
     */
    var identifier: Identifier = Identifier()

    /**
     * What kind of component it is
     */
    var type: CodeableConcept = CodeableConcept()

    /**
     * Recent system change timestamp
     */
    var lastSystemChange: String? = null

    /**
     * Top-level device resource link
     */
    var source: Reference? = null

    /**
     * Parent resource link
     */
    var parent: Reference? = null

    val operationalStatus: List<CodeableConcept> = mutableListOf<CodeableConcept>()

    /**
     * Current supported parameter group
     */
    var parameterGroup: CodeableConcept? = null

    /**
     * other | chemical | electrical | impedance | nuclear | optical | thermal | biological | mechanical | acoustical | manual+
     */
    var measurementPrinciple: String? = null

    val productionSpecification: List<DeviceComponentProductionSpecification> =
            mutableListOf<DeviceComponentProductionSpecification>()

    /**
     * Language code for the human-readable text strings produced by the device
     */
    var languageCode: CodeableConcept? = null
}

/**
 * Specification details such as Component Revisions, or Serial Numbers
 *
 * The production specification such as component revision, serial number, etc.
 */
open class DeviceComponentProductionSpecification() : BackboneElement() {
    /**
     * Type or kind of production specification, for example serial number or software revision
     */
    var specType: CodeableConcept? = null

    /**
     * Internal component unique identification
     */
    var componentId: Identifier? = null

    /**
     * A printable string defining the component
     */
    var productionSpec: String? = null
}
