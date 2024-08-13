package com.pfe.gesauto.service;
import com.pfe.gesauto.model.Produit;
import com.pfe.gesauto.repository.ProduitRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProduitService {

    @Autowired
    private ProduitRepository produitRepository;

    public Produit addProduit(Produit produit) {
        return produitRepository.save(produit);
    }
    public List<Produit> getAllProduits() {
        return produitRepository.findAll();
    }
    public Optional<Produit> getProduitById(long id) { return produitRepository.findById(id);}
    public void deleteProduitById(long  id) {produitRepository.deleteById(id);
  }
}
