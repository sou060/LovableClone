package com.java.loveableclone.service;

import com.java.loveableclone.dto.auth.UserProfileResponse;
import org.springframework.stereotype.Service;

@Service
public interface Userservice {
    UserProfileResponse getProfile(Long id);
}
