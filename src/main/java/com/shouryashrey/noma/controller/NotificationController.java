package com.shouryashrey.noma.controller;

import com.shouryashrey.noma.model.PostNotification;
import com.shouryashrey.noma.model.standardResponse.StatusResponse;
import com.shouryashrey.noma.service.StatusResponseFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ve1")
public class NotificationController {


    @Autowired
    private StatusResponseFactory statusResponseFactory;

    @PostMapping("/notify")
    public ResponseEntity<StatusResponse> putNotification(@RequestBody PostNotification postNotification) {
        return new ResponseEntity<>(
            statusResponseFactory.createResponse(HttpStatus.OK),
            HttpStatus.OK
        );
    }
}
