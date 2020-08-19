package com.example.seniorproject.service;

import com.example.seniorproject.service.model.SystemInfEntity;
import com.example.seniorproject.service.repository.SystemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class SystemServiceImpl implements SystemService {

    @Autowired
    private SystemRepository systemRepository;

    @Override
    public void update(SystemInfEntity newSystem, String greenHouseId) {
        newSystem.setGreenHouseId(greenHouseId);
        SystemInfEntity systemInfEntity = this.getSystemInf(newSystem.getGreenHouseId());
        if (systemInfEntity != null) {
            newSystem.setId(systemInfEntity.getId());
        }
        systemRepository.save(newSystem);
    }

    @Override
    public SystemInfEntity getSystemInf(String greenHouseId) {
        Optional<SystemInfEntity> systemInfEntity = Optional.ofNullable(systemRepository.findByGreenHouseId(greenHouseId));
        return systemInfEntity.orElse(null);
    }
}
