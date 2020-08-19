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
public class GreenHouseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @Column(unique = true)
    private String greenHouseId;
    private BigDecimal temperature;
    private BigDecimal humidity;
    private BigDecimal moisture;
    private BigDecimal light;

}
