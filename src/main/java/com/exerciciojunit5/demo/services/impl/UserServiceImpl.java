package com.exerciciojunit5.demo.services.impl;

import com.exerciciojunit5.demo.models.User;
import com.exerciciojunit5.demo.models.dtos.UserDTO;
import com.exerciciojunit5.demo.repositories.UserRepository;
import com.exerciciojunit5.demo.services.UserService;
import com.exerciciojunit5.demo.services.exceptions.DataIntegratyViolationException;
import com.exerciciojunit5.demo.services.exceptions.ObjectNotFoundException;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository repository;
    @Autowired
    private ModelMapper mapper;

    @Override
    public User findById( Integer id ) {
        Optional<User> obj = repository.findById(id);
        return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado"));
    }

    @GetMapping
    public List<User> findAll() {
        return repository.findAll();
    }

    @Override
    public User create( UserDTO obj ) {

        findByEmail(obj);
        return repository.save(mapper.map(obj, User.class));
    }

    @Override
    public User update( UserDTO obj ) {
        findByEmail(obj);
        return repository.save(mapper.map(obj,User.class));
    }

    @Override
    public void delete( Integer id ) {
        repository.findById(id);
    }

    private void findByEmail( UserDTO obj ) {
        Optional<User> user = repository.findByEmail(obj.getEmail());
        if(user.isPresent() && !user.get().getId().equals(obj.getId())){
            throw new DataIntegratyViolationException("Email já cadastrado no sistema");
        }

    }

}
