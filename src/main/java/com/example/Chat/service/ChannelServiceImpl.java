package com.example.Chat.service;

import com.example.Chat.model.Channel;
import com.example.Chat.model.GroupChannel;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Slf4j
public class ChannelServiceImpl implements ChannelService{

    @Override
    public ResponseEntity create(Channel channel) {
        return null;
    }

    @Override
    public ResponseEntity createGroup(GroupChannel groupChannel) {
        return null;
    }
}
