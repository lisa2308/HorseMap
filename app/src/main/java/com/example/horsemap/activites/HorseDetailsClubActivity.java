package com.example.horsemap.activites;

import android.content.Intent;
import android.os.Bundle;

import android.widget.TextView;


import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import com.example.horsemap.R;



public class HorseDetailsClubActivity extends AppCompatActivity  {

//les findView

    TextView name;
    TextView race;
    TextView size;
    TextView sexe;
    TextView age;
    TextView colorMat;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.horse_details_club);

        name = findViewById(R.id.horse_details_title);
        race = findViewById(R.id.horse_details_race);
        size = findViewById(R.id.horse_details_taille);
        sexe = findViewById(R.id.horse_details_sexe);
        age = findViewById(R.id.horse_details_age);
        size = findViewById(R.id.horse_details_taille);
        colorMat = findViewById(R.id.horse_details_couleurMat);


        Intent i = getIntent();
        String nameStr = i.getStringExtra("name");
        name.setText(nameStr);
        String sizeStr = i.getStringExtra("size");
        size.setText(sizeStr);
        String raceStr = i.getStringExtra("race");
        race.setText(raceStr);
        String sexeStr = i.getStringExtra("sexe");
        sexe.setText(sexeStr);
        int ageInt = i.getIntExtra("age", 0);
        age.setText(ageInt + " ans");
        int colorMatInt = i.getIntExtra("colorMat", 0);
        colorMat.setBackgroundColor(ContextCompat.getColor(this, colorMatInt));

    }
}


