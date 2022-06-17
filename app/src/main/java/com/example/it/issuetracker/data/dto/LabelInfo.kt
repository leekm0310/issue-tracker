package com.example.it.issuetracker.data.dto

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class LabelInfo(
    val id: Int,
    val title: String,
    val description: String,
    val color: String,
    val textColor: String
)