package com.insightscode.kafka;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.insightscode.event.AppEvent;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

/**
 * This represents the service of the Ka
 */
@Service
public class PublishMsgServiceImpl implements PublishMsgService {

    @Autowired
    ObjectMapper objectMapper;

    private static final Logger LOGGER = LoggerFactory.getLogger(PublishMsgServiceImpl.class);
        @Autowired
        private KafkaTemplate<String,String> kafkaTemplate;
        @Autowired
        private String topicName;


    @Override
    public String send(String payload) {
        LOGGER.info("Sending to the Kafka Topic ={0}",topicName);
        kafkaTemplate.send(topicName,payload);
        return "Sent Event to Kafka Topic";
    }

    @Override
    public String send(AppEvent event) throws JsonProcessingException {
        LOGGER.info("Sending to the Kafka Topic ={0}",topicName);
        kafkaTemplate.send(topicName,objectMapper.writeValueAsString(event));
        return "Sent Event to Kafka Topic";
    }
}
