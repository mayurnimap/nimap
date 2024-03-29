package com.example.basic_dagger_1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import javax.inject.Inject

class MainActivity : AppCompatActivity() {


    @Inject
    lateinit var userRegistrationService: UserRegistrationService //whener we have called inject  method it will look for the variable with inject annotation here in main class

    @Inject
    lateinit var emailService: EmailService  // same here

    @Inject
    lateinit var notificationService: NotificationService




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        

        val component = DaggerUserRegisterComponent.builder().build()
        component.inject(this) // this method is in component which takes main activity as a parameter and out of main activity we use all the variables such as emailservice and userregisterservice
        userRegistrationService.registerUser("mayurkkene@gmail.com","123456")
        notificationService.send("aa","aa","aa")

        // above process is called as field injection in which we have lateint it and after that we have used it



    }
}