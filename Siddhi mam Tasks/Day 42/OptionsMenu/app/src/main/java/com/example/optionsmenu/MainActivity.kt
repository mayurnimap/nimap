package com.example.optionsmenu

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu

import android.view.MenuItem
import android.widget.Toast
import androidx.appcompat.widget.Toolbar


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Find the toolbar in the layout and set it as the ActionBar
        val toolbar: Toolbar = findViewById(R.id.toolbar)
        toolbar.title = "Select the Options"
        setSupportActionBar(toolbar)
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
         menuInflater.inflate(R.menu.menu_main, menu)
         return true
    }



    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            R.id.itFacebook -> {
                Toast.makeText(applicationContext, "click on facebook", Toast.LENGTH_LONG).show()
                true
            }
            R.id.itTwitter ->{
                Toast.makeText(applicationContext, "click on twitter", Toast.LENGTH_LONG).show()
                return true
            }
            R.id.itSnapchat ->{
                Toast.makeText(applicationContext, "click on snapchat", Toast.LENGTH_LONG).show()
                return true
            }
            R.id.itInstagram ->{
                Toast.makeText(applicationContext, "click on instagram", Toast.LENGTH_LONG).show()
                return true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }
}