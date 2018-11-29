//
//  Generated from FHIR Version 3.0.1.11917 on 2018-11-29T05:04:14.748 
//
//   2018, JuiceLab, LLC
//  
package com.juicelabs.fhir.model

import com.juicelabs.fhir.base.FhirDate
import kotlin.collections.List

/**
 * Item used in healthcare
 *
 * This resource identifies an instance or a type of a manufactured item that is used in the provision of healthcare without being substantially changed through that activity. The device may be a medical or non-medical device.  Medical devices include durable (reusable) medical equipment, implantable devices, as well as disposable equipment used for diagnostic, treatment, and research for healthcare and public health.  Non-medical devices may include items such as a machine, cellphone, computer, application, etc.
 */
open class Device() : DomainResource() {
    val identifier: List<Identifier> = mutableListOf<Identifier>()

    /**
     * Unique Device Identifier (UDI) Barcode string
     */
    var udi: DeviceUdi? = null

    /**
     * active | inactive | entered-in-error | unknown
     */
    var status: String? = null

    /**
     * What kind of device this is
     */
    var type: CodeableConcept? = null

    /**
     * Lot number of manufacture
     */
    var lotNumber: String? = null

    /**
     * Name of device manufacturer
     */
    var manufacturer: String? = null

    /**
     * Date when the device was made
     */
    var manufactureDate: FhirDate? = null

    /**
     * Date and time of expiry of this device (if applicable)
     */
    var expirationDate: FhirDate? = null

    /**
     * Model id assigned by the manufacturer
     */
    var model: String? = null

    /**
     * Version number (i.e. software)
     */
    var version: String? = null

    /**
     * Patient to whom Device is affixed
     */
    var patient: Reference? = null

    /**
     * Organization responsible for device
     */
    var owner: Reference? = null

    val contact: List<ContactPoint> = mutableListOf<ContactPoint>()

    /**
     * Where the resource is found
     */
    var location: Reference? = null

    /**
     * Network address to contact device
     */
    var url: String? = null

    val note: List<Annotation> = mutableListOf<Annotation>()

    val safety: List<CodeableConcept> = mutableListOf<CodeableConcept>()
}

/**
 * Unique Device Identifier (UDI) Barcode string
 *
 * [Unique device identifier (UDI)](device.html#5.11.3.2.2) assigned to device label or package.
 */
open class DeviceUdi() : BackboneElement() {
    /**
     * Mandatory fixed portion of UDI
     */
    var deviceIdentifier: String? = null

    /**
     * Device Name as appears on UDI label
     */
    var name: String? = null

    /**
     * Regional UDI authority
     */
    var jurisdiction: String? = null

    /**
     * UDI Human Readable Barcode String
     */
    var carrierHRF: String? = null

    /**
     * UDI Machine Readable Barcode String
     */
    var carrierAIDC: String? = null

    /**
     * UDI Issuing Organization
     */
    var issuer: String? = null

    /**
     * barcode | rfid | manual +
     */
    var entryType: String? = null
}
