package com.juicelabs.fhir.generator

import com.google.gson.Gson
import com.google.gson.JsonElement
import com.google.gson.JsonObject
import com.google.gson.JsonParser
import java.io.File
import java.util.*


class FhirSpec(val directory: String, val packageName: String) {
    val log by logger()

    val gson = Gson()

    val valueSets: MutableMap<String, FhirValueSet> = HashMap()
    val codeSystems: MutableMap<String, FhirCodeSystem> = HashMap()
    val profiles: MutableMap<String, FhirStructureDefinition> = HashMap()
    val info: FhirVersionInfo = FhirVersionInfo(this, directory)
    val skipBecauseUnsupported = arrayOf(
            "SimpleQuantity"
    )


    init {
        // assert directory exists


    }


    fun prepare() {
        readValueSets()
        handleManualProfiles()
        readProfiles()
        wrapUp()
        println("done")
    }


    private fun readBundleResources(f: String): List<JsonElement> {
        val parser = JsonParser()
        val resources: MutableList<JsonElement> = mutableListOf()

        val json = parser.parse(File("${Settings.downloadDir}/$f").readTextAndClose()).asJsonObject

        if (!json.has("resourceType")) {
            InvalidPropertiesFormatException("No resourceType in $f")
        }

        if (json.get("resourceType").asString != "Bundle") {
            InvalidPropertiesFormatException("Resource type is not Bundle")
        }

        if (!json.has("entry")) {
            throw InvalidPropertiesFormatException("No entries in Bundle")
        }

        json.get("entry").asJsonArray.forEach { elem ->
            val resource = (elem as JsonObject).get("resource") as JsonObject
            resources.add(resource)
        }

        return resources
    }


    @Suppress("UNCHECKED_CAST")
    private fun readValueSets() {
        val resources = readBundleResources("valuesets.json")
        resources.forEach { res ->
            val resource = gson.fromJson(res, Map::class.java)
            val resourceType = resource["resourceType"] as String
            val url = resource["url"] as String

            if (resourceType.contains("ValueSet")) {
                valueSets.put(url, FhirValueSet(this, resource as Map<String, FhirValueSet>))
            } else if (resourceType.contains("CodeSystem")) {
                if (resource.containsKey("content") && resource.containsKey("concept")) {
                    codeSystems.put(url, FhirCodeSystem(this, resource as Map<String, FhirCodeSystem>))
                } else {
                    log.warn("CodeSystem with no concepts: $url")
                }
            }
        }
    }


    fun valuesetWithUri(uri: String): FhirValueSet? {
        return valueSets[uri]
    }


    fun codesystemWithUri(uri: String): FhirCodeSystem {
        return codeSystems[uri]!!
    }


    private fun readProfiles() {
        val resources: MutableList<JsonElement> = mutableListOf()

        arrayOf("profiles-types.json", "profiles-resources.json").forEach { f ->
            readBundleResources(f).forEach { res ->
                if (res.asJsonObject.get("resourceType").asString == "StructureDefinition") {
                    resources.add(res)
                }
            }
        }

        // create profile instances
        resources.forEach { res ->
            val profile = FhirStructureDefinition(this, res as JsonObject)
            // todo add skip check
            /* for pattern in skip_because_unsupported:
            if re.search(pattern, profile.url) is not None:
            logger.info('Skipping "{}"'.format(resource['url']))
            profile = None
            break
            */
            if (foundProfile(profile)) {
                profile.processProfile()
            }
        }
    }


    private fun foundProfile(profile: FhirStructureDefinition): Boolean {
        if (profile.name() == null) {
            print("TODO ERROR HERE")
            return false
        }
        if (profiles.containsKey(profile.name()!!.toLowerCase())) {
            print("log key already found")
            return false
        }

        profiles[profile.name()!!.toLowerCase()] = profile
        return true
    }


    /**
     * Creates in-memory representations for all our manually defined
     * profiles.
     */
    private fun handleManualProfiles() {
        // todo impo

    }


    /**
     * Should be called after all profiles have been parsed and allows
     * to perform additional actions, like looking up class implementations
     * from different profiles.
     */
    private fun wrapUp() {
        profiles.forEach { _, profile ->
            profile.wrapUp()
        }
    }


    fun asModuleName(name: String): String? {
        return name.toLowerCase()
    }


    fun asClassName(className: String, parentName: String?): String? {
        if (className.isEmpty()) {
            return null
        }
        val pathName = if (parentName != null) parentName + "." + className else null

        if (pathName != null && Settings.classMap.containsKey(pathName.toLowerCase())) {
            return Settings.classMap[pathName.toLowerCase()]
        }

        // is our plain class mapped?
        if (Settings.classMap.containsKey(className.toLowerCase())) {
            return Settings.classMap[className.toLowerCase()]
        }

        // CamelCase
        return className.capitalize()
    }


    fun classNameForType(typeName: String, parentName: String? = null): String? {
        return asClassName(typeName, parentName)
    }


    fun classNameForTypeIfProperty(typeName: String): String? {
        val className = classNameForType(typeName)
        return if (className != null) Settings.reservedMap.getOrDefault(className, className) else null
    }


    fun classNameForProfile(profileName: String): String {
        // todo check impl for edge case
        return profileName.split("/").last()
    }


    fun classNameIsNative(className: String): Boolean {
        return Settings.natives.contains(className)
    }


    fun safePropertyName(propName: String): String {
        return Settings.reservedMap.getOrDefault(propName, propName)
    }


    // todo imp
    fun safeEnumName(name: String): String {
        return Settings.enumNameMap.getOrDefault(name, name)

    }


    fun jsonClassForClassName(className: String): String {
        return Settings.jsonmap.getOrDefault(className, Settings.jsonMapDefault)
    }


    fun writeableProfile(): List<FhirStructureDefinition> {
        val p = mutableListOf<FhirStructureDefinition>()
        profiles.forEach { _, profile ->
            if (!profile.isManual) {
                p.add(profile)
            }
        }
        return p
    }

}