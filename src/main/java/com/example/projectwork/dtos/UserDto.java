package com.example.projectwork.dtos;


import com.example.projectwork.models.Card;
import com.example.projectwork.models.Role;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.List;


@Data
public class UserDto  {
    private Integer id;
    @NotEmpty
    private String name;
    @NotEmpty
    private String surname;
    @NotEmpty
    private String email;
    @NotEmpty
    private String password;
    private Role role;
    private List<Card> cards;

}
