package com.example.onlinereservationsystem.controller;

import org.springframework.web.bind.annotation.*;

import com.example.onlinereservationsystem.model.Reservation;

@RestController
@RequestMapping("/reservations")

public class ReservationController {
    @GetMapping
    public String getAllReservations() {
        // Aquí iría la lógica para obtener todas las reservas
        return "List of reservations";
    }

    @GetMapping("/{id}")
    public String getReservationById(@PathVariable int id) {
        // Aquí iría la lógica para obtener una reserva por su ID
        return "Reservation with ID: " + id;
    }

    @PostMapping
    public String createReservation(@RequestBody Reservation reservation) {
        // Aquí iría la lógica para crear una nueva reserva
        return "Reservation created";
    }

    @PutMapping("/{id}")
    public String updateReservation(@PathVariable int id, @RequestBody Reservation reservation) {
        // Aquí iría la lógica para actualizar una reserva
        return "Reservation with ID " + id + " updated";
    }

    @DeleteMapping("/{id}")
    public String cancelReservation(@PathVariable int id) {
        // Aquí iría la lógica para cancelar una reserva
        return "Reservation with ID " + id + " cancelled";
    }
}
