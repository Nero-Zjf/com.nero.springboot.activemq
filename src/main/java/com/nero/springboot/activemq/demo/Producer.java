package com.nero.springboot.activemq.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsMessagingTemplate;
import org.springframework.stereotype.Component;

import javax.jms.Queue;
import javax.jms.Topic;

@Component
public class Producer {
    @Autowired
    private JmsMessagingTemplate jmsTemplate;

    @Autowired
    private Queue queue;

    @Autowired
    private Topic topic;

    //发送queue类型消息
    public void sendQueueMsg(String msg){
        jmsTemplate.convertAndSend(queue, msg);
    }

    //发送topic类型消息
    public void sendTopicMsg(String msg){
        jmsTemplate.convertAndSend(topic, msg);
    }
}
