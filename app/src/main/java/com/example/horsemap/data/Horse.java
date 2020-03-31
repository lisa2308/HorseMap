package com.example.horsemap.data;

import android.widget.TextView;

import com.example.horsemap.R;

public class Horse {

    private String photo;
    private String name;
    private String sexe;
    private int age;
    private String size;
    private int colorMat;
    private String enrenement;
    private String matComp;
    private int number;
    private String place;
    private String race;


    public Horse(String race, String photo, String name, String place, int number, String sexe, int age, String size, int colorMat, String enrenement, String matComp) {
        this.race = race;
        this.name = name;
        this.place = place;
        this.number = number;
        this.photo = photo;
        this.sexe = sexe;
        this.age = age;
        this.size = size;
        this.colorMat = colorMat;
        this.enrenement = enrenement;
        this.matComp = matComp;
    }

    public Horse(String race, String photo, String name, String place, int number, String sexe, int age, String size, String enrenement, String matComp) {
        this.race = race;
        this.name = name;
        this.place = place;
        this.number = number;
        this.photo = photo;
        this.sexe = sexe;
        this.age = age;
        this.size = size;
        this.enrenement = enrenement;
        this.matComp = matComp;
    }

    public Horse(String race, String photo, String name, String place, int number, String sexe, int age, String size) {
        this.race = race;
        this.name = name;
        this.place = place;
        this.number = number;
        this.photo = photo;
        this.sexe = sexe;
        this.age = age;
        this.size = size;
    }


    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public String getSexe() {
        return sexe;
    }

    public void setSexe(String sexe) {
        this.sexe = sexe;
    }

    public int getColorMat() {
        return colorMat;
    }

    public void setColorMat(int color) {
        this.colorMat = color;
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getEnrenement() {
        return enrenement;
    }

    public void setEnrenement(String enrenement) {
        this.enrenement = enrenement;
    }

    public String getMatComp() {
        return matComp;
    }

    public void setMatComp(String matComp) {
        this.matComp = matComp;
    }
}

