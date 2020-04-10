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
import com.example.horsemap.activites.HorseDetailsProprioActivity;
import com.example.horsemap.adapters.RecyclerViewAdapter;
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

    //(String race, String photo, String name, String place, int number, String pension, String sexe, int age, String size, String enplus, String tel)
    public void initRecycler(){
        List<Horse> horseList = new ArrayList<>();
        horseList.add(new Horse("SF","https://www.cheval-shop.com/boutique/16144/fourreau-de-muserolle-time-rider-sport.jpg","CAPRI","N°BOX",30,"PENSION TRAVAIL PAILLE","Jument",4,"Cheval","enplus","Marie Ouannes"));
        horseList.add(new Horse("Holsteiner","https://www.cheval-shop.com/boutique/16144/fourreau-de-muserolle-time-rider-sport.jpg","CANTER","N°BOX",31,"PENSION TRAVAIL PAILLE","Entier",4,"Cheval","enplus","Allison Marron"));
        horseList.add(new Horse("KWPN","https://www.cheval-shop.com/boutique/16144/fourreau-de-muserolle-time-rider-sport.jpg","CHERIE","N°BOX",32,"PENSION NORMALE COPEAUX","Jument",4,"Cheval","enplus","Valérie Ancrenaz"));
        horseList.add(new Horse("SF","https://www.cheval-shop.com/boutique/16144/fourreau-de-muserolle-time-rider-sport.jpg","BUDDY","N°BOX",34,"PENSION NORMALE PAILLE","Hongre",4,"Cheval","enplus","INCONNU"));
        horseList.add(new Horse("SF","https://www.cheval-shop.com/boutique/16144/fourreau-de-muserolle-time-rider-sport.jpg","VIREE","N°BOX",36,"PENSION TRAVAIL PAILLE","Jument",4,"Poney","enplus"," Jessica Boex"));
        horseList.add(new Horse("SF","https://www.cheval-shop.com/boutique/16144/fourreau-de-muserolle-time-rider-sport.jpg","Magic","N°BOX",38,"PENSION TRAVAIL COPEAUX","Jument",4,"Poney","enplus","Aline Veyrat"));
        horseList.add(new Horse("SF","https://www.cheval-shop.com/boutique/16144/fourreau-de-muserolle-time-rider-sport.jpg","BARON","N°BOX",40,"PENSION TRAVAIL PAILLE","Hongre",4,"Cheval","enplus","Thérèse Perrin"));
        horseList.add(new Horse("SF","https://www.cheval-shop.com/boutique/16144/fourreau-de-muserolle-time-rider-sport.jpg","MARA","N°BOX",42,"PENSION TRAVAIL PAILLE","Jument",4,"Poney","enplus","Sophie Flandin"));
        horseList.add(new Horse("SF","https://www.cheval-shop.com/boutique/16144/fourreau-de-muserolle-time-rider-sport.jpg","BOLLY","N°BOX",44,"PENSION TRAVAIL PAILLE","Hongre",4,"Poney","enplus","Sophie Flandin"));
        horseList.add(new Horse("SF","https://www.cheval-shop.com/boutique/16144/fourreau-de-muserolle-time-rider-sport.jpg","BORSALINO","N°BOX",46,"PENSION TRAVAIL COPEAUX","Hongre",4,"Cheval","enplus","Laurence Van"));
        horseList.add(new Horse("SF","https://www.cheval-shop.com/boutique/16144/fourreau-de-muserolle-time-rider-sport.jpg","CALYPSO","N°BOX",48,"PENSION TRAVAIL COPEAUX","Hongre",4,"Cheval","enplus","Lea Monnet"));
        horseList.add(new Horse("SF","https://www.cheval-shop.com/boutique/16144/fourreau-de-muserolle-time-rider-sport.jpg","FAROUK","N°BOX",50,"PENSION TRAVAIL PAILLE","Hongre",4,"Cheval","enplus","Elsie Mouthon"));
        horseList.add(new Horse("SF","https://www.cheval-shop.com/boutique/16144/fourreau-de-muserolle-time-rider-sport.jpg","CRYSTALE","N°BOX",52,"PENSION NORMALE COPEAUX","Jument",4,"Cheval","enplus","Estelle"));
        horseList.add(new Horse("SF","https://www.cheval-shop.com/boutique/16144/fourreau-de-muserolle-time-rider-sport.jpg","ALINEA","N°BOX",54,"PENSION NORMALE COPEAUX","Jument",4,"Cheval","enplus","Sofia"));
        horseList.add(new Horse("SF","https://www.cheval-shop.com/boutique/16144/fourreau-de-muserolle-time-rider-sport.jpg","ALIANOR","N°BOX",56,"PENSION NORMALE PAILLE","Jument",4,"Cheval","enplus","Marjorie"));

        RecyclerViewHolderListener listener = new RecyclerViewHolderListener() {
            @Override
            public void onItemClicked(RecyclerView.ViewHolder viewHolder, Object item, int pos) {
                Horse h = (Horse) item;
                Intent i = new Intent(getContext(), HorseDetailsProprioActivity.class);
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
                i.putExtra("pension", h.getPension());
                startActivity(i);
                i.putExtra("tel", h.getTel());
                startActivity(i);






            }
        };
        //ASSOCIATE ADAPTER WITH RECYCLER//
        RecyclerViewAdapter recyclerViewAdapter = new RecyclerViewAdapter(horseList, listener);
        recyclerView.setAdapter(recyclerViewAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));

    }



    }


