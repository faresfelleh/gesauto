package com.pfe.gesauto.service;

import com.pfe.gesauto.repository.SinistreRepositroy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SinistreService {

    @Autowired
    private SinistreRepositroy SinistreRepositroy;
}
