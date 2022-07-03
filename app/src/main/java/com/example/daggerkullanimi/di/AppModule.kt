package com.example.daggerkullanimi.di

import androidx.transition.Visibility
import com.example.daggerkullanimi.Adres
import dagger.Module
import dagger.Provides


@Module
class AppModule {
    @Provides
    fun provideAdres() : Adres{
        return Adres("Tepebaşı/ESKİŞEHİR")
    }
}