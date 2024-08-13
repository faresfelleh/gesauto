package com.pfe.gesauto.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Mission {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private int idMisssion;
        private String adresseDepartMission;
        private String adresseArriveMission;
        private Date dateDepartMission;
        private Date dateArriveMission;
        private String missionStatus;

}
