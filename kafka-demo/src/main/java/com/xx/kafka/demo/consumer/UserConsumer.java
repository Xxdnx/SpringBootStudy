package com.xx.kafka.demo.consumer;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

/**
 * @author Xx
 * @program study
 * @description
 * @create 2020-12-31 21:26
 * @since
 */
@Component
public class UserConsumer {

    @KafkaListener(topics = "${user.topic}")
    public void listen(ConsumerRecord<?, ?> record) {
        System.out.println("topic is " + record.topic() + ", offset is " + record.offset() + ", value is " + record.value());
    }

}
