package com.poc.practice.spring.security.jwt.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "USER_TBL")
public class User {

    @Id
    private int id;
    private String userName;
    private String password;
    private String email;
}
