package com.example.dagger2sample.di

import com.example.dagger2sample.classes.Provider1
import com.example.dagger2sample.classes.Provider2
import dagger.Module
import dagger.Provides

@Module
class MusicModule(provider1: Provider1, provider2: Provider2)
{
    var provider1: Provider1 = provider1
    var provider2: Provider2 =provider2

    @Provides //Provides provider1 dependency
    fun provideProvider1(): Provider1 {
    return this.provider1
}

    @Provides //provides provider2 dependency
    fun provideProvider2(): Provider2 {
    return this.provider2
}

}