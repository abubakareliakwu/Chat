package com.example.Chat.service;

import com.example.Chat.model.Channel;
import com.example.Chat.model.GroupChannel;
import org.springframework.http.ResponseEntity;

public interface ChannelService {

    ResponseEntity create(Channel channel);
    ResponseEntity createGroup(GroupChannel groupChannel);
}
