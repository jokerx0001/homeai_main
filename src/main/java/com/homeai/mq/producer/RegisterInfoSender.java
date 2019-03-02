package com.homeai.mq.producer;

import com.homeai.entity.User;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class RegisterInfoSender {

    @Autowired
    private AmqpTemplate rabbitTemplate;

    public void send(User user) {
        String text = "Register info " + user.getName() + new Date();
        System.out.println("Sender : " + text);
        this.rabbitTemplate.convertAndSend("register", text);
    }

}
