package com.example.seniorproject.service;

import com.example.seniorproject.service.model.GreenHouseEntity;
import com.example.seniorproject.service.repository.GreenHouseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;


@Service
public class GreenHouseServiceImpl implements GreenHouseService {

    @Autowired
    private GreenHouseRepository greenHouseRepository;

    @Override
    public void update(GreenHouseEntity newGreenHouseEntity, String greenHouseId) {
        newGreenHouseEntity.setGreenHouseId(greenHouseId);
        GreenHouseEntity greenHouseEntity = this.getGreenHouse(newGreenHouseEntity.getGreenHouseId());
        if (greenHouseEntity != null) {
            newGreenHouseEntity.setId(greenHouseEntity.getId());
        }
        greenHouseRepository.save(newGreenHouseEntity);
    }

    @Override
    public GreenHouseEntity getGreenHouse(String greenHouseId) {
        Optional<GreenHouseEntity> result = Optional.ofNullable(greenHouseRepository.findByGreenHouseId(greenHouseId));
        return result.orElse(null);
    }


}
