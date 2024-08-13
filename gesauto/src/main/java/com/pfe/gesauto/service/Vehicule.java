package com.pfe.gesauto.service;

import com.pfe.gesauto.repository.VehiculeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Vehicule {

    @Autowired
    private VehiculeRepository vehiculeRepository;
}
