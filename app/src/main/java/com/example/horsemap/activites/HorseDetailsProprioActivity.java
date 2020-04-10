package com.example.horsemap.activites;

import android.content.Intent;
import android.os.Bundle;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;


import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import com.example.horsemap.R;



public class HorseDetailsProprioActivity extends AppCompatActivity  {

//les findView

    TextView name;
    TextView race;
    TextView size;
    TextView sexe;
    TextView age;
    TextView pension;
    TextView tel;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.horse_details_proprio);

        name = findViewById(R.id.horse_details_title);
        race = findViewById(R.id.horse_details_race);
        size = findViewById(R.id.horse_details_taille);
        sexe = findViewById(R.id.horse_details_sexe);
        age = findViewById(R.id.horse_details_age);
        size = findViewById(R.id.horse_details_taille);
        pension = findViewById(R.id.horse_details_proprio_pension);
        tel = findViewById(R.id.horse_details_proprio_tel);



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
        String pensionStr = i.getStringExtra("pension");
        pension.setText(pensionStr);
        String telStr = i.getStringExtra("tel");
        tel.setText(telStr);

        Button button;
        button = findViewById(R.id.horse_details_button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
           public void onClick(View view) {
               Intent intent = new Intent(HorseDetailsProprioActivity.this,CareActivity.class);
                startActivity(intent);
           }
         });



    }




}


