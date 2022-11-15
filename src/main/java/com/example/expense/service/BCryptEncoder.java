package com.example.expense.service;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class BCryptEncoder implements PasswordEncoder{

    private BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder();

    @Override
    public String encode(String password) {
        return bCryptPasswordEncoder.encode(password);
    }

    @Override
    public Boolean matches(String plaintext, String hashed) {
        return bCryptPasswordEncoder.matches(plaintext, hashed);
    }
}
