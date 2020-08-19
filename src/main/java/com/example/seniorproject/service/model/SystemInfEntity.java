package com.example.seniorproject.service.model;

import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class SystemInfEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @Column(unique = true)
    private String greenHouseId;
    private int lightOn;
    private int conditioningOn;
    private int irrigationSystemOn;
}
