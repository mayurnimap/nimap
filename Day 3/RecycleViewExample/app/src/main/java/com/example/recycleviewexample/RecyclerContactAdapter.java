package com.example.recycleviewexample;

import android.content.Context;
import android.view.LayoutInflater;
import  android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class RecyclerContactAdapter extends RecyclerView.Adapter<RecyclerContactAdapter.ViewHolder>
{

    Context context ;//global member
    ArrayList<ContactModel> arrContacts;
    RecyclerContactAdapter(Context context, ArrayList<ContactModel> arrContacts)
    {

        this.context=context;
        this.arrContacts = arrContacts;
     //this is constructor
    }


    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType)
    {
        View view = LayoutInflater.from(context).inflate(R.layout.contact_row,parent, false);

        //attachtoroot we have set flase because if we set it true then it will just drag the
        //first data into last and then it will become neverending list...

        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;

        //R.layout.contact_row,parent this is path
        // we r returning ViewHolder because return type is Viewholder.

    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position)
    {
        holder.imgContact.setImageResource(arrContacts.get(position).img);
        holder.txtName.setText(arrContacts.get(position).name);
        holder.txtNumber.setText(arrContacts.get(position).number);



    }

    @Override
    public int getItemCount() {
        return arrContacts.size();

        //this states that we have to mentioned the size of the data because if its set to 0
        //then it will be having only one height column....
    }

    public class ViewHolder extends RecyclerView.ViewHolder
    {

        //this is class that we have given the name and that class is extending the recyclerview.
        //viewholder so first clsss we have made it and the second class is alredy present..


        TextView txtName,txtNumber;
        ImageView imgContact;
        //this are variables
        public ViewHolder( @NonNull View itemView) {
            super(itemView);

            txtName = itemView.findViewById(R.id.txtName);
            txtNumber = itemView.findViewById(R.id.txtNumber);
            imgContact = itemView.findViewById(R.id.imgContact);
        }

        //this is constructor....






    }




}
