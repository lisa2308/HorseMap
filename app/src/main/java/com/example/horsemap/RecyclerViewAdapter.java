package com.example.horsemap;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.RecyclerHolder> {

    List<Horse> horseList;

    public RecyclerViewAdapter(List<Horse> horseList){
        this.horseList = horseList;
    }

    public static class RecyclerHolder extends RecyclerView.ViewHolder{
        TextView name;
        TextView birth;
        TextView sexe;
        TextView color;
        //ImageView photo;
        TextView place;

        public RecyclerHolder(View view){
            super(view);
            name = view.findViewById(R.id.activity_main_name);
            birth = view.findViewById(R.id.activity_main_birth);
            sexe = view.findViewById(R.id.activity_main_sexe);
            color = view.findViewById(R.id.activity_main_color);
            //photo = view.findViewById(R.id.activity_main_photo);
            place = view.findViewById(R.id.activity_main_place);

        }
    }

    @Override
    public RecyclerHolder onCreateViewHolder(final ViewGroup parent, int viewType){
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.activity_horse_item,parent,false);
        return new RecyclerHolder(itemView);
    }

    @Override
    public void onBindViewHolder(final RecyclerHolder holder, final int position) {

        //position liée à la ligne donc change toute seule//
        final Horse horse = horseList.get(position);

        holder.name.setText(horse.getName());
        holder.birth.setText(horse.getBirth());
        holder.sexe.setText(horse.getSexe());
        holder.color.setText(horse.getColor());
        holder.place.setText(horse.getPlace());
        //holder.photo.setImageResource(horse.getPhoto());

    }
    @Override
    public int getItemCount(){
        return horseList.size();
    }
}

