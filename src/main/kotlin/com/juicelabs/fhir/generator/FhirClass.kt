package com.juicelabs.fhir.generator

/**
 * An element/resource that should become its own class.
 */
class FhirClass(element: FhirStructureDefinitionElement) {
    val log by logger()

    val path: String = element.path
    val name: String = element.nameIfClass()
    var module: String? = null
    val resourceType: String? = element.nameOfResource()
    val superclassName: String? = if (name == "Resource") "FhirAbstractResource" else element.getSuperclassName()
    var superClass: FhirClass? = null
    val short: String = element.definition.short
    val formal: String = element.definition.formal

//    private val comp = Comparator<FhirClassProperty> { s1, s2 -> s1.name.compareTo(s2.name) }
//
//    val properties = sortedSetOf(comp)

    val properties: MutableMap<String, FhirClassProperty> = mutableMapOf()

    init {
        print(1)
    }

    companion object {
        val known = mutableMapOf<String, FhirClass>()

        fun forElement(element: FhirStructureDefinitionElement): Pair<FhirClass, Boolean> {
            val className = element.nameIfClass()
            if (known.containsKey(className)) {
                return Pair(known[className]!!, false)
            }
            val klass = FhirClass(element)
            known[className] = klass
            return Pair(klass, true)
        }

        fun withName(className: String?): FhirClass? {
            return known[className]
        }


        fun findProperty(parent: FhirClass, paths: List<String>, key: String): FhirClassProperty? {
            var cls: FhirClass? = parent
            for (path in paths) {
                if (path.isBlank()) {
                    break
                }
                // todo rethink this
                if (cls!!.properties.containsKey(path)) {
                    cls = withName(cls.properties[path]!!.typeName)
                    if (cls == null) {
                        return null
                    }
                    break
                }
            }

            return cls!!.properties[key]
        }
    }

    fun addProperty(prop: FhirClassProperty) {

        // do we already have a property with this name?
        // if we do and it's a specific reference, make it a reference to a generic resource
        if (properties.containsKey(prop.name)) {
            if (properties[prop.name]!!.referenceToNames.isEmpty()) {
                log.warn("Already have property ${prop.name} on $name, which is only allowed for references")
            } else {
                properties[prop.name]!!.referenceToNames.addAll(prop.referenceToNames)
            }
        }
        // todo needed still?
        if (properties.contains(prop.name)) {
            return
        }

        properties[prop.name] = prop

        // todo
//        if prop.nonoptional and prop.oneOfMany is not None:
//        if prop.oneOfMany in self.expanded_nonoptionals:
//        self.expanded_nonoptionals[prop.oneOfMany].append(prop)
//        else:
//        self.expanded_nonoptionals[prop.oneOfMany] = [prop]
    }


    fun shouldWrite(): Boolean {
        if (superClass != null) {
            return true
        }
        return properties.isNotEmpty()
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
        var result = path.hashCode()
        result = 31 * result + name.hashCode()
        result = 31 * result + (module?.hashCode() ?: 0)
        result = 31 * result + (resourceType?.hashCode() ?: 0)
        result = 31 * result + (superclassName?.hashCode() ?: 0)
        result = 31 * result + (superClass?.hashCode() ?: 0)
        result = 31 * result + (short.hashCode())
        result = 31 * result + (formal.hashCode())
        result = 31 * result + properties.hashCode()
        return result
    }


}
