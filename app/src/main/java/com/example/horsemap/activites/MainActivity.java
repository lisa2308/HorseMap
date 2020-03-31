package com.example.horsemap.activites;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.ActionBar;
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
    private int colorGreen;
    private int colorBlue;
    private int colorOrange;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_horse);

        colorBlue = 1;
        colorGreen = 2;
        colorOrange = 3;


        recyclerView = findViewById(R.id.activity_horse_recycler);
        initRecycler();
    }


    public void initRecycler(){
        List<Horse> horseList = new ArrayList<>();
        horseList.add(new Horse("(ONC)","https://desenio.fr/bilder/artiklar/zoom/3547_1.jpg","MARCO", "N°BOX",1,"Hongre", 8, "poney",3,"",""));
        horseList.add(new Horse("(ONC)","https://farm5.static.flickr.com/4479/37522445620_7d0f529952_b.jpg","LILIADE", "N°BOX", 1, "Jument", 8, "poney",3,"",""));
        horseList.add(new Horse("(ONC)","https://desenio.fr/bilder/artiklar/zoom/3547_1.jpg","LADY", "N°BOX",2,"Jument", 8, "poney",3,"",""));
        horseList.add(new Horse("(ONC)","https://desenio.fr/bilder/artiklar/zoom/3547_1.jpg","DONJA", "N°BOX",2,"Jument", 8, "poney",3,"",""));
        horseList.add(new Horse("(Fjord)","https://desenio.fr/bilder/artiklar/zoom/3547_1.jpg","STAR", "N°BOX",3,"Jument", 8, "poney",3,"",""));
        horseList.add(new Horse("(KWPN)","https://desenio.fr/bilder/artiklar/zoom/3547_1.jpg","HUTCH", "N°BOX",3,"Hongre", 8, "poney",3,"",""));
        horseList.add(new Horse("(ONC)","https://desenio.fr/bilder/artiklar/zoom/3547_1.jpg","SIMBA", "N°BOX",4,"Hongre", 8, "poney",3,"",""));
        horseList.add(new Horse("(ONC)","https://desenio.fr/bilder/artiklar/zoom/3547_1.jpg","VIP", "N°BOX",4,"Hongre", 8, "poney",3,"",""));
        horseList.add(new Horse("(Haflinger)","https://desenio.fr/bilder/artiklar/zoom/3547_1.jpg","BANDIT", "N°BOX",5,"Hongre", 8, "poney",3,"",""));
        horseList.add(new Horse("(ONC)","https://desenio.fr/bilder/artiklar/zoom/3547_1.jpg","ICARD", "N°BOX",6,"Hongre", 8, "poney",3,"",""));
        horseList.add(new Horse("(OC)","https://desenio.fr/bilder/artiklar/zoom/3547_1.jpg","IBIS", "N°BOX",7,"Jument", 8, " Petit poney",3,"",""));
        horseList.add(new Horse("(ONC)","https://desenio.fr/bilder/artiklar/zoom/3547_1.jpg","VICKY", "N°BOX",8, "Jument", 8, "poney",3,"",""));
        horseList.add(new Horse("(KWPN)","https://desenio.fr/bilder/artiklar/zoom/3547_1.jpg","DATSHA", "N°BOX",9, "Jument", 8, "poney",3,"",""));
        horseList.add(new Horse("(ONC)","https://desenio.fr/bilder/artiklar/zoom/3547_1.jpg","ELIA", "N°BOX",10,"Jument", 8, "poney",3,"","Cheval peureux, ne pas rentrer à plusieurs dans le box"));
        horseList.add(new Horse("(ONC)","https://desenio.fr/bilder/artiklar/zoom/3547_1.jpg","RHIANNA", "N°BOX",11,"Jument", 8, "poney",3,"",""));
        horseList.add(new Horse("(OC)","https://desenio.fr/bilder/artiklar/zoom/3547_1.jpg","MERCURE", "N°BOX",11, "Hongre", 8, "poney",3,"",""));
        horseList.add(new Horse("(ONC)","https://desenio.fr/bilder/artiklar/zoom/3547_1.jpg","SOURIS", "N°BOX",12, "Jument", 8, "Petit cheval",1,"",""));
        horseList.add(new Horse("(OC)","https://desenio.fr/bilder/artiklar/zoom/3547_1.jpg","ELIXIR", "N°BOX",13,"Hongre", 8, "Petit cheval",1,"",""));
        horseList.add(new Horse("(TF)","https://desenio.fr/bilder/artiklar/zoom/3547_1.jpg","ROUPIE", "N°BOX",14,"Jument", 8, "Petit cheval",1,"",""));
        horseList.add(new Horse("(OC)","https://desenio.fr/bilder/artiklar/zoom/3547_1.jpg","CYBELLE", "N°BOX",15, "Jument", 8, "Petit cheval",1,"",""));
        horseList.add(new Horse("(SF)","https://desenio.fr/bilder/artiklar/zoom/3547_1.jpg","CANYON", "N°BOX",16, "Hongre", 8, "cheval",1,"",""));
        horseList.add(new Horse("(ONC)","https://desenio.fr/bilder/artiklar/zoom/3547_1.jpg","CYRANO", "N°BOX",17, "Hongre", 8, "Cheval",1,"",""));
        horseList.add(new Horse("(Camarguais)","https://desenio.fr/bilder/artiklar/zoom/3547_1.jpg","HARIBO", "N°BOX",18, "Hongre", 8, "Cheval",1,"","Castré tard, ne pas approcher trop près des autres chevaux"));
        horseList.add(new Horse("(KWPN)","https://desenio.fr/bilder/artiklar/zoom/3547_1.jpg","SKY", "N°BOX",19,"Hongre", 8, "Cheval",2,"","Mettre crême sur le garot"));
        horseList.add(new Horse("(ONC)","https://desenio.fr/bilder/artiklar/zoom/3547_1.jpg","SEENC", "N°BOX",20, "Hongre", 8, "Petit cheval",1,"",""));
        horseList.add(new Horse("(KWPN)","https://desenio.fr/bilder/artiklar/zoom/3547_1.jpg","PROPHET", "N°BOX",21,"Hongre", 8, "Cheval",2,"",""));
        horseList.add(new Horse("(OC)","https://desenio.fr/bilder/artiklar/zoom/3547_1.jpg","SISSI", "N°BOX",22, "Jument", 8, "Cheval",2,"","Amortisseur"));
        horseList.add(new Horse("(SF)","https://desenio.fr/bilder/artiklar/zoom/3547_1.jpg","BRILLANT", "N°BOX",23, "Hongre", 8, "Cheval",2,"",""));
        horseList.add(new Horse("(SF)","https://desenio.fr/bilder/artiklar/zoom/3547_1.jpg","CLIN D'OEIL", "N°BOX",24, "Hongre", 8, "Cheval",2,"",""));
        horseList.add(new Horse("(KWPN)","https://desenio.fr/bilder/artiklar/zoom/3547_1.jpg","DIVA", "N°BOX",25,"Jument", 8, "Cheval",2,"",""));
        horseList.add(new Horse("(ONC)","https://desenio.fr/bilder/artiklar/zoom/3547_1.jpg","MARS", "N°BOX",26, "Hongre", 8, "Poney",3,"",""));
        horseList.add(new Horse("(Zangersheide)","https://desenio.fr/bilder/artiklar/zoom/3547_1.jpg","CAMACHO", "N°BOX",27, "Hongre", 19, "Cheval",2,"",""));
        horseList.add(new Horse("(ONC)","https://desenio.fr/bilder/artiklar/zoom/3547_1.jpg","HERCULE", "N°BOX",28, "Hongre", 8, "Petit poney",1,"",""));
        horseList.add(new Horse("(Shetland)","https://desenio.fr/bilder/artiklar/zoom/3547_1.jpg","BOURRIQUET", "N°BOX",28, "Hongre", 8, "Shetland","",""));
        horseList.add(new Horse("(Shetland)","https://desenio.fr/bilder/artiklar/zoom/3547_1.jpg","CAPRICE", "N°BOX",28,"Hongre", 8, "Shetland","",""));
        horseList.add(new Horse("(Shetland)","https://desenio.fr/bilder/artiklar/zoom/3547_1.jpg","FIONA", "N°BOX",28, "Jument", 8, "Shetland","",""));
        horseList.add(new Horse("(Shetland)","https://desenio.fr/bilder/artiklar/zoom/3547_1.jpg","PUNKY", "N°BOX",28, "Hongre", 8, "Shetland","",""));
        horseList.add(new Horse("(Shetland)", "https://desenio.fr/bilder/artiklar/zoom/3547_1.jpg","CARAMEL", "N°BOX",29, "Hongre", 8, "Shetland","",""));
        horseList.add(new Horse("(Shetland)","https://desenio.fr/bilder/artiklar/zoom/3547_1.jpg","NUTELLA", "N°BOX",29,"Hongre", 8, "Shetland","",""));
        horseList.add(new Horse("(Shetland)", "https://desenio.fr/bilder/artiklar/zoom/3547_1.jpg","NEMO", "N°BOX",29, "Hongre", 8, "Shetland","",""));
        horseList.add(new Horse("(Shetland)","https://desenio.fr/bilder/artiklar/zoom/3547_1.jpg","BOB", "N°BOX",29, "Hongre", 8, "Shetland","",""));
        horseList.add(new Horse("(Shetland)","https://desenio.fr/bilder/artiklar/zoom/3547_1.jpg","QUINETTE", "N°BOX",29, "Jument", 8, "Shetland","",""));
        horseList.add(new Horse("(Holsteiner)","https://desenio.fr/bilder/artiklar/zoom/3547_1.jpg","CANTER", "N°BOX",31, "Entier", 8, "Cheval"));
        horseList.add(new Horse("(KWPN)","https://desenio.fr/bilder/artiklar/zoom/3547_1.jpg","CAPRI", "N°BOX",30, "Jument", 8, "Cheval"));
        horseList.add(new Horse("(KWPN)","https://desenio.fr/bilder/artiklar/zoom/3547_1.jpg","CHERIE", "N°BOX",32, "Jument", 8, "Cheval"));
        horseList.add(new Horse("(KWPN)","https://desenio.fr/bilder/artiklar/zoom/3547_1.jpg","BUDDY", "N°BOX",34,  "Hongre", 8, "Cheval"));
        horseList.add(new Horse("(ONC)","https://desenio.fr/bilder/artiklar/zoom/3547_1.jpg","VIREE", "N°BOX",36,  "Jument", 8, "Poney"));
        horseList.add(new Horse("(ONC)","https://desenio.fr/bilder/artiklar/zoom/3547_1.jpg","DIEGO", "N°BOX",38,  "Hongre", 8, "Cheval"));
        horseList.add(new Horse("(KWPN)","https://desenio.fr/bilder/artiklar/zoom/3547_1.jpg","MARA", "N°BOX",42,  "Jument", 8, "Poney"));
        horseList.add(new Horse("(KWPN)","https://desenio.fr/bilder/artiklar/zoom/3547_1.jpg","BOLLYWOOD", "N°BOX",44,  "Hongre", 8, "Poney"));
        horseList.add(new Horse("(Ibérique)","https://desenio.fr/bilder/artiklar/zoom/3547_1.jpg","BORSALINO", "N°BOX",46,  "Hongre", 8, "Cheval"));
        horseList.add(new Horse("(SF)","https://desenio.fr/bilder/artiklar/zoom/3547_1.jpg","CALYPSO", "N°BOX",48,  "Hongre", 8, "Cheval"));
        horseList.add(new Horse("(Belge)","https://desenio.fr/bilder/artiklar/zoom/3547_1.jpg","FAROUK", "N°BOX",50,  "Hongre", 8, "Cheval"));
        horseList.add(new Horse("(ONC)","https://desenio.fr/bilder/artiklar/zoom/3547_1.jpg","MAGIC", "N°BOX",51,  "Jument", 8, "Poney"));
        horseList.add(new Horse("(KWPN)","https://desenio.fr/bilder/artiklar/zoom/3547_1.jpg","CRYSTALE", "N°BOX",52,  "Jument", 8, "Cheval"));
        horseList.add(new Horse("(SF)","https://desenio.fr/bilder/artiklar/zoom/3547_1.jpg","ALINEA", "N°BOX",54,  "Jument", 8, "Cheval"));
        horseList.add(new Horse("(ONC)","https://desenio.fr/bilder/artiklar/zoom/3547_1.jpg","DOUDOU", "N°BOX",55, "Hongre", 8, "Shetland","",""));
        horseList.add(new Horse("(ONC)","https://desenio.fr/bilder/artiklar/zoom/3547_1.jpg","IRIS", "N°BOX",55, "Jument", 8, "Shetland","",""));
        horseList.add(new Horse("(ONC)","https://desenio.fr/bilder/artiklar/zoom/3547_1.jpg","ALIANOR", "N°BOX",56, "Jument", 8, "Poney"));
        horseList.add(new Horse("(ONC)","https://desenio.fr/bilder/artiklar/zoom/3547_1.jpg","CHOCO", "N°BOX",57, "Hongre", 8, "Shetland","",""));
        horseList.add(new Horse("(ONC)","https://desenio.fr/bilder/artiklar/zoom/3547_1.jpg","LUNE", "N°BOX",57, "Jument", 8, "Shetland","",""));
        horseList.add(new Horse("(ONC)","https://desenio.fr/bilder/artiklar/zoom/3547_1.jpg","ELISA", "N°BOX",57, "Jument", 8, "Shetland","",""));
        horseList.add(new Horse("(ONC)","https://desenio.fr/bilder/artiklar/zoom/3547_1.jpg","SURPRISE", "N°BOX",57, "Hongre", 8, "Shetland","",""));



        RecyclerViewHolderListener listener = new RecyclerViewHolderListener() {
            @Override
            public void onItemClicked(RecyclerView.ViewHolder viewHolder, Object item, int pos) {
                Horse h = (Horse) item;
                Intent i = new Intent(MainActivity.this, HorseDetailsActivity.class);
                i.putExtra("name", h.getName());
                startActivity(i);
                i.putExtra("size", h.getSize());
                startActivity(i);
                i.putExtra("race", h.getRace());
                startActivity(i);
                i.putExtra("sexe", h.getSexe());
                startActivity(i);


            }
        };
        //ASSOCIATE ADAPTER WITH RECYCLER//
        RecyclerViewAdapter recyclerViewAdapter = new RecyclerViewAdapter(horseList, listener);
        recyclerView.setAdapter(recyclerViewAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(MainActivity.this));

    }


}
