package com.example.seniorproject.service.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class SystemInfEntity {

    @Id
    private long id;
    private int lightOn;
    private int conditioningOn;
    private int irrigationSystemOn;
}
