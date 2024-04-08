package com.example.viewmodelscopelifecyclescope

import android.content.ContentValues.TAG
import android.nfc.Tag
import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class MainViewModel: ViewModel() {

    init {
        viewModelScope.launch {
            while (true){
                delay(500)
                Log.d(TAG,"hello from cheeze code")
            }
        }
    }

    override fun onCleared() {
        super.onCleared()
        Log.d(TAG,"view model Destoryed")
    }

}