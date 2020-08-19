package com.example.seniorproject.api.model;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class SystemInf {

    private String greenHouseId;
    private int lightOn;
    private int conditioningOn;
    private int irrigationSystemOn;

}
