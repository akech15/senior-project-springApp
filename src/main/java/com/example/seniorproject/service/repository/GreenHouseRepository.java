package com.example.seniorproject.service.repository;

import com.example.seniorproject.service.model.GreenHouseEntity;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface GreenHouseRepository extends CrudRepository<GreenHouseEntity, Long> {

    GreenHouseEntity findByGreenHouseId(String greenHouseId);
}
