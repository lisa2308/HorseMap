package com.example.horsemap;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.activity_horse_recycler);
        initRecycler();

    }

    public void initRecycler(){
        List<Horse> horseList = new ArrayList<>();
        horseList.add(new Horse("Camacho",1990, "Male", R.color.colorWhite,8, "photo"));
        horseList.add(new Horse("Mars",1990, "Male", R.color.colorBai,8, "photo"));
        horseList.add(new Horse("Diva",1990, "Femelle", R.color.colorBai,8, "photo"));
        horseList.add(new Horse("Clin d'oeil",1990, "Male", R.color.colorBai,8, "photo"));
        horseList.add(new Horse("Sisi",1990, "Femelle", R.color.colorWhite,8, "photo"));
        horseList.add(new Horse("Brillant",1990, "Male", R.color.colorPrimaryDark,8, "photo"));
        horseList.add(new Horse("Seenc",1990, "Male", R.color.colorWhite,8, "photo"));
        horseList.add(new Horse("Prophet",1990, "Male", R.color.colorPrimaryDark,8, "photo"));
        horseList.add(new Horse("Haribo",1990, "Male", R.color.colorWhite + R.color.colorGrey + R.color.colorPrimaryDark,8, "photo"));
        horseList.add(new Horse("Sky",1990, "Male", R.color.colorWhite + R.color.colorAlezan,8, "photo"));
        horseList.add(new Horse("Canyon",1990, "Male", R.color.colorWhite + R.color.colorBai,8, "photo"));
        horseList.add(new Horse("Cyrano",1990, "Male", R.color.colorPrimaryDark,8, "photo"));
        horseList.add(new Horse("Roupie",1990, "Femelle", R.color.colorPrimaryDark,8, "photo"));
        horseList.add(new Horse("Cybelle",1990, "Femelle", R.color.colorGrey,8, "photo"));
        horseList.add(new Horse("Souris",1990, "Femelle", R.color.colorWhite,8, "photo"));
        horseList.add(new Horse("Elixir",1990, "Male", R.color.colorWhite + R.color.colorAlezan,8, "photo"));
        horseList.add(new Horse("Elia",1990, "Femelle", R.color.colorGrey,8, "photo"));
        horseList.add(new Horse("Rhianna",1990, "Femelle", R.color.colorWhite,8, "photo"));
        horseList.add(new Horse("Vicky",1990, "Femelle", R.color.colorWhite,8, "photo"));
        horseList.add(new Horse("Datcha",1990, "Male", R.color.colorBeige,8, "photo"));
        horseList.add(new Horse("Icar",1990, "Male", R.color.colorBai,8, "photo"));
        horseList.add(new Horse("Ibis",1990, "Male", R.color.colorAlezan,8, "photo"));
        horseList.add(new Horse("Simba",1990, "Male", R.color.colorWhite,8, "photo"));
        horseList.add(new Horse("VIP",1990, "Male", R.color.colorBai,8, "photo"));
        horseList.add(new Horse("Bandit",1990, "Male", R.color.colorHalf,8, "photo"));
        horseList.add(new Horse("Star",1990, "Femelle", R.color.colorBeige,8, "photo"));
        horseList.add(new Horse("Hutch",1990, "Male", R.color.colorBai,8, "photo"));
        horseList.add(new Horse("Lady",1990, "Femelle", R.color.colorAlezan,8, "photo"));
        horseList.add(new Horse("Donja",1990, "Femelle", R.color.colorAlezan,8, "photo"));
        horseList.add(new Horse("Marco",1990, "Male", R.color.colorBeige,8, "photo"));
        horseList.add(new Horse("Liliade",1990, "Femelle", R.color.colorBeige,8, "photo"));
        horseList.add(new Horse("Canter",1990, "Male", R.color.colorGrey,8, "photo"));
        horseList.add(new Horse("Capri",1990, "Femelle", R.color.colorAlezan,8, "photo"));
        horseList.add(new Horse("Chery",1990, "Femelle", R.color.colorBai + R.color.colorWhite,8, "photo"));
        horseList.add(new Horse("Buddy",1990, "Male", R.color.colorAlezan,8, "photo"));
        horseList.add(new Horse("Virée",1990, "Femelle", R.color.colorWhite,8, "photo"));
        horseList.add(new Horse("Alizée",1990, "Femelle", R.color.colorAlezan,8, "photo"));
        horseList.add(new Horse("Diego",1990, "Male", R.color.colorAlezan,8, "photo"));
        horseList.add(new Horse("Baron",1990, "Male", R.color.colorBai,8, "photo"));
        horseList.add(new Horse("Mara",1990, "Femelle", R.color.colorPrimaryDark,8, "photo"));
        horseList.add(new Horse("Viena",1990, "Femelle", R.color.colorPrimaryDark,8, "photo"));
        horseList.add(new Horse("Bollywood",1990, "Male", R.color.colorBai,8, "photo"));
        horseList.add(new Horse("Borsalino",1990, "Male", R.color.colorBeige,8, "photo"));
        horseList.add(new Horse("Callypso",1990, "Male", R.color.colorPrimaryDark,8, "photo"));
        horseList.add(new Horse("Magic",1990, "Male", R.color.colorGrey,8, "photo"));
        horseList.add(new Horse("Farouk",1990, "Male", R.color.colorPrimaryDark,8, "photo"));
        horseList.add(new Horse("Crystale",1990, "Femelle", R.color.colorGrey,8, "photo"));
        horseList.add(new Horse("Alianor",1990, "Femelle", R.color.colorBai,8, "photo"));
        horseList.add(new Horse("Alinéa",1990, "Femelle", R.color.colorPrimaryDark,8, "photo"));
        horseList.add(new Horse("Doudou",1990, "Male", R.color.colorPrimaryDark,8, "photo"));
        horseList.add(new Horse("Bourriquet",1990, "Male", R.color.colorAlezan + R.color.colorWhite,8, "photo"));
        horseList.add(new Horse("Caprice",1990, "Male", R.color.colorAlezan + R.color.colorWhite,8, "photo"));
        horseList.add(new Horse("Fiona",1990, "Femelle", R.color.colorAlezan + R.color.colorWhite,8, "photo"));
        horseList.add(new Horse("Iris",1990, "Femelle", R.color.colorPrimaryDark,8, "photo"));
        horseList.add(new Horse("Punky",1990, "Male", R.color.colorPrimaryDark,8, "photo"));
        horseList.add(new Horse("Caramel",1990, "Male", R.color.colorPrimaryDark,8, "photo"));
        horseList.add(new Horse("Nutella",1990, "Male", R.color.colorPrimaryDark,8, "photo"));
        horseList.add(new Horse("Nemo",1990, "Male", R.color.colorPrimaryDark,8, "photo"));
        horseList.add(new Horse("Bob",1990, "Male", R.color.colorPrimaryDark,8, "photo"));
        horseList.add(new Horse("Quinette",1990, "Femelle", R.color.colorAlezan,8, "photo"));
        horseList.add(new Horse("Elisa",1990, "Femelle", R.color.colorWhite,8, "photo"));
        horseList.add(new Horse("Lune",1990, "Femelle", R.color.colorAlezan,8, "photo"));
        horseList.add(new Horse("Cheyenne",1990, "Femelle", R.color.colorBai,8, "photo"));
        horseList.add(new Horse("Choco",1990, "Male", R.color.colorBai,8, "photo"));

        RecyclerViewAdapter recyclerViewAdapter = new RecyclerViewAdapter(horseList);

        //ASSOCIATE ADAPTER WITH RECYCLER//
        recyclerView.setAdapter(recyclerViewAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));












    }
}
