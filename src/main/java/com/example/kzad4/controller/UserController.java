package com.example.kzad4.controller;

import com.example.kzad4.domain.dao.User;
import com.example.kzad4.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/users")
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @GetMapping("{id}")
    public User getUserById(@PathVariable Long id){
        return userService.findUser(id);
    }

    @PostMapping
    public User saveUser(@RequestBody User user){
        return userService.saveUser(user);
    }

    @DeleteMapping("{id}")
    public void deleteUser(@PathVariable Long id){
        userService.deleteUser(id);
    }

    ////////////////////////////////////////////////////////

    @GetMapping
    public Page<User> getUserPage(@RequestParam int page,@RequestParam int size){
        return userService.getPage(PageRequest.of(page, size));
    }

    @PutMapping("{id}")
    public User updateUser(@RequestBody User user, @PathVariable Long id){
        return userService.updateUser(id, user);
    }
}
