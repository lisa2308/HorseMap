package com.example.horsemap;

import android.content.Context;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

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


        RecyclerViewAdapter recyclerViewAdapter = new RecyclerViewAdapter(horseList);
        recyclerView.setAdapter(recyclerViewAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(MainActivity.this));





        //ASSOCIATE ADAPTER WITH RECYCLER//




    }
}
