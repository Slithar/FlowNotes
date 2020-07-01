package com.example.flownotes.model

data class Note(
    val id: String,
    val title: String,
    val content: String,
    val createdDate: Long,
    val categoryId: String
)