package com.pfe.gesauto.model;

import lombok.Data;

@Data
public class Mission {
        private int id;
        private String missionName;
        private String missionDescription;
        private String missionLocation;
        private String missionType;
        private String missionDate;
        private String missionTime;
        private String missionStatus;

}
