package com.dispositivosmoveis.ritterflix.repository.http

import com.dispositivosmoveis.ritterflix.repository.models.Genres
import com.dispositivosmoveis.ritterflix.repository.models.Popular
import com.dispositivosmoveis.ritterflix.repository.models.Releases
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface ApiService {

    @GET("3/movie/now_playing")
    fun getLastReleases(
        @Query("api_key") apiKey: String,
        @Query("language") language: String,
        @Query("page") page: String
    ): Call<Releases>

    @GET("3/movie/popular")
    fun getPopularMovies(
        @Query("api_key") apiKey: String,
        @Query("language") language: String,
        @Query("page") page: String
    ): Call<Popular>

    @GET("3/genre/{category}/list")
    fun getGenres(
        @Path("category") category: String,
        @Query("api_key") apiKey: String,
        @Query("language") language: String
    ): Call<Genres>
}