package com.example.seniorproject.service;

import com.example.seniorproject.service.model.GreenHouseEntity;

public interface GreenHouseService {

    void update(GreenHouseEntity newGreenHouseEntity, String greenHouseId);

    GreenHouseEntity getGreenHouse(String greenHouseId);

}
