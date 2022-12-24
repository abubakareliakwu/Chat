package com.example.Chat.service;

import com.example.Chat.dto.CreateChatDTO;
import com.example.Chat.model.Channel;

import java.util.List;

public interface ChannelService {

    Channel create(CreateChatDTO channel);
    Channel createGroup(Channel groupChannel);

    Channel getById(Long id);
    void remove(Long id);

    List<Channel> getallChat(String phone);

}
