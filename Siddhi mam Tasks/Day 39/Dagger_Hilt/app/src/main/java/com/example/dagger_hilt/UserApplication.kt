package com.example.dagger_hilt

import android.app.Application
import dagger.hilt.android.HiltAndroidApp
import javax.inject.Inject

@HiltAndroidApp  // this annotation is used for application class and entrypoint annotation is use for all other classes
class UserApplication : Application() {


    override fun onCreate() {
        super.onCreate()
    }
}