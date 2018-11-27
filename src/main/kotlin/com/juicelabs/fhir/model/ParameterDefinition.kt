//
//  Generated from FHIR Version 3.0.1.11917 on 2018-11-27T12:50:39.936 
//
//   2018, JuiceLab, LLC
//  
package com.juicelabs.fhir.model

/**
 * Definition of a parameter to a module
 *
 * The parameters to the module. This collection specifies both the input and output parameters. Input parameters are provided by the caller as part of the $evaluate operation. Output parameters are included in the GuidanceResponse.
 */
open class ParameterDefinition() : Element() {
    /**
     * Name used to access the parameter value
     */
    var name: String? = null

    /**
     * in | out
     */
    var use: String = ""

    /**
     * Minimum cardinality
     */
    var min: Int? = null

    /**
     * Maximum cardinality (a number of *)
     */
    var max: String? = null

    /**
     * A brief description of the parameter
     */
    var documentation: String? = null

    /**
     * What type of value
     */
    var type: String = ""

    /**
     * What profile the value is expected to be
     */
    var profile: Reference? = null
}
