package com.example.seniorproject.service.model;

import lombok.*;

import javax.persistence.*;
import java.math.BigDecimal;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class GreenHouseLimitsEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @Column(unique = true)
    private String greenHouseId;
    private BigDecimal downTemperatureLimit;
    private BigDecimal upTemperatureLimit;
    private BigDecimal downMoistureLimit;
    private BigDecimal upMoistureLimit;
    private BigDecimal downLightLimit;
    private BigDecimal upLightLimit;

}
