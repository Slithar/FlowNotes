package com.example.flownotes.koin

import com.example.flownotes.NotesViewModel
import com.example.flownotes.network.ModelAPI
import com.example.flownotes.network.RetrofitConfiguration
import com.example.flownotes.repository.ModelRemoteRepository
import com.example.flownotes.usecase.NotesUseCase
import org.koin.android.viewmodel.dsl.viewModel
import org.koin.dsl.module

val networkModule = module {
    single { createModelAPI() }
    factory { ModelRemoteRepository(get()) }
    factory { NotesUseCase(get()) }
}

val screenModule = module {
    viewModel { NotesViewModel(get()) }
}

fun createModelAPI() : ModelAPI {
    return RetrofitConfiguration.retrofit.create(ModelAPI::class.java)
}