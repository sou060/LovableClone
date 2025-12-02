package com.java.loveableclone.dto.project;

import java.time.Instant;

public record FileNode(String Path, Instant modifiedAt, Long size, String type) {
}
