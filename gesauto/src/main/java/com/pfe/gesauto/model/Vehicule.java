package com.pfe.gesauto.model;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Vehicule {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String matriculeVehicule;
    private String modeleVehicule;
    private String marqueVehicule;
    private String typeVehicule;
    private double kilometreinitVehicule;
    private double puissanceVehicule;
    private double carbuantVehicule;
    private String finaceVehicule;
    private String numcartegrise;
    private double kilometrerouler;


}
