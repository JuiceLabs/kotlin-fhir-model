//
//  Generated from FHIR Version 3.0.1.11917 on 2018-11-29T05:04:14.636 
//
//   2018, JuiceLab, LLC
//  
package com.juicelabs.fhir.model

import com.juicelabs.fhir.base.FhirDate
import kotlin.collections.List

/**
 * Definition of an operation or a named query
 *
 * A formal computable definition of an operation (on the RESTful interface) or a named query (using the search interaction).
 */
open class OperationDefinition() : DomainResource() {
    /**
     * Logical URI to reference this operation definition (globally unique)
     */
    var url: String? = null

    /**
     * Business version of the operation definition
     */
    var version: String? = null

    /**
     * Name for this operation definition (computer friendly)
     */
    var name: String? = null

    /**
     * draft | active | retired | unknown
     */
    var status: String? = null

    /**
     * operation | query
     */
    var kind: String? = null

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
     * Natural language description of the operation definition
     */
    var description: String? = null

    val useContext: List<UsageContext> = mutableListOf<UsageContext>()

    val jurisdiction: List<CodeableConcept> = mutableListOf<CodeableConcept>()

    /**
     * Why this operation definition is defined
     */
    var purpose: String? = null

    /**
     * Whether content is unchanged by the operation
     */
    var idempotent: Boolean? = null

    /**
     * Name used to invoke the operation
     */
    var code: String? = null

    /**
     * Additional information about use
     */
    var comment: String? = null

    /**
     * Marks this as a profile of the base
     */
    var base: Reference? = null

    val resource: List<String> = mutableListOf<String>()

    /**
     * Invoke at the system level?
     */
    var system: Boolean? = null

    /**
     * Invole at the type level?
     */
    var type: Boolean? = null

    /**
     * Invoke on an instance?
     */
    var instance: Boolean? = null

    val parameter: List<OperationDefinitionParameter> =
            mutableListOf<OperationDefinitionParameter>()

    val overload: List<OperationDefinitionOverload> = mutableListOf<OperationDefinitionOverload>()
}

/**
 * Parameters for the operation/query
 *
 * The parameters for the operation/query.
 */
open class OperationDefinitionParameter() : BackboneElement() {
    /**
     * Name in Parameters.parameter.name or in URL
     */
    var name: String? = null

    /**
     * in | out
     */
    var use: String? = null

    /**
     * Minimum Cardinality
     */
    var min: Int? = null

    /**
     * Maximum Cardinality (a number or *)
     */
    var max: String? = null

    /**
     * Description of meaning/use
     */
    var documentation: String? = null

    /**
     * What type this parameter has
     */
    var type: String? = null

    /**
     * number | date | string | token | reference | composite | quantity | uri
     */
    var searchType: String? = null

    /**
     * Profile on the type
     */
    var profile: Reference? = null

    /**
     * ValueSet details if this is coded
     */
    var binding: OperationDefinitionParameterBinding? = null

    val part: List<OperationDefinitionParameter> = mutableListOf<OperationDefinitionParameter>()
}

/**
 * ValueSet details if this is coded
 *
 * Binds to a value set if this parameter is coded (code, Coding, CodeableConcept).
 */
open class OperationDefinitionParameterBinding() : BackboneElement() {
    /**
     * required | extensible | preferred | example
     */
    var strength: String? = null

    /**
     * Source of value set
     */
    var valueSetUri: String? = null

    /**
     * Source of value set
     */
    var valueSetReference: Reference = Reference()
}

/**
 * Define overloaded variants for when  generating code
 *
 * Defines an appropriate combination of parameters to use when invoking this operation, to help code generators when generating overloaded parameter sets for this operation.
 */
open class OperationDefinitionOverload() : BackboneElement() {
    val parameterName: List<String> = mutableListOf<String>()

    /**
     * Comments to go on overload
     */
    var comment: String? = null
}
