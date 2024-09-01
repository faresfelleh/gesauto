package com.pfe.gesauto.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "SINISTRE")
public class Sinistre {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idSinistre;
    private String typeSinistre;
    private String descriptionSinistre;
    private Date dateSinistre;
    private String lieuSinistre;

    @ManyToOne
    @JoinColumn(name = "idvehicule",nullable = false)
    private Vehicule vehicule;
}
