package com.asg.springjms01;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class MsgMonitor {

    @JmsListener(destination="${springjms.queue01}")
    public void receive(String msg) {
        System.out.println("Received message: " + msg);
    }
    
}
