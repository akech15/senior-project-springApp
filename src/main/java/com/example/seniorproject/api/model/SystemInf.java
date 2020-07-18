package com.example.seniorproject.api.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class SystemInf{
    private long id;
    private int lightOn;
    private int conditioningOn;
    private int irrigationSystemOn;
    private long greenHouseId;

}
