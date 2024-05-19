package com.insightscode.kafka;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.insightscode.event.AppEvent;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

/**
 * This represents the service of the Ka
 */
@Service
@Slf4j
public class PublishMsgServiceImpl implements PublishMsgService {

    @Autowired
    ObjectMapper objectMapper;

        @Autowired
        private KafkaTemplate<String,String> kafkaTemplate;
        @Autowired
        private String topicName;


    @Override
    public String send(String payload) {
        log.info("Sending to the Kafka Topic ={0}",topicName);
        kafkaTemplate.send(topicName,payload);
        return "Sent Event to Kafka Topic";
    }

    @Override
    public String send(AppEvent event) throws JsonProcessingException {
        log.info("Sending to the Kafka Topic ={0}",topicName);
        kafkaTemplate.send(topicName,objectMapper.writeValueAsString(event));
        return "Sent Event to Kafka Topic";
    }
}
