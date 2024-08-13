package com.pfe.gesauto.service;

import com.pfe.gesauto.repository.AssuranceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AssuranceService {

    @Autowired
    private AssuranceRepository assuranceRepository;
}
