package com.pfe.gesauto.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor

public class Assurance {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idAssurance;
    private String numAssurance;
    private String nomAgenceAssurance;
    private String dateDebutAssurance;
    private String dateFinAssurance;


}
