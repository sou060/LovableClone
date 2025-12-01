package com.java.loveableclone.entity;

import com.java.loveableclone.enums.SuscriptionStatus;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

import java.time.Instant;

@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Subscription {
    Long id;

    User user;

    Plan plan;

    String stripeCustomerId;
    String stripeSubscriptionId;
    SuscriptionStatus status;
    Instant currentPeriodStart;
    Instant currentPeriodEnd;
    Boolean canceledAtPeriodEnd;
    Instant createdAt;
    Instant updatedAt;
}
