package com.example.seniorproject.service.repository;

import com.example.seniorproject.api.model.GreenHouseLimits;
import com.example.seniorproject.service.model.GreenHouseLimitsEntity;
import org.springframework.data.repository.CrudRepository;

public interface GreenHouseLimitsRepository extends CrudRepository<GreenHouseLimitsEntity, Long> {
    GreenHouseLimitsEntity findByGreenHouseId (String greenHouseId);
}
