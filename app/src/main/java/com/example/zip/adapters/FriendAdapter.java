package com.example.zip.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.zip.R;
import com.example.zip.models.StoryModel;
import com.google.android.material.imageview.ShapeableImageView;

import java.util.List;


public class FriendAdapter extends RecyclerView.Adapter<FriendAdapter.ViewHolderMy> {
    List<StoryModel> list;

    public FriendAdapter(List<StoryModel> list) {
        this.list = list;
    }

    @NonNull
    @Override
    public ViewHolderMy onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_friend, parent, false);
        return new ViewHolderMy(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolderMy holder, int position) {
        holder.imageView.setImageResource(list.get(position).getPic());
        holder.name.setText(list.get(position).getName());

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public void setAdapter(FriendAdapter friendAdapter) {
    }

    public class ViewHolderMy extends RecyclerView.ViewHolder {
        ShapeableImageView imageView;
        TextView name;
        public ViewHolderMy(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.img);
            name = itemView.findViewById(R.id.txtName);
        }
    }
}
