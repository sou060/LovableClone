package com.java.loveableclone.entity;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Plan {
    Long id;

    String name;

    String stripePriceId;

    Integer maxProject;
    Integer maxTokenPerDay;
    Integer maxPreview;

    Boolean unlimitedAI;
    Boolean active;

}
