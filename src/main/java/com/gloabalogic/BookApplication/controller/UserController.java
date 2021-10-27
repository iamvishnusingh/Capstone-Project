package com.gloabalogic.BookApplication.controller;

import com.gloabalogic.BookApplication.Model.User;
import com.gloabalogic.BookApplication.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1")
public class UserController {
    private  UserService service;

    @Autowired
    public UserController(UserService service) {
        this.service = service;
    }

    @PostMapping(value = "/users")
    public ResponseEntity<User> saveUser(@RequestBody User user){


        User user1=service.saveUser(user);
//        try {
//            employee=employeeService.addNew(emp);
//        }
//        catch (Exception e){
//            return new ResponseEntity<>("Employee already Exist",HttpStatus.CREATED);
//        }
//        return new ResponseEntity<>(employee,HttpStatus.CREATED);
        return  new ResponseEntity<>(user1, HttpStatus.CREATED);
    }
}
