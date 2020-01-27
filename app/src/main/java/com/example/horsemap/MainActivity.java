package com.example.horsemap;

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
        setContentView(R.layout.activity_horse_item);

        recyclerView = findViewById(R.id.activity_horse_recycler);
        initRecycler();

    }


    public void initRecycler(){
        List<Horse> horseList = new ArrayList<>();
        horseList.add(new Horse("Camacho",2001, "Male", R.color.colorWhite,8));

        RecyclerViewAdapter recyclerViewAdapter = new RecyclerViewAdapter(horseList);
        recyclerView.setAdapter(recyclerViewAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(MainActivity.this));





        //ASSOCIATE ADAPTER WITH RECYCLER//




    }
}
