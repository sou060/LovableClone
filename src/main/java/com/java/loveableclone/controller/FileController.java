package com.java.loveableclone.controller;

import com.java.loveableclone.dto.project.FileContentResponse;
import com.java.loveableclone.dto.project.FileNode;
import com.java.loveableclone.service.FileService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/projects/{projectId}/files")
@RequiredArgsConstructor
public class FileController {
    public  FileService fileService;

    @GetMapping
    public ResponseEntity<List<FileNode>> getFileTree(@PathVariable Long projectId){
        Long userId=1L;
        return ResponseEntity.ok(fileService.getFiletree(userId,projectId));
    }
    @GetMapping("/{*path}")
    public ResponseEntity<FileContentResponse> getFile(@PathVariable Long projectId, @PathVariable String path){
        Long userId=1L;
        return ResponseEntity.ok(fileService.getFileContent(projectId,userId,path));
    }
}
