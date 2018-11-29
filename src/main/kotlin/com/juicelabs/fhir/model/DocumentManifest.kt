//
//  Generated from FHIR Version 3.0.1.11917 on 2018-11-29T05:04:15.056 
//
//   2018, JuiceLab, LLC
//  
package com.juicelabs.fhir.model

import com.juicelabs.fhir.base.FhirDate
import kotlin.collections.List

/**
 * A list that defines a set of documents
 *
 * A collection of documents compiled for a purpose together with metadata that applies to the collection.
 */
open class DocumentManifest() : DomainResource() {
    /**
     * Unique Identifier for the set of documents
     */
    var masterIdentifier: Identifier? = null

    val identifier: List<Identifier> = mutableListOf<Identifier>()

    /**
     * current | superseded | entered-in-error
     */
    var status: String? = null

    /**
     * Kind of document set
     */
    var type: CodeableConcept? = null

    /**
     * The subject of the set of documents
     */
    var subject: Reference? = null

    /**
     * When this document manifest created
     */
    var created: FhirDate? = null

    val author: List<Reference> = mutableListOf<Reference>()

    val recipient: List<Reference> = mutableListOf<Reference>()

    /**
     * The source system/application/software
     */
    var source: String? = null

    /**
     * Human-readable description (title)
     */
    var description: String? = null

    val content: List<DocumentManifestContent> = mutableListOf<DocumentManifestContent>()

    val related: List<DocumentManifestRelated> = mutableListOf<DocumentManifestRelated>()
}

/**
 * The items included
 *
 * The list of Documents included in the manifest.
 */
open class DocumentManifestContent() : BackboneElement() {
    /**
     * Contents of this set of documents
     */
    var pAttachment: Attachment = Attachment()

    /**
     * Contents of this set of documents
     */
    var pReference: Reference = Reference()
}

/**
 * Related things
 *
 * Related identifiers or resources associated with the DocumentManifest.
 */
open class DocumentManifestRelated() : BackboneElement() {
    /**
     * Identifiers of things that are related
     */
    var identifier: Identifier? = null

    /**
     * Related Resource
     */
    var ref: Reference? = null
}
