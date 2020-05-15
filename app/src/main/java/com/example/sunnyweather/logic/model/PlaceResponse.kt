package com.example.sunnyweather.logic.model

data class PlaceResponse(
    val places: List<Place>,
    val query: String,
    val status: String
) {

    data class Place(
        val formatted_address: String,
        val id: String,
        val location: Location,
        val name: String,
        val place_id: String
    )

    data class Location(
        val lat: String,
        val lng: String
    )
}