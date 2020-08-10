package com.example.seniorproject.service;

import com.example.seniorproject.service.model.SystemInfEntity;
import com.example.seniorproject.service.repository.SystemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SystemServiceImpl implements SystemService {

    @Autowired
    private SystemRepository systemRepository;

    @Override
    public void update(SystemInfEntity newSystem) {
        systemRepository.save(newSystem);
    }

    @Override
    public SystemInfEntity getSystemInf(long greenHouseId) {
        return systemRepository.findById(greenHouseId).orElse(null);
    }
}
