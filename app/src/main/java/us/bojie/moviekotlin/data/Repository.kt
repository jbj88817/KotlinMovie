package us.bojie.moviekotlin.data

import us.bojie.moviekotlin.data.remote.ApiService
import us.bojie.moviekotlin.data.remote.RetrofitClient


object Repository {

    private var client: ApiService = RetrofitClient.webservice

    suspend fun getMovieList(key: String, searchStr: String, page: Int) =
        client.getMovies(key, searchStr, page)

}