package com.phx.springboot.basic_use_of_middleware.activemq.queue;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

import javax.jms.JMSException;
import javax.jms.Session;
import javax.jms.TextMessage;

@Component
public class Consumer {

    @JmsListener(destination = "${queue}")
    public void receive(String msg){
        System.out.println("消费者："+msg);
    }


//    @JmsListener(destination = "${queue}")
//    public void receive(TextMessage textMessage, Session session){
//        String msg = null;
//        String id = null;
//        try {
//            msg = textMessage.getText();
//            id = textMessage.getJMSMessageID();
//            System.out.println("消费者："+msg);
//            System.out.println("id:"+id);
//        } catch (JMSException e) {
//            e.printStackTrace();
//        }
//    }


}
