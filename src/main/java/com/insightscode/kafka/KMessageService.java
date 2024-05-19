package com.insightscode.kafka;

public interface KMessageService {
     /**
      * This service is used to transfer object to the topic to the zookeeper
      * @param payload
      */
     void send(String payload);
}
