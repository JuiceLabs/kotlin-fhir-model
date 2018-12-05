package com.juicelabs.fhir.generator

import com.google.gson.JsonElement

class FhirClassProperty(element: FhirStructureDefinitionElement, type: FhirElementType, typeName: String? = null) {


    val spec: FhirSpec = element.profile.fhirSpec
    var path: String = element.path
    val typeName: String = typeName ?: type.code ?: "" // Settings.classMap.getOrDefault( type.code?.toLowerCase(), type.code) ?: ""
    var name: String = element.definition.propName ?: ""
    val oneOfMany: String?
    val min: Int
    val max: Int
    val origName: String
    val parentName: String
    val className: String
    var jsonClass: String
    val shortDesc: String = element.definition.short
    val formalDesc: String = element.definition.formal
    val isNative: Boolean

    private var isSummary: Boolean

    private var representation: JsonElement? // todo string?

    var referenceToNames: MutableList<String>

    init {

        var n = name

        if (n.contains("[x]")) {
            oneOfMany = n.replace("[x]", "")
            n = oneOfMany + this.typeName.capitalize()
        } else {
            oneOfMany = null
        }
        max = element.max

        origName = n
        name = spec.safePropertyName(n)
        parentName = element.parentName
        className = spec.classNameForTypeIfProperty(this.typeName) ?: ""
       // moduleName = null // should only be set if it's an external module (think Python)
        jsonClass = spec.jsonClassForClassName(className)
        isNative = spec.classNameIsNative(className)

        isSummary = element.isSummary
        referenceToNames = if (type.profile != null) mutableListOf(spec.classNameForProfile(type.profile.asString)) else mutableListOf()
        representation = element.definition.representation

        if (Settings.primitives.contains(className)) {
            min = 0
        } else {
            min = element.min ?: 1
        }
    }

    fun isList(): Boolean {
        return (((min == 0 || min == 1) && (max == -1 || max > 1)) || (min > 1))
    }

    fun isNullable(): Boolean {
        return min == 0 && !isList()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as FhirClassProperty

        if (spec != other.spec) return false
        if (path != other.path) return false
        if (typeName != other.typeName) return false
        if (name != other.name) return false
        if (oneOfMany != other.oneOfMany) return false
        if (min != other.min) return false
        if (max != other.max) return false
        if (origName != other.origName) return false
        if (parentName != other.parentName) return false
        if (className != other.className) return false
        if (jsonClass != other.jsonClass) return false
        if (shortDesc != other.shortDesc) return false
        if (formalDesc != other.formalDesc) return false
        if (isNative != other.isNative) return false
        if (isSummary != other.isSummary) return false
        if (representation != other.representation) return false
        if (referenceToNames != other.referenceToNames) return false

        return true
    }

    override fun hashCode(): Int {
        var result = spec.hashCode()
        result = 31 * result + path.hashCode()
        result = 31 * result + typeName.hashCode()
        result = 31 * result + name.hashCode()
        result = 31 * result + (oneOfMany?.hashCode() ?: 0)
        result = 31 * result + min
        result = 31 * result + max
        result = 31 * result + origName.hashCode()
        result = 31 * result + parentName.hashCode()
        result = 31 * result + className.hashCode()
        result = 31 * result + jsonClass.hashCode()
        result = 31 * result + shortDesc.hashCode()
        result = 31 * result + formalDesc.hashCode()
        result = 31 * result + isNative.hashCode()
        result = 31 * result + isSummary.hashCode()
        result = 31 * result + (representation?.hashCode() ?: 0)
        result = 31 * result + referenceToNames.hashCode()
        return result
    }

}
