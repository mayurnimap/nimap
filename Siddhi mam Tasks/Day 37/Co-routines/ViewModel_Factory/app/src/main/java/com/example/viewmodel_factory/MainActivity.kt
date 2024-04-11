package com.example.viewmodel_factory

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val viewModelFactory = MyViewModelFactory("Mayur")



        var viewModel = ViewModelProvider(this,viewModelFactory).get(MyViewModel::class.java)

    }
}