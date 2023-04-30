package com.freely.listenfreely.retrofit

import retrofit2.http.GET

interface ApiInterface {
    @GET("tracks/?ids=4WNcduiCmDNfmTEz7JvmLv")
    suspend fun fetchTracksList(): List<String>
}