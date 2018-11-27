//
//  Generated from FHIR Version 3.0.1.11917 on 2018-11-27T12:50:39.875 
//
//   2018, JuiceLab, LLC
//  
package com.juicelabs.fhir.model

import kotlin.collections.List

/**
 * Group of multiple entities
 *
 * Represents a defined collection of entities that may be discussed or acted upon collectively but which are not expected to act collectively and are not formally or legally recognized; i.e. a collection of entities that isn't an Organization.
 */
open class Group() : DomainResource() {
    val identifier: List<Identifier> = mutableListOf<Identifier>()

    /**
     * Whether this group's record is in active use
     */
    var active: Boolean? = null

    /**
     * person | animal | practitioner | device | medication | substance
     */
    var type: String = ""

    /**
     * Descriptive or actual
     */
    var actual: Boolean = false

    /**
     * Kind of Group members
     */
    var code: CodeableConcept? = null

    /**
     * Label for Group
     */
    var name: String? = null

    /**
     * Number of members
     */
    var quantity: Int? = null

    val characteristic: List<GroupCharacteristic> = mutableListOf<GroupCharacteristic>()

    val member: List<GroupMember> = mutableListOf<GroupMember>()
}

/**
 * Trait of group members
 *
 * Identifies the traits shared by members of the group.
 */
open class GroupCharacteristic() : BackboneElement() {
    /**
     * Kind of characteristic
     */
    var code: CodeableConcept = CodeableConcept()

    /**
     * Value held by characteristic
     */
    var valueCodeableConcept: CodeableConcept = CodeableConcept()

    /**
     * Value held by characteristic
     */
    var valueBoolean: Boolean = false

    /**
     * Value held by characteristic
     */
    var valueQuantity: Quantity = Quantity()

    /**
     * Value held by characteristic
     */
    var valueRange: Range = Range()

    /**
     * Group includes or excludes
     */
    var exclude: Boolean = false

    /**
     * Period over which characteristic is tested
     */
    var period: Period? = null
}

/**
 * Who or what is in group
 *
 * Identifies the resource instances that are members of the group.
 */
open class GroupMember() : BackboneElement() {
    /**
     * Reference to the group member
     */
    var entity: Reference = Reference()

    /**
     * Period member belonged to the group
     */
    var period: Period? = null

    /**
     * If member is no longer in group
     */
    var inactive: Boolean? = null
}
