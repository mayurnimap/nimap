package com.example.co_routine_hierarchy

import android.content.ContentValues.TAG
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.isActive
import kotlinx.coroutines.launch

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        GlobalScope.launch(Dispatchers.Main) {
            execute()
        }


    }

    private suspend fun execute() {

        val parentJob = CoroutineScope(Dispatchers.IO).launch {
            for(i in 1..1000)
            {
                if(isActive) { // wih the help of this we are checking that is our co-routine is in active state if it is in active state then only go in for the loop
                    executeLongRunnningTask()
                    Log.d(TAG, i.toString())
                }
            }
        }

        delay(100)
        Log.d(TAG,"cancelling job")
        parentJob.cancel()  // as we can see we have cancel the parent job but then also it is running coz it is getting
                            // confused so for that purpose we have set the conditiont that if our co-routine is in active state then only get into it.. for better result just cmt the if condition to see the result

        parentJob.join()
        Log.d(TAG,"parent Completed")

    }

    private fun executeLongRunnningTask() {
        for (i in 1..1000000000) {

        }
    }
}