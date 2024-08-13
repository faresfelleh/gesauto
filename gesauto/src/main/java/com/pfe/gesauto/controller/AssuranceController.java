package com.pfe.gesauto.controller;
import com.pfe.gesauto.model.Assurance;
import com.pfe.gesauto.service.AssuranceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("Api/Assurance")

public class AssuranceController {

    @Autowired
    private AssuranceService assuranceService;

    @PostMapping()
    public Assurance saveAssurance(@RequestBody Assurance assurance)
    {
        return assuranceService.addAssurane(assurance);
    }
    @GetMapping()
    public List<Assurance> ListAssurance()
    {
        return assuranceService.getAllAssurance();
    }
    @GetMapping("/{id}")
    public Optional<Assurance> getAssuranceById(@PathVariable int id){
        return assuranceService.findAssuranceById(id);
    }
    @DeleteMapping("/{id}")
    public String deleteAssuarance(@PathVariable("id") int idAssurance)
    {
        assuranceService.deleteAssuranceById(idAssurance);
        return "Assurance deleted";
    }
}
