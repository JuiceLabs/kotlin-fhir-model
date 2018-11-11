
package com.juicelabs.fhir.base

import com.google.gson.JsonDeserializationContext
import com.google.gson.JsonDeserializer
import com.google.gson.JsonElement
import com.google.gson.JsonPrimitive
import com.google.gson.JsonSerializationContext
import com.google.gson.JsonSerializer
import java.lang.reflect.Type
import java.time.LocalDate
import java.time.LocalDateTime
import java.time.LocalTime
import java.time.Year
import java.time.YearMonth
import java.time.ZoneId
import java.time.ZonedDateTime
import java.time.format.DateTimeFormatter
import java.time.temporal.Temporal
import java.util.*


/**
 *  A date or partial date (e.g. just year or year + month). There is no time zone. The format is a union of the schema
 *  types gYear, gYearMonth and date.  Dates SHALL be valid dates.
 */
class FhirDate(private val input: String) {

    companion object {
        fun now(): FhirDate {
            return FhirDate(LocalDateTime.now().toString())
        }

        private val yearFormats = listOf(
                DateTimeFormatter.ofPattern("yyyy")
        )
        private val dateFormats = listOf(
                DateTimeFormatter.ofPattern("yyyy-MM-dd"),
                DateTimeFormatter.ISO_LOCAL_DATE,
                DateTimeFormatter.ofPattern("MMM d yyyy")
        )

        private val yearMonthFormats = listOf(
                DateTimeFormatter.ofPattern("yyyy-MM")
        )

        private val timeFormats = listOf(
                DateTimeFormatter.ofPattern("HH:mm"),
                DateTimeFormatter.ISO_TIME,
                DateTimeFormatter.ISO_LOCAL_TIME
        )

        private val dateTimeFormats = listOf(
                DateTimeFormatter.ISO_LOCAL_DATE_TIME
                        .withLocale(Locale.getDefault())
                        .withZone(ZoneId.systemDefault()),
                DateTimeFormatter.ISO_INSTANT,
                DateTimeFormatter.ISO_OFFSET_DATE_TIME,
                DateTimeFormatter.RFC_1123_DATE_TIME
        )
    }

    private var format: DateTimeFormatter = DateTimeFormatter.BASIC_ISO_DATE
    private var dateValue: Temporal? = null

    init {
        parse(yearFormats, Year::parse)
                ?: parse(dateFormats, LocalDate::parse)
                ?: parse(yearMonthFormats, YearMonth::parse)
                ?: parse(dateTimeFormats, ZonedDateTime::parse)
                ?: parse(timeFormats, LocalTime::parse)
        if (dateValue == null) throw Exception("Unable to parse input value: $input")
    }

    override fun toString(): String {
        return format.format(dateValue)
    }

    private fun parse(formats: List<DateTimeFormatter>, parser: (o: String, m: DateTimeFormatter) -> Temporal): Boolean? {
        for (it in formats) {
            val dt = try {
                parser(input, it)
            } catch (e: Exception) {
                null
            }
            if (dt != null) {
                dateValue = dt
                format = it
                return true
            }
        }
        return null
    }
}

class FhirDateSerializer : JsonSerializer<FhirDate> {
    override fun serialize(p0: FhirDate?, p1: Type?, p2: JsonSerializationContext?): JsonElement {
        return JsonPrimitive(p0.toString())
    }
}

class FhirDateDeSerializer : JsonDeserializer<FhirDate> {
    override fun deserialize(p0: JsonElement?, p1: Type?, p2: JsonDeserializationContext?): FhirDate {
        return FhirDate(p0!!.asString)
    }

}
