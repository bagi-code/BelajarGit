package com.robby.belajargit.models;

public class Human {

    private String name;
    private String jenisKelamin;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getJenisKelamin() {
        return jenisKelamin;
    }

    public void setJenisKelamin(String jenisKelamin) {
        this.jenisKelamin = jenisKelamin;
    }

    public Human(String name, String jenisKelamin) {


        this.name = name;
        this.jenisKelamin = jenisKelamin;
    }
}
