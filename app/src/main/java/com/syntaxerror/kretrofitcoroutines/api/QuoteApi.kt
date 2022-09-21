package com.syntaxerror.kretrofitcoroutines.api

import com.syntaxerror.kretrofitcoroutines.data.model.QuoteList
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface QuoteApi {
    @GET("/quotes")
    suspend fun getQuotes(@Query("page") page:Int): Response<QuoteList>
}