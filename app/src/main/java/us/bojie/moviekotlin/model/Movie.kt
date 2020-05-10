package us.bojie.moviekotlin.model

data class Movie(
    val Poster: String,
    val Title: String,
    val Type: String,
    val Year: String,
    val imdbID: String
)

data class Response(
    val Search: List<Movie>
)
