package com.example.wosmartprojc.models;

public class LoginUser {

    @NotEmpty(message="Username is required!")
    @Email(message="Please enter a valid Username!")
    private String username;
    
    @NotEmpty(message="Password is required!")
    @Size(min=8, max=128, message="Password must be between 8 and 128 characters")
    private String password;
    
    public LoginUser() {}
}
