package com.example.flownotes.network

import com.example.flownotes.model.Model
import retrofit2.Call
import retrofit2.http.GET

interface ModelAPI {
    @GET("notes.json")
    fun getModel(): Call<Model>
}