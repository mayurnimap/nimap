package com.example.coroutine

import android.content.ContentValues.TAG
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
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
        var fbfollowers = 0
        val job = CoroutineScope(Dispatchers.IO).launch {
            fbfollowers=getFollowers()
        }

        job.join()       // if we cmt this line then as we know it is co-routine then it will look for the other task to complete and it will print the 0 because getfollower is delay by 1000 ms that why it will directly print 0
                         // join method will keep the object in the waiting state so as long as we will not get the return value it will not go for other task
        Log.d(TAG,fbfollowers.toString())
    }

    private suspend fun getFollowers(): Int {

        delay(1000)
        return 54

    }
}