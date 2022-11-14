package com.example.expense.service;

import com.example.expense.dto.CreateUserDTO;
import com.example.expense.model.User;
import com.example.expense.repositories.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class UserService {

    private UserRepository userRepository;

    public User createUser(CreateUserDTO request) {
        User user = request.user();
        userRepository.save(user);
        return user;
    }

    public User getUser(Long id) {
        return userRepository.findById(id).orElseThrow(RuntimeException::new);
    }
}
