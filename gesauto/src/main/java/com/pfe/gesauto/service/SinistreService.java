package com.pfe.gesauto.service;

import com.pfe.gesauto.model.Sinistre;
import com.pfe.gesauto.repository.SinistreRepositroy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SinistreService {

    @Autowired
    private SinistreRepositroy SinistreRepositroy;

    public Sinistre addSinistre(Sinistre sinistre) {
        return  SinistreRepositroy.save(sinistre);
    }
    public List<Sinistre> findAllSinistre() {
        return SinistreRepositroy.findAll();
    }
    public Optional<Sinistre> findSinistreById(int id) {
        return SinistreRepositroy.findById(id);
    }
    public void deleteSinistreById(int id) {
        SinistreRepositroy.deleteById(id);
    }
}
