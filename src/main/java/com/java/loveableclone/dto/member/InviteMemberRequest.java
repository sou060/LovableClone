package com.java.loveableclone.dto.member;

import com.java.loveableclone.enums.ProjectRole;

public record InviteMemberRequest(
        String email,
        ProjectRole role
                                  ) {
}
