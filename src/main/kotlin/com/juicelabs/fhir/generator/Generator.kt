package com.juicelabs.fhir.generator

import com.google.gson.JsonObject
import java.io.File
import java.io.FileInputStream
import java.io.FileOutputStream
import java.io.IOException
import java.net.URL
import java.nio.file.Files
import java.nio.file.Paths
import java.util.zip.ZipInputStream


fun main(args: Array<String>) {
    val baseUrl = URL(Settings.baseUrl)
    if (Settings.downloadFiles) {
        deleteFiles(Settings.downloadDir)
        downloadSpec(baseUrl)
    }
    copyExamples()
    deleteFiles(Settings.destinationSrcDir + "/model")
    deleteFiles(Settings.destinationTestDir + "/model")
    val fhirSpec = FhirSpec(Settings.destinationSrcDir, "com.juicelabs.fhir.model")
    fhirSpec.prepare()
    FhirRenderer(fhirSpec).build()
}

fun downloadSpec(url: URL) {
    createDir(Settings.downloadDir)
    downloadFromUrl(URL(url, "version.info"), "${Settings.downloadDir}/version.info")
    downloadFromUrl(URL(url, "examples-json.zip"), "${Settings.downloadDir}/examples-json.zip")
    unzip("${Settings.downloadDir}/examples-json.zip", "${Settings.downloadDir}/")
}

fun copyExamples() {
    // delete any existing examples
    deleteFiles(Settings.samplesDir)
    var i = 0
    File(Settings.downloadDir)
            .walk()
            .filter { it.name.contains("example") }
            .filter { !it.name.startsWith("list") }
            .forEach { file ->
                file.copyTo(File("${Settings.samplesDir}/${file.name}"), true)
                println("Copying example file: ${file.name}")
                i++
            }
    println("Copied $i example files")
}

fun deleteFiles(directory: String) {
    try {
        var i = 0
        Files.newDirectoryStream(Paths.get(directory)).use { directoryStream ->
            for (path in directoryStream) {
                path.toFile().delete()
                i++
            }
        }
        println("Deleted $i files")
    } catch (ex: IOException) {
        println("Error deleting files in $directory")
    }
}


fun downloadFromUrl(url: URL, localFilename: String) {
    println("Downloading: $url")
    val urlConn = url.openConnection()

    val inputStream = urlConn.getInputStream()
    val fos = FileOutputStream(localFilename)

    inputStream.use {
        fos.use { output ->
            inputStream.copyTo(output)
        }
    }
}

fun unzip(zipFile: String, targetLocation: String) {

    // create target location folder if not exist
    createDir(targetLocation)

    val fin = FileInputStream(zipFile)
    val zin = ZipInputStream(fin)
    var ze = zin.nextEntry
    while (ze != null) {
        println("Extracting ${ze.name}")

        if (ze.isDirectory) {
            createDir(ze.name)
        } else {
            val fout = FileOutputStream(targetLocation + ze.name)
            fout.use { output ->
                zin.copyTo(output)
            }
        }
        ze = zin.nextEntry
    }
    zin.close()
    File(zipFile).delete()
}


fun createDir(dirPath: String) {
    print("Creating directory [$dirPath] ")
    // Check If Directory Already Exists Or Not?
    val dirPathObj = Paths.get(dirPath)
    val dirExists = Files.exists(dirPathObj)
    if (dirExists) {
        println(" Directory Already Exists !")
    } else {
        try {
            Files.createDirectories(dirPathObj)
            println(" Success")
        } catch (ioExceptionObj: IOException) {
            println("Problem Occured While Creating The Directory Structure= " + ioExceptionObj.message)
        }
    }
}


fun File.readTextAndClose(): String? {
    return reader().use { reader ->
        reader.readText()
    }
}

fun JsonObject.getStringOrNull(key: String): String? {
    val v = this.get(key)
    if (v == null || !v.isJsonPrimitive) {
        return null
    }
    return v.asString
}

fun JsonObject.getStringOrEmpty(key: String): String {
    val v = this.get(key)
    if (v == null || !v.isJsonPrimitive) {
        return ""
    }
    return v.asString
}

fun JsonObject.getBooleanOrFalse(key: String): Boolean {
    val v = this.get(key)
    if (v == null || !v.isJsonPrimitive) {
        return false
    }
    return v.asBoolean
}