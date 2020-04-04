package com.example.horsemap.data;


public class Horse {

    private String photo;
    private String name;
    private String sexe;
    private int age;
    private String size;
    private int colorMat;
    private String enrenement;
    private String enplus;
    private int number;
    private String place;
    private String race;
    private String pension;
    private String tel;


    public Horse(String race, String photo, String name, String place, int number, String sexe, int age, String size, int colorMat, String enrenement, String enplus) {
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
        this.enplus = enplus;
    }

    public Horse(String race, String photo, String name, String place, int number, String pension, String sexe, int age, String size, String enplus, String tel) {
        this.race = race;
        this.name = name;
        this.place = place;
        this.number = number;
        this.pension = pension;
        this.photo = photo;
        this.sexe = sexe;
        this.age = age;
        this.size = size;
        this.enplus = enplus;
        this.tel = tel;
    }


    public String getPension() {
        return pension;
    }

    public void setPension(String pension) {
        this.pension = pension;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
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

    public String getEnplus() {
        return enplus;
    }

    public void setEnplus(String enplus) {
        this.enplus = enplus;
    }
}

