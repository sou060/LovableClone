package com.java.loveableclone.service;

import com.java.loveableclone.dto.member.InviteMemberRequest;
import com.java.loveableclone.dto.member.MemberResponse;
import org.jspecify.annotations.Nullable;

import java.util.List;

public interface ProjectMemberService {
    List<MemberResponse> getProjectMembers(Long userId, Long projectId);

    MemberResponse inviteMember(Long projectId, Long userId, InviteMemberRequest request);

    MemberResponse updateMemberRole(Long projectId, Long userId, InviteMemberRequest request);

    MemberResponse deleteProjectMember(Long projectId, Long userId, InviteMemberRequest request);
}
