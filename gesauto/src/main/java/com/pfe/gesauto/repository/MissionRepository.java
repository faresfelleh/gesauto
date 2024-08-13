package com.pfe.gesauto.repository;

import com.pfe.gesauto.model.Mission;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MissionRepository extends JpaRepository<Mission, Integer> {
}
