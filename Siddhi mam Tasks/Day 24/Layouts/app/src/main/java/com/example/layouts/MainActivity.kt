package com.example.layouts

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button



class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val layout1 = findViewById<Button>(R.id.layout1)

        layout1.setOnClickListener {
            // Switching from ActivityA to SecondActivity
            val intent = Intent(this,Screen_1::class.java)
            startActivity(intent)
        }





    }
}