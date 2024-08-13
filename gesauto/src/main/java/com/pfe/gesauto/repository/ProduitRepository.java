package com.pfe.gesauto.repository;

import com.pfe.gesauto.model.Produit;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProduitRepository extends JpaRepository<Produit, Long> {
}
