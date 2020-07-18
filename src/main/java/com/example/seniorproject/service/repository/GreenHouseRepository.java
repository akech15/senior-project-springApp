package com.example.seniorproject.service.repository;

import com.example.seniorproject.service.model.GreenHouseEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GreenHouseRepository extends JpaRepository<GreenHouseEntity, Long> {
}
