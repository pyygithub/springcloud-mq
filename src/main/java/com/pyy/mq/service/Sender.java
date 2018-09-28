package com.pyy.mq.service;


import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * 消息发送者
 * @author wolf
 */

@Component
public class Sender {

    @Autowired
    private AmqpTemplate rabbitAmqpTemplate;

    /**
     * 发送消息方法
     * @param msg
     */
    public void send(String msg) {
        // 向消息队列中发送消息
        this.rabbitAmqpTemplate.convertAndSend("hello-queue", msg);
    }
}