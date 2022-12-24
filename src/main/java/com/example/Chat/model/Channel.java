package com.example.Chat.model;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
public class Channel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;

    private String senderPhone;
    private String destPhone; 

    @ManyToMany(fetch = FetchType.LAZY, cascade = {CascadeType.PERSIST, CascadeType.REFRESH})
    @JoinColumn(name = "group_channel_id", referencedColumnName = "id", nullable = false)
    private List<GroupChannel> groupChannel;

}
