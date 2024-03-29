package com.example.basic_dagger_1

import android.util.Log
import javax.inject.Inject

interface UserRepository {

    fun saveUser(email:String,password:String)
}

class SQLRepository @Inject constructor() : UserRepository{

    override fun saveUser(email: String, password: String) {

        Log.d("cd","User saved in DB")

    }

}

class FirebaseRepository @Inject constructor():UserRepository{

    override fun saveUser(email: String, password: String) {

        Log.d("cd","User saved in firebase")



    }


}