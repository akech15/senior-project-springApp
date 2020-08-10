package com.example.seniorproject.service;

import com.example.seniorproject.api.model.GreenHouseLimits;
import com.example.seniorproject.service.model.GreenHouseLimitsEntity;
import com.example.seniorproject.service.repository.GreenHouseLimitsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class GreenHouseLimitsServiceImpl implements GreenHouseLimitsService {

    @Autowired
    private GreenHouseLimitsRepository greenHouseLimitsRepository;

    @Override
    public void update(GreenHouseLimitsEntity newGreenHouseLimitsEntity) {
        greenHouseLimitsRepository.save(newGreenHouseLimitsEntity);
    }

    @Override
    public GreenHouseLimitsEntity getGreenHouseLimitsByGreenHouseId(long greenHouseId) {
        Optional<GreenHouseLimitsEntity> greenHouseLimitsEntity = greenHouseLimitsRepository.findById(greenHouseId);
        return greenHouseLimitsEntity.orElse(null);
    }
}