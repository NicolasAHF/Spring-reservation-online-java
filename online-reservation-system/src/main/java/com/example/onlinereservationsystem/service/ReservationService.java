package com.example.onlinereservationsystem.service;

import java.util.Optional;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.onlinereservationsystem.model.Reservation;
import com.example.onlinereservationsystem.repository.ReservationRepository;

@Service
public class ReservationService {
    private final ReservationRepository reservationRepository;

    public ReservationService(ReservationRepository reservationRepository) {
        this.reservationRepository = reservationRepository;
    }

    public Reservation addReservation(Reservation reservation) {
        return reservationRepository.save(reservation);
    }

    public Reservation updateReservation(Reservation reservation) {
        return reservationRepository.save(reservation);
    }

    public void deleteReservation(Long reservationId) {
        reservationRepository.deleteById(reservationId);
    }

    public Optional<Reservation> getReservation(Long reservationId) {
        return reservationRepository.findById(reservationId);
    }

    public List<Reservation> getAll() {
        return reservationRepository.findAll();
    }
}
