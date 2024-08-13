package com.pfe.gesauto.service;

import com.pfe.gesauto.model.Mission;
import com.pfe.gesauto.repository.MissionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MissionService {

    @Autowired
    private MissionRepository missionRepository;

    public Mission addMission(Mission mission) {
        return missionRepository.save(mission);
    }
    public List<Mission> getAllMissions() {
            return missionRepository.findAll();
    }
    public Optional<Mission> getMissionById(int id) { return missionRepository.findById(id); }
    public void deleteMissionById(int idMission) {
        missionRepository.deleteById(idMission);
    }
}
