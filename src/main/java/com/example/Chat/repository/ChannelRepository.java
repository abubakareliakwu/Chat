package com.example.Chat.repository;

import com.example.Chat.model.Channel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ChannelRepository extends JpaRepository<Channel,Long> {

    @Query(value = "SELECT * FROM Channel C where C.sender_phone=:senderPhone ", nativeQuery = true)
    List<Channel> getChannel(String senderPhone);
}
