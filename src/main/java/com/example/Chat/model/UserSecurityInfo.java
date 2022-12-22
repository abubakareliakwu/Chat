package com.example.Chat.model;

import lombok.Data;

import java.security.Principal;

@Data
public class UserSecurityInfo implements Principal {

    private String name;

    public UserSecurityInfo(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }
}
