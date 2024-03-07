package com.example.navigation_components

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import com.example.navigation_components.databinding.FragmentXfragmentBinding


class Xfragment : Fragment() {

    private lateinit var binding: FragmentXfragmentBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentXfragmentBinding.inflate(inflater, container, false)


        binding.button1.setOnClickListener {
            it.findNavController().navigate(R.id.action_xfragment2_to_yfragment2)
        }

        binding.button2.setOnClickListener {
            it.findNavController().navigate(R.id.action_xfragment2_to_zfragment2)
        }

        return binding.root

    }
}
