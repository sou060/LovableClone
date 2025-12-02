package com.java.loveableclone.service;

import com.java.loveableclone.dto.project.FileContentResponse;
import com.java.loveableclone.dto.project.FileNode;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface FileService {
    List<FileNode> getFiletree(Long userId, Long projectId);

    FileContentResponse getFileContent(Long projectId, Long userId, String path);
}
