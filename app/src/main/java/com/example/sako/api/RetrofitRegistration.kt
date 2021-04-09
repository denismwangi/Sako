package com.example.sako.api

import android.util.Base64
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

/**
 ** dennis at 13/5/2020
 */

object RetrofitRegistration {


//
//
////api authorisation
//    private val  AUTH = "basic"+Base64.encodeToString("dennis:12345".toByteArray(), Base64.NO_WRAP)
//
//
////url should be basic ip address
//private const val BASE_URL = "Http://192.44.44.MyApi/regUsers"
//
//private val okHttpClient = OkHttpClient.Builder()
//
//    .addInterceptor{
//            chain ->
//        val original = chain.request()
//
//        val requestBuilder = original.newBuilder()
//            .addHeader( "Authorization", AUTH)
//            .method(original.method(), original.body())
//
//        val request = requestBuilder.build()
//        chain.proceed(request)
//    }.build()
//
//
//val instance: RegistrationApi by lazy {
//
//    val retrofit = Retrofit.Builder()
//        .baseUrl(BASE_URL)
//        .addConverterFactory(GsonConverterFactory.create())
//        .client(okHttpClient)
//        .build()
//    retrofit.create(RegistrationApi::class.java)
//}

}
