package com.example.seniorproject.service.model;

import lombok.*;
import org.springframework.context.annotation.Primary;

import javax.persistence.*;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Builder

public class UserEntity {
    @Id
    private long id;
    @Column(unique = true)
    private String userName;
    private String password;
}
