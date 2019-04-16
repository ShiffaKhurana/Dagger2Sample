package com.example.dagger2sample

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.example.dagger2sample.classes.Compare
import com.example.dagger2sample.classes.Provider1
import com.example.dagger2sample.classes.Provider2
import com.example.dagger2sample.di.DaggerMusicComponent
import com.example.dagger2sample.di.MusicComponent
import com.example.dagger2sample.di.MusicModule

class MainActivity : AppCompatActivity() {
    lateinit var compare: Compare
    lateinit var provider1: Provider1
    lateinit var provider2: Provider2

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        provider1= Provider1()
        provider2= Provider2()

        var component: MusicComponent =DaggerMusicComponent.builder().musicModule(
            MusicModule(
                provider1,
                provider2
            )
        ).build()

        compare= component.getWar()
        compare.play()
        compare.pause()

        component.getProvider1()
        component.getProvider2()

    }
}
