package com.example.Chat.controller;

import com.example.Chat.service.ChannelService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/chat-gateway")
@RequiredArgsConstructor
public class UserController {

      private final ChannelService channelService;


}
