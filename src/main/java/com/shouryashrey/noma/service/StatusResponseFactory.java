package com.shouryashrey.noma.service;

import com.shouryashrey.noma.model.standardResponse.StatusResponse;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;


@Component
public class StatusResponseFactory {

    public StatusResponse createResponse(HttpStatus responseCode) {
        String message = switch (responseCode.value()) {
            case 200 -> "Notification pushed to queue";
            case 400 -> "Bad Request";
            case 404 -> "Not Found";
            case 500 -> "Internal Server Error";
            default -> "Unknown";
        };
        return new StatusResponse(
            message,
            responseCode.value(),
            System.currentTimeMillis()
        );
    }
}
