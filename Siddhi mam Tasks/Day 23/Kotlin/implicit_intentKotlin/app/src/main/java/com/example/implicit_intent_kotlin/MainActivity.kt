package com.example.implicit_intent_kotlin

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val dial = findViewById<Button>(R.id.dial)
        val msg = findViewById<Button>(R.id.msg)
        val mail = findViewById<Button>(R.id.mail)
        val share = findViewById<Button>(R.id.share)

        dial.setOnClickListener {
            val intent = Intent(Intent.ACTION_DIAL)
            intent.data = Uri.parse("tel: +7030368899")
            startActivity(intent)
        }

        msg.setOnClickListener {
            val intent = Intent(Intent.ACTION_SEND)
            intent.data = Uri.parse("smsto: +8806046789")  // Only SMS apps respond to this.
            intent.putExtra("sms_body", "hello i m mayur ... how r u")
            startActivity(intent)
        }

        mail.setOnClickListener {
            val intent = Intent(Intent.ACTION_SENDTO)
            intent.data = Uri.parse("mailto:" + "mayurkkene@gmail.com") // Only email apps handle this.
            intent.putExtra(Intent.EXTRA_SUBJECT, "about taking holiday")
            intent.putExtra(Intent.EXTRA_TEXT, "i was in hospital so i not able to come tommrrow")
            startActivity(intent)
        }

        share.setOnClickListener {
            val intent = Intent(Intent.ACTION_SEND)
            intent.type = "text/plain"
            intent.putExtra(Intent.EXTRA_TEXT, "take my referral code to this")
            startActivity(intent)
        }
    }
}

