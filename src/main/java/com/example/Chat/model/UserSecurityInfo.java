package com.example.Chat.model;

import java.security.Principal;

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
