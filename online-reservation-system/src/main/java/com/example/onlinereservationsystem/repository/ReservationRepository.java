package com.example.onlinereservationsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.onlinereservationsystem.model.Reservation;
import com.example.onlinereservationsystem.model.User;

import java.time.LocalDateTime;
import java.util.*;

public interface ReservationRepository extends JpaRepository<Reservation, Long> {
    Optional<Reservation> findById(Long id);

    List<Reservation> findByUser(User user);

    List<Reservation> findAll();

    void deleteById(Long id);

    List<Reservation> findByStartDateBetween(LocalDateTime start, LocalDateTime end);

}
