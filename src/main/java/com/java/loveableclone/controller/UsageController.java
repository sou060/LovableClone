package com.java.loveableclone.controller;

import com.java.loveableclone.dto.subscription.PlanLimitResponse;
import com.java.loveableclone.dto.subscription.UsageTodayResponse;
import com.java.loveableclone.service.UsageService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/usage")
@RequiredArgsConstructor
public class UsageController {
    private UsageService usageService;

    @GetMapping("/today")
    public ResponseEntity<UsageTodayResponse> getTodayUsage(){
        Long userId=1L;
        return ResponseEntity.ok(usageService.getTodayUsageOfUser(userId));
    }

    @GetMapping("/limits")
    public ResponseEntity<PlanLimitResponse> getPlanLimits()
    {
        Long userId=1L;
        return ResponseEntity.ok(usageService.getCurrentSubscriptionLimits(userId));
    }
}
