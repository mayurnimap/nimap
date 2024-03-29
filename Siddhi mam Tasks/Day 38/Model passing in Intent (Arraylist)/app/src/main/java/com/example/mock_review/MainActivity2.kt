package com.example.mock_review

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        // Find the TextView
        val textView = findViewById<TextView>(R.id.textView)

        val modelList = intent.getSerializableExtra("modelList") as ArrayList<MyModel>?

        // Displaying data
        modelList?.let {
            for (model in it) {
                textView.append("Name: ${model.name}, Age: ${model.age}\n")
            }
        }
    }
}