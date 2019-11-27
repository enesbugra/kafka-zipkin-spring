package com.agaoglu.test.kafkazipkinservice1.rest;

import com.agaoglu.test.kafkazipkinservice1.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ServiceTestController {

    @Autowired
    private TestService testService;

    @GetMapping("/test")
    public void callRestApi(){
        testService.sendData();
    }
}
