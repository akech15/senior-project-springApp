package com.example.seniorproject.integration.esp32;

import com.example.seniorproject.api.helper.GreenHouseConverter;
import com.example.seniorproject.api.model.GreenHouse;
import com.example.seniorproject.service.GreenHouseService;
import com.example.seniorproject.service.model.GreenHouseEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "esp32", produces = MediaType.APPLICATION_JSON_VALUE)
public class Esp32IntegrationController {

    @Autowired
    private GreenHouseService greenHouseService;

    @PutMapping
    public void updateGreenHouse(@RequestBody GreenHouse greenHouse) {
        GreenHouseEntity greenHouseEntity = GreenHouseConverter.fromDTO(greenHouse);
        greenHouseService.update(greenHouseEntity);
    }

}
