package com.example.seniorproject.api.model;

import lombok.*;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder

public class User {

    private String greenHouseId;
    private String userName;
    private String password;

}
