package com.example.app.controller;

import com.example.app.domain.dto.UserDto;
import com.example.app.mapper.UserMapper;
import com.example.app.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/users")
@RequiredArgsConstructor
public class UserController {
    private final UserService userService;
    private final UserMapper userMapper;

    @GetMapping("{id}")
    public UserDto getUserById(@PathVariable Long id){
        return userMapper.daoToDto(userService.findUser(id));
    }

    @PostMapping
    public UserDto saveUser(@RequestBody UserDto user){
        return userMapper.daoToDto(userService.saveUser(userMapper.dtoToDao(user)));
    }

    @DeleteMapping("{id}")
    public void deleteUser(@PathVariable Long id){
        userService.deleteUser(id);
    }

    @GetMapping
    public Page<UserDto> getUserPage(@RequestParam int page,@RequestParam int size){
        return userService.getPage(PageRequest.of(page, size)).map(userMapper::daoToDto);
    }

    @PutMapping("{id}")
    public UserDto updateUser(@RequestBody UserDto user, @PathVariable Long id){
        return userMapper.daoToDto(userService.updateUser(id, userMapper.dtoToDao(user)));
    }
}
