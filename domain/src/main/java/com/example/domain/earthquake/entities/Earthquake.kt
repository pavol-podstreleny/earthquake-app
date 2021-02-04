package com.example.domain.earthquake.entities

/**
 * Represents earthquake
 *
 * @param id unique earthquake id
 * @param properties of earthquake
 * @param geometry of earthquake
 *
 */

interface Earthquake {
    val id: String
    val properties: EarthquakeDetail
    val geometry: EarthquakeGeometry
}


