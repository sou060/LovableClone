package com.java.loveableclone.entity;

import com.java.loveableclone.enums.ProjectRole;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

import java.time.Instant;
@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class ProjectMember {
  ProjectMemberID id;
  Project project;
  User user;
  ProjectRole role;
  Instant invitedAt;
  Instant acceptedAt;
}
