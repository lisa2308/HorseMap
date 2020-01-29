package com.example.horsemap.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.example.horsemap.RecyclerViewHolderListener;
import com.example.horsemap.data.Horse;
import com.example.horsemap.R;
import com.squareup.picasso.Picasso;

import java.util.List;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.RecyclerHolder> {

    List<Horse> horseList;
    RecyclerViewHolderListener listener;

    public RecyclerViewAdapter(List<Horse> horseList, RecyclerViewHolderListener listener){
        this.horseList = horseList;
        this.listener = listener;

    }

    public static class RecyclerHolder extends RecyclerView.ViewHolder{
        TextView name;
        ImageView photo;
        TextView number;
        TextView place;


        public RecyclerHolder(View view){
            super(view);
            name = view.findViewById(R.id.activity_horse_item_name);
            number = view.findViewById(R.id.activity_horse_item_number);
            place = view.findViewById(R.id.activity_horse_item_place);
            photo = view.findViewById(R.id.activity_horse_item_photo);


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
        holder.place.setText("N°BOX");
        holder.number.setText(String.valueOf(horse.getNumber()));
        Picasso.get().load(horse.getPhoto()).into(holder.photo);

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                listener.onItemClicked(holder,horse,position);
            }
        });



    }
    @Override
    public int getItemCount(){
        return horseList.size();
    }
}

