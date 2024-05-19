package com.insightscode.controller;

import com.insightscode.model.Employee;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

    @PostMapping
    public ResponseEntity<String> sendToKafka(@RequestBody Employee employee){

        return new ResponseEntity<String>("Message sent to kafka", HttpStatus.OK);
    }
}
