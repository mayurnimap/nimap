package com.example.tab_layout

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentStatePagerAdapter
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.google.android.material.search.SearchView.Behavior

class TAdapter(fm:FragmentManager):FragmentStatePagerAdapter(fm,
    BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT){

    var fragmentlist : ArrayList<Fragment> = ArrayList()
    var fragmenttitle : ArrayList<String> = ArrayList()




    override fun getCount(): Int {

        return fragmentlist.size

    }

    override fun getItem(position: Int): Fragment {

        return fragmentlist[position]

    }

    override fun getPageTitle(position: Int): CharSequence? {
        return fragmenttitle[position]
    }

    fun addfragment(fragment:Fragment,title:String){
        fragmentlist.add(fragment)
        fragmenttitle.add(title)

    }


}