package com.pfe.gesauto.model;


import lombok.Data;

@Data
public class Vehicule {
    private int id;
    private String plate;
    private String model;
    private String color;
    private String type;
    private int year;
    private int month;
    private int day;


    public Vehicule() {

    }

}
