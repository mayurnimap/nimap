package com.example.demo_rc;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {

    int [] images;
    String [] names;

    MyAdapter(int [] images, String  [] names)
    {
        this.images=images;
        this.names=names;
    }



    class MyViewHolder extends RecyclerView.ViewHolder
    {

        private ImageView imageView3;
        private TextView textView2;


        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            imageView3 = (ImageView) itemView.findViewById(R.id.imageView3);
            textView2 = (TextView) itemView.findViewById(R.id.textView2);
        }
    }


    @NonNull
    @Override
    public MyAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.contact,parent,false);

        return  new MyViewHolder(view);


    }

    @Override
    public void onBindViewHolder(@NonNull MyAdapter.MyViewHolder holder, int position) {


        holder.imageView3.setImageResource(images[position]);
        holder.textView2.setText(names[position]);

    }

    @Override
    public int getItemCount() {

        return names.length;
    }
}
