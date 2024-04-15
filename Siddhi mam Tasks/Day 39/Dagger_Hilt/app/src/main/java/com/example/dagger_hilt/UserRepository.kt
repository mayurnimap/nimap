package com.example.dagger_hilt

import android.content.ContentValues.TAG
import android.nfc.Tag
import android.util.Log
import javax.inject.Inject

class UserRepository @Inject constructor(val userLoggerService: UserLoggerService) //  this is knows as constrcutor injection
 {

    fun saveUser(email:String,pass:String){
        userLoggerService.xyz("user save in database")
    }
}