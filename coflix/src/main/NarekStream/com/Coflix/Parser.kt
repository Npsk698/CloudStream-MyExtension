package com.CoflixArt

data class Movie(
    val title: String,
    val url: String,
    val poster: String
)

data class Series(
    val title: String,
    val url: String,
    val seasons: List<Season>
)

data class Season(
    val number: Int,
    val episodes: List<Episode>
)

data class Episode(
    val title: String,
    val url: String
)
