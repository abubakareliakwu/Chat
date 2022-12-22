package com.example.Chat.service;

import com.example.Chat.model.MessageContent;
import com.example.Chat.util.SocketUtil;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Slf4j
public class SenderServiceImpl implements SenderService {
    private final SimpMessagingTemplate simpMessagingTemplate;

    @Override
    public void sendMessage(MessageContent content) {
        simpMessagingTemplate.convertAndSend(SocketUtil.WEB_SOCKET_QUEUE + content.getSenderId(),
                content);
    }
    @Override
    public void uploadFile(MessageContent content) {
        simpMessagingTemplate.convertAndSend(SocketUtil.WEB_SOCKET_TOPIC + "group_id",
                content);
    }
}
