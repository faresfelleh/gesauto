package com.pfe.gesauto.service;

import com.pfe.gesauto.model.Vehicule;
import com.pfe.gesauto.repository.VehiculeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class VehiculeService {

    @Autowired
    private VehiculeRepository vehiculeRepository;

    public Vehicule addVehicule(Vehicule vehicule) {
        return vehiculeRepository.save(vehicule);
    }
    public List<Vehicule> getAllVehicules() {
        return vehiculeRepository.findAll();
    }
    public Optional<Vehicule> findVehiculeById(long id) {
        return vehiculeRepository.findById(id);
    }
    public void deleteVehiculeById(long id) {
        vehiculeRepository.deleteById(id);
    }

}
