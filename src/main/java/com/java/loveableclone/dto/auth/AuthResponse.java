package com.java.loveableclone.dto.auth;

public record AuthResponse(String token, UserProfileResponse user) {
}
//dummy code new AuthResponse("",new UserProfileResponse())
