package com.example.models

import kotlinx.serialization.Serializable

@Serializable
data class Hero(
    val id: Int,
    val name: String,
    val image: String,
    val about: String,
    val month: String,
    val day: String,
    val rating: Double,
    val power: Int,
    val abilities: List<String>,
    val family: List<String>,
    val natureTypes: List<String>
)
