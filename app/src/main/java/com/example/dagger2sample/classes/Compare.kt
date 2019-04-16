package com.example.dagger2sample.classes

import com.example.dagger2sample.classes.SDCard
import com.example.dagger2sample.classes.USB
import javax.inject.Inject

class Compare
{
    var sdCard: SDCard
    var usb: USB

    @Inject
    constructor(sdCard: SDCard, usb: USB)
    {
      this.sdCard=sdCard
        this.usb=usb
    }

    fun play()
    {
        sdCard.playMusic()
        usb.playMusic()
    }

    fun pause()
    {
        sdCard.pauseMusic()
        usb.pauseMusic()
    }
}