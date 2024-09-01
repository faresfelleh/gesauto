package com.pfe.gesauto.model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Vehicule {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idvehicule;
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

    @OneToMany(mappedBy = "vehicule")
    private Set<Mission> missions;

    @OneToMany(mappedBy = "vehicule")
    private Set<Services> services;

    @OneToMany(mappedBy = "vehicule")
    private Set<Sinistre> sinistres;


}
