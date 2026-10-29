package com.example.recyclerviewtest;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder> {
    private ArrayList<Item> mData;
    public MyAdapter(ArrayList<Item> data) {
        this.mData = data;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        public final ImageView ivImage;
        public final TextView ivName;
        public final TextView ivDescription;
        public ViewHolder(View itemView) {
            super(itemView);
            ivImage = itemView.findViewById(R.id.imageView);
            ivName = itemView.findViewById(R.id.name);
            ivDescription = itemView.findViewById(R.id.description);
        }
    }

    @NonNull
    @Override
    public MyAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater  inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.custom_layout, parent, false);
        ViewHolder viewHolder = new ViewHolder(view);
        viewHolder.ivImage.setOnClickListener(v -> {
            this.notifyItemRemoved(viewHolder.getAdapterPosition());
        });
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyAdapter.ViewHolder holder, int position) {
        Item item = mData.get(position);
        holder.ivImage.setImageResource(item.getImage());
        holder.ivName.setText(item.getName());
        holder.ivDescription.setText(item.getDescription());
    }

    @Override
    public int getItemCount() {
        return mData.size();
    }
}
