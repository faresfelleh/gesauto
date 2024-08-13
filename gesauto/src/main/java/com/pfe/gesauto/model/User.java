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
public class User {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private int idUser;
        private String nom;
        private String prenom;
        private String email;
        private String adresse;
        private String telephone;
        private String password;
        private String permis ;
        private String dateNaissance;
        private String sexe;
        private String civilSatut;
        private String login;

}
