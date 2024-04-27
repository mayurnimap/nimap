package com.example.tab_layout

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.tab_layout.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        val fragmentAdapter = TAdapter(supportFragmentManager)
        fragmentAdapter.addfragment(AFragment(),"A")
        fragmentAdapter.addfragment(BFragment(),"B")
        fragmentAdapter.addfragment(CFragment(),"C")
        fragmentAdapter.addfragment(DFragment(),"D")

        binding.viewPager.adapter = fragmentAdapter
        binding.tabLayout.setupWithViewPager(binding.viewPager)
    }
}