package com.agaoglu.test.kafkazipkinservice2.listener;

import com.agaoglu.test.kafkazipkinservice2.dto.TestDto;
import com.agaoglu.test.kafkazipkinservice2.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaTestListener {

    @Autowired
    TestService testService;

    @KafkaListener(topics = "test", groupId = "group_id")
    public void consumeMessage(String message){

        TestDto testDto = new TestDto();
        testDto.setBody(message);
        testDto.setId((long) (Math.random() * 1000));
        System.out.println(message);
        testService.modifyTestEntity(testDto);
    }
}
