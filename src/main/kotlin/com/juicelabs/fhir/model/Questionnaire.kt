//
//  Generated from FHIR Version 3.0.1.11917 on 2018-11-29T05:04:15.086 
//
//   2018, JuiceLab, LLC
//  
package com.juicelabs.fhir.model

import com.juicelabs.fhir.base.FhirDate
import kotlin.collections.List

/**
 * A structured set of questions
 *
 * A structured set of questions intended to guide the collection of answers from end-users. Questionnaires provide detailed control over order, presentation, phraseology and grouping to allow coherent, consistent data collection.
 */
open class Questionnaire() : DomainResource() {
    /**
     * Logical URI to reference this questionnaire (globally unique)
     */
    var url: String? = null

    val identifier: List<Identifier> = mutableListOf<Identifier>()

    /**
     * Business version of the questionnaire
     */
    var version: String? = null

    /**
     * Name for this questionnaire (computer friendly)
     */
    var name: String? = null

    /**
     * Name for this questionnaire (human friendly)
     */
    var title: String? = null

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

    /**
     * Natural language description of the questionnaire
     */
    var description: String? = null

    /**
     * Why this questionnaire is defined
     */
    var purpose: String? = null

    /**
     * When the questionnaire was approved by publisher
     */
    var approvalDate: FhirDate? = null

    /**
     * When the questionnaire was last reviewed
     */
    var lastReviewDate: FhirDate? = null

    /**
     * When the questionnaire is expected to be used
     */
    var effectivePeriod: Period? = null

    val useContext: List<UsageContext> = mutableListOf<UsageContext>()

    val jurisdiction: List<CodeableConcept> = mutableListOf<CodeableConcept>()

    val contact: List<ContactDetail> = mutableListOf<ContactDetail>()

    /**
     * Use and/or publishing restrictions
     */
    var copyright: String? = null

    val code: List<Coding> = mutableListOf<Coding>()

    val subjectType: List<String> = mutableListOf<String>()

    val item: List<QuestionnaireItem> = mutableListOf<QuestionnaireItem>()
}

/**
 * Questions and sections within the Questionnaire
 *
 * A particular question, question grouping or display text that is part of the questionnaire.
 */
open class QuestionnaireItem() : BackboneElement() {
    /**
     * Unique id for item in questionnaire
     */
    var linkId: String? = null

    /**
     * ElementDefinition - details for the item
     */
    var definition: String? = null

    val code: List<Coding> = mutableListOf<Coding>()

    /**
     * E.g. "1(a)", "2.5.3"
     */
    var prefix: String? = null

    /**
     * Primary text for the item
     */
    var text: String? = null

    /**
     * group | display | boolean | decimal | integer | date | dateTime +
     */
    var type: String? = null

    val enableWhen: List<QuestionnaireItemEnableWhen> = mutableListOf<QuestionnaireItemEnableWhen>()

    /**
     * Whether the item must be included in data results
     */
    var required: Boolean? = null

    /**
     * Whether the item may repeat
     */
    var repeats: Boolean? = null

    /**
     * Don't allow human editing
     */
    var readOnly: Boolean? = null

    /**
     * No more than this many characters
     */
    var maxLength: Int? = null

    /**
     * Valueset containing permitted answers
     */
    var options: Reference? = null

    val option: List<QuestionnaireItemOption> = mutableListOf<QuestionnaireItemOption>()

    /**
     * Default value when item is first rendered
     */
    var initialBoolean: Boolean? = null

    /**
     * Default value when item is first rendered
     */
    var initialDecimal: Float? = null

    /**
     * Default value when item is first rendered
     */
    var initialInteger: Int? = null

    /**
     * Default value when item is first rendered
     */
    var initialDate: FhirDate? = null

    /**
     * Default value when item is first rendered
     */
    var initialDateTime: FhirDate? = null

    /**
     * Default value when item is first rendered
     */
    var initialTime: FhirDate? = null

    /**
     * Default value when item is first rendered
     */
    var initialString: String? = null

    /**
     * Default value when item is first rendered
     */
    var initialUri: String? = null

    /**
     * Default value when item is first rendered
     */
    var initialAttachment: Attachment? = null

    /**
     * Default value when item is first rendered
     */
    var initialCoding: Coding? = null

    /**
     * Default value when item is first rendered
     */
    var initialQuantity: Quantity? = null

    /**
     * Default value when item is first rendered
     */
    var initialReference: Reference? = null

    val item: List<QuestionnaireItem> = mutableListOf<QuestionnaireItem>()
}

/**
 * Only allow data when
 *
 * A constraint indicating that this item should only be enabled (displayed/allow answers to be captured) when the specified condition is true.
 */
open class QuestionnaireItemEnableWhen() : BackboneElement() {
    /**
     * Question that determines whether item is enabled
     */
    var question: String? = null

    /**
     * Enable when answered or not
     */
    var hasAnswer: Boolean? = null

    /**
     * Value question must have
     */
    var answerBoolean: Boolean? = null

    /**
     * Value question must have
     */
    var answerDecimal: Float? = null

    /**
     * Value question must have
     */
    var answerInteger: Int? = null

    /**
     * Value question must have
     */
    var answerDate: FhirDate? = null

    /**
     * Value question must have
     */
    var answerDateTime: FhirDate? = null

    /**
     * Value question must have
     */
    var answerTime: FhirDate? = null

    /**
     * Value question must have
     */
    var answerString: String? = null

    /**
     * Value question must have
     */
    var answerUri: String? = null

    /**
     * Value question must have
     */
    var answerAttachment: Attachment? = null

    /**
     * Value question must have
     */
    var answerCoding: Coding? = null

    /**
     * Value question must have
     */
    var answerQuantity: Quantity? = null

    /**
     * Value question must have
     */
    var answerReference: Reference? = null
}

/**
 * Permitted answer
 *
 * One of the permitted answers for a "choice" or "open-choice" question.
 */
open class QuestionnaireItemOption() : BackboneElement() {
    /**
     * Answer value
     */
    var valueInteger: Int? = null

    /**
     * Answer value
     */
    var valueDate: FhirDate? = null

    /**
     * Answer value
     */
    var valueTime: FhirDate? = null

    /**
     * Answer value
     */
    var valueString: String? = null

    /**
     * Answer value
     */
    var valueCoding: Coding = Coding()
}
