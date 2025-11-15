package com.example.apirest001.data.remote

import com.example.apirest001.remote.ApiService
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.create

object RetrofitInstance {
    // Se instancia el servicio de la Api
    val api : ApiService by lazy{
        Retrofit.Builder()

            .baseUrl("https://jsonplaceholder.typicode.com")
            .addConverterFactory(GsonConverterFactory.create())  // conversor del Json
            .build()
            .create(ApiService::class.java)  // Implementa la Interfaz
    }// fin lazy

}// fin object