package com.gloabalogic.BookApplication.service;

import com.gloabalogic.BookApplication.Model.User;
import com.gloabalogic.BookApplication.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    private UserRepository repository;

    @Autowired
    public UserService(UserRepository repository) {
        this.repository = repository;
    }

    public User saveUser(User user){
        return repository.save(user);
    }
}
