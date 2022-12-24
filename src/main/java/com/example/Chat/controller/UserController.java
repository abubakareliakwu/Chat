package com.example.Chat.controller;

import com.example.Chat.dto.CreateChatDTO;
import com.example.Chat.model.Channel;
import com.example.Chat.service.ChannelService;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/chat-gateway")
@RequiredArgsConstructor
public class UserController {

      private final ChannelService channelService;

      private static final Logger logger = LoggerFactory.getLogger(UserController.class);


      @RequestMapping(value = "/create-chats", method = RequestMethod.POST)
      public ResponseEntity<Channel> save(@RequestBody CreateChatDTO chat) throws Exception {
            logger.info("UserController.clazz save() chat" + chat);
            return new ResponseEntity<Channel>(channelService.create(chat), HttpStatus.OK);
      }

      @RequestMapping(value = "/create-groupchats", method = RequestMethod.POST)
      public ResponseEntity<Channel> createGroup(@RequestBody Channel chat) throws Exception {
            logger.info("UserController.clazz save() chat" + chat);
            return new ResponseEntity<Channel>(channelService.createGroup(chat), HttpStatus.OK);
      }

      @RequestMapping(value = "/chat", method = RequestMethod.GET)
      public ResponseEntity<Channel> createGroup(@RequestParam long id) throws Exception {
            logger.info("UserController.clazz save() chat" + id);
            return new ResponseEntity<Channel>(channelService.getById(id), HttpStatus.OK);
      }

      @RequestMapping(value = "/delete", method = RequestMethod.DELETE)
      public void delete(@RequestParam long id) throws Exception {
            logger.info("UserController.clazz save() chat" + id);
            channelService.remove(id);
      }

      @RequestMapping(value = "/getAllChat", method = RequestMethod.GET)
      public List<Channel> getAllChat(@RequestParam String senderPhone) throws Exception {
            logger.info("UserController.clazz  chat: " + senderPhone);
            return channelService.getallChat(senderPhone);
      }
}
