package com.example.basic_dagger_1

import android.util.Log
import javax.inject.Inject


interface NotificationService{

    fun send(to:String,from:String,body:String?)

}

class EmailService @Inject constructor() : NotificationService {


    override fun send(to:String,from:String,body:String?)
    {
        Log.d("cd","Email send")
    }
}

class MessageService(): NotificationService{
    override fun send(to: String, from: String, body: String?) {

        Log.d("cd","Message send")

    }


}