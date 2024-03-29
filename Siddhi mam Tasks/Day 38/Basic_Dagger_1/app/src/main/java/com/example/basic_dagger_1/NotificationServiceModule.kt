package com.example.basic_dagger_1

import dagger.Module
import dagger.Provides
import javax.inject.Named


@Module
class NotificationServiceModule {



    @Provides
    fun getMessageService():NotificationService
    {
        return MessageService()
    }

//    @Provides
//    fun getEmailServce(emailService: EmailService):NotificationService
//    {
//        return emailService
//    }
//    if we run this it will give error  as we know notification service  bound it 2 times with email service and message service as well
//    so we will get two notification service and dagger will get confuse that which notifcation service should be called
//    sp for that we used Named annotation

    // @Named("email")
    @EmailQualifier  //
    @Provides
    fun getEmailService(emailService: EmailService):NotificationService
    {
        return emailService
   }

//    as we can see now we have added the named anotation for better understanding and tell the dagger that which instance should be called
//    but with this there is one issue that there can be typo problem so for that we have made our own annotation and use that that is Emailqualifier





}