package com.example.retrofit.network
import com.example.retrofit.model.Responseuser
import retrofit2.Call
import retrofit2.http.*

interface ApiService {

    //Ambil list data keseluruhan
    @GET("api/users")
    fun getListUsers(@Query("page") page: String): Call<Responseuser>
}