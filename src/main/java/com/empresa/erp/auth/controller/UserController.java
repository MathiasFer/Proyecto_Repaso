package com.empresa.erp.auth.controller;

import com.empresa.erp.auth.entity.User;
import com.empresa.erp.auth.service.UserService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService){
        this.userService = userService;
    }

    @PostMapping
    public User create(@RequestBody User user){
        return userService.save(user);
    }

    public List <User> list(){
        return userService.findAll();
    }


}
