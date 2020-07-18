package com.example.seniorproject.service.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.math.BigDecimal;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class GreenHouseLimitsEntity {
    @Id
    @GeneratedValue
    private long id;
    private BigDecimal downTemperatureLimit;
    private BigDecimal upTemperatureLimit;
    private BigDecimal downMoistureLimit;
    private BigDecimal upMoistureLimit;
    private BigDecimal downLightLimit;
    private BigDecimal upLightLimit;
    private long greenHouseId;

}
