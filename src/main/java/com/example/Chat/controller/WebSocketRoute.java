package com.example.Chat.controller;

import com.example.Chat.model.MessageContent;
import com.example.Chat.service.SenderService;
import lombok.RequiredArgsConstructor;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Controller;

@Controller
@RequiredArgsConstructor
public class WebSocketRoute {

    private final SenderService senderService;
    @MessageMapping("/send")
    public void verifyTransaction(@Payload MessageContent payload){
     senderService.sendMessage(payload);
    }

    @MessageMapping("/file/upload")
    public void uploadFile(@Payload MessageContent payload){
        senderService.sendMessage(payload);
    }

    @MessageMapping("/user/display")
    public void displayUser(@Payload MessageContent payload){
        senderService.sendMessage(payload);
    }
}
