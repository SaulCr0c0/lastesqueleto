package com.spokefan.lastesqueleto.data.server

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object PostConection {
    private val builder by lazy {
            Retrofit.Builder()
            .baseUrl("https://jsonplaceholder.typicode.com/")
            .addConverterFactory(GsonConverterFactory.create())
                .build()
    }

    val service: PostService = builder.create(PostService::class.java)
}