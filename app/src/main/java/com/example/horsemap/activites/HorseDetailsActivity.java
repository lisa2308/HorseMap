package com.example.horsemap.activites;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import com.example.horsemap.R;
import com.example.horsemap.data.Horse;
import com.google.android.material.floatingactionbutton.FloatingActionButton;


public class HorseDetailsActivity extends AppCompatActivity {

//les findView

    TextView name;
    TextView race;
    TextView size;
    TextView sexe;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.horse_details);

        name = findViewById(R.id.horse_details_title);
        race = findViewById(R.id.horse_details_race);
        size = findViewById(R.id.horse_details_taille);
        sexe = findViewById(R.id.horse_details_sexe);

        Intent i = getIntent();
        String nameStr = i.getStringExtra("name");
        name.setText(nameStr);
        String sizeStr = i.getStringExtra("size");
        size.setText(sizeStr);
        String raceStr = i.getStringExtra("race");
        race.setText(raceStr);
        String sexeStr = i.getStringExtra("sexe");
        sexe.setText(sexeStr);


    }


}
