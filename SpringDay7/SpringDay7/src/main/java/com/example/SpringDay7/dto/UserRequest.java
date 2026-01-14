package com.example.SpringDay7.dto;

import com.example.SpringDay7.validation.ValidPhone;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public class UserRequest {

    @ValidPhone
    private String phone;

    @NotBlank(message = "Name cannot be empty")
    private String name;

    @Email(message = "Email format is invalid")
    private String email;

    @Min(value = 18 , message = "Age must be 18 or above")
    private int age;

    @Size(min = 8,max = 20,message = "Password must be 8-20 characters")
    private String password;

    @NotBlank(message = "City is required")
    private String city;
}

