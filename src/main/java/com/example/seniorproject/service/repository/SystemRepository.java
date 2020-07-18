package com.example.seniorproject.service.repository;

import com.example.seniorproject.service.model.SystemInfEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SystemRepository extends JpaRepository<SystemInfEntity, Long> {
}
