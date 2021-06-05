package com.ebenezerdiaz.adea.web.controller;

import com.ebenezerdiaz.adea.domain.dto.User;
import com.ebenezerdiaz.adea.domain.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.security.NoSuchAlgorithmException;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/login")
    public boolean login(@RequestBody User user) throws NoSuchAlgorithmException {
        return userService.login(user);
    }

    @PostMapping("/save")
    public User save(@RequestBody User user){
        return userService.save(user);
    }

    @GetMapping("/{login}")
    public User findUser(@PathVariable("login") String login){
        return userService.getUser(login).get();
    }
}
