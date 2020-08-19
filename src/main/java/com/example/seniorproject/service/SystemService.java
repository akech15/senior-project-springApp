package com.example.seniorproject.service;

import com.example.seniorproject.service.model.SystemInfEntity;

public interface SystemService {

    void update(SystemInfEntity newSystem, String greenHouseId);

    SystemInfEntity getSystemInf(String greenHouseId);

}
