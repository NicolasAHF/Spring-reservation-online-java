package com.example.onlinereservationsystem.model;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

@Getter
@Entity
@Table(name = "users")
@ToString
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Setter
    private String name;
    @Setter
    private String email;
    @Setter
    private String password;
    @Setter
    private String role;
    @Setter
    private String phoneNumber;
    @Setter
    private LocalDateTime createdAt;
    @Setter
    private LocalDateTime updatedAt;
}
