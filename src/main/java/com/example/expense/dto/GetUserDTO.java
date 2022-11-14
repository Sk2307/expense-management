package com.example.expense.dto;

import com.example.expense.model.User;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@AllArgsConstructor
@Getter
@Builder
public class GetUserDTO {
    private String name;
    private String phoneNumber;
}
