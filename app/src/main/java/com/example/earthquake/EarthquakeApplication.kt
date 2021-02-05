package com.example.earthquake

import android.app.Application
import com.example.network.services.di.networkModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class EarthquakeApplication : Application() {

    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidContext(this@EarthquakeApplication)
            modules(listOf(networkModule))
        }
    }
}