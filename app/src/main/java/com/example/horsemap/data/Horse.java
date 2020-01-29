package com.example.horsemap.data;

import android.widget.TextView;

public class Horse {

    private String name;
    private int birth;
    private String sexe;
    private int color;
    private int number;
    private String place;
    private String photo;

    public Horse(String photo, String name, String place, int number) {
        this.name = name;
        this.place = place;
        this.number = number;
        this.photo = photo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBirth() {
        return birth;
    }

    public void setBirth(int birth) {
        this.birth = birth;
    }

    public String getSexe() {
        return sexe;
    }

    public void setSexe(String sexe) {
        this.sexe = sexe;
    }

    public int getColor() {
        return color;
    }

    public void setColor(int color) {
        this.color = color;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getPlace() {
        return place;
    }
    public void setPlace(String place){
        this.place = place;
    }

    public String getPhoto() {
        return photo;
    }

   public void setPhoto(String photo) {
      this.photo = photo;
    }
}
