package com.example.flownotes

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.LifecycleOwner
import androidx.lifecycle.Observer
import com.example.flownotes.databinding.ActivityMainBinding
import org.koin.android.viewmodel.ext.android.viewModel

class MainActivity : AppCompatActivity() {
    private lateinit var views: ActivityMainBinding
    private val viewModel: NotesViewModel by viewModel()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        views = ActivityMainBinding.inflate(layoutInflater)
        setContentView(views.root)

        viewModel.notesLiveData.observe(this as LifecycleOwner, Observer {
            views.text.text = it.toString()
        })
    }
}