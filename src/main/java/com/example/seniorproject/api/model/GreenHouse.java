package com.example.seniorproject.api.model;

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
public class GreenHouse {

    private long id;
    private BigDecimal temperature;
    private BigDecimal humidity;
    private BigDecimal moisture;
    private BigDecimal light;

}
