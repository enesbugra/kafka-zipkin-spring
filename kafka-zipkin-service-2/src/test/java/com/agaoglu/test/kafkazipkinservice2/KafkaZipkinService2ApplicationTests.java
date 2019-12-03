package com.agaoglu.test.kafkazipkinservice2;

import com.agaoglu.test.kafkazipkinservice2.dto.TestDto;
import com.agaoglu.test.kafkazipkinservice2.entity.TestEntity;
import com.agaoglu.test.kafkazipkinservice2.repository.TestRepository;
import com.agaoglu.test.kafkazipkinservice2.service.TestService;
import org.aspectj.lang.annotation.Before;
import org.junit.jupiter.api.Test;
import org.mockito.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.util.AssertionErrors;

import static org.mockito.ArgumentMatchers.any;


@SpringBootTest
class KafkaZipkinService2ApplicationTests {

	@Test
	void contextLoads() {
	}

	@InjectMocks
	TestService testService;

	@Mock
	TestRepository testRepository;

	@Test
	public void testServiceTest(){
		Mockito.when(testRepository.save(any(TestEntity.class))).then(AdditionalAnswers.returnsFirstArg());
		TestDto testDto = new TestDto();
		testDto.setBody("message");
		long id = (long) (Math.random() * 1000);
		testDto.setId(id);
		TestEntity result = testService.modifyTestEntity(testDto);
		AssertionErrors.assertEquals("", "message", result.getBody());
		AssertionErrors.assertEquals("", 5, result.getId());
	}
}
