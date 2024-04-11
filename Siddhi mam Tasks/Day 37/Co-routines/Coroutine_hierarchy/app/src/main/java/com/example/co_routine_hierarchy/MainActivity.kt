package com.example.co_routine_hierarchy

import android.content.ContentValues.TAG
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        GlobalScope.launch(Dispatchers.Main) {
            execute()
        }



    }

    private suspend fun execute()
    {
        val parentJob = GlobalScope.launch(Dispatchers.Main) {
            Log.d(TAG,"parents started ")

            val childJob = launch (Dispatchers.IO){
                Log.d(TAG,"child job started ")
                delay(5000)
                Log.d(TAG,"child job ended ")
            }

            delay(3000)
            Log.d(TAG,"parents ended ")
        }

        parentJob.join()  // so here we can see that until our child co-routine is not completed parents completed will not print because we have use the join method

        Log.d(TAG,"parents completed")
    }
}