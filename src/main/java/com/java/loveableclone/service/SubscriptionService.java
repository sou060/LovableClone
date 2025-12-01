package com.java.loveableclone.service;

import com.java.loveableclone.dto.subscription.CheckoutRequest;
import com.java.loveableclone.dto.subscription.CheckoutResponse;
import com.java.loveableclone.dto.subscription.PortalResponse;
import com.java.loveableclone.dto.subscription.SubscriptionResponse;
import org.jspecify.annotations.Nullable;

public interface SubscriptionService {
    SubscriptionResponse getCurrentSubscription(Long userId);

    CheckoutResponse createCheckoutSessionUrl(CheckoutRequest request, Long userId);

    PortalResponse openCustomerPortal(Long userId);
}
