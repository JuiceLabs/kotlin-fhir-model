package com.juicelabs.fhir.generator

import java.io.File
import com.google.gson.JsonObject
import java.io.IOException
import com.google.gson.stream.JsonReader
import com.google.gson.stream.JsonWriter
import com.google.gson.JsonElement
import com.google.gson.TypeAdapter
import sun.util.locale.provider.LocaleProviderAdapter.getAdapter
import com.google.gson.internal.`$Gson$Types`.getRawType
import com.google.gson.Gson
import com.google.gson.TypeAdapterFactory




open class FhirRenderer(val spec: FhirSpec) {
    fun build() {
        FhirStructureDefinitionRenderer(spec).render()
        TestClassRenderer(spec)
 //       copyDefaultClasses()
    }

    private fun copyDefaultClasses() {

        File("./src/main/kotlin/com/juicelabs/fhir/base")
                .walk()
                .filter { it.name != "model" }
                .forEach {
                    it.copyTo(File("${Settings.destinationSrcDir}/com/juicelabs/fhir/model/${it.name}"), true)
                }
    }
}


