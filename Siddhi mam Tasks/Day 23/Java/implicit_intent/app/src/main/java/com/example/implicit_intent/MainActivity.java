package com.example.implicit_intent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button dial,msg,mail,share;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        dial = findViewById(R.id.dial);
        msg = findViewById(R.id.msg);
        mail = findViewById(R.id.mail);
        share = findViewById(R.id.share);

        dial.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel: +7030368899"));
                //just check that is there any app to open this screen
                startActivity(intent);



            }
        });

        msg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_SEND);
                intent.setData(Uri.parse("smsto: +8806046789"));  // Only SMS apps respond to this.
                intent.putExtra("sms_body", "hello i m mayur ... how r u");
                startActivity(intent);


            }
        });

        mail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_SENDTO);
                intent.setData(Uri.parse("mailto:" + "mayurkkene@gmail.com")); // Only email apps handle this.
                intent.putExtra(Intent.EXTRA_SUBJECT, "about taking holiday");
                intent.putExtra(Intent.EXTRA_TEXT,"i was in hospital so i not able to come tommrrow");
                startActivity(intent);

            }
        });

        share.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_SEND);
                intent.setType("text/plain");
                intent.putExtra(Intent.EXTRA_TEXT,"take my referral code to this");
                startActivity(intent);


            }
        });
    }


}