package com.security.med.auth_service.controller;


import com.security.med.auth_service.service.AuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
public class AuthController {

    @Autowired
    private AuthService authService;

    @PostMapping("/register")
    public String register(@RequestParam String username, @RequestParam String password) {
        authService.register(username, password);
        return "User registered successfully!";
    }

    @GetMapping("/test")
    public String test() {
        return "Test Endpoint is secured!";
    }
}
