package com.example.kzad4.service;

import com.example.kzad4.domain.dao.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface UserService {

    User saveUser(User user);
    User findUser(Long id);
    User updateUser(Long id, User user);
    Page<User> getPage(Pageable pageable);
    void deleteUser(Long id);

}
