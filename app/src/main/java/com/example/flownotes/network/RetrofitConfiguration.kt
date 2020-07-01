package com.example.flownotes.network

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class RetrofitConfiguration {
    companion object {
        val retrofit by lazy { Retrofit.Builder()
            .baseUrl("https://s3.amazonaws.com/kezmo.assets/sandbox/")
            .addConverterFactory(GsonConverterFactory.create())
            .build() }
    }
}