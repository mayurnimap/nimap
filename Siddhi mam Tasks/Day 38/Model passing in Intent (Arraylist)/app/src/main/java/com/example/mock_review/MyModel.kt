package com.example.mock_review

import java.io.Serializable

data class MyModel(val name: String, val age: Int) : Serializable

// we have used serializable here to passes the arraylist from one activity to other 
