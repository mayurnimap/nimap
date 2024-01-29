package com.example.listview_application;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.example.listview_application.R;

public class YashAdapter extends ArrayAdapter<String> {

private String arr[];
    public YashAdapter(@NonNull Context context, int resource, @NonNull String[] arr) {
        super(context, resource, arr);
        this.arr=arr;
    }

    @Nullable
    @Override
    public String getItem(int position)
    {
        return arr[position];
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        convertView = LayoutInflater.from(getContext()).inflate(R.layout.mayur_layout,parent,false);
        TextView t = convertView.findViewById(R.id.textView2);
        t.setText(getItem(position));
        return convertView;
    }
}
