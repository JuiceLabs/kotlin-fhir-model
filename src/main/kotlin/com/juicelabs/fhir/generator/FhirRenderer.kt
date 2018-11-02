package com.juicelabs.fhir.generator

import java.io.File


open class FhirRenderer(val spec: FhirSpec) {
    fun build() {
        FhirStructureDefinitionRenderer(spec).render()
        TestClassRenderer(spec)
 //       copyDefaultClasses()
    }

    private fun copyDefaultClasses() {

        File("./src/main/kotlin/com/juicelabs/fhir/default")
                .walk()
                .filter { it.name != "model" }
                .forEach {
                    it.copyTo(File("${Settings.destinationSrcDir}/com/juicelabs/fhir/model/${it.name}"), true)
                }
    }
}