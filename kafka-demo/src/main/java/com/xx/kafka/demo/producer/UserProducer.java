package com.xx.kafka.demo.producer;

import com.xx.kafka.demo.bean.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.SendResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.ExecutionException;

/**
 * @author Xx
 * @program study
 * @description
 * @create 2020-12-31 21:26
 * @since
 */
@RestController
public class UserProducer {

    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    @RequestMapping("send")
    public String sendMessage(User user) {
        try {
            SendResult<String, String> result = kafkaTemplate.send("demo", user.toString()).get();
            return result.toString();
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }
        return "failure";
    }

}
