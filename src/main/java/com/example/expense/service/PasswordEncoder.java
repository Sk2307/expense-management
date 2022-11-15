package com.example.expense.service;

public interface PasswordEncoder {

    String encode(String password);

    Boolean matches(String plaintext, String hashed);
}
