package com.pfe.gesauto.controller;

import com.pfe.gesauto.model.User;
import com.pfe.gesauto.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("Api/User")
public class UserController {
    @Autowired
    private UserService userService;
    @PostMapping
    public User createUser(@RequestBody User user) {
        return userService.addUser(user);
    }
   @GetMapping
    public List<User> getAllUsers() {
        return userService.getAllUsers();
   }
}
