package com.java.loveableclone.service;

import com.java.loveableclone.dto.subscription.PlanResponse;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface PlanService {
    List<PlanResponse> getAllActivePlans();
}
