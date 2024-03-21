package com.ethermail.androidchallenge.data


import com.ethermail.androidchallenge.data.model.assets.AssetsApiData
import com.ethermail.androidchallenge.data.model.markets.MarketsApiData
import retrofit2.http.GET

const val HOST_COINCAP = "https://api.coincap.io/"

interface CoincapService {

    @GET("/v2/assets")
    suspend fun getAssets(): AssetsApiData

    @GET("/v2/markets")
    suspend fun getMarkets(): MarketsApiData
}