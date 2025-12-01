package com.java.loveableclone.service;

import com.java.loveableclone.dto.auth.AuthResponse;
import com.java.loveableclone.dto.auth.LoginRequest;
import com.java.loveableclone.dto.auth.SignupRequest;
import org.jspecify.annotations.Nullable;

public interface AuthService {
     AuthResponse signup(SignupRequest signupRequest);

     AuthResponse login(LoginRequest loginRequest);
}
