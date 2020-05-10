package us.bojie.moviekotlin.data.remote

import retrofit2.http.GET
import retrofit2.http.Query
import us.bojie.moviekotlin.model.Response

interface ApiService {

    @GET("/")
    suspend fun getMovies(
        @Query("apikey") key: String, @Query("s") searchStr: String,
        @Query("page") page: Int
    ): Response
}