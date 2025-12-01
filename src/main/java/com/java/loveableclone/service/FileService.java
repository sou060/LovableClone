package com.java.loveableclone.service;

import com.java.loveableclone.dto.project.FileContentResponse;
import com.java.loveableclone.dto.project.FileNode;
import org.jspecify.annotations.Nullable;

import java.util.List;

public interface FileService {
    List<FileNode> getFiletree(Long userId, Long projectId);

    FileContentResponse getFileContent(Long projectId, Long userId, String path);
}
