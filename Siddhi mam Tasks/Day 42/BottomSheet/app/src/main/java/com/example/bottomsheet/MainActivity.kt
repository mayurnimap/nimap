package com.example.bottomsheet

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.google.android.material.bottomsheet.BottomSheetDialog

class MainActivity : AppCompatActivity() {

    lateinit var btnShowBottomSheet: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // initializing our variable for button with its id.
        btnShowBottomSheet = findViewById(R.id.idBtnShowBottomSheet);

        // adding on click listener for our button.
        btnShowBottomSheet.setOnClickListener {
            val dialog = BottomSheetDialog(this)

            // on below line we are inflating a layout file which we have created.
            val view = layoutInflater.inflate(R.layout.bottom_sheet_dialog,null)

            // on below line we are creating a variable for our button
            // which we are using to dismiss our dialog.
            val btnClose = view.findViewById<Button>(R.id.idBtnDismiss)

            // on below line we are adding on click listener
            // for our dismissing the dialog button.
            btnClose.setOnClickListener {
                // on below line we are calling a dismiss
                // method to close our dialog.
                dialog.dismiss()
            }

            // below line is use to set cancelable to avoid
            // closing of dialog box when clicking on the screen.
            dialog.setCancelable(false)

            // on below line we are setting
            // content view to our view.
            dialog.setContentView(view)

            // on below line we are calling
            // a show method to display a dialog.
            dialog.show()
        }
    }
}