package com.pfe.gesauto.model;

import lombok.Data;

@Data
public class Assurance {
    private int id;
    private String assurance;
    private String assuranceType;
    private String assuranceDate;
    private String assuranceStatus;
    private String assuranceDescription;
    private String assuranceLocation;


    public Assurance() {
    }
}
