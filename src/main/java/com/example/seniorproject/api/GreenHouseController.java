package com.example.seniorproject.api;


import com.example.seniorproject.api.helper.GreenHouseConverter;
import com.example.seniorproject.api.helper.GreenHouseLimitsConverter;
import com.example.seniorproject.api.helper.SystemConverter;
import com.example.seniorproject.api.helper.UserConverter;
import com.example.seniorproject.api.model.GreenHouse;
import com.example.seniorproject.api.model.GreenHouseLimits;
import com.example.seniorproject.api.model.SystemInf;
import com.example.seniorproject.api.model.User;
import com.example.seniorproject.service.GreenHouseLimitsService;
import com.example.seniorproject.service.GreenHouseService;
import com.example.seniorproject.service.SystemService;
import com.example.seniorproject.service.UserService;
import com.example.seniorproject.service.model.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class GreenHouseController {

    @Autowired
    private GreenHouseService greenHouseService;

    @Autowired
    private GreenHouseLimitsService greenHouseLimitsService;

    @Autowired
    private SystemService systemService;

    @Autowired
    private UserService userService;


    @GetMapping("get-green-house/{greenHouseId}")
    public GreenHouse getGreenHouseInformation(@PathVariable String greenHouseId) {
        GreenHouseEntity greenHouseEntity = greenHouseService.getGreenHouse(greenHouseId);
        if (greenHouseEntity == null) {
            return null;
        }
        return GreenHouseConverter.toDTO(greenHouseEntity);
    }

    @PutMapping("limits/{greenHouseId}")
    public void update(@RequestBody GreenHouseLimits greenHouseLimits, @PathVariable String greenHouseId) {
        GreenHouseLimitsEntity greenHouseLimitsEntity = GreenHouseLimitsConverter.fromDTO(greenHouseLimits);
        greenHouseLimitsService.update(greenHouseLimitsEntity, greenHouseId);
    }

    @PutMapping("systemInf/{greenHouseId}")
    public void update(@RequestBody SystemInf systemInf, @PathVariable String greenHouseId) {
        SystemInfEntity systemInfEntity = SystemConverter.fromDTO(systemInf);
        systemService.update(systemInfEntity, greenHouseId);
    }

    @PutMapping("userInf/{greenHouseId}")
    public ResponseEntity addUser(@RequestBody User user, @PathVariable String greenHouseId) {
        UserEntity userEntity = UserConverter.fromDTO(user);
        ResponseEntity result = userService.addUser(userEntity, greenHouseId);
        result.setUser(UserConverter.toDTO(userEntity));
        return result;
    }

    @GetMapping("get-user/{userName}/{password}")
    public User getUser(@PathVariable String userName, @PathVariable String password) {
        UserEntity userEntity = userService.getUserByUserName(userName, password);
        if (userEntity == null) {
            return null;
        }
        return UserConverter.toDTO(userEntity);
    }

}
