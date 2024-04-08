package com.example.basic_dagger_1

import dagger.BindsInstance
import dagger.Component


@Component(modules=[UserRepositoryModule::class,NotificationServiceModule::class])
interface UserRegisterComponent {

    //fun getUserRegistrationService() : UserRegistrationService
    //fun getEmailService(): EmailService

    fun inject (mainActivity: MainActivity)
    @Component.Factory
    interface Factory{
        fun create(@BindsInstance retryCount:Int):UserRegisterComponent
    }
}