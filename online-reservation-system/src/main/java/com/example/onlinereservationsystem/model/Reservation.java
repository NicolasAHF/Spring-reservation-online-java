package com.example.onlinereservationsystem.model;

import java.time.LocalDateTime;
import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.*;

@Getter
@Entity
@Table(name = "reservations")
@ToString
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
public class Reservation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Setter
    private LocalDateTime startDate;
    @Setter
    private LocalDateTime endDate;
    @OneToMany(mappedBy = "reservation", cascade = CascadeType.ALL)
    @Setter
    private Set<Person> people;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    @Setter
    private User user;
    @Setter
    private String status;
    @Setter
    private String notes;
}
