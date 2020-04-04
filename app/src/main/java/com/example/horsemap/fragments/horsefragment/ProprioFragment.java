package com.example.horsemap.fragments.horsefragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import com.example.horsemap.R;
import com.example.horsemap.data.Horse;

import java.util.ArrayList;
import java.util.List;

public class ProprioFragment extends Fragment {

    RecyclerView recyclerView;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_club, container, false);
        recyclerView = v.findViewById(R.id.fragment_club_recycler_view);

        initRecycler();
        return v;

    }


    public void initRecycler(){
        List<Horse> horseList = new ArrayList<>();

    }

}
