package com.example.dagger2sample.classes

import android.util.Log
import com.example.dagger2sample.classes.AudioInterface
import javax.inject.Inject

class SDCard: AudioInterface {
    @Inject
    constructor()
    {

    }
    override fun playMusic() {
        Log.e("SDCard","Playing music from SD Card")

    }

    override fun pauseMusic() {
        Log.e("SDCard","Music paused from SD Card")
    }

}