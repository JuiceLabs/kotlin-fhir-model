//
//  Generated from FHIR Version 3.0.1.11917 on 2018-11-27T12:50:39.663 
//
//   2018, JuiceLab, LLC
//  
package com.juicelabs.fhir.model

/**
 * Investigation to increase healthcare-related patient-independent knowledge
 *
 * A process where a researcher or organization plans and then executes a series of steps intended to increase the field of healthcare-related knowledge.  This includes studies of safety, efficacy, comparative effectiveness and other information about medications, devices, therapies and other interventional and investigative techniques.  A ResearchStudy involves the gathering of information about human or animal subjects.
 */
open class ResearchSubject() : DomainResource() {
    /**
     * Business Identifier for research subject
     */
    var identifier: Identifier? = null

    /**
     * candidate | enrolled | active | suspended | withdrawn | completed
     */
    var status: String = ""

    /**
     * Start and end of participation
     */
    var period: Period? = null

    /**
     * Study subject is part of
     */
    var study: Reference = Reference()

    /**
     * Who is part of study
     */
    var individual: Reference = Reference()

    /**
     * What path should be followed
     */
    var assignedArm: String? = null

    /**
     * What path was followed
     */
    var actualArm: String? = null

    /**
     * Agreement to participate in study
     */
    var consent: Reference? = null
}