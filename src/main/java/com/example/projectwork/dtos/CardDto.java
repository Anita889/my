package com.example.projectwork.dtos;


import com.example.projectwork.models.Users;
import jakarta.persistence.OneToOne;
import jakarta.validation.constraints.NotEmpty;
import lombok.*;

import java.sql.Timestamp;


@Data
public class CardDto {
    private Integer id;
    @NotEmpty
    private String name;
    @NotEmpty
    private String surname;
    @NotEmpty
    private String email;
    @NotEmpty
    private String password;
    private Long pincode;
    private Long account;
    private Timestamp start;
    private Timestamp finish;
    private Users user;
}
