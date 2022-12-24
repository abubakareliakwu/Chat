package com.example.Chat.service;

import com.example.Chat.dto.CreateChatDTO;
import com.example.Chat.model.Channel;
import com.example.Chat.repository.ChannelRepository;
import com.example.Chat.repository.GroupChannelRepository;
import com.example.Chat.util.SocketUtil;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
@Slf4j
public class ChannelServiceImpl implements ChannelService{

    @Autowired
    private final ChannelRepository channelRepository;

    @Override
    public Channel create(CreateChatDTO channel) {

        Channel channel1 = new Channel();
        channel1.setSenderPhone(channel.getSenderPhone());
        channel1.setDestPhone(channel.getDestPhone());

        return channelRepository.save(channel1);
    }
    @Override
    public Channel createGroup(Channel groupChannel) {
        return channelRepository.save(groupChannel);
    }

    @Override
    public Channel getById(Long id) {
        return channelRepository.findById(id).get();
    }

    @Override
    public void remove(Long id) {
       channelRepository.deleteById(id);
    }

    @Override
    public List<Channel> getallChat(String phone) {
        System.out.println(phone);
        return channelRepository.getChannel(phone);
    }
}
