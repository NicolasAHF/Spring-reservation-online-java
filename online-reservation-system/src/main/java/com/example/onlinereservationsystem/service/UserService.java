package com.example.onlinereservationsystem.service;

import java.util.Optional;
import java.util.stream.Collectors;
import java.time.LocalDateTime;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.onlinereservationsystem.dto.User.AddUserDto;
import com.example.onlinereservationsystem.dto.User.GetUserDto;
import com.example.onlinereservationsystem.model.User;
import com.example.onlinereservationsystem.repository.UserRepository;

@Service
public class UserService {
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public GetUserDto addUser(AddUserDto userDto) {
        Optional<User> existingUser = userRepository.findByEmail(userDto.getEmail());
        if (existingUser.isPresent()) {
            throw new RuntimeException("Ya existe un usuario con ese email");
        }
        User user = convertToUser(userDto);
        User savedUser = userRepository.save(user);
        return convertToDto(savedUser);
    }

    public User updateUser(User user) {
        return userRepository.save(user);
    }

    public void deleteUser(Long userId) {
        userRepository.deleteById(userId);
    }

    public Optional<GetUserDto> getUser(Long userId) {
        return userRepository.findById(userId)
                .map(this::convertToDto);
    }

    public List<GetUserDto> getAllUsers() {
        return userRepository.findAll().stream()
                .map(this::convertToDto)
                .collect(Collectors.toList());
    }

    private GetUserDto convertToDto(User user) {
        GetUserDto dto = new GetUserDto();
        dto.setId(user.getId());
        dto.setName(user.getName());
        dto.setEmail(user.getEmail());

        return dto;
    }

    private User convertToUser(AddUserDto userDto) {
        User user = new User();
        user.setName(userDto.getName());
        user.setEmail(userDto.getEmail());
        user.setPassword(userDto.getPassword());
        user.setPhoneNumber(userDto.getPhoneNumber());
        user.setRole("Basic");
        user.setCreatedAt(LocalDateTime.now());
        user.setUpdatedAt(LocalDateTime.now());

        return user;
    }
}
