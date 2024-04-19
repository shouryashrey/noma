package com.shouryashrey.noma.service;

import com.shouryashrey.noma.model.PostNotification;
import com.shouryashrey.noma.service.kafkaImpl.KafkaProducerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NotificationHandler {

    @Autowired
    private KafkaProducerService kafkaProducer;

    public void publishNotification(PostNotification postNotification) {
        kafkaProducer.send("noma", postNotification);
    }
}
