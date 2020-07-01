package com.example.flownotes

import android.app.Application
import com.example.flownotes.koin.networkModule
import com.example.flownotes.koin.screenModule
import org.koin.core.context.startKoin

class NotesApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        startKoin {
            modules(listOf(networkModule, screenModule))
        }
    }
}