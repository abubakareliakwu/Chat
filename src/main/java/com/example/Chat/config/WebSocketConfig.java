package com.example.Chat.config;

import com.example.Chat.config.interceptor.UserInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.messaging.simp.config.ChannelRegistration;
import org.springframework.messaging.simp.config.MessageBrokerRegistry;
import org.springframework.web.socket.config.annotation.EnableWebSocketMessageBroker;
import org.springframework.web.socket.config.annotation.StompEndpointRegistry;
import org.springframework.web.socket.config.annotation.WebSocketMessageBrokerConfigurer;

@Configuration
@EnableWebSocketMessageBroker
public class WebSocketConfig implements WebSocketMessageBrokerConfigurer {
    @Override
    public void registerStompEndpoints(StompEndpointRegistry
                                               registry) {

        registry.addEndpoint("/websocket")
                .setAllowedOrigins("http://localhost:4200").withSockJS();
//        registry.addEndpoint("/ws-callback")
//                .setAllowedOrigins("http://localhost:4200");
        //.addInterceptors(new HttpHandshakeInterceptor())
    }
//http://localhost:8080/websocket/send
//http://localhost:8080/websocket/file/upload
//http://localhost:8080/gateway/login
    @Override
    public void configureMessageBroker(MessageBrokerRegistry config) {
        config.enableSimpleBroker("/queue/","/topic/");
        config.setApplicationDestinationPrefixes("/");
//    config.setUserDestinationPrefix("/users");
    }

    @Override
    public void configureClientInboundChannel(ChannelRegistration registration) {
        registration.interceptors(new UserInterceptor());
    }
}
