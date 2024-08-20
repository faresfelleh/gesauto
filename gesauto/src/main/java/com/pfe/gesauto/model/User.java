package com.pfe.gesauto.model;

import jakarta.persistence.*;
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
        private String permis ;
        private String dateNaissance;
        private String sexe;
        private String civilSatut;
        private String username;
        private String password;
        @Enumerated(EnumType.STRING)
        private Role role;

}
