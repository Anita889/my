package com.example.projectwork.services;

import com.example.projectwork.dtos.UserDto;
import com.example.projectwork.models.Card;
import com.example.projectwork.models.Users;

import java.util.Optional;

public interface UserService {
    Users userSave(UserDto user);
    Users findByEmail(String email);
}
