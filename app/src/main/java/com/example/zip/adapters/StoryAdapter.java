package com.example.zip.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.zip.R;
import com.example.zip.models.StoryModel;

import java.util.List;

import de.hdodenhof.circleimageview.CircleImageView;

public class StoryAdapter extends RecyclerView.Adapter<StoryAdapter.MyViewHolder> {
    List<StoryModel> list;

    public StoryAdapter(List<StoryModel> list) {
        this.list = list;
    }

    @NonNull
    @Override
    public StoryAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_story, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull StoryAdapter.MyViewHolder holder, int position) {
        if (position == 0) {
            holder.all_story.setVisibility(View.GONE);
            holder.add_story.setVisibility(View.VISIBLE);
        } else {
            holder.all_story.setVisibility(View.VISIBLE);
            holder.add_story.setVisibility(View.GONE);
            holder.pic.setImageResource(list.get(position - 1).getPic());
            holder.name.setText(list.get(position - 1).getName());

        }
    }

    @Override
    public int getItemCount() {
        return list.size() + 1;
    }



    public class MyViewHolder extends RecyclerView.ViewHolder {
        LinearLayout add_story, all_story;
        CircleImageView pic;
        TextView name;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            add_story = itemView.findViewById(R.id.liner_add);
            all_story = itemView.findViewById(R.id.Liner_all_story);
            pic = itemView.findViewById(R.id.pic1);
            name = itemView.findViewById(R.id.txtNameStory);
        }
    }
}
