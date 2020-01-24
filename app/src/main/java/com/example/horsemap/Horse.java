package com.example.horsemap;

public class Horse {

    private String name;
    private int birth;
    private String sexe;
    private int color;
    private int place;
    private String photo;

    public Horse(String name, int birth, String sexe, int color, int place, String photo) {
        this.name = name;
        this.birth = birth;
        this.sexe = sexe;
        this.color = color;
        this.place = place;
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

    public int getPlace() {
        return place;
    }

    public void setPlace(int place) {
        this.place = place;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }
}
