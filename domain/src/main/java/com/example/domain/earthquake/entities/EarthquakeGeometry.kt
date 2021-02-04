package com.example.domain.earthquake.entities

/**
 * EarthquakeGeometry represents geometry information where earthquake occurred
 *
 * @param coordinates coordinates contains:
 *    longitude: See (https://earthquake.usgs.gov/data/comcat/data-eventterms.php#longitude)
 *    latitude: See (https://earthquake.usgs.gov/data/comcat/data-eventterms.php#latitude)
 *    depth: See (https://earthquake.usgs.gov/data/comcat/data-eventterms.php#depth)
 */
data class EarthquakeGeometry(val coordinates: ArrayList<Double>)