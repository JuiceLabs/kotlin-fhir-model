package com.juicelabs.fhir.generator

import com.google.gson.JsonArray
import com.google.gson.JsonObject

class FhirStructureDefinition(val fhirSpec: FhirSpec, val profile: JsonObject) {

    val structure = FhirStructureDefinitionStructure(fhirSpec, this)
    val elements = mutableListOf<FhirStructureDefinitionElement>()
    var mainElement: FhirStructureDefinitionElement? = null
    val classes = mutableListOf<FhirClass>()
    var didWrapUp: Boolean = false
    val url: String
    val isManual = false
    lateinit var targetName: String


    fun name(): String? {
        return structure.name
    }


    init {
        assert(profile.getStringOrEmpty("resourceType") == "StructureDefinition")

        url = profile["url"].asString

        structure.parseFrom(profile)
    }


    fun processProfile() {
        val struct = if (structure.differential != null) structure.differential as JsonArray else structure.snapshot as JsonArray

        var i = 0
        val mapped = mutableMapOf<String, FhirStructureDefinitionElement>()
        struct.forEach { e ->
            i++
            val element = FhirStructureDefinitionElement(this, e as JsonObject, (mainElement == null))
            elements.add(element)
            val path = element.path
            mapped.put(path, element)

            // establish hierarchy (may move to extra loop in case elements are no longer in order)
            if (element.isMainProfileElement) {
                mainElement = element
            }

            mapped[element.parentName]?.addChild(element)

            elements.forEach {
                it.resolveDependencies()
            }

            // run check: if n_min > 0 and parent is in summary, must also be in summary
            elements.forEach { elem ->
                val p = elem.parent
                if (elem.min != null && p != null && p.isSummary && !elem.isSummary) {
                    //logger.error("n_min > 0 but not summary: `{}`".format(element.path))
                    elem.summaryMinConflict = true
                }
            }
        }

        // create classes and class properties
        if (mainElement != null) {
            val (snapClass, kids) = mainElement!!.createClass() // todo stench

            if (snapClass == null) {
                throw Exception("The main element for \"$url\" did not create a class")
            } else {
                foundClass(snapClass)

                kids.forEach { cls ->
                    foundClass(cls)
                }

                targetName = snapClass.name
            }
        }
    }


    private fun foundClass(klass: FhirClass) {
        classes.add(klass)
    }


    fun elementWithId(ident: String): FhirStructureDefinitionElement? {

        elements.forEach { e ->
            if (e.definition.id == ident) {
                return e
            }
        }
        return null
    }


    fun wrapUp() {
        // assign all super-classes as objects
        classes.forEach { c ->
            if (c.superClass == null) {
                val sc = FhirClass.withName(c.superclassName)
                if (sc == null && c.superclassName != null) {
                    //                  throw Exception("There is no class implementation for class named ${c.superclassName} in profile ${url}")
                }
                c.superClass = sc
            }
        }
        didWrapUp = true
    }


    fun writeableClasses(): List<FhirClass> {
        val c = mutableListOf<FhirClass>()
        classes.forEach { fclass ->
            if (fclass.shouldWrite()) {
                c.add(fclass)
            }
        }
        return c
    }


    /**
     * Returns a unique list of class items that are needed for any of the
     * receiver's classes' properties and are not defined in this profile.
     */
    fun neededExternalClasses(): Set<Pair<String, String>> {
        val internal = mutableSetOf<String>()
        internal.addAll(classes.map { it.name })

        val needed = mutableSetOf<Pair<String, String>>()

        classes.forEach { cls ->

            cls.properties.forEach { prop ->
                val typeName = Settings.classMap[prop.typeName.decapitalize()] ?: prop.typeName
                if (Settings.imports.containsKey(typeName)) {
                    needed.add(Settings.imports[typeName]!!)

                }

            }
        }
        return needed
    }
}