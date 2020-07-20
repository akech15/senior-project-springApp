package com.example.seniorproject.api.model;

import lombok.*;

import java.math.BigDecimal;


@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class GreenHouse {

    private long id;
    private BigDecimal temperature;
    private BigDecimal humidity;
    private BigDecimal moisture;
    private BigDecimal light;

}
