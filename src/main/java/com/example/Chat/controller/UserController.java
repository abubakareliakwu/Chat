package com.example.Chat.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/gateway")
public class UserController {

    @PostMapping("/login")
    ResponseEntity<String> checkLogin(){
        return ResponseEntity.ok("Thi is coold");

    }
}
