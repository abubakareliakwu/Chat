package com.example.Chat.model;

import java.util.List;

public class Accounts {
    private String username;
    private String privateChannel; //WEB_SOCKET_QUEUE+username
    private List<GroupChannel> groupChannel;
}
