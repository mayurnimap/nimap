package com.example.recycler_task;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {

    Context context;
    String[] text1;
    String[] text2;
    String[] text3;
    int[] images;

    public MyAdapter(Context context, String[] text1, String[] text2, String[] text3, int[] images) {
        this.context = context;
        this.text1 = text1;
        this.text2 = text2;
        this.text3 = text3;
        this.images = images;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view  = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.prizez,parent,false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.textView1.setText(text1[position]);
        holder.textView2.setText(text2[position]);
        holder.textView3.setText(text3[position]);
        holder.imageView.setImageResource(images[position]);
    }

    @Override
    public int getItemCount() {

        return text3.length;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        TextView textView1, textView2, textView3;
        ImageView imageView;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            textView1 = itemView.findViewById(R.id.text1);
            textView2 = itemView.findViewById(R.id.text2);
            textView3 = itemView.findViewById(R.id.text3);
            imageView = itemView.findViewById(R.id.box);
        }
    }
}
