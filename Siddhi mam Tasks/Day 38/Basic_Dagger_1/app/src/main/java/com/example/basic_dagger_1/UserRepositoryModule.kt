package com.example.basic_dagger_1

import dagger.Binds
import dagger.Module
import dagger.Provides


@Module
public class UserRepositoryModule {

    @Provides
    fun getFirebaseRepository():UserRepository
    {
        return FirebaseRepository()
    }

    //below is the usecase of binds notation

//    @Binds
//    abstract fun getSQLRepository(sqlRepository: SQLRepository):UserRepository


}