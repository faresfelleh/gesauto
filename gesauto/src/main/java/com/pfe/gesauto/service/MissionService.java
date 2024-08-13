package com.pfe.gesauto.service;


import com.pfe.gesauto.repository.MissionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MissionService {

    @Autowired
    private MissionRepository missionRepository;
}
