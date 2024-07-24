package com.example.retrofitproduct

data class Rating(
    val rate: Double,
    val count: Int
)

data class Model(
    val id: Int,
    val title: String,
    val price: Double,
    val description: String,
    val category: String,
    val image: String,
    val rating: Rating
)


