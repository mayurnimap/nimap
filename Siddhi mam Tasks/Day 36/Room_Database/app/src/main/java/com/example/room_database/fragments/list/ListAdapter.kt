package com.example.room_database.fragments.list

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.view.menu.MenuView.ItemView
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.Recycler
import com.example.room_database.R
import com.example.room_database.data.User

class ListAdapter: RecyclerView.Adapter<ListAdapter.MyViewHolder>() {

    private var userlist = emptyList<User>()

    class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)
    {

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListAdapter.MyViewHolder {

        return MyViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.custom_row,parent,false))

    }

    override fun onBindViewHolder(holder: ListAdapter.MyViewHolder, position: Int) {

        val currentItem = userlist[position]

        holder.itemView.apply {
            findViewById<TextView>(R.id.textViewId).setText(currentItem.id.toString())
            findViewById<TextView>(R.id.textViewFirstName).setText(currentItem.firstName)
            findViewById<TextView>(R.id.textViewLastName).setText(currentItem.lastName)
            findViewById<TextView>(R.id.textViewAge).setText(currentItem.age.toString())
        }
    }

    override fun getItemCount(): Int {

        return userlist.size

    }

    fun setData(user:List<User>)
    {
        this.userlist = user
        notifyDataSetChanged()
    }


}