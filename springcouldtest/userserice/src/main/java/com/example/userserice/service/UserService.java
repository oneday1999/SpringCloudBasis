package com.example.userserice.service;

import com.example.userserice.pojo.User;

import java.util.List;

public interface UserService {

    void insert(User user);

    User getUser(Long id);

    void update(User user);

    void delete(Long id);

    User getByUsername(String username);

    List<User> listUsersByIds(List<Long> ids);

}

