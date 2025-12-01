package com.java.loveableclone.entity;

import com.java.loveableclone.enums.MessageRole;

import java.time.Instant;

public class ChatMessage {
    Long id;
    ChatSession chatSession;
    MessageRole role;
    String content;
    String toolCalls; //JSON Array of tools called
    Integer tokensUsed;
    Instant createdAt;
}
