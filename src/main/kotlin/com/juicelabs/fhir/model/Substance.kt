//
//  Generated from FHIR Version 3.0.1.11917 on 2018-11-27T12:50:39.970 
//
//   2018, JuiceLab, LLC
//  
package com.juicelabs.fhir.model

import com.juicelabs.fhir.base.FhirDate
import kotlin.collections.List

/**
 * A homogeneous material with a definite composition
 *
 * A homogeneous material with a definite composition.
 */
open class Substance() : DomainResource() {
    val identifier: List<Identifier> = mutableListOf<Identifier>()

    /**
     * active | inactive | entered-in-error
     */
    var status: String? = null

    val category: List<CodeableConcept> = mutableListOf<CodeableConcept>()

    /**
     * What substance this is
     */
    var code: CodeableConcept = CodeableConcept()

    /**
     * Textual description of the substance, comments
     */
    var description: String? = null

    val instance: List<SubstanceInstance> = mutableListOf<SubstanceInstance>()

    val ingredient: List<SubstanceIngredient> = mutableListOf<SubstanceIngredient>()
}

/**
 * If this describes a specific package/container of the substance
 *
 * Substance may be used to describe a kind of substance, or a specific package/container of the substance: an instance.
 */
open class SubstanceInstance() : BackboneElement() {
    /**
     * Identifier of the package/container
     */
    var identifier: Identifier? = null

    /**
     * When no longer valid to use
     */
    var expiry: FhirDate? = null

    /**
     * Amount of substance in the package
     */
    var quantity: Quantity? = null
}

/**
 * Composition information about the substance
 *
 * A substance can be composed of other substances.
 */
open class SubstanceIngredient() : BackboneElement() {
    /**
     * Optional amount (concentration)
     */
    var quantity: Ratio? = null

    /**
     * A component of the substance
     */
    var substanceCodeableConcept: CodeableConcept = CodeableConcept()

    /**
     * A component of the substance
     */
    var substanceReference: Reference = Reference()
}
