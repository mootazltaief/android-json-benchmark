package com.mootazltaief.json

import android.content.Context

object Utils {

    fun loadJSONFromAsset(context: Context, fileName: String): String {
        context.assets.open(fileName).use {
            return it.reader().readText()
        }
    }

}