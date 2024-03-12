package com.example.room_database.fragments.add

import android.os.Bundle
import android.text.Editable
import android.text.TextUtils
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import com.example.room_database.R
import com.example.room_database.data.User
import com.example.room_database.data.UserViewModel


class addFragment : Fragment() {

    private lateinit var mUserViewModel : UserViewModel


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view =  inflater.inflate(R.layout.fragment_add, container, false)

        mUserViewModel = ViewModelProvider(this).get(UserViewModel::class.java)

        view.findViewById<Button>(R.id.Submit).setOnClickListener {
            insertDataToDatabase()
        }


        return view
    }

    private fun insertDataToDatabase() {
        val firstName = view?.findViewById<EditText>(R.id.editView1)?.text.toString()
        val lastName = view?.findViewById<EditText>(R.id.editView2)?.text.toString()
        val ageText = view?.findViewById<EditText>(R.id.editView3)?.text.toString()

        if (inputCheck(firstName, lastName, ageText)) {
            val age = if (ageText.isNotEmpty()) ageText.toInt() else 0 // Convert to integer if not empty

            // Create user object
            val user = User(0, firstName, lastName, age)

            // Add user to database
            mUserViewModel.addUser(user)
            Toast.makeText(requireContext(), "Successfully Added", Toast.LENGTH_LONG).show()

            // Navigate back
            findNavController().navigate(R.id.action_addFragment_to_listFragment)
        } else {
            Toast.makeText(requireContext(), "Please fill out all the fields", Toast.LENGTH_LONG).show()
        }
    }

    private fun inputCheck(firstName: String, lastName: String, age: String): Boolean {
        return !(TextUtils.isEmpty(firstName) || TextUtils.isEmpty(lastName) || age.isEmpty())
    }



}