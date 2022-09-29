package com.exerciciojunit5.demo.services.impl;

import com.exerciciojunit5.demo.models.User;
import com.exerciciojunit5.demo.repositories.UserRepository;
import com.exerciciojunit5.demo.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository repository;

    @Override
    public User findById( Integer id ) {
        Optional<User> obj =  repository.findById(id);
        return  obj.orElse(null);

    }
}
