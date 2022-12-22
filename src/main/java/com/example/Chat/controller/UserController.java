package com.example.Chat.controller;

import com.example.Chat.service.LoginService;
import com.example.Chat.service.SenderService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/gateway")
@RequiredArgsConstructor
public class UserController {

private final LoginService loginService;
    @PostMapping("/login")
    ResponseEntity<String> checkLogin(){
        return ResponseEntity.ok("Thi is coold");

    }

}
