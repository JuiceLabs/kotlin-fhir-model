package com.juicelabs.fhir.generator

class Settings {
    companion object {
        const val baseUrl = "http://hl7.org/fhir/"

        const val downloadFiles = false

        const val downloadDir = "./download"
        const val destinationBaseDir = "."
        const val destinationSrcDir = "$destinationBaseDir/src/main/kotlin"
        const val destinationTestDir = "$destinationBaseDir/src/test/kotlin"
        const val samplesDir = "$destinationBaseDir/src/test/resources/model/sample_data"

        val reservedMap = mapOf<String, String>(
                "for" to "for_fhir",
                "from" to "from_fhir",
                "class" to "class_fhir",
                "import" to "import_fhir",
                "global" to "global_fhir",
                "assert" to "assert_fhir",
                "except" to "except_fhir",
                "when" to "when_fhir",
                "package" to "package_fhir"
        )

        val classMap = mapOf<String, String>(
                "Any" to "Resource",
                "Practitioner.role" to "PractRole",  // to avoid Practinioner.role and PractitionerRole generating the same class

                "bool" to "Boolean",
                "integer" to "Int",
                "positiveInt" to "Int",
                "unsignedInt" to "Int",
                "date" to "FhirDate",
                "dateTime" to "FhirDate",
                "instant" to "FhirDate",
                "time" to "FhirDate",
                "decimal" to "Float",

                "markdown" to "String",
                "id" to "String",
                "code" to "String", // for now we"re not generating enums for these
                "uri" to "String",
                "url" to "String",
                "canonical" to "String",
                "oid" to "String",
                "uuid" to "String",
                "xhtml" to "String",
                "base64Binary" to "String"
        )

        val imports = mapOf(
                "FhirDate" to Pair("com.juicelabs.fhir.default", "FhirDate")
        )

        val enumNameMap = mapOf<String, String>(
                "httpto//hl7.org/fhir/contracttermsubtypecodes" to "ContractTermSubtypeCodes",
                "httpto//hl7.org/fhir/coverage-exception" to "CoverageExceptionCodes",
                "httpto//hl7.org/fhir/resource-type-link" to "ResourceTypeLink"
        )

        val jsonmap = mapOf<String, String>(
                "str" to "String",
                "int" to "int",
                "bool" to "bool",
                "float" to "float",
                "FhirDate" to "FhirDateTime"
        )

        val jsonMapDefault = "dict"

        // Which class names are native to the language (or can be treated this way)
        val natives = listOf<String>("Int", "Float", "Boolean", "String", "List",
                "LocalDateTime", "FhirDate")

        val defaultValues = mapOf<String, String>(
                "String" to """""""",
                "Boolean" to "false",
                "Int" to "0",
                "Float" to "0.0f",
                "LocalDate" to "LocalDate.now()",
                "LocalDateTime" to "LocalDateTime.now()",
                "FhirDate" to "FhirDate.now()"
        )

        val manualClasses = mapOf(
                "FhirAbstractResource" to mapOf(
                        "resourceType" to Pair("String?", "null")
                )
        )
    }
}

