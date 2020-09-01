package com.example.seniorproject;


import com.example.seniorproject.service.model.GreenHouseEntity;
import com.example.seniorproject.service.repository.GreenHouseRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.math.BigDecimal;

@Configuration
public class InitialDataGenerator {

	@Bean
	CommandLineRunner initDatabase(GreenHouseRepository greenHouseRepository) {
		return args -> {
			GreenHouseEntity greenHouse = GreenHouseEntity.builder()
					.humidity(BigDecimal.ONE)
					.light(BigDecimal.TEN)
					.moisture(BigDecimal.TEN)
					.temperature(BigDecimal.ONE)
					.greenHouseId("test")
					.build();
			greenHouseRepository.save(greenHouse);
		};
	}

}
