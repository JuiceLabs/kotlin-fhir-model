//
//  Generated from FHIR Version 3.0.1.11917 on 2018-11-27T12:50:39.979 
//
//   2018, JuiceLab, LLC
//  
package com.juicelabs.fhir.model

import com.juicelabs.fhir.base.FhirDate
import kotlin.collections.List

/**
 * Definition of an element in a resource or extension
 *
 * Captures constraints on each element within the resource, profile, or extension.
 */
open class ElementDefinition() : Element() {
    /**
     * Path of the element in the hierarchy of elements
     */
    var path: String = ""

    val representation: List<String> = mutableListOf<String>()

    /**
     * Name for this particular element (in a set of slices)
     */
    var sliceName: String? = null

    /**
     * Name for element to display with or prompt for element
     */
    var label: String? = null

    val code: List<Coding> = mutableListOf<Coding>()

    /**
     * This element is sliced - slices follow
     */
    var slicing: ElementDefinitionSlicing? = null

    /**
     * Concise definition for space-constrained presentation
     */
    var short: String? = null

    /**
     * Full formal definition as narrative text
     */
    var definition: String? = null

    /**
     * Comments about the use of this element
     */
    var comment: String? = null

    /**
     * Why this resource has been created
     */
    var requirements: String? = null

    val alias: List<String> = mutableListOf<String>()

    /**
     * Minimum Cardinality
     */
    var min: Int? = null

    /**
     * Maximum Cardinality (a number or *)
     */
    var max: String? = null

    /**
     * Base definition information for tools
     */
    var base: ElementDefinitionBase? = null

    /**
     * Reference to definition of content for the element
     */
    var contentReference: String? = null

    val type: List<ElementDefinitionType> = mutableListOf<ElementDefinitionType>()

    /**
     * Specified value if missing from instance
     */
    var defaultValueBase64Binary: String? = null

    /**
     * Specified value if missing from instance
     */
    var defaultValueBoolean: Boolean? = null

    /**
     * Specified value if missing from instance
     */
    var defaultValueCode: String? = null

    /**
     * Specified value if missing from instance
     */
    var defaultValueDate: FhirDate? = null

    /**
     * Specified value if missing from instance
     */
    var defaultValueDateTime: FhirDate? = null

    /**
     * Specified value if missing from instance
     */
    var defaultValueDecimal: Float? = null

    /**
     * Specified value if missing from instance
     */
    var defaultValueId: String? = null

    /**
     * Specified value if missing from instance
     */
    var defaultValueInstant: FhirDate? = null

    /**
     * Specified value if missing from instance
     */
    var defaultValueInteger: Int? = null

    /**
     * Specified value if missing from instance
     */
    var defaultValueMarkdown: String? = null

    /**
     * Specified value if missing from instance
     */
    var defaultValueOid: String? = null

    /**
     * Specified value if missing from instance
     */
    var defaultValuePositiveInt: Int? = null

    /**
     * Specified value if missing from instance
     */
    var defaultValueString: String? = null

    /**
     * Specified value if missing from instance
     */
    var defaultValueTime: FhirDate? = null

    /**
     * Specified value if missing from instance
     */
    var defaultValueUnsignedInt: Int? = null

    /**
     * Specified value if missing from instance
     */
    var defaultValueUri: String? = null

    /**
     * Specified value if missing from instance
     */
    var defaultValueAddress: Address? = null

    /**
     * Specified value if missing from instance
     */
    var defaultValueAge: Age? = null

    /**
     * Specified value if missing from instance
     */
    var defaultValueAnnotation: Annotation? = null

    /**
     * Specified value if missing from instance
     */
    var defaultValueAttachment: Attachment? = null

    /**
     * Specified value if missing from instance
     */
    var defaultValueCodeableConcept: CodeableConcept? = null

    /**
     * Specified value if missing from instance
     */
    var defaultValueCoding: Coding? = null

    /**
     * Specified value if missing from instance
     */
    var defaultValueContactPoint: ContactPoint? = null

    /**
     * Specified value if missing from instance
     */
    var defaultValueCount: Count? = null

    /**
     * Specified value if missing from instance
     */
    var defaultValueDistance: Distance? = null

    /**
     * Specified value if missing from instance
     */
    var defaultValueDuration: Duration? = null

    /**
     * Specified value if missing from instance
     */
    var defaultValueHumanName: HumanName? = null

    /**
     * Specified value if missing from instance
     */
    var defaultValueIdentifier: Identifier? = null

    /**
     * Specified value if missing from instance
     */
    var defaultValueMoney: Money? = null

    /**
     * Specified value if missing from instance
     */
    var defaultValuePeriod: Period? = null

    /**
     * Specified value if missing from instance
     */
    var defaultValueQuantity: Quantity? = null

    /**
     * Specified value if missing from instance
     */
    var defaultValueRange: Range? = null

    /**
     * Specified value if missing from instance
     */
    var defaultValueRatio: Ratio? = null

    /**
     * Specified value if missing from instance
     */
    var defaultValueReference: Reference? = null

    /**
     * Specified value if missing from instance
     */
    var defaultValueSampledData: SampledData? = null

    /**
     * Specified value if missing from instance
     */
    var defaultValueSignature: Signature? = null

    /**
     * Specified value if missing from instance
     */
    var defaultValueTiming: Timing? = null

    /**
     * Specified value if missing from instance
     */
    var defaultValueMeta: Meta? = null

    /**
     * Implicit meaning when this element is missing
     */
    var meaningWhenMissing: String? = null

    /**
     * What the order of the elements means
     */
    var orderMeaning: String? = null

    /**
     * Value must be exactly this
     */
    var fixedBase64Binary: String? = null

    /**
     * Value must be exactly this
     */
    var fixedBoolean: Boolean? = null

    /**
     * Value must be exactly this
     */
    var fixedCode: String? = null

    /**
     * Value must be exactly this
     */
    var fixedDate: FhirDate? = null

    /**
     * Value must be exactly this
     */
    var fixedDateTime: FhirDate? = null

    /**
     * Value must be exactly this
     */
    var fixedDecimal: Float? = null

    /**
     * Value must be exactly this
     */
    var fixedId: String? = null

    /**
     * Value must be exactly this
     */
    var fixedInstant: FhirDate? = null

    /**
     * Value must be exactly this
     */
    var fixedInteger: Int? = null

    /**
     * Value must be exactly this
     */
    var fixedMarkdown: String? = null

    /**
     * Value must be exactly this
     */
    var fixedOid: String? = null

    /**
     * Value must be exactly this
     */
    var fixedPositiveInt: Int? = null

    /**
     * Value must be exactly this
     */
    var fixedString: String? = null

    /**
     * Value must be exactly this
     */
    var fixedTime: FhirDate? = null

    /**
     * Value must be exactly this
     */
    var fixedUnsignedInt: Int? = null

    /**
     * Value must be exactly this
     */
    var fixedUri: String? = null

    /**
     * Value must be exactly this
     */
    var fixedAddress: Address? = null

    /**
     * Value must be exactly this
     */
    var fixedAge: Age? = null

    /**
     * Value must be exactly this
     */
    var fixedAnnotation: Annotation? = null

    /**
     * Value must be exactly this
     */
    var fixedAttachment: Attachment? = null

    /**
     * Value must be exactly this
     */
    var fixedCodeableConcept: CodeableConcept? = null

    /**
     * Value must be exactly this
     */
    var fixedCoding: Coding? = null

    /**
     * Value must be exactly this
     */
    var fixedContactPoint: ContactPoint? = null

    /**
     * Value must be exactly this
     */
    var fixedCount: Count? = null

    /**
     * Value must be exactly this
     */
    var fixedDistance: Distance? = null

    /**
     * Value must be exactly this
     */
    var fixedDuration: Duration? = null

    /**
     * Value must be exactly this
     */
    var fixedHumanName: HumanName? = null

    /**
     * Value must be exactly this
     */
    var fixedIdentifier: Identifier? = null

    /**
     * Value must be exactly this
     */
    var fixedMoney: Money? = null

    /**
     * Value must be exactly this
     */
    var fixedPeriod: Period? = null

    /**
     * Value must be exactly this
     */
    var fixedQuantity: Quantity? = null

    /**
     * Value must be exactly this
     */
    var fixedRange: Range? = null

    /**
     * Value must be exactly this
     */
    var fixedRatio: Ratio? = null

    /**
     * Value must be exactly this
     */
    var fixedReference: Reference? = null

    /**
     * Value must be exactly this
     */
    var fixedSampledData: SampledData? = null

    /**
     * Value must be exactly this
     */
    var fixedSignature: Signature? = null

    /**
     * Value must be exactly this
     */
    var fixedTiming: Timing? = null

    /**
     * Value must be exactly this
     */
    var fixedMeta: Meta? = null

    /**
     * Value must have at least these property values
     */
    var patternBase64Binary: String? = null

    /**
     * Value must have at least these property values
     */
    var patternBoolean: Boolean? = null

    /**
     * Value must have at least these property values
     */
    var patternCode: String? = null

    /**
     * Value must have at least these property values
     */
    var patternDate: FhirDate? = null

    /**
     * Value must have at least these property values
     */
    var patternDateTime: FhirDate? = null

    /**
     * Value must have at least these property values
     */
    var patternDecimal: Float? = null

    /**
     * Value must have at least these property values
     */
    var patternId: String? = null

    /**
     * Value must have at least these property values
     */
    var patternInstant: FhirDate? = null

    /**
     * Value must have at least these property values
     */
    var patternInteger: Int? = null

    /**
     * Value must have at least these property values
     */
    var patternMarkdown: String? = null

    /**
     * Value must have at least these property values
     */
    var patternOid: String? = null

    /**
     * Value must have at least these property values
     */
    var patternPositiveInt: Int? = null

    /**
     * Value must have at least these property values
     */
    var patternString: String? = null

    /**
     * Value must have at least these property values
     */
    var patternTime: FhirDate? = null

    /**
     * Value must have at least these property values
     */
    var patternUnsignedInt: Int? = null

    /**
     * Value must have at least these property values
     */
    var patternUri: String? = null

    /**
     * Value must have at least these property values
     */
    var patternAddress: Address? = null

    /**
     * Value must have at least these property values
     */
    var patternAge: Age? = null

    /**
     * Value must have at least these property values
     */
    var patternAnnotation: Annotation? = null

    /**
     * Value must have at least these property values
     */
    var patternAttachment: Attachment? = null

    /**
     * Value must have at least these property values
     */
    var patternCodeableConcept: CodeableConcept? = null

    /**
     * Value must have at least these property values
     */
    var patternCoding: Coding? = null

    /**
     * Value must have at least these property values
     */
    var patternContactPoint: ContactPoint? = null

    /**
     * Value must have at least these property values
     */
    var patternCount: Count? = null

    /**
     * Value must have at least these property values
     */
    var patternDistance: Distance? = null

    /**
     * Value must have at least these property values
     */
    var patternDuration: Duration? = null

    /**
     * Value must have at least these property values
     */
    var patternHumanName: HumanName? = null

    /**
     * Value must have at least these property values
     */
    var patternIdentifier: Identifier? = null

    /**
     * Value must have at least these property values
     */
    var patternMoney: Money? = null

    /**
     * Value must have at least these property values
     */
    var patternPeriod: Period? = null

    /**
     * Value must have at least these property values
     */
    var patternQuantity: Quantity? = null

    /**
     * Value must have at least these property values
     */
    var patternRange: Range? = null

    /**
     * Value must have at least these property values
     */
    var patternRatio: Ratio? = null

    /**
     * Value must have at least these property values
     */
    var patternReference: Reference? = null

    /**
     * Value must have at least these property values
     */
    var patternSampledData: SampledData? = null

    /**
     * Value must have at least these property values
     */
    var patternSignature: Signature? = null

    /**
     * Value must have at least these property values
     */
    var patternTiming: Timing? = null

    /**
     * Value must have at least these property values
     */
    var patternMeta: Meta? = null

    val example: List<ElementDefinitionExample> = mutableListOf<ElementDefinitionExample>()

    /**
     * Minimum Allowed Value (for some types)
     */
    var minValueDate: FhirDate? = null

    /**
     * Minimum Allowed Value (for some types)
     */
    var minValueDateTime: FhirDate? = null

    /**
     * Minimum Allowed Value (for some types)
     */
    var minValueInstant: FhirDate? = null

    /**
     * Minimum Allowed Value (for some types)
     */
    var minValueTime: FhirDate? = null

    /**
     * Minimum Allowed Value (for some types)
     */
    var minValueDecimal: Float? = null

    /**
     * Minimum Allowed Value (for some types)
     */
    var minValueInteger: Int? = null

    /**
     * Minimum Allowed Value (for some types)
     */
    var minValuePositiveInt: Int? = null

    /**
     * Minimum Allowed Value (for some types)
     */
    var minValueUnsignedInt: Int? = null

    /**
     * Minimum Allowed Value (for some types)
     */
    var minValueQuantity: Quantity? = null

    /**
     * Maximum Allowed Value (for some types)
     */
    var maxValueDate: FhirDate? = null

    /**
     * Maximum Allowed Value (for some types)
     */
    var maxValueDateTime: FhirDate? = null

    /**
     * Maximum Allowed Value (for some types)
     */
    var maxValueInstant: FhirDate? = null

    /**
     * Maximum Allowed Value (for some types)
     */
    var maxValueTime: FhirDate? = null

    /**
     * Maximum Allowed Value (for some types)
     */
    var maxValueDecimal: Float? = null

    /**
     * Maximum Allowed Value (for some types)
     */
    var maxValueInteger: Int? = null

    /**
     * Maximum Allowed Value (for some types)
     */
    var maxValuePositiveInt: Int? = null

    /**
     * Maximum Allowed Value (for some types)
     */
    var maxValueUnsignedInt: Int? = null

    /**
     * Maximum Allowed Value (for some types)
     */
    var maxValueQuantity: Quantity? = null

    /**
     * Max length for strings
     */
    var maxLength: Int? = null

    val condition: List<String> = mutableListOf<String>()

    val constraint: List<ElementDefinitionConstraint> = mutableListOf<ElementDefinitionConstraint>()

    /**
     * If the element must supported
     */
    var mustSupport: Boolean? = null

    /**
     * If this modifies the meaning of other elements
     */
    var isModifier: Boolean? = null

    /**
     * Include when _summary = true?
     */
    var isSummary: Boolean? = null

    /**
     * ValueSet details if this is coded
     */
    var binding: ElementDefinitionBinding? = null

    val mapping: List<ElementDefinitionMapping> = mutableListOf<ElementDefinitionMapping>()
}

/**
 * This element is sliced - slices follow
 *
 * Indicates that the element is sliced into a set of alternative definitions (i.e. in a structure definition, there are multiple different constraints on a single element in the base resource). Slicing can be used in any resource that has cardinality ..* on the base resource, or any resource with a choice of types. The set of slices is any elements that come after this in the element sequence that have the same path, until a shorter path occurs (the shorter path terminates the set).
 */
open class ElementDefinitionSlicing() : Element() {
    val discriminator: List<ElementDefinitionSlicingDiscriminator> =
            mutableListOf<ElementDefinitionSlicingDiscriminator>()

    /**
     * Text description of how slicing works (or not)
     */
    var description: String? = null

    /**
     * If elements must be in same order as slices
     */
    var ordered: Boolean? = null

    /**
     * closed | open | openAtEnd
     */
    var rules: String = ""
}

/**
 * Element values that are used to distinguish the slices
 *
 * Designates which child elements are used to discriminate between the slices when processing an instance. If one or more discriminators are provided, the value of the child elements in the instance data SHALL completely distinguish which slice the element in the resource matches based on the allowed values for those elements in each of the slices.
 */
open class ElementDefinitionSlicingDiscriminator() : Element() {
    /**
     * value | exists | pattern | type | profile
     */
    var type: String = ""

    /**
     * Path to element value
     */
    var path: String = ""
}

/**
 * Base definition information for tools
 *
 * Information about the base definition of the element, provided to make it unnecessary for tools to trace the deviation of the element through the derived and related profiles. This information is provided when the element definition is not the original definition of an element - i.g. either in a constraint on another type, or for elements from a super type in a snap shot.
 */
open class ElementDefinitionBase() : Element() {
    /**
     * Path that identifies the base element
     */
    var path: String = ""

    /**
     * Min cardinality of the base element
     */
    var min: Int = 0

    /**
     * Max cardinality of the base element
     */
    var max: String = ""
}

/**
 * Data type and Profile for this element
 *
 * The data type or resource that the value of this element is permitted to be.
 */
open class ElementDefinitionType() : Element() {
    /**
     * Data type or Resource (reference to definition)
     */
    var code: String = ""

    /**
     * Profile (StructureDefinition) to apply (or IG)
     */
    var profile: String? = null

    /**
     * Profile (StructureDefinition) to apply to reference target (or IG)
     */
    var targetProfile: String? = null

    val aggregation: List<String> = mutableListOf<String>()

    /**
     * either | independent | specific
     */
    var versioning: String? = null
}

/**
 * Example value (as defined for type)
 *
 * A sample value for this element demonstrating the type of information that would typically be found in the element.
 */
open class ElementDefinitionExample() : Element() {
    /**
     * Describes the purpose of this example
     */
    var label: String = ""

    /**
     * Value of Example (one of allowed types)
     */
    var valueBase64Binary: String = ""

    /**
     * Value of Example (one of allowed types)
     */
    var valueBoolean: Boolean = false

    /**
     * Value of Example (one of allowed types)
     */
    var valueCode: String = ""

    /**
     * Value of Example (one of allowed types)
     */
    var valueDate: FhirDate = FhirDate.now()

    /**
     * Value of Example (one of allowed types)
     */
    var valueDateTime: FhirDate = FhirDate.now()

    /**
     * Value of Example (one of allowed types)
     */
    var valueDecimal: Float = 0.0f

    /**
     * Value of Example (one of allowed types)
     */
    var valueId: String = ""

    /**
     * Value of Example (one of allowed types)
     */
    var valueInstant: FhirDate = FhirDate.now()

    /**
     * Value of Example (one of allowed types)
     */
    var valueInteger: Int = 0

    /**
     * Value of Example (one of allowed types)
     */
    var valueMarkdown: String = ""

    /**
     * Value of Example (one of allowed types)
     */
    var valueOid: String = ""

    /**
     * Value of Example (one of allowed types)
     */
    var valuePositiveInt: Int = 0

    /**
     * Value of Example (one of allowed types)
     */
    var valueString: String = ""

    /**
     * Value of Example (one of allowed types)
     */
    var valueTime: FhirDate = FhirDate.now()

    /**
     * Value of Example (one of allowed types)
     */
    var valueUnsignedInt: Int = 0

    /**
     * Value of Example (one of allowed types)
     */
    var valueUri: String = ""

    /**
     * Value of Example (one of allowed types)
     */
    var valueAddress: Address = Address()

    /**
     * Value of Example (one of allowed types)
     */
    var valueAge: Age = Age()

    /**
     * Value of Example (one of allowed types)
     */
    var valueAnnotation: Annotation = Annotation()

    /**
     * Value of Example (one of allowed types)
     */
    var valueAttachment: Attachment = Attachment()

    /**
     * Value of Example (one of allowed types)
     */
    var valueCodeableConcept: CodeableConcept = CodeableConcept()

    /**
     * Value of Example (one of allowed types)
     */
    var valueCoding: Coding = Coding()

    /**
     * Value of Example (one of allowed types)
     */
    var valueContactPoint: ContactPoint = ContactPoint()

    /**
     * Value of Example (one of allowed types)
     */
    var valueCount: Count = Count()

    /**
     * Value of Example (one of allowed types)
     */
    var valueDistance: Distance = Distance()

    /**
     * Value of Example (one of allowed types)
     */
    var valueDuration: Duration = Duration()

    /**
     * Value of Example (one of allowed types)
     */
    var valueHumanName: HumanName = HumanName()

    /**
     * Value of Example (one of allowed types)
     */
    var valueIdentifier: Identifier = Identifier()

    /**
     * Value of Example (one of allowed types)
     */
    var valueMoney: Money = Money()

    /**
     * Value of Example (one of allowed types)
     */
    var valuePeriod: Period = Period()

    /**
     * Value of Example (one of allowed types)
     */
    var valueQuantity: Quantity = Quantity()

    /**
     * Value of Example (one of allowed types)
     */
    var valueRange: Range = Range()

    /**
     * Value of Example (one of allowed types)
     */
    var valueRatio: Ratio = Ratio()

    /**
     * Value of Example (one of allowed types)
     */
    var valueReference: Reference = Reference()

    /**
     * Value of Example (one of allowed types)
     */
    var valueSampledData: SampledData = SampledData()

    /**
     * Value of Example (one of allowed types)
     */
    var valueSignature: Signature = Signature()

    /**
     * Value of Example (one of allowed types)
     */
    var valueTiming: Timing = Timing()

    /**
     * Value of Example (one of allowed types)
     */
    var valueMeta: Meta = Meta()
}

/**
 * Condition that must evaluate to true
 *
 * Formal constraints such as co-occurrence and other constraints that can be computationally evaluated within the context of the instance.
 */
open class ElementDefinitionConstraint() : Element() {
    /**
     * Target of 'condition' reference above
     */
    var key: String = ""

    /**
     * Why this constraint is necessary or appropriate
     */
    var requirements: String? = null

    /**
     * error | warning
     */
    var severity: String = ""

    /**
     * Human description of constraint
     */
    var human: String = ""

    /**
     * FHIRPath expression of constraint
     */
    var expression: String = ""

    /**
     * XPath expression of constraint
     */
    var xpath: String? = null

    /**
     * Reference to original source of constraint
     */
    var source: String? = null
}

/**
 * ValueSet details if this is coded
 *
 * Binds to a value set if this element is coded (code, Coding, CodeableConcept, Quantity), or the data types (string, uri).
 */
open class ElementDefinitionBinding() : Element() {
    /**
     * required | extensible | preferred | example
     */
    var strength: String = ""

    /**
     * Human explanation of the value set
     */
    var description: String? = null

    /**
     * Source of value set
     */
    var valueSetUri: String? = null

    /**
     * Source of value set
     */
    var valueSetReference: Reference? = null
}

/**
 * Map element to another set of definitions
 *
 * Identifies a concept from an external specification that roughly corresponds to this element.
 */
open class ElementDefinitionMapping() : Element() {
    /**
     * Reference to mapping declaration
     */
    var identity: String = ""

    /**
     * Computable language of mapping
     */
    var language: String? = null

    /**
     * Details of the mapping
     */
    var map: String = ""

    /**
     * Comments about the mapping or its use
     */
    var comment: String? = null
}
