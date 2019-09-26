package com.mootazltaief.benchmark

import androidx.benchmark.BenchmarkRule
import androidx.benchmark.measureRepeated
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.platform.app.InstrumentationRegistry
import com.mootazltaief.json.gson.GsonParser
import com.mootazltaief.json.jackson.JacksonParser
import com.mootazltaief.json.kotlinx.KotlinParser
import com.mootazltaief.json.moshi.MoshiParser
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class JsonBenchmark {

    @get:Rule
    val benchmarkRule = BenchmarkRule()

    private val appContext = InstrumentationRegistry.getInstrumentation().targetContext
    private val gsonParser = GsonParser(appContext)
    private val moshiParser = MoshiParser(appContext)
    private val kotlinParser = KotlinParser(appContext)
    private val jacksonParser = JacksonParser(appContext)


    @Test
    fun benchmarkGsonWithSample1() {
        benchmarkRule.measureRepeated {
            gsonParser.parseSample1()
        }
    }

    @Test
    fun benchmarkGsonWithSample2() {
        benchmarkRule.measureRepeated {
            gsonParser.parseSample2()
        }
    }

    @Test
    fun benchmarkGsonWithSample3() {
        benchmarkRule.measureRepeated {
            gsonParser.parseSample3()
        }
    }

    @Test
    fun benchmarkGsonWithSample4() {
        benchmarkRule.measureRepeated {
            gsonParser.parseSample4()
        }
    }

    @Test
    fun benchmarkMoshiWithSample1() {
        benchmarkRule.measureRepeated {
            moshiParser.parseSample1()
        }
    }

    @Test
    fun benchmarkMoshiWithSample2() {
        benchmarkRule.measureRepeated {
            moshiParser.parseSample2()
        }
    }

    @Test
    fun benchmarkMoshiWithSample3() {
        benchmarkRule.measureRepeated {
            moshiParser.parseSample3()
        }
    }

    @Test
    fun benchmarkMoshiWithSample4() {
        benchmarkRule.measureRepeated {
            moshiParser.parseSample4()
        }
    }

    @Test
    fun benchmarkKotlinWithSample1() {
        benchmarkRule.measureRepeated {
            kotlinParser.parseSample1()
        }
    }

    @Test
    fun benchmarkKotlinWithSample2() {
        benchmarkRule.measureRepeated {
            kotlinParser.parseSample2()
        }
    }

    @Test
    fun benchmarkKotlinWithSample3() {
        benchmarkRule.measureRepeated {
            kotlinParser.parseSample3()
        }
    }

    @Test
    fun benchmarkKotlinWithSample4() {
        benchmarkRule.measureRepeated {
            kotlinParser.parseSample4()
        }
    }

    @Test
    fun benchmarkJacksonWithSample1() {
        benchmarkRule.measureRepeated {
            jacksonParser.parseSample1()
        }
    }

    @Test
    fun benchmarkJacksonWithSample2() {
        benchmarkRule.measureRepeated {
            jacksonParser.parseSample2()
        }
    }

    @Test
    fun benchmarkJacksonWithSample3() {
        benchmarkRule.measureRepeated {
            jacksonParser.parseSample3()
        }
    }

    @Test
    fun benchmarkJacksonWithSample4() {
        benchmarkRule.measureRepeated {
            jacksonParser.parseSample4()
        }
    }
}