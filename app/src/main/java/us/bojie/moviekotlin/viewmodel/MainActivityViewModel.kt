package us.bojie.moviekotlin.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.liveData
import kotlinx.coroutines.Dispatchers
import us.bojie.moviekotlin.data.Repository
import us.bojie.moviekotlin.data.remote.RetrofitClient

class MainActivityViewModel : ViewModel() {

    val movieList = liveData(Dispatchers.IO) {
        val movieList = Repository.getMovieList(
            RetrofitClient.API_KEY, "avengers", 1
        )
        emit(movieList)
    }
}