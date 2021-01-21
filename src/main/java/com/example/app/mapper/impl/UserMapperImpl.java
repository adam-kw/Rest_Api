package com.example.app.mapper.impl;

import com.example.app.domain.dao.User;
import com.example.app.domain.dto.UserDto;
import com.example.app.mapper.UserMapper;
import org.springframework.stereotype.Component;

@Component
public class UserMapperImpl implements UserMapper {
    @Override
    public UserDto daoToDto(User user) {
        return UserDto.builder()
                .id(user.getId())
                .email(user.getEmail())
                .firstName(user.getFirstName())
                .lastName(user.getLastName())
                .build();
    }

    @Override
    public User dtoToDao(UserDto userDto) {
        return User.builder()
                .id(userDto.getId())
                .firstName(userDto.getFirstName())
                .email(userDto.getEmail())
                .lastName(userDto.getLastName())
                .build();
    }
}
