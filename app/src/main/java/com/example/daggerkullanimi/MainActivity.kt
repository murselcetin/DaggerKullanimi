package com.example.daggerkullanimi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.daggerkullanimi.di.DaggerAppComponent
import javax.inject.Inject

class MainActivity : AppCompatActivity() {
    @Inject //Dagger nesneleri private olamaz
    lateinit var kargo: Kargo
    @Inject
    lateinit var internet: Internet
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        DaggerAppComponent.builder().build().inject(this)

        kargo.gonder()
        internet.basvuruYap()
    }
}