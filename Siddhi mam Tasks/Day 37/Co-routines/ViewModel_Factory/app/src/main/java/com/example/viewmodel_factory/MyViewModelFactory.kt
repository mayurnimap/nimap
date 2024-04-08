package com.example.viewmodel_factory

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import java.lang.IllegalArgumentException

class MyViewModelFactory(var name:String):ViewModelProvider.Factory {

    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if(modelClass.isAssignableFrom(MyViewModel::class.java))
        {


            return MyViewModel(name) as T
        }
        throw IllegalArgumentException("Viewmodel class not found")

    }

    // modelClass.isAssignableFrom(MyViewModel::class.java): This condition checks if the provided modelClass is assignable from MyViewModel::class.java.
    // In other words, it checks if modelClass is either MyViewModel or a superclass of MyViewModel.

}