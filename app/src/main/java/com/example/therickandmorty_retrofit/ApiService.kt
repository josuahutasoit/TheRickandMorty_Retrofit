package com.example.therickandmorty_retrofit

import retrofit2.Call
import retrofit2.http.GET

interface ApiService {
    @GET("character")
    fun getRick (): Call<ResponseRick>
}