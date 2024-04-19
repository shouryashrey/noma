package com.shouryashrey.noma.service.serializer;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.kafka.common.serialization.Deserializer;
import org.springframework.util.SerializationUtils;

import java.io.Serializable;
import java.util.Map;

public class CustomDeserializer<T extends Serializable> implements Deserializer<T> {

    private final ObjectMapper objectMapper = new ObjectMapper();

    @Override
    public void configure(Map<String, ?> configs, boolean isKey) {
    }

    @SuppressWarnings("unchecked")
    @Override
    public T deserialize(String topic, byte[] objectData) {
        return (objectData == null) ? null : (T) SerializationUtils.deserialize(objectData);
    }

    @Override
    public void close() {
    }
}