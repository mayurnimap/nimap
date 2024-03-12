package com.example.room_database.data

import androidx.room.Entity
import androidx.room.PrimaryKey


// Entity Class
@Entity(tableName = "user_table")
data class User (
    @PrimaryKey(autoGenerate = true)
    val id : Int,
    val firstName : String,
    val lastName : String,
    val age : Int
)

// this is the class we hav created with the parameters id, first name,lastname and age
//so whenever we will create the object we should pass all of this parameters




