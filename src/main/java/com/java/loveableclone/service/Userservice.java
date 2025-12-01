package com.java.loveableclone.service;

import com.java.loveableclone.dto.auth.UserProfileResponse;
import org.jspecify.annotations.Nullable;

public interface Userservice {
    UserProfileResponse getProfile(Long id);
}
