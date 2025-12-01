package com.java.loveableclone.service;

import com.java.loveableclone.dto.subscription.PlanLimitResponse;
import com.java.loveableclone.dto.subscription.UsageTodayResponse;
import org.jspecify.annotations.Nullable;

public interface UsageService {
    UsageTodayResponse getTodayUsageOfUser(Long userId);

    PlanLimitResponse getCurrentSubscriptionLimits(Long userId);
}
