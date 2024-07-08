package com.example.firstspringbootapplication.service;

import com.example.firstspringbootapplication.dto.UserDto;
import com.example.firstspringbootapplication.model.User;
import org.springframework.stereotype.Service;

import java.util.List;

public interface UserService {
    void saveUser(UserDto userDto);

    User findUserByEmail(String email);

    List<UserDto> findAllUsers();
}
