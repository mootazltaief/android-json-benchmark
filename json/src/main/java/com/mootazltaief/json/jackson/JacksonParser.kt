package com.mootazltaief.json.jackson

import android.content.Context
import com.fasterxml.jackson.databind.ObjectMapper
import com.mootazltaief.json.Utils
import com.mootazltaief.json.jackson.models.PhotosJackson
import com.mootazltaief.json.jackson.models.UserJackson

class JacksonParser(context: Context) {

    private val sample1 = Utils.loadJSONFromAsset(context, "sample1.json")
    private val sample2 = Utils.loadJSONFromAsset(context, "sample2.json")
    private val sample3 = Utils.loadJSONFromAsset(context, "sample3.json")
    private val sample4 = Utils.loadJSONFromAsset(context, "sample4.json")


    private val jackson = ObjectMapper()

    private var userCollectionType =
        jackson.typeFactory.constructCollectionType(List::class.java, UserJackson::class.java)

    fun parseSample1(): List<UserJackson> {
        return jackson.readValue(sample1, userCollectionType)
    }

    fun parseSample2(): List<UserJackson> {
        return jackson.readValue(sample2, userCollectionType)
    }

    fun parseSample3(): PhotosJackson {
        return jackson.readValue(sample3, PhotosJackson::class.java)
    }

    fun parseSample4(): UserJackson? {
        return jackson.readValue(sample4, UserJackson::class.java)
    }

}