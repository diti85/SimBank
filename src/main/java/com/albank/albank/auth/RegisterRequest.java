package com.albank.albank.auth;

import java.time.LocalDate;

import lombok.Data;
@Data
public class RegisterRequest {
    private String firstname;
    private String lastname;
    private String email;
    private String password;
    private LocalDate dob;
    private int balance;
    
}