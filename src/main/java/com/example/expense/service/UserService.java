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

    private PasswordEncoder encoder;

    public User createUser(CreateUserDTO request) {
        String hashedPassword = encoder.encode(request.getPassword());
        User user = request.user(hashedPassword);
        userRepository.save(user);
        return user;
    }

    public User getUser(Long id) {
        return userRepository.findById(id).orElseThrow(RuntimeException::new);
    }
}
