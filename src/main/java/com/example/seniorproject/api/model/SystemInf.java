package com.example.seniorproject.api.model;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class SystemInf {

    private long id;
    private int lightOn;
    private int conditioningOn;
    private int irrigationSystemOn;


}
