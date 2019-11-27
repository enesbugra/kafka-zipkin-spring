package com.agaoglu.test.kafkazipkinservice2.listener;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaTestListener {


    @KafkaListener(topics = "test", groupId = "group_id")
    public void consumeMessage(String message){
        System.out.println(message);
    }
}
