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
@Table(name = "MISSION")
public class Mission {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private int idMisssion;
        private String adresseDepartMission;
        private String adresseArriveMission;
        private Date dateDepartMission;
        private Date dateArriveMission;
        private String missionStatus;
        @ManyToOne
        @JoinColumn(name="idClient",nullable = false)
        private Client client;

}
