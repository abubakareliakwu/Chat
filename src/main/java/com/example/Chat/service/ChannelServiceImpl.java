package com.example.Chat.service;

import com.example.Chat.model.Channel;
import com.example.Chat.repository.ChannelRepository;
import com.example.Chat.repository.GroupChannelRepository;
import com.example.Chat.util.SocketUtil;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Slf4j
public class ChannelServiceImpl implements ChannelService{

    private final ChannelRepository channelRepository;

    private  final GroupChannelRepository groupChannelRepository;
    @Override
    public Channel create(Channel channel) {

        channel.setPrivateChannel(SocketUtil.WEB_SOCKET_QUEUE+channel.getPrivateChannel());

        return channelRepository.save(channel);
    }
    @Override
    public Channel createGroup(Channel groupChannel) {
        groupChannel.setPrivateChannel(SocketUtil.WEB_SOCKET_TOPIC);
        return channelRepository.save(groupChannel);
    }
}
