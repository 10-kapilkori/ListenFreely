package com.freely.listenfreely.retrofit

import javax.inject.Inject

class ApiHelper @Inject constructor(private val apiInterface: ApiInterface) {

    suspend fun fetchTracksList() =
        apiInterface.fetchTracksList()
}