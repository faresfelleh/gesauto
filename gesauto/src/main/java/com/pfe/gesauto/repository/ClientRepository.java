package com.pfe.gesauto.repository;

import com.pfe.gesauto.model.Client;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ClientRepository extends JpaRepository<Client, Integer>{
}
