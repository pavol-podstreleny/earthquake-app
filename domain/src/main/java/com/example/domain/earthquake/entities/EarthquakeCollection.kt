package com.example.domain.earthquake.entities

data class EarthquakeCollection(
    val metadata: CollectionMetadata,
    val boundingBox: ArrayList<Double>,
    val earthquakes: ArrayList<Earthquake>
)

data class CollectionMetadata(
    val generated: Long,
    val url: String,
    val title: String,
    val api: String,
    val count: Int,
    val status: Int
)


