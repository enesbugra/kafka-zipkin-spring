package com.agaoglu.test.kafkazipkinservice2.service;

import com.agaoglu.test.kafkazipkinservice2.dto.TestDto;
import com.agaoglu.test.kafkazipkinservice2.entity.TestEntity;
import com.agaoglu.test.kafkazipkinservice2.repository.TestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TestService {

    @Autowired
    TestRepository testRepository;

    public TestEntity modifyTestEntity(TestDto testDto){
        TestEntity testEntity = new TestEntity();
        testEntity.setId(testDto.getId());
        testEntity.setBody(testDto.getBody());
        testRepository.save(testEntity);
        return testEntity;
    }
}
