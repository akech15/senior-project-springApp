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
    public void update(GreenHouseLimitsEntity newGreenHouseLimitsEntity, String id) {
        newGreenHouseLimitsEntity.setGreenHouseId(id);
        GreenHouseLimitsEntity greenHouseLimitsEntity = this.getGreenHouseLimitsByGreenHouseId(newGreenHouseLimitsEntity.getGreenHouseId());
        if (greenHouseLimitsEntity != null){
            newGreenHouseLimitsEntity.setId(greenHouseLimitsEntity.getId());
        }
        greenHouseLimitsRepository.save(newGreenHouseLimitsEntity);
    }

    @Override
    public GreenHouseLimitsEntity getGreenHouseLimitsByGreenHouseId(String greenHouseId) {
        Optional<GreenHouseLimitsEntity> greenHouseLimitsEntity = Optional.ofNullable(greenHouseLimitsRepository.findByGreenHouseId(greenHouseId));
        return greenHouseLimitsEntity.orElse(null);
    }
}
