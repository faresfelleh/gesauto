package com.pfe.gesauto.service;

import com.pfe.gesauto.model.Assurance;
import com.pfe.gesauto.repository.AssuranceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AssuranceService {

    @Autowired
    private AssuranceRepository assuranceRepository;

    public Assurance addAssurane(Assurance assurance)
    {
        return assuranceRepository.save(assurance);
    }
    public List<Assurance> getAllAssurance()
    {
        return assuranceRepository.findAll();
    }
    public Optional<Assurance> findAssuranceById(int id){ return assuranceRepository.findById(id);}
    public void deleteAssuranceById(int idAssurance)
    {
         assuranceRepository.deleteById(idAssurance);
    }
}
