package com.shouryashrey.noma.service;

import com.shouryashrey.noma.model.standardResponse.StatusResponse;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;


@Component
public class StatusResponseFactory {

    @Value("${statusMessage.OK}")
    private String OK;

    @Value("${statusMessage.BAD_REQUEST}")
    private String BAD_REQUEST;

    @Value("${statusMessage.NOT_FOUND}")
    private String NOT_FOUND;

    @Value("${statusMessage.INTERNAL_SERVER_ERROR}")
    private String INTERNAL_SERVER_ERROR;

    @Value("${statusMessage.DEFAULT}")
    private String DEFAULT;


    public StatusResponse createResponse(HttpStatus responseCode) {
        String message = switch (responseCode.value()) {
            case 200 -> OK;
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
