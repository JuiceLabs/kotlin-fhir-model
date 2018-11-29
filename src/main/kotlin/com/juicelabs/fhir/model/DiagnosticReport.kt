//
//  Generated from FHIR Version 3.0.1.11917 on 2018-11-29T05:04:14.938 
//
//   2018, JuiceLab, LLC
//  
package com.juicelabs.fhir.model

import com.juicelabs.fhir.base.FhirDate
import kotlin.collections.List

/**
 * A Diagnostic report - a combination of request information, atomic results, images, interpretation, as well as formatted reports
 *
 * The findings and interpretation of diagnostic  tests performed on patients, groups of patients, devices, and locations, and/or specimens derived from these. The report includes clinical context such as requesting and provider information, and some mix of atomic results, images, textual and coded interpretations, and formatted representation of diagnostic reports.
 */
open class DiagnosticReport() : DomainResource() {
    val identifier: List<Identifier> = mutableListOf<Identifier>()

    val basedOn: List<Reference> = mutableListOf<Reference>()

    /**
     * registered | partial | preliminary | final +
     */
    var status: String? = null

    /**
     * Service category
     */
    var category: CodeableConcept? = null

    /**
     * Name/Code for this diagnostic report
     */
    var code: CodeableConcept = CodeableConcept()

    /**
     * The subject of the report - usually, but not always, the patient
     */
    var subject: Reference? = null

    /**
     * Health care event when test ordered
     */
    var context: Reference? = null

    /**
     * Clinically relevant time/time-period for report
     */
    var effectiveDateTime: FhirDate? = null

    /**
     * Clinically relevant time/time-period for report
     */
    var effectivePeriod: Period? = null

    /**
     * DateTime this version was released
     */
    var issued: FhirDate? = null

    val performer: List<DiagnosticReportPerformer> = mutableListOf<DiagnosticReportPerformer>()

    val specimen: List<Reference> = mutableListOf<Reference>()

    val result: List<Reference> = mutableListOf<Reference>()

    val imagingStudy: List<Reference> = mutableListOf<Reference>()

    val image: List<DiagnosticReportImage> = mutableListOf<DiagnosticReportImage>()

    /**
     * Clinical Interpretation of test results
     */
    var conclusion: String? = null

    val codedDiagnosis: List<CodeableConcept> = mutableListOf<CodeableConcept>()

    val presentedForm: List<Attachment> = mutableListOf<Attachment>()
}

/**
 * Participants in producing the report
 *
 * Indicates who or what participated in producing the report.
 */
open class DiagnosticReportPerformer() : BackboneElement() {
    /**
     * Type of performer
     */
    var role: CodeableConcept? = null

    /**
     * Practitioner or Organization  participant
     */
    var actor: Reference = Reference()
}

/**
 * Key images associated with this report
 *
 * A list of key images associated with this report. The images are generally created during the diagnostic process, and may be directly of the patient, or of treated specimens (i.e. slides of interest).
 */
open class DiagnosticReportImage() : BackboneElement() {
    /**
     * Comment about the image (e.g. explanation)
     */
    var comment: String? = null

    /**
     * Reference to the image source
     */
    var link: Reference = Reference()
}
