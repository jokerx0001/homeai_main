package com.homeai.mq.consumer;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
@RabbitListener(queues = "register")
public class MessageSender {

    @RabbitHandler
    public void process(String hello) {
        System.out.println("Message send to  : " + hello);
    }
}
