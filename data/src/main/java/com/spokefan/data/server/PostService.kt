package com.spokefan.data.server

import com.spokefan.data.server.models.Post
import retrofit2.http.GET

interface PostService {

    @GET("post/")
    suspend fun getPosts(): List<Post>

}