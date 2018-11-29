//
//  Generated from FHIR Version 3.0.1.11917 on 2018-11-29T14:32:35.637 
//
//   2018, JuiceLab, LLC
//  
package com.juicelabs.fhir.model

import com.google.gson.annotations.SerializedName
import kotlin.collections.List

/**
 * A reference to a document
 *
 * A reference to a document.
 */
open class DocumentReference() : DomainResource() {
    /**
     * Master Version Specific Identifier
     */
    var masterIdentifier: Identifier? = null

    val identifier: List<Identifier> = mutableListOf<Identifier>()

    /**
     * current | superseded | entered-in-error
     */
    var status: String? = null

    /**
     * preliminary | final | appended | amended | entered-in-error
     */
    var docStatus: String? = null

    /**
     * Kind of document (LOINC if possible)
     */
    var type: CodeableConcept = CodeableConcept()

    /**
     * Categorization of document
     */
    @SerializedName("class")
    var class_fhir: CodeableConcept? = null

    /**
     * Who/what is the subject of the document
     */
    var subject: Reference? = null

    /**
     * Document creation time
     */
    var created: String? = null

    /**
     * When this document reference was created
     */
    var indexed: String? = null

    val author: List<Reference> = mutableListOf<Reference>()

    /**
     * Who/what authenticated the document
     */
    var authenticator: Reference? = null

    /**
     * Organization which maintains the document
     */
    var custodian: Reference? = null

    val relatesTo: List<DocumentReferenceRelatesTo> = mutableListOf<DocumentReferenceRelatesTo>()

    /**
     * Human-readable description (title)
     */
    var description: String? = null

    val securityLabel: List<CodeableConcept> = mutableListOf<CodeableConcept>()

    val content: List<DocumentReferenceContent> = mutableListOf<DocumentReferenceContent>()

    /**
     * Clinical context of document
     */
    var context: DocumentReferenceContext? = null
}

/**
 * Relationships to other documents
 *
 * Relationships that this document has with other document references that already exist.
 */
open class DocumentReferenceRelatesTo() : BackboneElement() {
    /**
     * replaces | transforms | signs | appends
     */
    var code: String? = null

    /**
     * Target of the relationship
     */
    var target: Reference = Reference()
}

/**
 * Document referenced
 *
 * The document and format referenced. There may be multiple content element repetitions, each with a different format.
 */
open class DocumentReferenceContent() : BackboneElement() {
    /**
     * Where to access the document
     */
    var attachment: Attachment = Attachment()

    /**
     * Format/content rules for the document
     */
    var format: Coding? = null
}

/**
 * Clinical context of document
 *
 * The clinical context in which the document was prepared.
 */
open class DocumentReferenceContext() : BackboneElement() {
    /**
     * Context of the document  content
     */
    var encounter: Reference? = null

    val event: List<CodeableConcept> = mutableListOf<CodeableConcept>()

    /**
     * Time of service that is being documented
     */
    var period: Period? = null

    /**
     * Kind of facility where patient was seen
     */
    var facilityType: CodeableConcept? = null

    /**
     * Additional details about where the content was created (e.g. clinical specialty)
     */
    var practiceSetting: CodeableConcept? = null

    /**
     * Patient demographics from source
     */
    var sourcePatientInfo: Reference? = null

    val related: List<DocumentReferenceContextRelated> =
            mutableListOf<DocumentReferenceContextRelated>()
}

/**
 * Related identifiers or resources
 *
 * Related identifiers or resources associated with the DocumentReference.
 */
open class DocumentReferenceContextRelated() : BackboneElement() {
    /**
     * Identifier of related objects or events
     */
    var identifier: Identifier? = null

    /**
     * Related Resource
     */
    var ref: Reference? = null
}
