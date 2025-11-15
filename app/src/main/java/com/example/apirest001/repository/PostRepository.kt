package com.example.apirest001.repository

import com.example.apirest001.data.model.Post
import com.example.apirest001.data.remote.RetrofitInstance

class PostRepository {

    // Funcion de obtener los post desde la API

    suspend fun getPosts(): List<Post>{
        return RetrofitInstance.api.getPosts()
    }// fin suspend

}