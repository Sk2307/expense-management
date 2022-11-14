package com.example.expense.controller;

import com.example.expense.dto.CreateUserDTO;
import com.example.expense.dto.GetUserDTO;
import com.example.expense.service.UserService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@RestController
@AllArgsConstructor
@Slf4j
public class UserController {

    private UserService userService;

    @GetMapping("/user/{id}")
    public GetUserDTO getUser(@PathVariable Long id){
        return userService.getUser(id).dto();
    }

    @PostMapping("/user")
    public GetUserDTO  createUser(@RequestBody CreateUserDTO request){
        validate(request);
        log.info("info = User Created, user = {}", request);
        return userService.createUser(request).dto();
    }

    private static void validate(CreateUserDTO request) {
        if (request.getName() == null) {
            throw new RuntimeException("Name is not present");
        }
        if (request.getPhoneNumber() == null) {
            throw new RuntimeException("Phone Number is not present");
        }
        if (request.getPassword() == null) {
            throw new RuntimeException("Password is not present");
        }
    }
}
