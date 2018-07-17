package com.example.a17045679.basicmath;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class CustomeAdapter extends ArrayAdapter {


    Context parent_context;
    int layout_id;
    ArrayList<MathItem> movieList;


    public CustomeAdapter(@NonNull Context context, int resource, @NonNull ArrayList<MathItem> objects) {
        super(context, resource, objects);
        parent_context = context;
        layout_id = resource;
        movieList = objects;
    }

    //Right-Click generate Override Method
    //It runs the roll everytime it runs
    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) parent_context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View rowView = inflater.inflate(layout_id, parent, false);
        TextView tvName = rowView.findViewById(R.id.textViewName);
        TextView tvDate = rowView.findViewById(R.id.textViewTriangle);
        TextView tvDate1 = rowView.findViewById(R.id.textViewCube);
        MathItem currentItem = movieList.get(position);
        String name = currentItem.getName();
        String fomula = currentItem.getName1();
        String area = currentItem.getName11();


        tvName.setText(name);
        tvDate.setText(fomula);
        tvDate1.setText(area);


        return rowView;
    }
}
