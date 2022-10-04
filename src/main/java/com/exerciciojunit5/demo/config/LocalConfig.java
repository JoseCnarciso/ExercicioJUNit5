package com.exerciciojunit5.demo.config;

import com.exerciciojunit5.demo.models.User;
import com.exerciciojunit5.demo.repositories.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.util.List;

@Configuration
@Profile("local")
public class LocalConfig {
    @Autowired
    private UserRepository repository;

  @Bean
    public void startDB(){
        User u1 = new User(null,"jose","josecdia@hotmail.","198728");
        User u2 = new User(null,"Francisco","francisco@hotmail.com","198728281");

        repository.saveAll(List.of(u1,u2));

    }

}
