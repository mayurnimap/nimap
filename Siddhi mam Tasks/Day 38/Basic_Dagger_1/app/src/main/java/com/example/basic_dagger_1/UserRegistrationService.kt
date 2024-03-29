package com.example.basic_dagger_1

import javax.inject.Inject
import javax.inject.Named

class UserRegistrationService @Inject constructor
    (private val userRepository:UserRepository,
     @EmailQualifier private val notificationService: NotificationService) // this is knows as constructor injection
 {

    fun registerUser(email: String, password: String) {
        userRepository.saveUser(email, password)
        notificationService.send(email, "no-replay@cheezecode.com", "User Register")
    }
}