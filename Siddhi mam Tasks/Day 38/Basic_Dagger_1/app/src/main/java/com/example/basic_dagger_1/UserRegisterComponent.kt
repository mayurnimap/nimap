package com.example.basic_dagger_1

import dagger.Component


@Component(modules=[UserRepositoryModule::class,NotificationServiceModule::class])
interface UserRegisterComponent {

    //fun getUserRegistrationService() : UserRegistrationService

    //fun getEmailService(): EmailService

    fun inject (mainActivity: MainActivity)
}