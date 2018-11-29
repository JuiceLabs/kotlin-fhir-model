package com.juicelabs.fhir.base

import com.google.gson.ExclusionStrategy
import com.google.gson.FieldAttributes
import com.google.gson.Gson
import com.google.gson.GsonBuilder
import com.google.gson.JsonArray
import com.google.gson.JsonDeserializationContext
import com.google.gson.JsonDeserializer
import com.google.gson.JsonElement
import com.google.gson.JsonParseException
import com.google.gson.JsonPrimitive
import com.google.gson.JsonSerializationContext
import com.google.gson.JsonSerializer
import com.juicelabs.fhir.model.Resource
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
//                DateTimeFormatter.ofPattern("yyyy-MM-dd'T'hh:mm:ssz")
                DateTimeFormatter.ISO_OFFSET_DATE_TIME,
                DateTimeFormatter.ISO_INSTANT,
                DateTimeFormatter.RFC_1123_DATE_TIME,
                DateTimeFormatter.ISO_LOCAL_DATE_TIME
                        .withLocale(Locale.getDefault())
                        .withZone(ZoneId.systemDefault())
        )
    }

    private var format: DateTimeFormatter = DateTimeFormatter.BASIC_ISO_DATE
    private var dateValue: Temporal? = null
    private var dateValueString: String

    init {
        dateValueString = input
        parse(yearFormats, Year::parse)
                ?: parse(dateFormats, LocalDate::parse)
                ?: parse(yearMonthFormats, YearMonth::parse)
                ?: parse(dateTimeFormats, ZonedDateTime::parse)
                ?: parse(timeFormats, LocalTime::parse)
        if (dateValue == null) throw Exception("Unable to parse input value: $input")
    }

    override fun toString(): String {
//        return format.format(dateValue)
        return input
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


fun getFhirGson(): Gson {
    return GsonBuilder()
            .registerTypeAdapter(FhirDate::class.java, FhirDateSerializer())
            .registerTypeAdapter(FhirDate::class.java, FhirDateDeSerializer())
            .registerTypeAdapter(Resource::class.java, ClassDeserializerAdapter<Resource>("resourceType"))
            .registerTypeHierarchyAdapter(Collection::class.java, CollectionAdapter())
//            .addDeserializationExclusionStrategy(FhirPrimitiveExclusionStrategy())
            .registerTypeAdapter(List::class.java, RemoveNullListSerializer())
            .create()
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


class ClassDeserializerAdapter<T> internal constructor(private val typeName: String) : JsonDeserializer<T> {
    private val gson: Gson

    init {
        gson = GsonBuilder()
                .registerTypeAdapter(FhirDate::class.java, FhirDateSerializer())
                .registerTypeAdapter(FhirDate::class.java, FhirDateDeSerializer())
                .create()
    }

    @Throws(JsonParseException::class)
    override fun deserialize(json: JsonElement, typeOfT: Type, context: JsonDeserializationContext): T {
        val jsonObject = json.asJsonObject
        val typeElement = jsonObject.get(typeName)
        val method = typeElement.asString
        val classType = Class.forName("com.juicelabs.fhir.model.$method") as Class<out T>
        return gson.fromJson(json, classType)
    }
}

internal class CollectionAdapter : JsonSerializer<Collection<*>> {

    override fun serialize(src: Collection<*>?, typeOfSrc: Type, context: JsonSerializationContext): JsonElement? {
        if (src == null || src.isEmpty())
        // exclusion is made here
            return null

        val array = JsonArray()

        for (child in src) {
            val element = context.serialize(child)
            array.add(element)
        }

        if (array.count() == 0) {
            return null
        }
        return array
    }
}

class RemoveNullListSerializer : JsonSerializer<List<*>> {
    override fun serialize(src: List<*>?, typeOfSrc: Type, context: JsonSerializationContext?): JsonElement? {

        val lst = src?.toMutableList() ?: mutableListOf()

        // remove all null values
        lst.removeAll(Collections.singleton(null))

        // create json Result
        val result = JsonArray()
        for (item in lst) {
            result.add(context!!.serialize(item))
        }

        if (result.count() == 0) {
            return null
        }

        return result
    }

}

//class EmptyCheckTypeAdapterFactory : TypeAdapterFactory {
//
//    fun <T> create(gson: Gson, type: TypeToken<T>): TypeAdapter<T>? {
//        // We filter out the EmptyCheckTypeAdapter as we need to check this for emptiness!
//        if (InnerObject::class.java!!.isAssignableFrom(type.getRawType())) {
//            val delegate = gson.getDelegateAdapter<T>(this, type)
//            val elementAdapter = gson.getAdapter(JsonElement::class.java)
//            return EmptyCheckTypeAdapter(delegate, elementAdapter).nullSafe()
//        }
//        return null
//    }
//
//    class EmptyCheckTypeAdapter<T>(private val delegate: TypeAdapter<T>,
//                                   private val elementAdapter: TypeAdapter<JsonElement>) : TypeAdapter<T>() {
//
//        @Throws(IOException::class)
//        override fun write(out: JsonWriter, value: T) {
//            this.delegate.write(out, value)
//        }
//
//        @Throws(IOException::class)
//        override fun read(`in`: JsonReader): T? {
//            val asJsonObject = elementAdapter.read(`in`).asJsonObject
//            return if (asJsonObject.entrySet().isEmpty()) null else this.delegate.fromJsonTree(asJsonObject)
//        }
//    }
//
//}

class FhirPrimitiveExclusionStrategy() : ExclusionStrategy {

    override fun shouldSkipField(f: FieldAttributes): Boolean {
        return false //  !f.name.startsWith("_")

    }

    override fun shouldSkipClass(clazz: Class<*>): Boolean {
        return true
    }

}