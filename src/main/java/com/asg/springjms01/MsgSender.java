package com.asg.springjms01;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Component;

@Component
public class MsgSender {

    @Autowired
    private JmsTemplate jmsTemplate;

    @Value("${springjms.queue01}")
    String queue;

    public void sendMsg(String msg) {
        jmsTemplate.convertAndSend(queue, msg);

    }
    
}
