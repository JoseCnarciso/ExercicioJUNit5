package com.exerciciojunit5.demo.services;

import com.exerciciojunit5.demo.models.User;

import java.util.List;


public interface UserService {
    User findById(Integer id);
    List<User> findAll();
}
