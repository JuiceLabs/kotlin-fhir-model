//
//  Generated from FHIR Version 3.0.1.11917 on 2018-11-27T12:50:39.907 
//
//   2018, JuiceLab, LLC
//  
package com.juicelabs.fhir.model

import com.google.gson.annotations.SerializedName
import com.juicelabs.fhir.base.FhirDate
import kotlin.collections.List

/**
 * A task to be performed
 *
 * A task to be performed.
 */
open class Task() : DomainResource() {
    val identifier: List<Identifier> = mutableListOf<Identifier>()

    /**
     * Formal definition of task
     */
    var definitionUri: String? = null

    /**
     * Formal definition of task
     */
    var definitionReference: Reference? = null

    val basedOn: List<Reference> = mutableListOf<Reference>()

    /**
     * Requisition or grouper id
     */
    var groupIdentifier: Identifier? = null

    val partOf: List<Reference> = mutableListOf<Reference>()

    /**
     * draft | requested | received | accepted | +
     */
    var status: String = ""

    /**
     * Reason for current status
     */
    var statusReason: CodeableConcept? = null

    /**
     * E.g. "Specimen collected", "IV prepped"
     */
    var businessStatus: CodeableConcept? = null

    /**
     * proposal | plan | order +
     */
    var intent: String = ""

    /**
     * normal | urgent | asap | stat
     */
    var priority: String? = null

    /**
     * Task Type
     */
    var code: CodeableConcept? = null

    /**
     * Human-readable explanation of task
     */
    var description: String? = null

    /**
     * What task is acting on
     */
    var focus: Reference? = null

    /**
     * Beneficiary of the Task
     */
    @SerializedName("for")
    var for_fhir: Reference? = null

    /**
     * Healthcare event during which this task originated
     */
    var context: Reference? = null

    /**
     * Start and end time of execution
     */
    var executionPeriod: Period? = null

    /**
     * Task Creation Date
     */
    var authoredOn: FhirDate? = null

    /**
     * Task Last Modified Date
     */
    var lastModified: FhirDate? = null

    /**
     * Who is asking for task to be done
     */
    var requester: TaskRequester? = null

    val performerType: List<CodeableConcept> = mutableListOf<CodeableConcept>()

    /**
     * Responsible individual
     */
    var owner: Reference? = null

    /**
     * Why task is needed
     */
    var reason: CodeableConcept? = null

    val note: List<Annotation> = mutableListOf<Annotation>()

    val relevantHistory: List<Reference> = mutableListOf<Reference>()

    /**
     * Constraints on fulfillment tasks
     */
    var restriction: TaskRestriction? = null

    val input: List<TaskInput> = mutableListOf<TaskInput>()

    val output: List<TaskOutput> = mutableListOf<TaskOutput>()
}

/**
 * Who is asking for task to be done
 *
 * The creator of the task.
 */
open class TaskRequester() : BackboneElement() {
    /**
     * Individual asking for task
     */
    var agent: Reference = Reference()

    /**
     * Organization individual is acting for
     */
    var onBehalfOf: Reference? = null
}

/**
 * Constraints on fulfillment tasks
 *
 * If the Task.focus is a request resource and the task is seeking fulfillment (i.e is asking for the request to be actioned), this element identifies any limitations on what parts of the referenced request should be actioned.
 */
open class TaskRestriction() : BackboneElement() {
    /**
     * How many times to repeat
     */
    var repetitions: Int? = null

    /**
     * When fulfillment sought
     */
    var period: Period? = null

    val recipient: List<Reference> = mutableListOf<Reference>()
}

/**
 * Information used to perform task
 *
 * Additional information that may be needed in the execution of the task.
 */
open class TaskInput() : BackboneElement() {
    /**
     * Label for the input
     */
    var type: CodeableConcept = CodeableConcept()

    /**
     * Content to use in performing the task
     */
    var valueBase64Binary: String = ""

    /**
     * Content to use in performing the task
     */
    var valueBoolean: Boolean = false

    /**
     * Content to use in performing the task
     */
    var valueCode: String = ""

    /**
     * Content to use in performing the task
     */
    var valueDate: FhirDate = FhirDate.now()

    /**
     * Content to use in performing the task
     */
    var valueDateTime: FhirDate = FhirDate.now()

    /**
     * Content to use in performing the task
     */
    var valueDecimal: Float = 0.0f

    /**
     * Content to use in performing the task
     */
    var valueId: String = ""

    /**
     * Content to use in performing the task
     */
    var valueInstant: FhirDate = FhirDate.now()

    /**
     * Content to use in performing the task
     */
    var valueInteger: Int = 0

    /**
     * Content to use in performing the task
     */
    var valueMarkdown: String = ""

    /**
     * Content to use in performing the task
     */
    var valueOid: String = ""

    /**
     * Content to use in performing the task
     */
    var valuePositiveInt: Int = 0

    /**
     * Content to use in performing the task
     */
    var valueString: String = ""

    /**
     * Content to use in performing the task
     */
    var valueTime: FhirDate = FhirDate.now()

    /**
     * Content to use in performing the task
     */
    var valueUnsignedInt: Int = 0

    /**
     * Content to use in performing the task
     */
    var valueUri: String = ""

    /**
     * Content to use in performing the task
     */
    var valueAddress: Address = Address()

    /**
     * Content to use in performing the task
     */
    var valueAge: Age = Age()

    /**
     * Content to use in performing the task
     */
    var valueAnnotation: Annotation = Annotation()

    /**
     * Content to use in performing the task
     */
    var valueAttachment: Attachment = Attachment()

    /**
     * Content to use in performing the task
     */
    var valueCodeableConcept: CodeableConcept = CodeableConcept()

    /**
     * Content to use in performing the task
     */
    var valueCoding: Coding = Coding()

    /**
     * Content to use in performing the task
     */
    var valueContactPoint: ContactPoint = ContactPoint()

    /**
     * Content to use in performing the task
     */
    var valueCount: Count = Count()

    /**
     * Content to use in performing the task
     */
    var valueDistance: Distance = Distance()

    /**
     * Content to use in performing the task
     */
    var valueDuration: Duration = Duration()

    /**
     * Content to use in performing the task
     */
    var valueHumanName: HumanName = HumanName()

    /**
     * Content to use in performing the task
     */
    var valueIdentifier: Identifier = Identifier()

    /**
     * Content to use in performing the task
     */
    var valueMoney: Money = Money()

    /**
     * Content to use in performing the task
     */
    var valuePeriod: Period = Period()

    /**
     * Content to use in performing the task
     */
    var valueQuantity: Quantity = Quantity()

    /**
     * Content to use in performing the task
     */
    var valueRange: Range = Range()

    /**
     * Content to use in performing the task
     */
    var valueRatio: Ratio = Ratio()

    /**
     * Content to use in performing the task
     */
    var valueReference: Reference = Reference()

    /**
     * Content to use in performing the task
     */
    var valueSampledData: SampledData = SampledData()

    /**
     * Content to use in performing the task
     */
    var valueSignature: Signature = Signature()

    /**
     * Content to use in performing the task
     */
    var valueTiming: Timing = Timing()

    /**
     * Content to use in performing the task
     */
    var valueMeta: Meta = Meta()
}

/**
 * Information produced as part of task
 *
 * Outputs produced by the Task.
 */
open class TaskOutput() : BackboneElement() {
    /**
     * Label for output
     */
    var type: CodeableConcept = CodeableConcept()

    /**
     * Result of output
     */
    var valueBase64Binary: String = ""

    /**
     * Result of output
     */
    var valueBoolean: Boolean = false

    /**
     * Result of output
     */
    var valueCode: String = ""

    /**
     * Result of output
     */
    var valueDate: FhirDate = FhirDate.now()

    /**
     * Result of output
     */
    var valueDateTime: FhirDate = FhirDate.now()

    /**
     * Result of output
     */
    var valueDecimal: Float = 0.0f

    /**
     * Result of output
     */
    var valueId: String = ""

    /**
     * Result of output
     */
    var valueInstant: FhirDate = FhirDate.now()

    /**
     * Result of output
     */
    var valueInteger: Int = 0

    /**
     * Result of output
     */
    var valueMarkdown: String = ""

    /**
     * Result of output
     */
    var valueOid: String = ""

    /**
     * Result of output
     */
    var valuePositiveInt: Int = 0

    /**
     * Result of output
     */
    var valueString: String = ""

    /**
     * Result of output
     */
    var valueTime: FhirDate = FhirDate.now()

    /**
     * Result of output
     */
    var valueUnsignedInt: Int = 0

    /**
     * Result of output
     */
    var valueUri: String = ""

    /**
     * Result of output
     */
    var valueAddress: Address = Address()

    /**
     * Result of output
     */
    var valueAge: Age = Age()

    /**
     * Result of output
     */
    var valueAnnotation: Annotation = Annotation()

    /**
     * Result of output
     */
    var valueAttachment: Attachment = Attachment()

    /**
     * Result of output
     */
    var valueCodeableConcept: CodeableConcept = CodeableConcept()

    /**
     * Result of output
     */
    var valueCoding: Coding = Coding()

    /**
     * Result of output
     */
    var valueContactPoint: ContactPoint = ContactPoint()

    /**
     * Result of output
     */
    var valueCount: Count = Count()

    /**
     * Result of output
     */
    var valueDistance: Distance = Distance()

    /**
     * Result of output
     */
    var valueDuration: Duration = Duration()

    /**
     * Result of output
     */
    var valueHumanName: HumanName = HumanName()

    /**
     * Result of output
     */
    var valueIdentifier: Identifier = Identifier()

    /**
     * Result of output
     */
    var valueMoney: Money = Money()

    /**
     * Result of output
     */
    var valuePeriod: Period = Period()

    /**
     * Result of output
     */
    var valueQuantity: Quantity = Quantity()

    /**
     * Result of output
     */
    var valueRange: Range = Range()

    /**
     * Result of output
     */
    var valueRatio: Ratio = Ratio()

    /**
     * Result of output
     */
    var valueReference: Reference = Reference()

    /**
     * Result of output
     */
    var valueSampledData: SampledData = SampledData()

    /**
     * Result of output
     */
    var valueSignature: Signature = Signature()

    /**
     * Result of output
     */
    var valueTiming: Timing = Timing()

    /**
     * Result of output
     */
    var valueMeta: Meta = Meta()
}
