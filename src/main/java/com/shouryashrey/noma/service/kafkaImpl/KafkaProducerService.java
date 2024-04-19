package com.shouryashrey.noma.service.kafkaImpl;

import com.shouryashrey.noma.model.PostNotification;
import com.shouryashrey.noma.service.serializer.CustomSerializer;
import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.ProducerConfig;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.apache.kafka.common.serialization.StringSerializer;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.Properties;

@Service
public class KafkaProducerService {

    private static final String BOOTSTAP_SERVER = "192.168.29.174:9092";

    private static Properties getKafkaProducerConfig(){
        Properties props = new Properties();
        props.put(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG, BOOTSTAP_SERVER);
        props.put(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, StringSerializer.class);
        props.put(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG, CustomSerializer.class);
        return props;
    }

    public static KafkaProducer<String, PostNotification> getKafkaProducer() {
        return new KafkaProducer<>(getKafkaProducerConfig());
    }

    public void send(String topic, PostNotification postNotification) {
        KafkaProducer<String, PostNotification> kafkaProducer = getKafkaProducer();
        ProducerRecord<String, PostNotification> notificationRecord = new ProducerRecord<>(topic, postNotification);
        kafkaProducer.send(notificationRecord);
    }
}
