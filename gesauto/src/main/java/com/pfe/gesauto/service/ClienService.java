package com.pfe.gesauto.service;

import com.pfe.gesauto.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClienService {

    @Autowired
    private ClientRepository ClientRepository;
}
