package com.shouryashrey.noma.service.kafkaImpl;

import com.shouryashrey.noma.model.PostNotification;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;


@Service
public class KafkaConsumerService {

    @KafkaListener(topics = "noma", groupId = "noma")
    public void listen(PostNotification notification) {
        System.out.println("Message received => " + notification.getNotificationList().size());
    }
}
