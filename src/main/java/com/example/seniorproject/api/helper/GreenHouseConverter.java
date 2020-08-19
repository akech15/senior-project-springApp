package com.example.seniorproject.api.helper;

import com.example.seniorproject.api.model.GreenHouse;
import com.example.seniorproject.service.model.GreenHouseEntity;

public final class GreenHouseConverter {

    public static GreenHouse toDTO(GreenHouseEntity from) {
        return GreenHouse.builder().
                greenHouseId(from.getGreenHouseId()).
                temperature(from.getTemperature()).
                humidity(from.getHumidity()).
                moisture(from.getMoisture()).
                light(from.getLight()).
                build();
    }

    public static GreenHouseEntity fromDTO(GreenHouse from) {
        return GreenHouseEntity.builder().
                greenHouseId(from.getGreenHouseId()).
                temperature(from.getTemperature()).
                humidity(from.getHumidity()).
                moisture(from.getMoisture()).
                light(from.getLight()).
                build();
    }

}
