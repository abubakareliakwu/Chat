package com.example.Chat.service;

import com.example.Chat.model.MessageContent;

public interface SenderService {
    void sendMessage(MessageContent content);
    void uploadFile(MessageContent content);
}
