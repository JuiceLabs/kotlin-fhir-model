package com.juicelabs.fhir.generator

import com.google.gson.JsonObject

class FhirStructureDefinitionElement(val profile: FhirStructureDefinition, element: JsonObject, val isMainProfileElement: Boolean = false) {
    val log by logger()

    var path: String
    val parentName: String
    var parent: FhirStructureDefinitionElement? = null
    val propertyName: String
    val definition: FhirStructureDefinitionElementDefinition
    val min: Int?
    val max: Int
    val isSummary: Boolean
    var summaryMinConflict = false  // to mark conflicts, see #13215 (http://gforge.hl7.org/gf/project/fhir/tracker/?action=TrackerItemEdit&tracker_item_id=13125)
    var representsClass: Boolean = false
    val children = mutableListOf<FhirStructureDefinitionElement>()
    var dependenciesResolved: Boolean = false
    private var superclassName: String? = null // todo stomping on var?

    init {
        val p = element.get("path").asString
        path = p
        val parts = p?.split(".") ?: listOf(path)

        parentName = if (p.contains(".")) p.substringBeforeLast(".") else ""
        propertyName = parts.last()

        // todo add check for - in name

        definition = FhirStructureDefinitionElementDefinition(this, element)
        definition.propName = parts.last()

        min = if (element.has("min")) element["min"].asInt else null
        max = if (element.has("max"))
            if (element["max"].asString.contains("*"))
                -1  // infinity
            else
                element["max"].asInt
        else
            0

        isSummary = element.getBooleanOrFalse("isSummary")
    }


    fun resolveDependencies() {
        representsClass = isMainProfileElement
        if (!representsClass && children.size > 0) {
            representsClass = true
        }

        definition.resolveDependencies()

        dependenciesResolved = true
    }


    fun addChild(element: FhirStructureDefinitionElement) {
        if (element != this) {
            element.parent = this
        } else {
            throw Exception("What the fuck?")
        }
        children.add(element)
    }

    /**
     * Creates a FHIRClass instance from the receiver, returning the
     * created class as the first and all inline defined subclasses as the
     * second item in the tuple.
     */
    fun createClass(module: String? = null): Pair<FhirClass?, MutableList<FhirClass>> {
        assert(dependenciesResolved)
        if (!representsClass) return Pair(null, mutableListOf())

        val subs = mutableListOf<FhirClass>()

        val (klass, didCreate) = FhirClass.forElement(this)
        if (didCreate) {
            log.debug("Created class '${klass.name}'")
            var mod = module
            if (module == null && isMainProfileElement) {
                mod = profile.fhirSpec.asModuleName(klass.name)
            }
            klass.module = mod
        }

        // child classes
        children.forEach { child ->
            val properties = child.asProperties()

            if (properties.isNotEmpty()) {
                // collect subclasses
                val (sub, kids) = child.createClass(module) // todo eek
                if (sub != null) {
                    subs.add(sub)
//                    subs.put(sub, if (kids.count() > 0 && kids.containsKey(sub)) kids[sub]!! else emptyList())
                }

                if (kids.isNotEmpty()) {
                    subs.addAll(kids)
                }

                // add properties to class
                if (didCreate) {
                    properties.forEach { prop ->
                        klass.addProperty(prop)
                    }
                }
            }
        }
        return Pair(klass as FhirClass?, subs)
    }


    /**
     * If the element describes a *class property*, returns a list of
     * FHIRClassProperty instances, None otherwise.
     */
    fun asProperties(): List<FhirClassProperty> {
        assert(dependenciesResolved)

        if (isMainProfileElement) {
            return emptyList()
        }

        // TODO: handle slicing information (not sure why these properties were omitted previously)
        //if self.definition.slicing:
        //    logger.debug('Omitting property "{}" for slicing'.format(self.definition.prop_name))
        //    return None

        // this must be a property
        if (parent == null) {
            throw  Exception("Element reports as property but has no parent: $path")
        }

        // create a list of FHIRClassProperty instances (usually with only 1 item)
        if (definition.types.count() > 0) {
            val props = mutableListOf<FhirClassProperty>()
            definition.types.forEach { typeObj ->
                // an inline class
                if ("BackboneElement" == typeObj.code || "Element" == typeObj.code) {
                    // data types don't use "BackboneElement"
                    props.add(FhirClassProperty(this, typeObj, nameIfClass()))
                    // TODO: look at http://hl7.org/fhir/StructureDefinition/structuredefinition-explicit-type-name ?
                } else {
                    props.add(FhirClassProperty(this, typeObj))
                }
            }
            return props
        }

        // no `type` definition in the element: it's a property with an inline class definition
        val typeObj = FhirElementType()
        return listOf(FhirClassProperty(this, typeObj, nameIfClass()))
    }


    fun nameOfResource(): String? {
        assert(dependenciesResolved)
        if (!isMainProfileElement) {
            return nameIfClass()
        }
        return definition.name
    }


    fun nameIfClass(): String {
        return definition.nameIfClass()
    }


    fun getSuperclassName(): String? {
        if (superclassName == null) {
            val types = definition.types
            if (types.size > 1) {
                throw Exception("Have more than one type to determine superclass in '$path': '$types'")
            }
            var typeCode: String? = null
            if (isMainProfileElement && profile.structure.subClassOf != null) {
                typeCode = profile.structure.subClassOf
            } else if (types.size > 0) {
                typeCode = types[0].code
            } else if (profile.structure.kind != null) {
                typeCode = profile.structure.kind
            }
            superclassName = typeCode
        }
        return superclassName
    }

}
