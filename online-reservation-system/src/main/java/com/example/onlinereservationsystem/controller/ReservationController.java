package com.example.onlinereservationsystem.controller;

import org.springframework.web.bind.annotation.*;

import com.example.onlinereservationsystem.model.Reservation;

@RestController
@RequestMapping("/reservations")

public class ReservationController {
    @GetMapping
    public String getAllReservations() {

        return "List of reservations";
    }

    @GetMapping("/{id}")
    public String getReservationById(@PathVariable int id) {

        return "Reservation with ID: " + id;
    }

    @PostMapping
    public String createReservation(@RequestBody Reservation reservation) {

        return "Reservation created";
    }

    @PutMapping("/{id}")
    public String updateReservation(@PathVariable int id, @RequestBody Reservation reservation) {

        return "Reservation with ID " + id + " updated";
    }

    @DeleteMapping("/{id}")
    public String cancelReservation(@PathVariable int id) {

        return "Reservation with ID " + id + " cancelled";
    }
}
