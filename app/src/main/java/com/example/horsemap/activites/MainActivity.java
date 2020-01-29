package com.example.horsemap.activites;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.ListAdapter;
import androidx.recyclerview.widget.RecyclerView;

import com.example.horsemap.RecyclerViewHolderListener;
import com.example.horsemap.data.Horse;
import com.example.horsemap.R;
import com.example.horsemap.adapters.RecyclerViewAdapter;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_horse);

        recyclerView = findViewById(R.id.activity_horse_recycler);
        initRecycler();

    }


    public void initRecycler(){
        List<Horse> horseList = new ArrayList<>();
        horseList.add(new Horse("https://desenio.fr/bilder/artiklar/zoom/3547_1.jpg","CAMACHO", "N°BOX",8));
        horseList.add(new Horse("https://farm5.static.flickr.com/4479/37522445620_7d0f529952_b.jpg","ROUPIE", "N°BOX", 20));

        RecyclerViewHolderListener listener = new RecyclerViewHolderListener() {
            @Override
            public void onItemClicked(RecyclerView.ViewHolder viewHolder, Object item, int pos) {
                Intent i = new Intent(recyclerView.getContext(), HorseDetailsActivity.class);
                startActivity(i);
            }
        };
        //ASSOCIATE ADAPTER WITH RECYCLER//
        RecyclerViewAdapter recyclerViewAdapter = new RecyclerViewAdapter(horseList, listener);
        recyclerView.setAdapter(recyclerViewAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(MainActivity.this));











    }
}
