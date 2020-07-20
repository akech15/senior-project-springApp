package com.example.seniorproject.service;

import com.example.seniorproject.service.model.GreenHouseLimitsEntity;

public interface GreenHouseLimitsService {
    void update(GreenHouseLimitsEntity newGreenHouseLimitsEntity);

    GreenHouseLimitsEntity getGreenHouseLimitsByGreenHouseId(long greenHouseId);
}
