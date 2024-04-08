package com.example.viewmodel_factory

import android.util.Log
import androidx.lifecycle.ViewModel

class MyViewModel(name:String) : ViewModel() {

    var myNAMe:String = name

    init {
        Log.d("viewModel", "my youtube channel name is $name")
    }


}