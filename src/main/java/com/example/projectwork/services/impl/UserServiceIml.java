package com.example.projectwork.services.impl;

import com.example.projectwork.dtos.UserDto;
import com.example.projectwork.models.Role;
import com.example.projectwork.models.Users;
import com.example.projectwork.repository.UserRepository;
import com.example.projectwork.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Arrays;
import java.util.Optional;


@Service
public class UserServiceIml implements UserService {
    private final UserRepository userRepository;

    @Autowired
    public UserServiceIml(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public Users userSave(UserDto userDto) {
      Users user=new Users();
      user.setId(userDto.getId());
      user.setSurname(userDto.getSurname());
      user.setName(userDto.getName());
      user.setEmail(userDto.getEmail());
      user.setPassword(userDto.getPassword());
      user.setCards(userDto.getCards());
      Role role=Role.USER;
      user.setRole(role);
      return userRepository.save(user);
    }
    @Override
    public Users findByEmail(String email) {
        return   userRepository.findByEmail(email);
    }

}
