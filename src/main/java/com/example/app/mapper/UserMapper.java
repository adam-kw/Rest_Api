package com.example.app.mapper;

import com.example.app.domain.dao.User;
import com.example.app.domain.dto.UserDto;

public interface UserMapper {
    UserDto daoToDto(User user);
    User dtoToDao(UserDto userDto);
}
