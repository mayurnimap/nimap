package com.example.dagger_hilt

import android.content.ContentValues.TAG
import android.util.Log
import javax.inject.Inject

class UserLoggerService @Inject constructor() {

    fun xyz(msg:String)
    {
        Log.d(TAG,msg)
    }
}