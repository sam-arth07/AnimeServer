package com.example.repository

import com.example.models.ApiResponse
import com.example.models.Hero

interface HeroRepository {

    val heroes: Map<Int, List<Hero>>

    val page1: List<Hero>
    val page2: List<Hero>
    val page3: List<Hero>
    val page4: List<Hero>
    val page5: List<Hero>

    val page6: List<Hero>
    val page7: List<Hero>
    val page8: List<Hero>
    val page9: List<Hero>
    val page10: List<Hero>
    suspend fun getAllHeroes(page: Int = 1): ApiResponse
    suspend fun searchHeroes(name: String?): ApiResponse
}