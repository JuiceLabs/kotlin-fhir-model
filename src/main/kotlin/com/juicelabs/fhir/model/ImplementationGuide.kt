//
//  Generated from FHIR Version 3.0.1.11917 on 2018-11-29T05:04:14.991 
//
//   2018, JuiceLab, LLC
//  
package com.juicelabs.fhir.model

import com.google.gson.annotations.SerializedName
import com.juicelabs.fhir.base.FhirDate
import kotlin.collections.List

/**
 * A set of rules about how FHIR is used
 *
 * A set of rules of how FHIR is used to solve a particular problem. This resource is used to gather all the parts of an implementation guide into a logical whole and to publish a computable definition of all the parts.
 */
open class ImplementationGuide() : DomainResource() {
    /**
     * Logical URI to reference this implementation guide (globally unique)
     */
    var url: String? = null

    /**
     * Business version of the implementation guide
     */
    var version: String? = null

    /**
     * Name for this implementation guide (computer friendly)
     */
    var name: String? = null

    /**
     * draft | active | retired | unknown
     */
    var status: String? = null

    /**
     * For testing purposes, not real usage
     */
    var experimental: Boolean? = null

    /**
     * Date this was last changed
     */
    var date: FhirDate? = null

    /**
     * Name of the publisher (organization or individual)
     */
    var publisher: String? = null

    val contact: List<ContactDetail> = mutableListOf<ContactDetail>()

    /**
     * Natural language description of the implementation guide
     */
    var description: String? = null

    val useContext: List<UsageContext> = mutableListOf<UsageContext>()

    val jurisdiction: List<CodeableConcept> = mutableListOf<CodeableConcept>()

    /**
     * Use and/or publishing restrictions
     */
    var copyright: String? = null

    /**
     * FHIR Version this Implementation Guide targets
     */
    var fhirVersion: String? = null

    val dependency: List<ImplementationGuideDependency> =
            mutableListOf<ImplementationGuideDependency>()

    @SerializedName("package")
    val package_fhir: List<ImplementationGuidePackage> = mutableListOf<ImplementationGuidePackage>()

    @SerializedName("global")
    val global_fhir: List<ImplementationGuideGlobal> = mutableListOf<ImplementationGuideGlobal>()

    val binary: List<String> = mutableListOf<String>()

    /**
     * Page/Section in the Guide
     */
    var page: ImplementationGuidePage? = null
}

/**
 * Another Implementation guide this depends on
 *
 * Another implementation guide that this implementation depends on. Typically, an implementation guide uses value sets, profiles etc.defined in other implementation guides.
 */
open class ImplementationGuideDependency() : BackboneElement() {
    /**
     * reference | inclusion
     */
    var type: String? = null

    /**
     * Where to find dependency
     */
    var uri: String? = null
}

/**
 * Group of resources as used in .page.package
 *
 * A logical group of resources. Logical groups can be used when building pages.
 */
open class ImplementationGuidePackage() : BackboneElement() {
    /**
     * Name used .page.package
     */
    var name: String? = null

    /**
     * Human readable text describing the package
     */
    var description: String? = null

    val resource: List<ImplementationGuidePackageResource> =
            mutableListOf<ImplementationGuidePackageResource>()
}

/**
 * Resource in the implementation guide
 *
 * A resource that is part of the implementation guide. Conformance resources (value set, structure definition, capability statements etc.) are obvious candidates for inclusion, but any kind of resource can be included as an example resource.
 */
open class ImplementationGuidePackageResource() : BackboneElement() {
    /**
     * If not an example, has its normal meaning
     */
    var example: Boolean? = null

    /**
     * Human Name for the resource
     */
    var name: String? = null

    /**
     * Reason why included in guide
     */
    var description: String? = null

    /**
     * Short code to identify the resource
     */
    var acronym: String? = null

    /**
     * Location of the resource
     */
    var sourceUri: String? = null

    /**
     * Location of the resource
     */
    var sourceReference: Reference = Reference()

    /**
     * Resource this is an example of (if applicable)
     */
    var exampleFor: Reference? = null
}

/**
 * Profiles that apply globally
 *
 * A set of profiles that all resources covered by this implementation guide must conform to.
 */
open class ImplementationGuideGlobal() : BackboneElement() {
    /**
     * Type this profiles applies to
     */
    var type: String? = null

    /**
     * Profile that all resources must conform to
     */
    var profile: Reference = Reference()
}

/**
 * Page/Section in the Guide
 *
 * A page / section in the implementation guide. The root page is the implementation guide home page.
 */
open class ImplementationGuidePage() : BackboneElement() {
    /**
     * Where to find that page
     */
    var source: String? = null

    /**
     * Short title shown for navigational assistance
     */
    var title: String? = null

    /**
     * page | example | list | include | directory | dictionary | toc | resource
     */
    var kind: String? = null

    val type: List<String> = mutableListOf<String>()

    @SerializedName("package")
    val package_fhir: List<String> = mutableListOf<String>()

    /**
     * Format of the page (e.g. html, markdown, etc.)
     */
    var format: String? = null

    val page: List<ImplementationGuidePage> = mutableListOf<ImplementationGuidePage>()
}
