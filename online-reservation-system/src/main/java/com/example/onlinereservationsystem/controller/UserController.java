package com.example.onlinereservationsystem.controller;

import org.springframework.web.bind.annotation.*;

import com.example.onlinereservationsystem.model.User;

@RestController
@RequestMapping("/users")
public class UserController {

    @GetMapping
    public String getAllUsers() {
        return "logica users";
    }

    @GetMapping("/{id}")
    public String getAllUsers(@PathVariable int id) {
        return "logica user id " + id;
    }

    @PostMapping
    public String createuser(@RequestBody User user) {
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
