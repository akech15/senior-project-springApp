package com.example.seniorproject.integration.esp32;

import com.example.seniorproject.api.helper.GreenHouseConverter;
import com.example.seniorproject.api.helper.GreenHouseLimitsConverter;
import com.example.seniorproject.api.helper.SystemConverter;
import com.example.seniorproject.api.model.GreenHouse;
import com.example.seniorproject.api.model.GreenHouseLimits;
import com.example.seniorproject.api.model.SystemInf;
import com.example.seniorproject.service.GreenHouseLimitsService;
import com.example.seniorproject.service.GreenHouseService;
import com.example.seniorproject.service.SystemService;
import com.example.seniorproject.service.model.GreenHouseEntity;
import com.example.seniorproject.service.model.GreenHouseLimitsEntity;
import com.example.seniorproject.service.model.SystemInfEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "esp32", produces = MediaType.APPLICATION_JSON_VALUE)
public class Esp32IntegrationController {

    @Autowired
    private GreenHouseService greenHouseService;

    @Autowired
    private GreenHouseLimitsService greenHouseLimitsService;

    @Autowired
    private SystemService systemService;

    @PutMapping
    public void updateGreenHouse(@RequestBody GreenHouse greenHouse) {
        GreenHouseEntity greenHouseEntity = GreenHouseConverter.fromDTO(greenHouse);
        greenHouseService.update(greenHouseEntity);
    }


    @GetMapping("get-limits/{greenHouseLimitsId}")
    public GreenHouseLimits getGreenHouseLimits(@PathVariable long greenHouseLimitsId) {
        GreenHouseLimitsEntity greenHouseLimitsEntity = greenHouseLimitsService.getGreenHouseLimitsByGreenHouseId(greenHouseLimitsId);

        if (greenHouseLimitsEntity == null) {
            return null;
        }

        return GreenHouseLimitsConverter.toDTO(greenHouseLimitsEntity);
    }

    @GetMapping("get-systemInf/{greenHouseId}")
    public SystemInf getSystemInf(@PathVariable long greenHouseId) {
        SystemInfEntity systemInfEntity = systemService.getSystemInf(greenHouseId);
        if (systemInfEntity == null) {
            return null;
        }
        return SystemConverter.toDTO(systemInfEntity);
    }

}
