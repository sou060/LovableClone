package com.java.loveableclone.service;


import com.java.loveableclone.dto.project.ProjectRequest;
import com.java.loveableclone.dto.project.ProjectResponse;
import com.java.loveableclone.dto.project.ProjectSummaryResponse;
import org.jspecify.annotations.Nullable;

import java.util.List;

public interface ProjectService {
    List<ProjectSummaryResponse> getUserProjects(Long userId);

    ProjectResponse getUserProjectsById(Long userId, Long id);

    ProjectResponse createProject(ProjectRequest request, Long userId);

    ProjectResponse updateProject(Long id, Long userId, ProjectRequest request);

    void softDelete(Long id, Long userId);
}
