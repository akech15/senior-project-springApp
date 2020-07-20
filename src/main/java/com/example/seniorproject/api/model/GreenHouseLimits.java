package com.example.seniorproject.api.model;

import lombok.*;

import java.math.BigDecimal;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class GreenHouseLimits {

    private long greenHouseId;
    private BigDecimal downTemperatureLimit;
    private BigDecimal upTemperatureLimit;
    private BigDecimal downMoistureLimit;
    private BigDecimal upMoistureLimit;
    private BigDecimal downLightLimit;
    private BigDecimal upLightLimit;

}
