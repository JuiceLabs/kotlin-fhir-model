package com.juicelabs.fhir.default

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.ValueSource
import kotlin.test.assertEquals

class FhirDateTest() {

    @ParameterizedTest
    @ValueSource(strings = ["1999", "2004"])
    fun `valid year`(y: String) {
        val fd = FhirDate(y)
        assertEquals(y, fd.toString())
    }

    @ParameterizedTest
    @ValueSource(strings = ["2016-01-23", "Jul 4 1776", "Jan 15 1967", "2012-06"])
    fun `valid date`(d: String) {
        val fd = FhirDate(d)
        assertEquals(d, fd.toString())
    }

    @ParameterizedTest
    @ValueSource(strings = ["2011-12-03T10:15:30", "2011-03-04T08:30:00+11:00"])
    //       2011-12-03T10:15:30+01:00'
    fun `valid date time tests`(d: String) {
        val fd = FhirDate(d)
        assertEquals(d, fd.toString())
    }

    @ParameterizedTest
    @ValueSource(strings = ["09:22"])
    fun `time tests`(y: String) {
        val t = FhirDate(y)
        assertEquals(y, t.toString())
    }

    @ParameterizedTest
    @ValueSource(strings = ["ABCD", "200F", "2016-22-12"])
    fun `invalid data tests`(y: String) {
        Assertions.assertThrows(Exception::class.java) {
            FhirDate(y)
        }
    }
}