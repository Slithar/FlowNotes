package com.example.flownotes.repository

import com.example.flownotes.model.Model
import com.example.flownotes.network.ModelAPI
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOn
import retrofit2.awaitResponse

class ModelRemoteRepository(private val api: ModelAPI) {

    fun getModel(): Flow<Model> {
        return flow<Model> {
            emit(api.getModel().awaitResponse().body() ?: Model(emptyList(), emptyList()))
        }.flowOn(Dispatchers.IO)
    }
}