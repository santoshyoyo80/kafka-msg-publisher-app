package com.insightscode.test;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.insightscode.model.Employee;
import com.insightscode.service.ProducerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class TestProducer {
    @Autowired
    private ProducerService producerService;
    @Autowired
    private ObjectMapper mapper;
    @Autowired
//
    @PostConstruct
    public void test() throws JsonProcessingException {
        Employee e = new Employee();
        e.setEmailId("santosh@gmail.com");
        e.setEmpId(100);
        e.setFirstName("santosh");
        e.setLastName("kumar");
        e.setPassword("qwerty16868");
        String payload = mapper.writeValueAsString(e);
        producerService.send(payload);
    }
}
