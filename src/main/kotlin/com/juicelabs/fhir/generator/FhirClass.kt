package com.juicelabs.fhir.generator

import com.google.gson.JsonElement

class FhirClass(element: FhirStructureDefinitionElement) {

    val path: String?
    val name: String
    var module: String? = null
    val resourceType: String?
    val superclassName: String?
    var superClass: FhirClass? = null
    val short: JsonElement?
    val formal: JsonElement?
    val properties = mutableListOf<FhirClassProperty>()


    init {
        path = element.path
        name = element.nameIfClass()
        resourceType = element.nameOfResource()
        superclassName = element.getSuperclassName()
        short = element.definition.short
        formal = element.definition.formal
    }


    companion object {
        val known = mutableMapOf<String, FhirClass>()

        fun forElement(element: FhirStructureDefinitionElement): Pair<FhirClass, Boolean> {
            val className = element.nameIfClass()
            if (known.containsKey(className)) {
                return Pair(known[className]!!, false)
            }
            val klass = FhirClass(element)
            known.put(className, klass)
            return Pair(klass, true)
        }

        fun withName(className: String?): FhirClass? {
            return known[className]
        }
    }


    fun addProperty(prop: FhirClassProperty) {
        // todo checks
        if (properties.contains(prop)) {
            return
        }
        properties.add(prop)

        // todo sort?

//        if prop.nonoptional and prop.one_of_many is not None:
//        if prop.one_of_many in self.expanded_nonoptionals:
//        self.expanded_nonoptionals[prop.one_of_many].append(prop)
//        else:
//        self.expanded_nonoptionals[prop.one_of_many] = [prop]
    }

    fun shouldWrite(): Boolean {
        if (superClass != null) {
            return true
        }
        return properties.size > 0
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as FhirClass

        if (path != other.path) return false
        if (name != other.name) return false
        if (module != other.module) return false
        if (resourceType != other.resourceType) return false
        if (superclassName != other.superclassName) return false
        if (superClass != other.superClass) return false
        if (short != other.short) return false
        if (formal != other.formal) return false
        if (properties != other.properties) return false

        return true
    }

    override fun hashCode(): Int {
        var result = path?.hashCode() ?: 0
        result = 31 * result + name.hashCode()
        result = 31 * result + (module?.hashCode() ?: 0)
        result = 31 * result + (resourceType?.hashCode() ?: 0)
        result = 31 * result + (superclassName?.hashCode() ?: 0)
        result = 31 * result + (superClass?.hashCode() ?: 0)
        result = 31 * result + (short?.hashCode() ?: 0)
        result = 31 * result + (formal?.hashCode() ?: 0)
        result = 31 * result + properties.hashCode()
        return result
    }


}
