package com.example.seniorproject.api.model;

import lombok.*;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder

public class User {

    private long id;
    private String userName;
    private String password;

}
