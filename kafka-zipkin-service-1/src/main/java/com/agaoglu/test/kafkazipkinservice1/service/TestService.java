package com.agaoglu.test.kafkazipkinservice1.service;

import com.agaoglu.test.kafkazipkinservice1.publisher.KafkaProducerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TestService {

    @Autowired
    private KafkaProducerService kafkaProducerService;

    public void sendData(){
        kafkaProducerService.sendData();
    }
}
