package com.example.Chat.model;


import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class GroupChannel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;

    private String name;
    private String channel;
    private String owner;
}
