package com.example.onlinereservationsystem.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.onlinereservationsystem.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findById(Long id);

    Optional<User> findByEmail(String email);

    List<User> findAll();

    void deleteById(Long id);
}