package com.example.seniorproject.api;


import com.example.seniorproject.api.helper.GreenHouseConverter;
import com.example.seniorproject.api.helper.GreenHouseLimitsConverter;
import com.example.seniorproject.api.model.GreenHouse;
import com.example.seniorproject.api.model.GreenHouseLimits;
import com.example.seniorproject.service.GreenHouseLimitsService;
import com.example.seniorproject.service.GreenHouseService;
import com.example.seniorproject.service.model.GreenHouseEntity;
import com.example.seniorproject.service.model.GreenHouseLimitsEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class GreenHouseController {

    @Autowired
    private GreenHouseService greenHouseService;
    @Autowired
    private GreenHouseLimitsService greenHouseLimitsService;

    @GetMapping("get-green-house/{greenHouseId}")
    public GreenHouse getGreenHouseInformation(@PathVariable long greenHouseId) {
        GreenHouseEntity greenHouseEntity = greenHouseService.getGreenHouse(greenHouseId);
        return GreenHouseConverter.toDTO(greenHouseEntity);
    }

    @PostMapping("add-green-house-limits")
    public void addGreenHouseLimits(@RequestBody GreenHouseLimits greenHouseLimits) {
        GreenHouseLimitsEntity greenHouseLimitsEntity = GreenHouseLimitsConverter.fromDTO(greenHouseLimits);
        greenHouseLimitsService.update(greenHouseLimitsEntity);
    }

    @GetMapping("get-limits/{greenHouseLimitsId}")
    public GreenHouseLimits getGreenHouseLimits(@PathVariable long greenHouseLimitsId) {
        return null;
    }

}
