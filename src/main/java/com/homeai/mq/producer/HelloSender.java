package com.homeai.mq.producer;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class HelloSender {

    @Autowired
    private AmqpTemplate rabbitTemplate;

    public void send() {
        String text = "info " + new Date();
        System.out.println("Sender : " + text);
        this.rabbitTemplate.convertAndSend("hello", text);
    }

}
