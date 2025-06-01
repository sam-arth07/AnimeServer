package com.example.di

import com.example.repository.HeroRepoImpl
import com.example.repository.HeroRepository
import org.koin.dsl.module

val koinModule = module {
    single<HeroRepository> { HeroRepoImpl() }
}