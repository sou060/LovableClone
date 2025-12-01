package com.java.loveableclone.dto.subscription;

import java.time.Instant;

public record SubscriptionResponse(
        PlanResponse plan,
        String status,
        Instant expiresAt,
        Long tokenUsedThisCycle
) {
}
