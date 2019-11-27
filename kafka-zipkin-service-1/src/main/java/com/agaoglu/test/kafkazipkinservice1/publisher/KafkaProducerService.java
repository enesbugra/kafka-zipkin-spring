package com.agaoglu.test.kafkazipkinservice1.publisher;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class KafkaProducerService {

    @Autowired
    private KafkaTemplate<String,String> kafkaTemplate;

    private static final String TOPIC = "test";

    public void sendData(){
        kafkaTemplate.send(TOPIC, "test");
    }
}
