package com.java.loveableclone.dto.subscription;

public record UsageTodayResponse(
        int tokensUsedToday,
        int tokensLimit,
        int previewsLimit,
        int previewRunning
) {
}
