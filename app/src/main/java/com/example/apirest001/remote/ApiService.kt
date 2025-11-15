package com.example.apirest001.remote

import com.example.apirest001.data.model.Post
import retrofit2.http.GET

// en esta interfaz define el endpoint del HTTP
interface ApiService {

    // define la solicitud
    @GET(value="/posts")
    suspend fun getPosts():List<Post>

}