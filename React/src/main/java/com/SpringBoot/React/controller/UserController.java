package com.SpringBoot.React.controller;

import com.SpringBoot.React.entities.User;
import com.SpringBoot.React.service.CountryService;
import com.SpringBoot.React.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
@CrossOrigin("*")

public class UserController {
    @Autowired
    UserService userService;

    @Autowired
    CountryService countryService;

    @PostMapping("/save")
    public ResponseEntity<User> create(@RequestBody User userDto) {
        return new ResponseEntity<>(userService.createAccount(userDto), HttpStatus.CREATED);
    }

}
