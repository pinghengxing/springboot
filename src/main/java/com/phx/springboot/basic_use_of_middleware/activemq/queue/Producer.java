package com.phx.springboot.basic_use_of_middleware.activemq.queue;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsMessagingTemplate;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.jms.Queue;
//@EnableScheduling
//@Component

@RestController
@RequestMapping(value = "/activemq")
public class Producer {
    @Autowired
    private Queue queue;

    @Autowired
    private JmsMessagingTemplate jmsMessagingTemplate;

//    @Scheduled(fixedDelay = 3000)
//    public void send(){
//        String message = System.currentTimeMillis()+"---测试发送！！";
//        System.out.println("message:"+message);
//        jmsMessagingTemplate.convertAndSend(queue,message);
//
//    }
    @RequestMapping(value = "/send")
    public String send(){
        String message = System.currentTimeMillis()+"---测试发送！！";
        System.out.println("message:"+message);
        jmsMessagingTemplate.convertAndSend(queue,message);
        return "消息发送成功！！";

    }


}
