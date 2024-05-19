package com.insightscode.kafka;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.insightscode.event.AppEvent;

public interface PublishMsgService {
     /**
      * This service is used to transfer object to the topic to the zookeeper
      * @param eventString
      */
     String send(String eventString);

     String send(AppEvent event) throws JsonProcessingException;
}
