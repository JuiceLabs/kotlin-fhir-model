//
//  Generated from FHIR Version 3.0.1.11917 on 2018-11-29T05:04:14.945 
//
//   2018, JuiceLab, LLC
//  
package com.juicelabs.fhir.model

import com.google.gson.annotations.SerializedName
import com.juicelabs.fhir.base.FhirDate
import kotlin.collections.List

/**
 * Describes a set of tests
 *
 * A structured set of tests against a FHIR server implementation to determine compliance against the FHIR specification.
 */
open class TestScript() : DomainResource() {
    /**
     * Logical URI to reference this test script (globally unique)
     */
    var url: String? = null

    /**
     * Additional identifier for the test script
     */
    var identifier: Identifier? = null

    /**
     * Business version of the test script
     */
    var version: String? = null

    /**
     * Name for this test script (computer friendly)
     */
    var name: String? = null

    /**
     * Name for this test script (human friendly)
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

    val contact: List<ContactDetail> = mutableListOf<ContactDetail>()

    /**
     * Natural language description of the test script
     */
    var description: String? = null

    val useContext: List<UsageContext> = mutableListOf<UsageContext>()

    val jurisdiction: List<CodeableConcept> = mutableListOf<CodeableConcept>()

    /**
     * Why this test script is defined
     */
    var purpose: String? = null

    /**
     * Use and/or publishing restrictions
     */
    var copyright: String? = null

    val origin: List<TestScriptOrigin> = mutableListOf<TestScriptOrigin>()

    val destination: List<TestScriptDestination> = mutableListOf<TestScriptDestination>()

    /**
     * Required capability that is assumed to function correctly on the FHIR server being tested
     */
    var metadata: TestScriptMetadata? = null

    val fixture: List<TestScriptFixture> = mutableListOf<TestScriptFixture>()

    val profile: List<Reference> = mutableListOf<Reference>()

    val variable: List<TestScriptVariable> = mutableListOf<TestScriptVariable>()

    val rule: List<TestScriptRule> = mutableListOf<TestScriptRule>()

    val ruleset: List<TestScriptRuleset> = mutableListOf<TestScriptRuleset>()

    /**
     * A series of required setup operations before tests are executed
     */
    var setup: TestScriptSetup? = null

    val test: List<TestScriptTest> = mutableListOf<TestScriptTest>()

    /**
     * A series of required clean up steps
     */
    var teardown: TestScriptTeardown? = null
}

/**
 * An abstract server representing a client or sender in a message exchange
 *
 * An abstract server used in operations within this test script in the origin element.
 */
open class TestScriptOrigin() : BackboneElement() {
    /**
     * The index of the abstract origin server starting at 1
     */
    var index: Int? = null

    /**
     * FHIR-Client | FHIR-SDC-FormFiller
     */
    var profile: Coding = Coding()
}

/**
 * An abstract server representing a destination or receiver in a message exchange
 *
 * An abstract server used in operations within this test script in the destination element.
 */
open class TestScriptDestination() : BackboneElement() {
    /**
     * The index of the abstract destination server starting at 1
     */
    var index: Int? = null

    /**
     * FHIR-Server | FHIR-SDC-FormManager | FHIR-SDC-FormReceiver | FHIR-SDC-FormProcessor
     */
    var profile: Coding = Coding()
}

/**
 * Required capability that is assumed to function correctly on the FHIR server being tested
 *
 * The required capability must exist and are assumed to function correctly on the FHIR server being tested.
 */
open class TestScriptMetadata() : BackboneElement() {
    val link: List<TestScriptMetadataLink> = mutableListOf<TestScriptMetadataLink>()

    val capability: List<TestScriptMetadataCapability> =
            mutableListOf<TestScriptMetadataCapability>()
}

/**
 * Links to the FHIR specification
 *
 * A link to the FHIR specification that this test is covering.
 */
open class TestScriptMetadataLink() : BackboneElement() {
    /**
     * URL to the specification
     */
    var url: String? = null

    /**
     * Short description
     */
    var description: String? = null
}

/**
 * Capabilities  that are assumed to function correctly on the FHIR server being tested
 *
 * Capabilities that must exist and are assumed to function correctly on the FHIR server being tested.
 */
open class TestScriptMetadataCapability() : BackboneElement() {
    /**
     * Are the capabilities required?
     */
    var required: Boolean? = null

    /**
     * Are the capabilities validated?
     */
    var validated: Boolean? = null

    /**
     * The expected capabilities of the server
     */
    var description: String? = null

    val origin: List<Int> = mutableListOf<Int>()

    /**
     * Which server these requirements apply to
     */
    var destination: Int? = null

    val link: List<String> = mutableListOf<String>()

    /**
     * Required Capability Statement
     */
    var capabilities: Reference = Reference()
}

/**
 * Fixture in the test script - by reference (uri)
 *
 * Fixture in the test script - by reference (uri). All fixtures are required for the test script to execute.
 */
open class TestScriptFixture() : BackboneElement() {
    /**
     * Whether or not to implicitly create the fixture during setup
     */
    var autocreate: Boolean? = null

    /**
     * Whether or not to implicitly delete the fixture during teardown
     */
    var autodelete: Boolean? = null

    /**
     * Reference of the resource
     */
    var resource: Reference? = null
}

/**
 * Placeholder for evaluated elements
 *
 * Variable is set based either on element value in response body or on header field value in the response headers.
 */
open class TestScriptVariable() : BackboneElement() {
    /**
     * Descriptive name for this variable
     */
    var name: String? = null

    /**
     * Default, hard-coded, or user-defined value for this variable
     */
    var defaultValue: String? = null

    /**
     * Natural language description of the variable
     */
    var description: String? = null

    /**
     * The fluentpath expression against the fixture body
     */
    var expression: String? = null

    /**
     * HTTP header field name for source
     */
    var headerField: String? = null

    /**
     * Hint help text for default value to enter
     */
    var hint: String? = null

    /**
     * XPath or JSONPath against the fixture body
     */
    var path: String? = null

    /**
     * Fixture Id of source expression or headerField within this variable
     */
    var sourceId: String? = null
}

/**
 * Assert rule used within the test script
 *
 * Assert rule to be used in one or more asserts within the test script.
 */
open class TestScriptRule() : BackboneElement() {
    /**
     * Assert rule resource reference
     */
    var resource: Reference = Reference()

    val param: List<TestScriptRuleParam> = mutableListOf<TestScriptRuleParam>()
}

/**
 * Rule parameter template
 *
 * Each rule template can take one or more parameters for rule evaluation.
 */
open class TestScriptRuleParam() : BackboneElement() {
    /**
     * Parameter name matching external assert rule parameter
     */
    var name: String? = null

    /**
     * Parameter value defined either explicitly or dynamically
     */
    var value: String? = null
}

/**
 * Assert ruleset used within the test script
 *
 * Contains one or more rules.  Offers a way to group rules so assertions could reference the group of rules and have them all applied.
 */
open class TestScriptRuleset() : BackboneElement() {
    /**
     * Assert ruleset resource reference
     */
    var resource: Reference = Reference()

    val rule: List<TestScriptRulesetRule> = mutableListOf<TestScriptRulesetRule>()
}

/**
 * The referenced rule within the ruleset
 *
 * The referenced rule within the external ruleset template.
 */
open class TestScriptRulesetRule() : BackboneElement() {
    /**
     * Id of referenced rule within the ruleset
     */
    var ruleId: String? = null

    val param: List<TestScriptRulesetRuleParam> = mutableListOf<TestScriptRulesetRuleParam>()
}

/**
 * Ruleset rule parameter template
 *
 * Each rule template can take one or more parameters for rule evaluation.
 */
open class TestScriptRulesetRuleParam() : BackboneElement() {
    /**
     * Parameter name matching external assert ruleset rule parameter
     */
    var name: String? = null

    /**
     * Parameter value defined either explicitly or dynamically
     */
    var value: String? = null
}

/**
 * A series of required setup operations before tests are executed
 *
 * A series of required setup operations before tests are executed.
 */
open class TestScriptSetup() : BackboneElement() {
    val action: List<TestScriptSetupAction> = mutableListOf<TestScriptSetupAction>()
}

/**
 * A setup operation or assert to perform
 *
 * Action would contain either an operation or an assertion.
 */
open class TestScriptSetupAction() : BackboneElement() {
    /**
     * The setup operation to perform
     */
    var operation: TestScriptSetupActionOperation? = null

    /**
     * The assertion to perform
     */
    @SerializedName("assert")
    var assert_fhir: TestScriptSetupActionAssert? = null
}

/**
 * The setup operation to perform
 *
 * The operation to perform.
 */
open class TestScriptSetupActionOperation() : BackboneElement() {
    /**
     * The operation code type that will be executed
     */
    var type: Coding? = null

    /**
     * Resource type
     */
    var resource: String? = null

    /**
     * Tracking/logging operation label
     */
    var label: String? = null

    /**
     * Tracking/reporting operation description
     */
    var description: String? = null

    /**
     * xml | json | ttl | none
     */
    var accept: String? = null

    /**
     * xml | json | ttl | none
     */
    var contentType: String? = null

    /**
     * Server responding to the request
     */
    var destination: Int? = null

    /**
     * Whether or not to send the request url in encoded format
     */
    var encodeRequestUrl: Boolean? = null

    /**
     * Server initiating the request
     */
    var origin: Int? = null

    /**
     * Explicitly defined path parameters
     */
    var params: String? = null

    val requestHeader: List<TestScriptSetupActionOperationRequestHeader> =
            mutableListOf<TestScriptSetupActionOperationRequestHeader>()

    /**
     * Fixture Id of mapped request
     */
    var requestId: String? = null

    /**
     * Fixture Id of mapped response
     */
    var responseId: String? = null

    /**
     * Fixture Id of body for PUT and POST requests
     */
    var sourceId: String? = null

    /**
     * Id of fixture used for extracting the [id],  [type], and [vid] for GET requests
     */
    var targetId: String? = null

    /**
     * Request URL
     */
    var url: String? = null
}

/**
 * Each operation can have one or more header elements
 *
 * Header elements would be used to set HTTP headers.
 */
open class TestScriptSetupActionOperationRequestHeader() : BackboneElement() {
    /**
     * HTTP header field name
     */
    var field: String? = null

    /**
     * HTTP headerfield value
     */
    var value: String? = null
}

/**
 * The assertion to perform
 *
 * Evaluates the results of previous operations to determine if the server under test behaves appropriately.
 */
open class TestScriptSetupActionAssert() : BackboneElement() {
    /**
     * Tracking/logging assertion label
     */
    var label: String? = null

    /**
     * Tracking/reporting assertion description
     */
    var description: String? = null

    /**
     * response | request
     */
    var direction: String? = null

    /**
     * Id of the source fixture to be evaluated
     */
    var compareToSourceId: String? = null

    /**
     * The fluentpath expression to evaluate against the source fixture
     */
    var compareToSourceExpression: String? = null

    /**
     * XPath or JSONPath expression to evaluate against the source fixture
     */
    var compareToSourcePath: String? = null

    /**
     * xml | json | ttl | none
     */
    var contentType: String? = null

    /**
     * The fluentpath expression to be evaluated
     */
    var expression: String? = null

    /**
     * HTTP header field name
     */
    var headerField: String? = null

    /**
     * Fixture Id of minimum content resource
     */
    var minimumId: String? = null

    /**
     * Perform validation on navigation links?
     */
    var navigationLinks: Boolean? = null

    /**
     * equals | notEquals | in | notIn | greaterThan | lessThan | empty | notEmpty | contains | notContains | eval
     */
    var operator: String? = null

    /**
     * XPath or JSONPath expression
     */
    var path: String? = null

    /**
     * delete | get | options | patch | post | put
     */
    var requestMethod: String? = null

    /**
     * Request URL comparison value
     */
    var requestURL: String? = null

    /**
     * Resource type
     */
    var resource: String? = null

    /**
     * okay | created | noContent | notModified | bad | forbidden | notFound | methodNotAllowed | conflict | gone | preconditionFailed | unprocessable
     */
    var response: String? = null

    /**
     * HTTP response code to test
     */
    var responseCode: String? = null

    /**
     * The reference to a TestScript.rule
     */
    var rule: TestScriptSetupActionAssertRule? = null

    /**
     * The reference to a TestScript.ruleset
     */
    var ruleset: TestScriptSetupActionAssertRuleset? = null

    /**
     * Fixture Id of source expression or headerField
     */
    var sourceId: String? = null

    /**
     * Profile Id of validation profile reference
     */
    var validateProfileId: String? = null

    /**
     * The value to compare to
     */
    var value: String? = null

    /**
     * Will this assert produce a warning only on error?
     */
    var warningOnly: Boolean? = null
}

/**
 * The reference to a TestScript.rule
 *
 * The TestScript.rule this assert will evaluate.
 */
open class TestScriptSetupActionAssertRule() : BackboneElement() {
    /**
     * Id of the TestScript.rule
     */
    var ruleId: String? = null

    val param: List<TestScriptSetupActionAssertRuleParam> =
            mutableListOf<TestScriptSetupActionAssertRuleParam>()
}

/**
 * Rule parameter template
 *
 * Each rule template can take one or more parameters for rule evaluation.
 */
open class TestScriptSetupActionAssertRuleParam() : BackboneElement() {
    /**
     * Parameter name matching external assert rule parameter
     */
    var name: String? = null

    /**
     * Parameter value defined either explicitly or dynamically
     */
    var value: String? = null
}

/**
 * The reference to a TestScript.ruleset
 *
 * The TestScript.ruleset this assert will evaluate.
 */
open class TestScriptSetupActionAssertRuleset() : BackboneElement() {
    /**
     * Id of the TestScript.ruleset
     */
    var rulesetId: String? = null

    val rule: List<TestScriptSetupActionAssertRulesetRule> =
            mutableListOf<TestScriptSetupActionAssertRulesetRule>()
}

/**
 * The referenced rule within the ruleset
 *
 * The referenced rule within the external ruleset template.
 */
open class TestScriptSetupActionAssertRulesetRule() : BackboneElement() {
    /**
     * Id of referenced rule within the ruleset
     */
    var ruleId: String? = null

    val param: List<TestScriptSetupActionAssertRulesetRuleParam> =
            mutableListOf<TestScriptSetupActionAssertRulesetRuleParam>()
}

/**
 * Rule parameter template
 *
 * Each rule template can take one or more parameters for rule evaluation.
 */
open class TestScriptSetupActionAssertRulesetRuleParam() : BackboneElement() {
    /**
     * Parameter name matching external assert ruleset rule parameter
     */
    var name: String? = null

    /**
     * Parameter value defined either explicitly or dynamically
     */
    var value: String? = null
}

/**
 * A test in this script
 *
 * A test in this script.
 */
open class TestScriptTest() : BackboneElement() {
    /**
     * Tracking/logging name of this test
     */
    var name: String? = null

    /**
     * Tracking/reporting short description of the test
     */
    var description: String? = null

    val action: List<TestScriptTestAction> = mutableListOf<TestScriptTestAction>()
}

/**
 * A test operation or assert to perform
 *
 * Action would contain either an operation or an assertion.
 */
open class TestScriptTestAction() : BackboneElement() {
    /**
     * The setup operation to perform
     */
    var operation: TestScriptSetupActionOperation? = null

    /**
     * The setup assertion to perform
     */
    @SerializedName("assert")
    var assert_fhir: TestScriptSetupActionAssert? = null
}

/**
 * A series of required clean up steps
 *
 * A series of operations required to clean up after the all the tests are executed (successfully or otherwise).
 */
open class TestScriptTeardown() : BackboneElement() {
    val action: List<TestScriptTeardownAction> = mutableListOf<TestScriptTeardownAction>()
}

/**
 * One or more teardown operations to perform
 *
 * The teardown action will only contain an operation.
 */
open class TestScriptTeardownAction() : BackboneElement() {
    /**
     * The teardown operation to perform
     */
    var operation: TestScriptSetupActionOperation = TestScriptSetupActionOperation()
}
