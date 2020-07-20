package com.example.seniorproject.api.helper;

import com.example.seniorproject.api.model.GreenHouseLimits;
import com.example.seniorproject.service.model.GreenHouseLimitsEntity;

public class GreenHouseLimitsConverter {
    public static GreenHouseLimits toDTO(GreenHouseLimitsEntity from) {
        return GreenHouseLimits.builder().
                greenHouseId(from.getGreenHouseId()).
                downTemperatureLimit(from.getDownTemperatureLimit()).
                upTemperatureLimit(from.getUpTemperatureLimit()).
                downMoistureLimit(from.getDownMoistureLimit()).
                upMoistureLimit(from.getUpMoistureLimit()).
                downLightLimit(from.getDownLightLimit()).
                upLightLimit(from.getUpLightLimit()).
                build();
    }

    public static GreenHouseLimitsEntity fromDTO(GreenHouseLimits from) {
        return GreenHouseLimitsEntity.builder().
                greenHouseId(from.getGreenHouseId()).
                downTemperatureLimit(from.getDownTemperatureLimit()).
                upTemperatureLimit(from.getUpTemperatureLimit()).
                downMoistureLimit(from.getDownMoistureLimit()).
                upMoistureLimit(from.getUpMoistureLimit()).
                downLightLimit(from.getDownLightLimit()).
                upLightLimit(from.getUpLightLimit()).
                build();
    }
}
