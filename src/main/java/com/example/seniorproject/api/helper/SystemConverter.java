package com.example.seniorproject.api.helper;

import com.example.seniorproject.api.model.SystemInf;
import com.example.seniorproject.service.model.SystemInfEntity;

public class SystemConverter {
    public static SystemInf toDTO(SystemInfEntity systemInfEntity) {
        return SystemInf.builder().
                id(systemInfEntity.getId()).
                lightOn(systemInfEntity.getLightOn()).
                conditioningOn(systemInfEntity.getConditioningOn()).
                irrigationSystemOn(systemInfEntity.getIrrigationSystemOn()).
                greenHouseId(systemInfEntity.getGreenHouseId()).
                build();
    }
}
