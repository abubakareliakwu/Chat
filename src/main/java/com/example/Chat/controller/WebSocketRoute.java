package com.example.Chat.controller;

import com.example.Chat.model.MessageContent;
import com.example.Chat.service.SenderService;
import lombok.RequiredArgsConstructor;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RequiredArgsConstructor
public class WebSocketRoute {

    private final SenderService senderService;
    @MessageMapping("/send")
    @SendTo("/queue/send")
    public void verifyTransaction(@Payload MessageContent payload) throws InterruptedException {
        Thread.sleep(3600);
        senderService.sendMessage(payload);
    }

    @MessageMapping("/file/upload")
    public void uploadFile(@Payload MessageContent payload){
        senderService.sendMessage(payload);
    }

    @MessageMapping("/sendGroup")
    @SendTo("/topic/send")
    public void sendGroup(@Payload MessageContent payload) throws InterruptedException {
        Thread.sleep(3600);
        senderService.sendGroupMessage(payload);
    }

}
