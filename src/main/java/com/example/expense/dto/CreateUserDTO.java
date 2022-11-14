package com.example.expense.dto;

import com.example.expense.model.User;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@Getter
@AllArgsConstructor
@Builder
public class CreateUserDTO {
    private String name;
    private String phoneNumber;
    private String password;

    public User user(){
        User user = new User();
        user.setName(name);
        user.setPhoneNumber(phoneNumber);
        user.setHashedPassword(password);
        return user;
    }
}
