//
//  Generated from FHIR Version 3.0.1.11917 on 2018-11-29T05:04:14.923 
//
//   2018, JuiceLab, LLC
//  
package com.juicelabs.fhir.model

import com.juicelabs.fhir.base.FhirDate
import kotlin.collections.List

/**
 * Diet, formula or nutritional supplement request
 *
 * A request to supply a diet, formula feeding (enteral) or oral nutritional supplement to a patient/resident.
 */
open class NutritionOrder() : DomainResource() {
    val identifier: List<Identifier> = mutableListOf<Identifier>()

    /**
     * proposed | draft | planned | requested | active | on-hold | completed | cancelled | entered-in-error
     */
    var status: String? = null

    /**
     * The person who requires the diet, formula or nutritional supplement
     */
    var patient: Reference = Reference()

    /**
     * The encounter associated with this nutrition order
     */
    var encounter: Reference? = null

    /**
     * Date and time the nutrition order was requested
     */
    var dateTime: FhirDate? = null

    /**
     * Who ordered the diet, formula or nutritional supplement
     */
    var orderer: Reference? = null

    val allergyIntolerance: List<Reference> = mutableListOf<Reference>()

    val foodPreferenceModifier: List<CodeableConcept> = mutableListOf<CodeableConcept>()

    val excludeFoodModifier: List<CodeableConcept> = mutableListOf<CodeableConcept>()

    /**
     * Oral diet components
     */
    var oralDiet: NutritionOrderOralDiet? = null

    val supplement: List<NutritionOrderSupplement> = mutableListOf<NutritionOrderSupplement>()

    /**
     * Enteral formula components
     */
    var enteralFormula: NutritionOrderEnteralFormula? = null
}

/**
 * Oral diet components
 *
 * Diet given orally in contrast to enteral (tube) feeding.
 */
open class NutritionOrderOralDiet() : BackboneElement() {
    val type: List<CodeableConcept> = mutableListOf<CodeableConcept>()

    val schedule: List<Timing> = mutableListOf<Timing>()

    val nutrient: List<NutritionOrderOralDietNutrient> =
            mutableListOf<NutritionOrderOralDietNutrient>()

    val texture: List<NutritionOrderOralDietTexture> =
            mutableListOf<NutritionOrderOralDietTexture>()

    val fluidConsistencyType: List<CodeableConcept> = mutableListOf<CodeableConcept>()

    /**
     * Instructions or additional information about the oral diet
     */
    var instruction: String? = null
}

/**
 * Required  nutrient modifications
 *
 * Class that defines the quantity and type of nutrient modifications (for example carbohydrate, fiber or sodium) required for the oral diet.
 */
open class NutritionOrderOralDietNutrient() : BackboneElement() {
    /**
     * Type of nutrient that is being modified
     */
    var modifier: CodeableConcept? = null

    /**
     * Quantity of the specified nutrient
     */
    var amount: Quantity? = null
}

/**
 * Required  texture modifications
 *
 * Class that describes any texture modifications required for the patient to safely consume various types of solid foods.
 */
open class NutritionOrderOralDietTexture() : BackboneElement() {
    /**
     * Code to indicate how to alter the texture of the foods, e.g. pureed
     */
    var modifier: CodeableConcept? = null

    /**
     * Concepts that are used to identify an entity that is ingested for nutritional purposes
     */
    var foodType: CodeableConcept? = null
}

/**
 * Supplement components
 *
 * Oral nutritional products given in order to add further nutritional value to the patient's diet.
 */
open class NutritionOrderSupplement() : BackboneElement() {
    /**
     * Type of supplement product requested
     */
    var type: CodeableConcept? = null

    /**
     * Product or brand name of the nutritional supplement
     */
    var productName: String? = null

    val schedule: List<Timing> = mutableListOf<Timing>()

    /**
     * Amount of the nutritional supplement
     */
    var quantity: Quantity? = null

    /**
     * Instructions or additional information about the oral supplement
     */
    var instruction: String? = null
}

/**
 * Enteral formula components
 *
 * Feeding provided through the gastrointestinal tract via a tube, catheter, or stoma that delivers nutrition distal to the oral cavity.
 */
open class NutritionOrderEnteralFormula() : BackboneElement() {
    /**
     * Type of enteral or infant formula
     */
    var baseFormulaType: CodeableConcept? = null

    /**
     * Product or brand name of the enteral or infant formula
     */
    var baseFormulaProductName: String? = null

    /**
     * Type of modular component to add to the feeding
     */
    var additiveType: CodeableConcept? = null

    /**
     * Product or brand name of the modular additive
     */
    var additiveProductName: String? = null

    /**
     * Amount of energy per specified volume that is required
     */
    var caloricDensity: Quantity? = null

    /**
     * How the formula should enter the patient's gastrointestinal tract
     */
    var routeofAdministration: CodeableConcept? = null

    val administration: List<NutritionOrderEnteralFormulaAdministration> =
            mutableListOf<NutritionOrderEnteralFormulaAdministration>()

    /**
     * Upper limit on formula volume per unit of time
     */
    var maxVolumeToDeliver: Quantity? = null

    /**
     * Formula feeding instructions expressed as text
     */
    var administrationInstruction: String? = null
}

/**
 * Formula feeding instruction as structured data
 *
 * Formula administration instructions as structured data.  This repeating structure allows for changing the administration rate or volume over time for both bolus and continuous feeding.  An example of this would be an instruction to increase the rate of continuous feeding every 2 hours.
 */
open class NutritionOrderEnteralFormulaAdministration() : BackboneElement() {
    /**
     * Scheduled frequency of enteral feeding
     */
    var schedule: Timing? = null

    /**
     * The volume of formula to provide
     */
    var quantity: Quantity? = null

    /**
     * Speed with which the formula is provided per period of time
     */
    var rateQuantity: Quantity? = null

    /**
     * Speed with which the formula is provided per period of time
     */
    var rateRatio: Ratio? = null
}
