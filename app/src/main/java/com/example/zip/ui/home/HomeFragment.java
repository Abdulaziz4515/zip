package com.example.zip.ui.home;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.zip.R;
import com.example.zip.adapters.FriendAdapter;
import com.example.zip.adapters.StoryAdapter;
import com.example.zip.models.StoryModel;

import java.util.ArrayList;
import java.util.List;


public class HomeFragment extends Fragment {
    RecyclerView storyRec,friendRec;
    StoryAdapter storyAdapter;
    FriendAdapter friendAdapter;
    List<StoryModel> storyModelList;
    List<StoryModel> friendModelList;

    public HomeFragment() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home, container, false);
    }

    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        initViews(view);
        setList();
        storyAdapter = new StoryAdapter(storyModelList);
        friendAdapter = new FriendAdapter(friendModelList);
        friendRec.setAdapter(friendAdapter);
        storyRec.setAdapter(storyAdapter);
    }

    private void setList() {
        storyModelList = new ArrayList<>();
        storyModelList.add(new StoryModel(R.drawable.car, "Adrien"));
        storyModelList.add(new StoryModel(R.drawable.car, "Jakob"));
        storyModelList.add(new StoryModel(R.drawable.car, "Carolina"));
        storyModelList.add(new StoryModel(R.drawable.car, "Richard"));
        storyModelList.add(new StoryModel(R.drawable.car, "Adrien"));
        storyModelList.add(new StoryModel(R.drawable.car, "Jakob"));
        storyModelList.add(new StoryModel(R.drawable.car, "Carolina"));
        storyModelList.add(new StoryModel(R.drawable.car, "Richard"));
        friendModelList = new ArrayList<>();
        friendModelList.add(new StoryModel(R.drawable.car, "Adrien"));
        friendModelList.add(new StoryModel(R.drawable.car, "Adrien"));
        friendModelList.add(new StoryModel(R.drawable.car, "Adrien"));
        friendModelList.add(new StoryModel(R.drawable.car, "Adrien"));
        friendModelList.add(new StoryModel(R.drawable.car, "Adrien"));

    }

    private void initViews(View view) {
        storyRec = view.findViewById(R.id.storyRec);
        friendRec = view.findViewById(R.id.friendRecy);
    }
}