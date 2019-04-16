package com.example.dagger2sample.di

import com.example.dagger2sample.classes.Provider1
import com.example.dagger2sample.classes.Provider2
import com.example.dagger2sample.classes.Compare
import dagger.Component

@Component(modules= arrayOf(MusicModule::class))
interface MusicComponent{
    fun getWar(): Compare
    fun getProvider1(): Provider1
    fun getProvider2(): Provider2
}