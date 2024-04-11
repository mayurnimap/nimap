package com.example.async_coroutine

import android.content.ContentValues.TAG
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.async
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        CoroutineScope(Dispatchers.IO).launch{
            printFollowers()
        }
    }

    private suspend fun printFollowers(){

         CoroutineScope(Dispatchers.IO).launch {
            var a = async { getFollowers() }  // as we know async means it will start both the task simulataneously but until we get the both the values it will not print
                                             // so we have 1 second delay per method so if we dont use async here then it will take 2 seconds to perform but with the help of async we can
                                             // get th output in 1 seconds and after getting both the values we will print 
            var b = async { getlikes() }
            Log.d(TAG,"followers-${a.await()},likes - ${b.await()}")
        }
    }

    private suspend fun getFollowers(): Int {
        delay(1000)
        return 54
    }

    private suspend fun getlikes():Int{
        delay(1000)
        return 100
    }
    }
