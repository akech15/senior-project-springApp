package com.example.seniorproject.service;

import com.example.seniorproject.service.model.GreenHouseEntity;
import com.example.seniorproject.service.repository.GreenHouseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


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
        return greenHouseRepository.findById(id).get();
    }


}
