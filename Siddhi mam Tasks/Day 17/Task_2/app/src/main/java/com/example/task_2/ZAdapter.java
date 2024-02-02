package com.example.task_2;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;

public class ZAdapter  extends RecyclerView.Adapter<ZAdapter.MyViewHolder> {

    String arr[];
    String arr2[];

    int images[];


    ZAdapter(String arr[],String arr2[],int images[])
    {
           this.arr = arr;
           this.arr2 = arr2;
           this.images = images;
    }


    class MyViewHolder extends RecyclerView.ViewHolder
     {
       private ImageView RImageView;
       private TextView RTextView1;
       private TextView RTextView2;


       public MyViewHolder(@NonNull View itemView) {
           super(itemView);
           RImageView = (ImageView) itemView.findViewById(R.id.RImageView);
           RTextView1 = (TextView) itemView.findViewById(R.id.RTextView1);
           RTextView2 = (TextView) itemView.findViewById(R.id.RTextView2);
       }


}

    @NonNull
    @Override
    public ZAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.list_item_layout,parent,false);

        return  new MyViewHolder(view);


    }

    @Override
    public void onBindViewHolder(@NonNull ZAdapter.MyViewHolder holder, int position) {


        holder.RImageView.setImageResource(images[position]);
        holder.RTextView1.setText(arr[position]);
        holder.RTextView2.setText(arr2[position]);

    }

    @Override
    public int getItemCount() {
        return arr.length;
    }
}











