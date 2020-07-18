package com.example.seniorproject.service;

import com.example.seniorproject.service.model.GreenHouseEntity;

public interface GreenHouseService {

    void update(GreenHouseEntity newGreenHouseEntity);

    GreenHouseEntity getGreenHouse(long id);

}
