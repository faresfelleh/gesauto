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
@Table(name = "CLIENT")

public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idClient;
    private String nomClient;
    private String matriculefiscaleClient;
    private String telephoneClient;
    private String addresseClient;

    @OneToMany(mappedBy = "client")
    private Set<Mission> missions;
}
