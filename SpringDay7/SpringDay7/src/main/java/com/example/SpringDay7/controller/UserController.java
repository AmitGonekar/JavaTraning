package com.example.SpringDay7.controller;

import com.example.SpringDay7.dto.UserRequest;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/user")
public class UserController {

    @PostMapping("/register")
    public ResponseEntity<?> registerUser(
            @Valid @RequestBody UserRequest request, BindingResult result){
        if(result.hasErrors()){
            return ResponseEntity
                    .badRequest()
                    .body(result.getAllErrors());
        }
        return ResponseEntity.ok("User registered successfully");
    }
}

