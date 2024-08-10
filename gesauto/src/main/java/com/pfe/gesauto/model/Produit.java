package com.pfe.gesauto.model;

import lombok.Data;

@Data
public class Produit {
    private int id;
    private String nom;
    private String description;
    private String image;
    private String categorie;
    private int stock;
    private int quantite;
    private int prix;


}
