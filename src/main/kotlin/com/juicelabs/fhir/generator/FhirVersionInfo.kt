package com.juicelabs.fhir.generator

import java.io.File
import java.time.LocalDateTime


class FhirVersionInfo(val spec: FhirSpec, val directory: String) {

    val now: LocalDateTime
    val version: String

    init {
        now = LocalDateTime.now()

        version = File("${Settings.downloadDir}/version.info").readText(Charsets.UTF_8).split("\r\n").get(2).substringAfterLast("=")
    }
}
