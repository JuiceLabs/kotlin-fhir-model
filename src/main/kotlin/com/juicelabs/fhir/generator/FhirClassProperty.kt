package com.juicelabs.fhir.generator

class FhirClassProperty(element: FhirStructureDefinitionElement, type: FhirElementType, typeName: String? = null) {


    val spec: FhirSpec
    var path: String?
    val typeName: String
    var name: String
    val one_of_many: String?
    val min: Int
    val max: Int
    val origName: String
    val parentName: String
    val className: String
    var moduleName: Nothing?
    var jsonClass: String
    val shortDesc: String
    val formalDesc: String
//    val isArray: Boolean

//    private var enum: ValueSetEnum

    init {
        spec = element.profile.fhirSpec
        path = element.path
        this.typeName = if (typeName == null)
            if (type.code != null) type.code else "" // todo fix! "" shouldn't happen
        else
            typeName
        name = element.definition.propName ?: ""
        shortDesc = if (element.definition.short != null) element.definition.short.asString else ""
        formalDesc = if (element.definition.formal != null) element.definition.formal.asString else ""

        var n = name
        if (n.contains("[x]")) { // todo mess
            one_of_many = n.replace("[x]", "")
            n = n.replace("[x]",
                    if (this.typeName.contains(".")) this.typeName.substring(0, this.typeName.indexOf(".")) else this.typeName
            )
        } else {
            one_of_many = null
        }
        min = if (element.min != null) element.min else 1
        max = element.max

        origName = n
        name = spec.safePropertyName(n)
        parentName = element.parentName
        className = if (typeName != null) spec.classNameForTypeIfProperty(typeName) ?: "" else "" // todo dear god no
//        enum = if ("code".equals(typeName)) element.enum else null
        moduleName = null // should only be set if it's an external module (think Python)
        jsonClass = spec.jsonClassForClassName(className)
//        isNative = if (enumval == null && className != null)  spec.jsonClassForClassName(className) else null
//        isArray = "*".equals(element.max)
//        isSummary = element.isSummary
//        isSummaryMinConflict = element
    }

    fun isList(): Boolean {
        return (((min == 0 || min == 1) && (max == -1 || max > 1)) || (min > 1))
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as FhirClassProperty

        if (spec != other.spec) return false
        if (path != other.path) return false
        if (typeName != other.typeName) return false
        if (name != other.name) return false
        if (one_of_many != other.one_of_many) return false
        if (min != other.min) return false
        if (max != other.max) return false
        if (origName != other.origName) return false
        if (parentName != other.parentName) return false
        if (className != other.className) return false
        if (jsonClass != other.jsonClass) return false
        if (shortDesc != other.shortDesc) return false
        if (formalDesc != other.formalDesc) return false

        return true
    }

    override fun hashCode(): Int {
        var result = spec.hashCode()
        result = 31 * result + (path?.hashCode() ?: 0)
        result = 31 * result + typeName.hashCode()
        result = 31 * result + name.hashCode()
        result = 31 * result + (one_of_many?.hashCode() ?: 0)
        result = 31 * result + min
        result = 31 * result + max
        result = 31 * result + origName.hashCode()
        result = 31 * result + parentName.hashCode()
        result = 31 * result + className.hashCode()
        result = 31 * result + (jsonClass.hashCode())
        result = 31 * result + shortDesc.hashCode()
        result = 31 * result + formalDesc.hashCode()
        return result
    }


}
