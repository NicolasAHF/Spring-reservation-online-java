package com.example.onlinereservationsystem.controller;

import java.util.List;

import org.springframework.web.bind.annotation.*;

import com.example.onlinereservationsystem.dto.User.AddUserDto;
import com.example.onlinereservationsystem.dto.User.GetUserDto;
import com.example.onlinereservationsystem.model.User;
import com.example.onlinereservationsystem.service.UserService;

@RestController
@RequestMapping("/users")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping
    public List<GetUserDto> getAllUsers() {
        return userService.getAllUsers();
    }

    @GetMapping("/{id}")
    public String getAllUsers(@PathVariable int id) {
        return "logica user id " + id;
    }

    @PostMapping
    public String createuser(@RequestBody AddUserDto user) {
        userService.addUser(user);
        return "User created";
    }

    @PutMapping("/{id}")
    public String updateUser(@PathVariable int id, @RequestBody User user) {
        return "User id" + id + " updated";
    }

    @DeleteMapping("/{id}")
    public String deleteUser(@PathVariable int id) {
        return "User with ID " + id + " deleted";
    }
}
