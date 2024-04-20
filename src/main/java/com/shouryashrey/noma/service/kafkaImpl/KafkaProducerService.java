package com.shouryashrey.noma.service.kafkaImpl;

import com.shouryashrey.noma.model.PostNotification;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import java.util.Properties;

@Service
public class KafkaProducerService {

    @Autowired
    KafkaTemplate<String, PostNotification> kafkaTemplate;

    public void send(String topic, PostNotification postNotification) {
        kafkaTemplate.send("noma", postNotification);
    }
}
