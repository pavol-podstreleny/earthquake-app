package com.example.domain.earthquake.entities

data class EarthquakeCollection(
    val bbox: ArrayList<Double>,
    val features: ArrayList<Earthquake>
)


