package com.java.loveableclone.controller;

import com.java.loveableclone.dto.auth.AuthResponse;
import com.java.loveableclone.dto.auth.LoginRequest;
import com.java.loveableclone.dto.auth.SignupRequest;
import com.java.loveableclone.dto.auth.UserProfileResponse;
import com.java.loveableclone.service.AuthService;
import com.java.loveableclone.service.Userservice;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/auth")
public class AuthController {
    private final AuthService authService;
    private final Userservice userservice;

    @PostMapping("/signup")
    public ResponseEntity<AuthResponse> signup(SignupRequest signupRequest) {
        return ResponseEntity.ok(authService.signup(signupRequest));
    }

    @PostMapping
    public ResponseEntity<AuthResponse> login(LoginRequest loginRequest) {
        return ResponseEntity.ok(authService.login(loginRequest));
    }

    @GetMapping("/me")
    public ResponseEntity<UserProfileResponse> me() {
        Long id = 1L;
        return ResponseEntity.ok(userservice.getProfile(id));
    }
}
