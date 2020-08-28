package com.example.exless1;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.jar.Attributes;

public class StudentAdapter extends RecyclerView.Adapter<StudentAdapter.ViewHolder> {

    ArrayList<Student> list;

    public StudentAdapter(ArrayList<Student> list) {
        this.list = list;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.rv_item, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.name.setText(list.get(position).getName());
        holder.group.setText(list.get(position).getGroup()+ "");
        holder.photo.setImageResource(list.get(position).getPhoto());

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        TextView name;
        TextView group;
        ImageView photo;


        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            name = itemView.findViewById(R.id.name);
            group = itemView.findViewById(R.id.group);
            photo = itemView.findViewById(R.id.photo);

        }
    }
}
