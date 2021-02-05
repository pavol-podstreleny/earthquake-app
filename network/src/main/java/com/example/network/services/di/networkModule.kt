package com.example.network.services.di

import com.example.network.services.EarthquakeWebService
import org.koin.dsl.module
import retrofit2.Retrofit

val networkModule = module {
    single{ provideRetrofit()}
    single{ provideEarthquakeService(get())}
}

fun provideRetrofit(): Retrofit {
    return Retrofit.Builder().baseUrl("https://earthquake.usgs.gov").build()
}

fun provideEarthquakeService(retrofit: Retrofit) : EarthquakeWebService {
    return retrofit.create(EarthquakeWebService::class.java)
}