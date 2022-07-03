package com.example.daggerkullanimi.di

import com.example.daggerkullanimi.MainActivity
import dagger.Component

@Component(modules = [AppModule::class])
interface AppComponent {
    fun inject(activity: MainActivity)
}