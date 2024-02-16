package com.example.api_calling;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.api_calling.Data;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class PostsAdapter extends RecyclerView.Adapter<PostsAdapter.ViewHolder> {

    private List<Data> dataList;



    public PostsAdapter(List<Data> dataList)
    {
        this.dataList = dataList;
    }






    @NonNull
    @Override
    public PostsAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view  = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.list_view,parent,false);
        return new ViewHolder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull PostsAdapter.ViewHolder holder, int position) {

        holder.user_id.setText(String.valueOf(dataList.get(position).getId()));//because return type was int thats why we have use wrapper class
        holder.user_name.setText(dataList.get(position).getName());
        holder.user_email.setText(dataList.get(position).getEmail());
        holder.user_gender.setText(dataList.get(position).getGender());
        holder.user_status.setText(dataList.get(position).getStatus());

    }

    @Override
    public int getItemCount() {
        return dataList.size();
    }



    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView user_id,user_name,user_email,user_gender,user_status;

        public ViewHolder(View itemview)
        {
            super(itemview);

            user_id = itemview.findViewById(R.id.user_id);
            user_name = itemview.findViewById(R.id.user_name);
            user_email = itemview.findViewById(R.id.user_email);
            user_gender = itemview.findViewById(R.id.user_gender);
            user_status = itemview.findViewById(R.id.user_status);
        }


    }
}



