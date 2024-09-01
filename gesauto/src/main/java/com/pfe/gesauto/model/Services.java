package com.pfe.gesauto.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "SERVICES")
public class Services {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idServvice;
    private String descriptionService;
    private String Service;
    private String CoutService;
    @ManyToOne
    @JoinColumn(name = "idvehicule",nullable = false)
    private Vehicule vehicule;
}
