package com.example.Chat.service;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class LoginServiceImpl implements LoginService{
    private final SenderService senderService;
    @Override
    public ResponseEntity login(String username) {
        return null;
    }
}
