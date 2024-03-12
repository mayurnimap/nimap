package com.example.room_database.data

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase


@Database(entities =[User::class],version = 1, exportSchema = false)
//here we have to compulsory give the class we are using in the entities section and version and
//export schema .. export scheme means relataed the version it is not mandatory as well
abstract class UserDatabase:RoomDatabase() {


    abstract  fun userDao():UserDao

    companion object{
        @Volatile

        private var INSTANCE : UserDatabase? = null

        fun getDatabase(context: Context):UserDatabase
        {
            val instance = Room.databaseBuilder(
                context.applicationContext,
                UserDatabase::class.java,
                "user_database"
            ).build()
            INSTANCE = instance
            return instance
        }
    }
}
