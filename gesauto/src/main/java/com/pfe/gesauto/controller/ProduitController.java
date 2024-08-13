package com.pfe.gesauto.controller;

import com.pfe.gesauto.model.Produit;
import com.pfe.gesauto.service.ProduitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("Api/Produit")
public class ProduitController {
    @Autowired
    private ProduitService produitService;

    @PostMapping
    public Produit saveProduit(@RequestBody Produit produit) { return  produitService.addProduit(produit);}
    @GetMapping
    public List<Produit> ListProduits() { return produitService.getAllProduits(); }
    @GetMapping("/{id}")
    public Optional<Produit> produitById(@PathVariable int id) { return produitService.getProduitById(id); }
    @DeleteMapping("{id}")
    public String deleteProduit(@PathVariable int id) { produitService.deleteProduitById(id);
    return "Produit deleted";}
}
