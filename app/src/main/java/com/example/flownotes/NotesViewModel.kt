package com.example.flownotes

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.flownotes.model.Note
import com.example.flownotes.usecase.NotesUseCase
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.launch

class NotesViewModel(private val useCase: NotesUseCase) : ViewModel() {

    val notesLiveData: MutableLiveData<List<Note>> = MutableLiveData()

    init {
        viewModelScope.launch {
            useCase.getNotes()
                .collect {
                    notesLiveData.postValue(it)
                }
        }
    }
}