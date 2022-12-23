package com.example.Chat.service;

import com.example.Chat.model.Channel;

public interface ChannelService {

    Channel create(Channel channel);
    Channel createGroup(Channel groupChannel);
}
