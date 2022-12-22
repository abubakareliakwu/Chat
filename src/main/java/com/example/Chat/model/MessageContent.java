package com.example.Chat.model;

import lombok.Data;

@Data
public class MessageContent {
    private String senderId; //
    private String destID;
    private String content;
}
