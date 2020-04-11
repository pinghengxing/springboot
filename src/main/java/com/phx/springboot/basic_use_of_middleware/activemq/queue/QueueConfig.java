package com.phx.springboot.basic_use_of_middleware.activemq.queue;

import javax.jms.Queue;

import org.apache.activemq.command.ActiveMQQueue;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class QueueConfig {
    @Value("${queue}")
    private String queue;


    @Bean
    public Queue logQueue() {
        return new ActiveMQQueue(queue);
    }

//    @Bean
//    public JmsTemplate jmsTemplate(ConnectionFactory  connectionFactory, Queue queue) {
//        JmsTemplate jmsTemplate = new JmsTemplate();
//        jmsTemplate.setDeliveryMode(2);// 进行持久化配置 1表示非持久化，2表示持久化</span>
//        jmsTemplate.setConnectionFactory(connectionFactory);
//        jmsTemplate.setDefaultDestination(queue); // 此处可不设置默认，在发送消息时也可设置队列
//        jmsTemplate.setSessionAcknowledgeMode(4);// 客户端签收模式</span>
//        return jmsTemplate;
//    }

    // 定义一个消息监听器连接工厂，这里定义的是点对点模式的监听器连接工厂
//    @Bean(name = "jmsQueueListener")
//    public DefaultJmsListenerContainerFactory jmsQueueListenerContainerFactory(ConnectionFactory  connectionFactory) {
//        DefaultJmsListenerContainerFactory factory = new DefaultJmsListenerContainerFactory();
//        factory.setConnectionFactory(connectionFactory);
//        // 设置连接数
//        factory.setConcurrency("1-10");
//        // 重连间隔时间
//        factory.setRecoveryInterval(1000L);
//        factory.setSessionAcknowledgeMode(4);
//        return factory;
//    }

}
