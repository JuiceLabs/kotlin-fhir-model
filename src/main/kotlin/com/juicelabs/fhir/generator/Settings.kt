package com.juicelabs.fhir.generator

class Settings {
    companion object {
        /**
         * http://hl7.org/fhir is the latest release. To generate other versions go to
         * http://hl7.org/fhir/directory.html and select which version to use.
         */
        const val baseUrl = "http://hl7.org/fhir/"

        val downloadFiles = (System.getenv("downloadFiles") ?: "false").equals("true", true)

        const val downloadDir = "./download"
        private const val destinationBaseDir = "."
        const val destinationSrcDir = "$destinationBaseDir/src/main/kotlin"
        const val destinationTestDir = "$destinationBaseDir/src/test/kotlin"
        const val samplesDir = "$destinationBaseDir/src/test/resources/model/sample_data"

        val reservedMap = mapOf(
                "for" to "for_fhir",
                "from" to "from_fhir",
                "class" to "class_fhir",
                "import" to "import_fhir",
                "global" to "global_fhir",
                "assert" to "assert_fhir",
                "when" to "when_fhir",
                "package" to "package_fhir"
        )

        val  classMap = mapOf(
                "Any" to "Resource",
                "Practitioner.role" to "PractRole",  // to avoid Practitioner.role and PractitionerRole generating the same class

                "bool" to "Boolean",
                "integer" to "Int",
                "positiveint" to "Int",
                "unsignedint" to "Int",
                "date" to "FhirDate",
                "datetime" to "FhirDate",
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
                "base64binary" to "String"
        )


        val primitives = listOf(
                "String",
                "Int",
                "Boolean",
                "Float",
                "FhirDate"
        )

        val imports = mapOf(
                "FhirDate" to Pair("com.juicelabs.fhir.base", "FhirDate")
        )

        val enumNameMap = mapOf(
                "httpto//hl7.org/fhir/contracttermsubtypecodes" to "ContractTermSubtypeCodes",
                "httpto//hl7.org/fhir/coverage-exception" to "CoverageExceptionCodes",
                "httpto//hl7.org/fhir/resource-type-link" to "ResourceTypeLink"
        )

        val jsonmap = mapOf(
                "str" to "String",
                "int" to "Int",
                "bool" to "Boolean",
                "float" to "Float",
                "FhirDate" to "FhirDateTime"
        )

        const val jsonMapDefault = "dict"

        // Which class names are native to the language (or can be treated this way)
        val natives = listOf("Int", "Float", "Boolean", "String", "List",
                "LocalDateTime", "FhirDate")

        val defaultValues = mapOf(
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

class CaseInsensitiveMutableMap<V>(private val map: MutableMap<String, V>) : MutableMap<String, V> by map {

    override fun containsKey(key: String): Boolean {
        return this.map.keys.any { it.equals(key, ignoreCase = true) }
    }

    override fun get(key: String): V? {
        return this.map.filter { it.key.equals(key, ignoreCase = true) }.map { it.value }.firstOrNull()
    }

    override fun remove(key: String): V? {
        return this.map.filter { it.key.equals(key, ignoreCase = true) }.map { it.key }.firstOrNull()?.let {
            this.map.remove(it)
        }
    }

    override fun put(key: String, value: V): V? {
        val old = this.remove(key)
        this.map.put(key, value)
        return old
    }

    override fun putAll(from: Map<out String, V>) {
        for ((key, value) in from) {
            this.put(key, value)
        }
    }

    override fun toString(): String {
        return this.map.toString()
    }

}
