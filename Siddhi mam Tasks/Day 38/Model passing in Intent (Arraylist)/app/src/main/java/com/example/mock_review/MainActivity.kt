package com.example.mock_review

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {





    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val button = findViewById<Button>(R.id.button)


        val modelList = ArrayList<MyModel>().apply {
            add(MyModel("Alice", 25))
            add(MyModel("Bob", 30))
        }

        button.setOnClickListener {
            val intent = Intent(this, MainActivity2::class.java)
            intent.putExtra("modelList", modelList)
            startActivity(intent)

        }
    }
}













