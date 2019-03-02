package com.homeai.mq.consumer;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
@RabbitListener(queues = "register")
public class EmailSender {

    @RabbitHandler
    public void process(String msg) {
        System.out.println("email send to  : " + msg);
    }
}
