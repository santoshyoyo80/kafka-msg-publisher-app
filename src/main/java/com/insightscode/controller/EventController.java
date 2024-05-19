package com.insightscode.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.insightscode.event.AppEvent;
import com.insightscode.kafka.PublishMsgService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * This contoller defined to control the app events
 *
 */
@RequestMapping("events")
@RestController
public class EventController {

    @Autowired
    PublishMsgService publishMsgService;

    @PostMapping
    public ResponseEntity<String> sendToKafka(@RequestBody AppEvent event) throws JsonProcessingException {
        publishMsgService.send(event);
        return new ResponseEntity<String>("Message sent to kafka", HttpStatus.OK);
    }
}
