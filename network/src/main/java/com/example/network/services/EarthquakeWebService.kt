package com.example.network.services

import com.example.domain.earthquake.entities.EarthquakeCollection
import retrofit2.http.GET
import retrofit2.http.QueryMap

interface EarthquakeWebService {

    @GET("earthquakes/feed/v1.0/summary/all_hour.geojson")
    suspend fun getEarthquakesPastHour() : EarthquakeCollection

    @GET("earthquakes/feed/v1.0/summary/all_day.geojson")
    suspend fun getEarthquakesPastDay(): EarthquakeCollection

    @GET("earthquakes/feed/v1.0/summary/all_week.geojson")
    suspend fun getEarthquakesPastWeek(): EarthquakeCollection

    @GET("earthquakes/feed/v1.0/summary/all_month.geojson")
    suspend fun getEarthquakesPastMonth(): EarthquakeCollection

    @GET("fdsnws/event/1/query?")
    suspend fun getEarthquakesWithFilter(
        @QueryMap filter: Map<String,String>
    ): EarthquakeCollection

}