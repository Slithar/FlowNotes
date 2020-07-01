package com.example.flownotes.usecase

import com.example.flownotes.model.Note
import com.example.flownotes.repository.ModelRemoteRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map

class NotesUseCase(private val repository: ModelRemoteRepository) {
    fun getNotes(): Flow<List<Note>> {
        return repository.getModel()
            .map { it.notes }
    }
}