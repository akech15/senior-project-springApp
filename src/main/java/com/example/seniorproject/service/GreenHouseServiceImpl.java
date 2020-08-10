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
    public void update(GreenHouseEntity newGreenHouseEntity) {
        greenHouseRepository.save(newGreenHouseEntity);
    }

    @Override
    public GreenHouseEntity getGreenHouse(long id) {
        Optional<GreenHouseEntity> result = greenHouseRepository.findById(id);
        return result.orElse(null);
    }


}
