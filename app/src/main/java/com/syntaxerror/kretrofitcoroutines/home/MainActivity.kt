package com.syntaxerror.kretrofitcoroutines

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.syntaxerror.kretrofitcoroutines.api.QuoteApi
import com.syntaxerror.kretrofitcoroutines.api.RetrofitHelper
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val quotesAPI = RetrofitHelper.getInstance().create(QuoteApi::class.java)
        GlobalScope.launch {
            val result = quotesAPI.getQuotes(1)
            if(result != null){
                Log.d("Result ",result.body().toString() )
            }
        }
    }
}