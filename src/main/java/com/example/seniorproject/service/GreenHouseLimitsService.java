package com.example.seniorproject.service;

import com.example.seniorproject.service.model.GreenHouseEntity;
import com.example.seniorproject.service.model.GreenHouseLimitsEntity;

public interface GreenHouseLimitsService {
    void update(GreenHouseLimitsEntity newGreenHouseLimitsEntity);

    GreenHouseLimitsEntity getGreenHouseLimits(long id);
}
