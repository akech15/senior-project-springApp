package com.example.seniorproject.service.repository;

import com.example.seniorproject.service.model.GreenHouseEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface GreenHouseRepository extends CrudRepository<GreenHouseEntity, Long> {
}
