package com.example.horsemap.fragments.horsefragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.horsemap.R;
import com.example.horsemap.RecyclerViewHolderListener;
import com.example.horsemap.activites.HorseDetailsClubActivity;
import com.example.horsemap.adapters.RecyclerViewAdapter;
import com.example.horsemap.data.Horse;

import java.util.ArrayList;
import java.util.List;

public class ClubFragment extends Fragment {

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
        horseList.add(new Horse("(ONC)","https://desenio.fr/bilder/artiklar/zoom/3547_1.jpg","MARCO", "N°BOX",1,"Hongre", 8, "Poney",R.color.colorOrange,"",""));
        horseList.add(new Horse("(ONC)","https://farm5.static.flickr.com/4479/37522445620_7d0f529952_b.jpg","LILIADE", "N°BOX", 1, "Jument", 8, "poney",R.color.colorOrange,"",""));
        horseList.add(new Horse("(ONC)","https://desenio.fr/bilder/artiklar/zoom/3547_1.jpg","LADY", "N°BOX",2,"Jument", 8, "Poney",R.color.colorOrange,"",""));
        horseList.add(new Horse("(ONC)","https://desenio.fr/bilder/artiklar/zoom/3547_1.jpg","DONJA", "N°BOX",2,"Jument", 8, "Poney",R.color.colorOrange,"",""));
        horseList.add(new Horse("(Fjord)","https://desenio.fr/bilder/artiklar/zoom/3547_1.jpg","STAR", "N°BOX",3,"Jument", 8, "Poney",R.color.colorOrange,"",""));
        horseList.add(new Horse("(KWPN)","https://desenio.fr/bilder/artiklar/zoom/3547_1.jpg","HUTCH", "N°BOX",3,"Hongre", 8, "Poney",R.color.colorOrange,"",""));
        horseList.add(new Horse("(ONC)","https://desenio.fr/bilder/artiklar/zoom/3547_1.jpg","SIMBA", "N°BOX",4,"Hongre", 8, "Poney",R.color.colorOrange,"",""));
        horseList.add(new Horse("(ONC)","https://desenio.fr/bilder/artiklar/zoom/3547_1.jpg","VIP", "N°BOX",4,"Hongre", 8, "Poney",R.color.colorOrange,"",""));
        horseList.add(new Horse("(Haflinger)","https://desenio.fr/bilder/artiklar/zoom/3547_1.jpg","BANDIT", "N°BOX",5,"Hongre", 8, "Poney",R.color.colorOrange,"",""));
        horseList.add(new Horse("(ONC)","https://desenio.fr/bilder/artiklar/zoom/3547_1.jpg","ICARD", "N°BOX",6,"Hongre", 8, "Poney",R.color.colorOrange,"",""));
        horseList.add(new Horse("(OC)","https://desenio.fr/bilder/artiklar/zoom/3547_1.jpg","IBIS", "N°BOX",7,"Jument", 8, " Petit poney",R.color.colorOrange,"",""));
        horseList.add(new Horse("(ONC)","https://desenio.fr/bilder/artiklar/zoom/3547_1.jpg","VICKY", "N°BOX",8, "Jument", 8, "Poney",R.color.colorOrange,"",""));
        horseList.add(new Horse("(KWPN)","https://desenio.fr/bilder/artiklar/zoom/3547_1.jpg","DATSHA", "N°BOX",9, "Jument", 8, "Poney",R.color.colorOrange,"",""));
        horseList.add(new Horse("(ONC)","https://desenio.fr/bilder/artiklar/zoom/3547_1.jpg","ELIA", "N°BOX",10,"Jument", 8, "Poney",R.color.colorOrange,"","Cheval peureux, ne pas rentrer à plusieurs dans le box"));
        horseList.add(new Horse("(ONC)","https://desenio.fr/bilder/artiklar/zoom/3547_1.jpg","RHIANNA", "N°BOX",11,"Jument", 8, "Poney",R.color.colorOrange,"",""));
        horseList.add(new Horse("(OC)","https://desenio.fr/bilder/artiklar/zoom/3547_1.jpg","MERCURE", "N°BOX",11, "Hongre", 8, "Poney",R.color.colorOrange,"",""));
        horseList.add(new Horse("(ONC)","https://desenio.fr/bilder/artiklar/zoom/3547_1.jpg","SOURIS", "N°BOX",12, "Jument", 8, "Petit cheval",R.color.colorBlue,"",""));
        horseList.add(new Horse("(OC)","https://desenio.fr/bilder/artiklar/zoom/3547_1.jpg","ELIXIR", "N°BOX",13,"Hongre", 8, "Petit cheval",R.color.colorBlue,"",""));
        horseList.add(new Horse("(TF)","https://desenio.fr/bilder/artiklar/zoom/3547_1.jpg","ROUPIE", "N°BOX",14,"Jument", 8, "Petit cheval",R.color.colorBlue,"",""));
        horseList.add(new Horse("(OC)","https://desenio.fr/bilder/artiklar/zoom/3547_1.jpg","CYBELLE", "N°BOX",15, "Jument", 8, "Petit cheval",R.color.colorBlue,"",""));
        horseList.add(new Horse("(SF)","https://desenio.fr/bilder/artiklar/zoom/3547_1.jpg","CANYON", "N°BOX",16, "Hongre", 8, "Cheval",R.color.colorBlue,"",""));
        horseList.add(new Horse("(ONC)","https://desenio.fr/bilder/artiklar/zoom/3547_1.jpg","CYRANO", "N°BOX",17, "Hongre", 8, "Cheval",R.color.colorBlue,"",""));
        horseList.add(new Horse("(Camarguais)","https://desenio.fr/bilder/artiklar/zoom/3547_1.jpg","HARIBO", "N°BOX",18, "Hongre", 8, "Cheval",R.color.colorBlue,"","Castré tard, ne pas approcher trop près des autres chevaux"));
        horseList.add(new Horse("(KWPN)","https://desenio.fr/bilder/artiklar/zoom/3547_1.jpg","SKY", "N°BOX",19,"Hongre", 8, "Cheval",R.color.colorGreen,"","Mettre crême sur le garot"));
        horseList.add(new Horse("(ONC)","https://desenio.fr/bilder/artiklar/zoom/3547_1.jpg","SEENC", "N°BOX",20, "Hongre", 8, "Petit cheval",R.color.colorBlue,"",""));
        horseList.add(new Horse("(KWPN)","https://desenio.fr/bilder/artiklar/zoom/3547_1.jpg","PROPHET", "N°BOX",21,"Hongre", 8, "Cheval",R.color.colorGreen,"",""));
        horseList.add(new Horse("(OC)","https://desenio.fr/bilder/artiklar/zoom/3547_1.jpg","SISSI", "N°BOX",22, "Jument", 8, "Cheval",R.color.colorGreen,"","Amortisseur"));
        horseList.add(new Horse("(SF)","https://desenio.fr/bilder/artiklar/zoom/3547_1.jpg","BRILLANT", "N°BOX",23, "Hongre", 8, "Cheval",R.color.colorGreen,"",""));
        horseList.add(new Horse("(SF)","https://desenio.fr/bilder/artiklar/zoom/3547_1.jpg","CLIN D'OEIL", "N°BOX",24, "Hongre", 8, "Cheval",R.color.colorGreen,"",""));
        horseList.add(new Horse("(KWPN)","https://desenio.fr/bilder/artiklar/zoom/3547_1.jpg","DIVA", "N°BOX",25,"Jument", 8, "Cheval",R.color.colorGreen,"",""));
        horseList.add(new Horse("(ONC)","https://desenio.fr/bilder/artiklar/zoom/3547_1.jpg","MARS", "N°BOX",26, "Hongre", 8, "Poney",R.color.colorOrange,"",""));

        RecyclerViewHolderListener listener = new RecyclerViewHolderListener() {
            @Override
            public void onItemClicked(RecyclerView.ViewHolder viewHolder, Object item, int pos) {
                Horse h = (Horse) item;
                Intent i = new Intent(getContext(), HorseDetailsClubActivity.class);
                i.putExtra("name", h.getName());
                startActivity(i);
                i.putExtra("size", h.getSize());
                startActivity(i);
                i.putExtra("race", h.getRace());
                startActivity(i);
                i.putExtra("sexe", h.getSexe());
                startActivity(i);
                i.putExtra("age", h.getAge());
                startActivity(i);
                i.putExtra("colorMat", h.getColorMat());
                startActivity(i);


            }
        };
        //ASSOCIATE ADAPTER WITH RECYCLER//
        RecyclerViewAdapter recyclerViewAdapter = new RecyclerViewAdapter(horseList, listener);
        recyclerView.setAdapter(recyclerViewAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));

    }
}
