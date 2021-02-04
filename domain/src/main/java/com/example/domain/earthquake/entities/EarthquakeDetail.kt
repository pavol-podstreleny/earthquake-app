package com.example.domain.earthquake.entities

/**
 *
 * EarthquakeDetail represents detailed information about the earthquake
 *
 * @param mag The magnitude for the event.
 * See (https://earthquake.usgs.gov/data/comcat/data-eventterms.php#mag)
 *
 * @param place Textual description of named geographic region near to the event.
 * See (https://earthquake.usgs.gov/data/comcat/data-eventterms.php#place)
 *
 * @param time Time when the event occurred. Times are reported in milliseconds
 * See (https://earthquake.usgs.gov/data/comcat/data-eventterms.php#time)
 *
 * @param updated Time when the event was most recently updated.
 * See (https://earthquake.usgs.gov/data/comcat/data-eventterms.php#updated)
 *
 * @param tz Timezone offset from UTC in minutes at the event epicenter.
 * See (https://earthquake.usgs.gov/data/comcat/data-eventterms.php#tz)
 *
 * @param url Link to USGS Event Page for event.
 * See (https://earthquake.usgs.gov/data/comcat/data-eventterms.php#url)
 *
 * @param detail Link to GeoJSON detail feed from a GeoJSON summary feed.
 * See (https://earthquake.usgs.gov/data/comcat/data-eventterms.php#detail)
 *
 * @param felt The total number of felt reports submitted to the DYFI? (did you feel it) system.
 * See (https://earthquake.usgs.gov/data/comcat/data-eventterms.php#felt)
 *
 * @param cdi The maximum reported intensity for the event. Computed by DYFI.
 * See (https://earthquake.usgs.gov/data/comcat/data-eventterms.php#cdi)
 *
 * @param mmi The maximum estimated instrumental intensity for the event.
 * See (https://earthquake.usgs.gov/data/comcat/data-eventterms.php#mmi)
 *
 * @param alert The alert level from the PAGER earthquake impact scale.
 * See (https://earthquake.usgs.gov/data/comcat/data-eventterms.php#alert)
 *
 * @param status Indicates whether the event has been reviewed by a human.
 * See (https://earthquake.usgs.gov/data/comcat/data-eventterms.php#status)
 *
 * @param tsunami This flag is set to "1" for large events in oceanic regions and "0" otherwise.
 * See (https://earthquake.usgs.gov/data/comcat/data-eventterms.php#tsunami)
 *
 * @param sig A number describing how significant the event is. Larger numbers indicate a more significant event.
 * See (https://earthquake.usgs.gov/data/comcat/data-eventterms.php#sig)
 *
 * @param net The ID of a data contributor.
 * See (https://earthquake.usgs.gov/data/comcat/data-eventterms.php#net)
 *
 * @param code An identifying code assigned by - and unique from - the corresponding source for the event.
 * See (https://earthquake.usgs.gov/data/comcat/data-eventterms.php#code)
 *
 * @param ids A comma-separated list of event ids that are associated to an event.
 * See (https://earthquake.usgs.gov/data/comcat/data-eventterms.php#ids)
 *
 * @param sources A comma-separated list of network contributors.
 * See (https://earthquake.usgs.gov/data/comcat/data-eventterms.php#sources)
 *
 * @param types A comma-separated list of product types associated to this event.
 * See (https://earthquake.usgs.gov/data/comcat/data-eventterms.php#types)
 *
 * @param nst The total number of seismic stations used to determine earthquake location.
 * See (https://earthquake.usgs.gov/data/comcat/data-eventterms.php#nst)
 *
 * @param dmin Horizontal distance from the epicenter to the nearest station (in degrees).
 * See (https://earthquake.usgs.gov/data/comcat/data-eventterms.php#dmin)
 *
 * @param rms The root-mean-square (RMS) travel time residual, in sec, using all weights.
 * See (https://earthquake.usgs.gov/data/comcat/data-eventterms.php#rms)
 *
 * @param gap The largest azimuthal gap between azimuthally adjacent stations (in degrees).
 * See (https://earthquake.usgs.gov/data/comcat/data-eventterms.php#gap)
 *
 * @param magType The method or algorithm used to calculate the preferred magnitude for the event.
 * See (https://earthquake.usgs.gov/data/comcat/data-eventterms.php#magType)
 *
 * @param type Type of seismic event.
 * See (https://earthquake.usgs.gov/data/comcat/data-eventterms.php#type)
 *
 *
 */
interface EarthquakeDetail {
    val mag: Double
    val place: String
    val time: Long
    val updated: Long
    val tz: Int?
    val url: String
    val detail: String
    val felt: Int?
    val cdi: Double?
    val mmi: Double?
    val alert: String?
    val status: String
    val tsunami: Int
    val sig: Int
    val net: String
    val code: String
    val ids: String
    val sources: String
    val types: String
    val nst: Int?
    val dmin: Double?
    val rms: Double?
    val gap: Double?
    val magType: String
    val type: String
}