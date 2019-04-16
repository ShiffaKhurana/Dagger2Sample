package com.example.dagger2sample.classes

import android.util.Log
import com.example.dagger2sample.classes.AudioInterface
import javax.inject.Inject

class USB: AudioInterface {

    @Inject
    constructor()
    {

    }
    override fun playMusic() {
        Log.e("USB","Playing music from USB")

    }

    override fun pauseMusic() {
        Log.e("USB","Music paused from SD Card")
    }


}