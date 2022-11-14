package com.example.expense.model;

import com.example.expense.dto.GetUserDTO;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "users")
@Getter
@Setter
public class User extends BaseModel{
    private String name;
    private String phoneNumber;
    private String hashedPassword;

    public GetUserDTO dto() {
        return GetUserDTO.builder()
                .name(name)
                .phoneNumber(phoneNumber)
                .build();
    }
}
