package com.example.seniorproject.api.helper;

import com.example.seniorproject.api.model.SystemInf;
import com.example.seniorproject.service.model.SystemInfEntity;

public class SystemConverter {
    public static SystemInf toDTO(SystemInfEntity from) {
        return SystemInf.builder().
                id(from.getId()).
                lightOn(from.getLightOn()).
                conditioningOn(from.getConditioningOn()).
                irrigationSystemOn(from.getIrrigationSystemOn()).
                build();
    }

    public static SystemInfEntity fromDTO(SystemInf from) {
        return SystemInfEntity.builder().
                id(from.getId()).
                lightOn(from.getLightOn()).
                conditioningOn(from.getConditioningOn()).
                irrigationSystemOn(from.getIrrigationSystemOn()).
                build();
    }
}
