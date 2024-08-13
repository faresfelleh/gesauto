package com.pfe.gesauto.controller;

import com.pfe.gesauto.model.Mission;
import com.pfe.gesauto.service.MissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;


@RestController
@RequestMapping("Api/Mission")
public class MissionController {

    @Autowired
    private MissionService missionService;

    @PostMapping
    public Mission saveMission(@RequestBody Mission mission) {
        return missionService.addMission(mission);
    }
    @GetMapping
    public List<Mission> ListAllMissions() {
        return  missionService.getAllMissions();
    }
    @GetMapping("/{id}")
    public Optional<Mission> MissionById(@PathVariable int id) { return missionService.getMissionById(id); }
    @DeleteMapping("/{id}")
    public String deleteMission(@PathVariable("id") int id) {
        missionService.deleteMissionById(id);
        return "Mission deleted";
    }
}
