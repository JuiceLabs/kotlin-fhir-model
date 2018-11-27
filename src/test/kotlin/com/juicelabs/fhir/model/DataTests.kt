package com.juicelabs.fhir.model

import com.google.gson.Gson
import java.io.File
import kotlin.Boolean
import kotlin.String

open class DataTests {
    val mapper: Gson

    init {
        mapper = com.juicelabs.fhir.base.getFhirGson()
    }

    fun stringMatch(str: String, actual: String?): Boolean = if (actual.isNullOrBlank()) true else actual!!.startsWith(str) 
}

fun File.readTextAndClose(): String {
    reader().use { reader ->
       return reader.readText()
       }
}
